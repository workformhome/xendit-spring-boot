package ramdan.com.xendit.endpoint;

import lombok.val;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import ramdan.com.xendit.exception.XenditException;
import ramdan.com.xendit.model.FixedVirtualAccount;

/**
 * Create closed VA with complete object
 * https://xendit.github.io/apireference/#create-virtual-account
 */
public class VirtualAccountCreateEndpoint extends CreateEndpoint<FixedVirtualAccount> {

    public static String ENDPOINT_PATH = "/callback_virtual_accounts";

    public VirtualAccountCreateEndpoint() {
        super(FixedVirtualAccount.class);
    }

    public FixedVirtualAccount create(Object params, HttpHeaders httpHeader) throws XenditException {
        //String url = String.format("%s%s", Xendit.getUrl(), "/callback_virtual_accounts");
//        boolean isClosed = false;
//        if (params.containsKey("is_closed")) {
//            isClosed = Boolean.getBoolean(params.toString());
//        }
//        //params.put("is_closed", isClosed);
//
//        if (isClosed && params.containsKey("suggested_amount")) {
//            throw new ParamException("Suggested amount is not supported for closed VA");
//        }
        if (httpHeader != null) {
            val httpEntity = new HttpEntity(params, httpHeader);
            val response = super.template.exchange(url, HttpMethod.POST, httpEntity, responseType);
            return response.getBody();
        } else {
            return super.postForObject(params);
        }
    }
}