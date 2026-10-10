package cn.jiguang.privates.push.business.operation.mobileNumber;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.JProtocol;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.api.MobileNumberMessage;
import cn.jiguang.privates.push.business.operation.JOperationBusiness;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.protocol.JPushProtocol;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public class JMobileNumberBusiness extends JOperationBusiness {
    private static final String TAG = "JMobileNumberBusiness";
    private static volatile JMobileNumberBusiness instance;
    private ConcurrentHashMap<Integer, String> mobileNumberMap = new ConcurrentHashMap<>();

    private int checkMobileNumber(String str) {
        if (Pattern.compile("^[+0-9][-0-9]{1,}$").matcher(str).matches()) {
            if (checkTime() != 0) {
                return JPushPrivatesApi.Code.INVOKE_TOO_SOON;
            }
            return 0;
        }
        JCommonLog.m5433w(TAG, "[" + str + "] is not mobileNumber");
        return JPushPrivatesApi.Code.INVALID_MOBILE_NUMBER;
    }

    public static JMobileNumberBusiness getInstance() {
        if (instance == null) {
            synchronized (JMobileNumberBusiness.class) {
                instance = new JMobileNumberBusiness();
            }
        }
        return instance;
    }

    public void onMobileNumberFailed(Context context, Bundle bundle) {
        try {
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            if (jProtocol == null) {
                return;
            }
            int rid = (int) jProtocol.getRid();
            String str = this.mobileNumberMap.get(Integer.valueOf(rid));
            this.mobileNumberMap.remove(Integer.valueOf(rid));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            MobileNumberMessage mobileNumber = new MobileNumberMessage().setSequence(rid).setCode(JPushPrivatesApi.Code.TIMEOUT).setMobileNumber(str);
            JCommonLog.m5430d(TAG, "onMobileNumberFailed mobileNumberMessage:" + mobileNumber.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("message", mobileNumber);
            JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.ON_MOBILE_NUMBER, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMobileNumberFailed failed " + th2.getMessage());
        }
    }

    public void onMobileNumberSuccess(Context context, Bundle bundle) {
        try {
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            int rid = (int) jProtocol.getRid();
            if (!this.mobileNumberMap.containsKey(Integer.valueOf(rid))) {
                JCommonLog.m5430d(TAG, "failed ");
                return;
            }
            String str = this.mobileNumberMap.get(Integer.valueOf(rid));
            this.mobileNumberMap.remove(Integer.valueOf(rid));
            MobileNumberMessage mobileNumber = new MobileNumberMessage().setSequence(rid).setCode(ByteBuffer.wrap(jProtocol.getBody()).getShort()).setMobileNumber(str);
            JCommonLog.m5430d(TAG, "onMobileNumberSuccess mobileNumberMessage:" + mobileNumber.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("message", mobileNumber);
            JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.ON_MOBILE_NUMBER, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMobileNumberSuccess failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.operation.JOperationBusiness
    public void processMainMessage(Context context, int i11, Bundle bundle) {
        JCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(MobileNumberMessage.class.getClassLoader());
            MobileNumberMessage mobileNumberMessage = (MobileNumberMessage) bundle.getParcelable("message");
            if (mobileNumberMessage != null && (commonReceiver = JGlobal.getCommonReceiver(context)) != null) {
                commonReceiver.onMobileNumber(context, mobileNumberMessage);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processMainMessage failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.operation.JOperationBusiness
    public void processRemoteMessage(Context context, int i11, Bundle bundle) {
        try {
            int i12 = bundle.getInt(JPushConstants.Operation.KEY_SEQUENCE);
            String string = bundle.getString(JPushConstants.Operation.KEY_MOBILE_NUMBER);
            int iCheckMobileNumber = checkMobileNumber(string);
            if (iCheckMobileNumber != 0) {
                JCommonLog.m5430d(TAG, "sendMobileNumberOperation failed code:" + iCheckMobileNumber + ", sequence:" + i12 + ", mobileNumber:" + string);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("message", new MobileNumberMessage().setSequence(i12).setCode(iCheckMobileNumber).setMobileNumber(string));
                JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.ON_MOBILE_NUMBER, bundle2);
                return;
            }
            this.mobileNumberMap.put(Integer.valueOf(i12), string);
            JCommonLog.m5430d(TAG, "sendMobileNumberOperation sequence:" + i12 + ", mobileNumber:" + string);
            JProtocol body = new JProtocol().setRid((long) i12).setCommand(26).setVersion(1).setBody(JPushProtocol.packageMobileNumberBody(string));
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("protocol", body);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.UPLOAD, bundle3);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processRemoteMessage failed " + th2.getMessage());
        }
    }
}
