package cn.jiguang.privates.push.business.operation.alias;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.StringUtil;
import cn.jiguang.privates.core.api.JProtocol;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.JPush;
import cn.jiguang.privates.push.api.AliasMessage;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.business.operation.JOperationBusiness;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.protocol.JPushProtocol;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JAliasBusiness extends JOperationBusiness {
    private static final String OP_ALIAS_CLEAN = "del";
    private static final String OP_ALIAS_GET = "get";
    private static final String OP_ALIAS_SET = "set";
    private static final String TAG = "JAliasBusiness";
    private static volatile JAliasBusiness instance;
    private ConcurrentHashMap<Integer, String> aliasMap = new ConcurrentHashMap<>();

    public static JAliasBusiness getInstance() {
        if (instance == null) {
            synchronized (JAliasBusiness.class) {
                instance = new JAliasBusiness();
            }
        }
        return instance;
    }

    public void onAliasOperationFailed(Context context, Bundle bundle) {
        try {
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            if (jProtocol == null) {
                return;
            }
            int rid = (int) jProtocol.getRid();
            String str = this.aliasMap.get(Integer.valueOf(rid));
            this.aliasMap.remove(Integer.valueOf(rid));
            AliasMessage alias = new AliasMessage().setSequence(rid).setCode(JPushPrivatesApi.Code.TIMEOUT).setAlias(str);
            JCommonLog.m5430d(TAG, "onAliasOperationFailed sequence:" + rid + ", aliasMessage:" + alias.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(JPushConstants.Operation.KEY_ALIAS, alias);
            JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.ALIAS_SET, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onAliasOperationFailed failed " + th2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    public void onAliasOperationSuccess(Context context, Bundle bundle) {
        byte b11;
        String strOptString;
        try {
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            if (jProtocol == null) {
                return;
            }
            int rid = (int) jProtocol.getRid();
            JSONObject jSONObject = new JSONObject(StringUtil.getTlv2(ByteBuffer.wrap(jProtocol.getBody())));
            JCommonLog.m5430d(TAG, "onAliasOperationSuccess sequence:" + rid + ", content:" + JCommonLog.toLogString(jSONObject));
            int iOptInt = jSONObject.optInt("code");
            String strOptString2 = jSONObject.optString("op");
            int iHashCode = strOptString2.hashCode();
            if (iHashCode != 99339) {
                if (iHashCode != 102230) {
                    if (iHashCode == 113762 && strOptString2.equals(OP_ALIAS_SET)) {
                        b11 = 0;
                    } else {
                        b11 = -1;
                    }
                } else if (strOptString2.equals(OP_ALIAS_GET)) {
                    b11 = 1;
                } else {
                    b11 = -1;
                }
            } else if (strOptString2.equals(OP_ALIAS_CLEAN)) {
                b11 = 2;
            } else {
                b11 = -1;
            }
            int i11 = JPushConstants.MainWhat.ALIAS_SET;
            if (b11 == 0) {
                strOptString = this.aliasMap.get(Integer.valueOf(rid));
                this.aliasMap.remove(Integer.valueOf(rid));
            } else if (b11 != 1) {
                strOptString = "";
                if (b11 == 2) {
                    i11 = JPushConstants.MainWhat.ALIAS_CLEAR;
                }
            } else {
                strOptString = jSONObject.optString(JPushConstants.Operation.KEY_ALIAS);
                i11 = JPushConstants.MainWhat.ALIAS_GET;
            }
            AliasMessage alias = new AliasMessage().setSequence(rid).setCode(iOptInt).setAlias(strOptString);
            JCommonLog.m5430d(TAG, "onAliasOperationSuccess aliasMessage:" + alias.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(JPushConstants.Operation.KEY_ALIAS, alias);
            JCommonPrivatesApi.sendMessageToMainProcess(context, i11, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onAliasOperationSuccess failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.operation.JOperationBusiness
    public void processMainMessage(Context context, int i11, Bundle bundle) {
        JCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(AliasMessage.class.getClassLoader());
            AliasMessage aliasMessage = (AliasMessage) bundle.getParcelable(JPushConstants.Operation.KEY_ALIAS);
            if (aliasMessage != null && (commonReceiver = JGlobal.getCommonReceiver(context)) != null) {
                switch (i11) {
                    case JPushConstants.MainWhat.ALIAS_SET /* 3017 */:
                    case JPushConstants.MainWhat.ALIAS_GET /* 3018 */:
                    case JPushConstants.MainWhat.ALIAS_CLEAR /* 3019 */:
                        commonReceiver.onAliasMessage(context, aliasMessage);
                        return;
                    default:
                        return;
                }
                JCommonLog.m5433w(TAG, "processMainMessage failed " + th.getMessage());
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processMainMessage failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.operation.JOperationBusiness
    public void processRemoteMessage(Context context, int i11, Bundle bundle) {
        String str;
        try {
            int i12 = bundle.getInt(JPushConstants.Operation.KEY_SEQUENCE);
            String string = bundle.getString(JPushConstants.Operation.KEY_ALIAS);
            switch (i11) {
                case JPushConstants.RemoteWhat.ALIAS_CLEAR /* 3981 */:
                    str = OP_ALIAS_CLEAN;
                    break;
                case JPushConstants.RemoteWhat.ALIAS_GET /* 3982 */:
                    str = OP_ALIAS_GET;
                    break;
                case JPushConstants.RemoteWhat.ALIAS_SET /* 3983 */:
                    str = OP_ALIAS_SET;
                    int iCheckAlias = checkAlias(string);
                    if (iCheckAlias != 0) {
                        AliasMessage alias = new AliasMessage().setSequence(i12).setCode(iCheckAlias).setAlias(string);
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable(JPushConstants.Operation.KEY_ALIAS, alias);
                        JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.ALIAS_SET, bundle2);
                        return;
                    }
                    break;
                default:
                    str = "";
                    break;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
            jSONObject.put("op", str);
            if (!TextUtils.isEmpty(string)) {
                this.aliasMap.put(Integer.valueOf(i12), string);
                jSONObject.put(JPushConstants.Operation.KEY_ALIAS, string);
            }
            JCommonLog.m5430d(TAG, "sendAliasOperation sequence:" + i12 + ", content:" + JCommonLog.toLogString(jSONObject));
            byte[] bArrPackageOperationBody = JPushProtocol.packageOperationBody(jSONObject.toString());
            if (bArrPackageOperationBody == null) {
                return;
            }
            JProtocol threadName = new JProtocol().setRid(i12).setCommand(29).setVersion(1).setBody(bArrPackageOperationBody).setThreadName(JPush.THREAD_PUSH);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("protocol", threadName);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.UPLOAD, bundle3);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "sendAliasOperation failed " + th2.getMessage());
        }
    }

    private int checkAlias(String str) {
        int iCheckTime = checkTime();
        if (iCheckTime != 0) {
            return iCheckTime;
        }
        if (TextUtils.isEmpty(str)) {
            return JPushPrivatesApi.Code.INVALID_ALIAS;
        }
        if (str.getBytes().length > 40) {
            return JPushPrivatesApi.Code.TOO_LONG_ALIAS;
        }
        if (!Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
            return JPushPrivatesApi.Code.INVALID_ALIAS;
        }
        return 0;
    }
}
