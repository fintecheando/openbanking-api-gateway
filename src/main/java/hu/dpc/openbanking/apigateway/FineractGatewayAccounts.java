package hu.dpc.openbanking.apigateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.dpc.common.http.HTTPCallExecutionException;
import hu.dpc.common.http.HttpUtils;
import hu.dpc.openbanking.apigateway.entities.accounts.AccountHeldResponse;
import hu.dpc.openbanking.apigateway.entities.accounts.UpdateConsentResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.Nullable;
import uk.org.openbanking.v3_1_2.accounts.OBReadConsentResponse1;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FineractGatewayAccounts extends FineractGateway {
    private static final Log LOG = LogFactory.getLog(FineractGatewayAccounts.class);

    @Nullable
    public static OBReadConsentResponse1 getConsent(final ServletConfig servletConfig, final HttpServletRequest request) {
        checkServletConfig(servletConfig);

        try {
            final RequestContent requestContent = new RequestContent(request);
            final Map<String, String> headers = populateHeaders(requestContent);
            final OBReadConsentResponse1 result = HttpUtils.doGET(OBReadConsentResponse1.class, openBankingLogicURL + reviewUrl("/consents/" + requestContent.getConsentId()), headers);
            request.getSession().putValue("AccountConsent", result);
            return result;
        } catch (final Exception e) {
            LOG.error("Something went wrong!", e);
        }

        return null;
    }

    @Nullable
    public static AccountHeldResponse getAccountsHeld(final ServletConfig servletConfig, final HttpServletRequest request) {
        checkServletConfig(servletConfig);

        try {
            final RequestContent requestContent = new RequestContent(request);
            final Map<String, String> headers = populateHeaders(requestContent);
            return HttpUtils.doGET(AccountHeldResponse.class, openBankingLogicURL + reviewUrl("/consents/" + requestContent.getConsentId() + "/accounts"), headers);
        } catch (final Exception e) {
            LOG.error("Something went wrong!", e);
        }

        return null;
    }

    public static UpdateConsentResponse updateConsent(final ServletConfig servletConfig, final String consentId, final String userName, final OBReadConsentResponse1 updateConsentRequest) throws HTTPCallExecutionException {
        checkServletConfig(servletConfig);

        final ObjectMapper mapper = new ObjectMapper();
        try {
            final String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(updateConsentRequest);

            final Map<String, String> headers = new HashMap<>();
            headers.put("Accept", "application/json");
            headers.put("Content-Type", "application/json");
            headers.put("x-fapi-interaction-id", UUID.randomUUID().toString());
            headers.put("user-id", userName);
            headers.put("consent-id", consentId);

            return HttpUtils.call(HttpUtils.HTTP_METHOD.PUT, UpdateConsentResponse.class, openBankingLogicURL + reviewUrl("/consents/" + consentId), headers, json);
        } catch (final Exception e) {
            LOG.error("Error on updateConsent", e);
            throw new HTTPCallExecutionException(e);
        }
    }

}
