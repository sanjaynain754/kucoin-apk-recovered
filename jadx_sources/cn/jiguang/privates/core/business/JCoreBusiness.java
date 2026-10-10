package cn.jiguang.privates.core.business;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.JProtocol;
import cn.jiguang.privates.core.api.Outputer;
import cn.jiguang.privates.core.cache.JCoreConfig;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.core.global.JCoreGlobal;
import com.tencent.bugly.proguard.C33556b3;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JCoreBusiness {
    private static final String TAG = "JCoreBusiness";
    private static volatile JCoreBusiness instance;

    public static JCoreBusiness getInstance() {
        if (instance == null) {
            synchronized (JCoreBusiness.class) {
                instance = new JCoreBusiness();
            }
        }
        return instance;
    }

    public void onCtrl(Context context, Bundle bundle) {
        try {
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            jProtocol.getRid();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(jProtocol.getBody());
            long j11 = byteBufferWrap.getLong();
            byte[] bArr = new byte[byteBufferWrap.getShort()];
            byteBufferWrap.get(bArr);
            String str = new String(bArr, "UTF-8");
            Outputer outputer = new Outputer();
            outputer.writeU16(0);
            outputer.writeU64(j11);
            outputer.writeByteArrayIncludeLength("".getBytes());
            JProtocol body = new JProtocol().setRid(j11).setCommand(25).setVersion(1).setBody(outputer.toByteArray());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("protocol", body);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.UPLOAD, bundle2);
            JSONObject jSONObject = new JSONObject(str);
            JCommonLog.m5430d(TAG, "onCtrl " + JCommonLog.toLogString(jSONObject));
            int iOptInt = jSONObject.optInt(C33556b3.f69058j2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content");
            Bundle bundle3 = new Bundle();
            bundle3.putString("protocol", jSONObjectOptJSONObject.toString());
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, iOptInt, bundle3);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onCtrl failed " + th2.getMessage());
        }
    }

    public void onMainLoginInfo(Context context, Bundle bundle) {
        int i11 = bundle.getInt("code");
        int i12 = bundle.getInt(JCoreConstants.Login.KEY_SEED_ID);
        long j11 = bundle.getLong(JCoreConstants.Login.KEY_SERVER_TIME);
        JCoreGlobal.setLoginCode(i11);
        JCoreGlobal.setSeedId(i12);
        JCoreGlobal.setServerTime(j11);
    }

    public void onMainRegisterInfo(Context context, Bundle bundle) {
        int i11 = bundle.getInt("code");
        long j11 = bundle.getLong("user_id");
        String string = bundle.getString(JCoreConstants.Register.KEY_REGISTRATION_ID);
        String string2 = bundle.getString("password");
        JCoreGlobal.setRegisterCode(i11);
        JCoreGlobal.setUserId(j11);
        JCoreGlobal.setRegistrationId(string);
        JCoreGlobal.setPassword(string2);
    }

    public void onRemoteLoginInfo(Context context) {
        int loginCode = JCoreConfig.getLoginCode(context);
        int seedId = JCoreConfig.getSeedId(context);
        long serverTime = JCoreConfig.getServerTime(context);
        Bundle bundle = new Bundle();
        bundle.putInt("code", loginCode);
        bundle.putInt(JCoreConstants.Login.KEY_SEED_ID, seedId);
        bundle.putLong(JCoreConstants.Login.KEY_SERVER_TIME, serverTime);
        JCommonPrivatesApi.sendMessageToMainProcess(context, 2102, bundle);
    }

    public void onRemoteRegisterInfo(Context context) {
        int registerCode = JCoreConfig.getRegisterCode(context);
        long userId = JCoreConfig.getUserId(context);
        String registrationId = JCoreConfig.getRegistrationId(context);
        String password = JCoreConfig.getPassword(context);
        Bundle bundle = new Bundle();
        bundle.putInt("code", registerCode);
        bundle.putLong("user_id", userId);
        bundle.putString(JCoreConstants.Register.KEY_REGISTRATION_ID, registrationId);
        bundle.putString("password", password);
        JCommonPrivatesApi.sendMessageToMainProcess(context, 2101, bundle);
    }
}
