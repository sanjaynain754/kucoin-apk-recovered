package cn.jiguang.privates.push.business.operation.tag;

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
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.api.TagMessage;
import cn.jiguang.privates.push.business.operation.JOperationBusiness;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.protocol.JPushProtocol;
import com.tencent.bugly.proguard.C33616e0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JTagBusiness extends JOperationBusiness {
    private static final String OP_TAG_ADD = "add";
    private static final String OP_TAG_DELETE = "del";
    private static final String OP_TAG_DELETE_ALL = "clean";
    private static final String OP_TAG_QUERY = "valid";
    private static final String OP_TAG_QUERY_ALL = "get";
    private static final String OP_TAG_UPDATE = "set";
    private static final String TAG = "JTagBusiness";
    private static volatile JTagBusiness instance;
    private final ConcurrentHashMap<Integer, String[]> tagMap = new ConcurrentHashMap<>();

    private int checkTag(String[] strArr) {
        int iCheckTime = checkTime();
        if (iCheckTime != 0) {
            return iCheckTime;
        }
        if (strArr.length > 1000) {
            return JPushPrivatesApi.Code.TOO_MANY_TAGS;
        }
        int length = strArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            String str = strArr[i12];
            if (TextUtils.isEmpty(str)) {
                return JPushPrivatesApi.Code.INVALID_TAGS;
            }
            if (!Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
                return JPushPrivatesApi.Code.INVALID_TAGS;
            }
            try {
                int length2 = str.getBytes("UTF-8").length;
                if (length2 > 40) {
                    return JPushPrivatesApi.Code.TOO_LONG_TAG;
                }
                i11 += length2;
            } catch (Throwable th2) {
                JCommonLog.m5433w(TAG, "getBytes failed " + th2.getMessage());
            }
        }
        if (i11 > 5000) {
            return JPushPrivatesApi.Code.TOO_LONG_TAGS;
        }
        return 0;
    }

    private int convertToMainWhat(int i11) {
        switch (i11) {
            case JPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                return JPushConstants.MainWhat.TAG_QUERY_ALL;
            case JPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                return JPushConstants.MainWhat.TAG_DELETE_ALL;
            case JPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                return JPushConstants.MainWhat.TAG_QUERY;
            case JPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                return JPushConstants.MainWhat.TAG_UPDATE;
            case JPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                return JPushConstants.MainWhat.TAG_DELETE;
            case JPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                return JPushConstants.MainWhat.TAG_ADD;
            default:
                return 0;
        }
    }

    private JSONArray convertToJsonArray(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    private int convertToMainWhat(String str) {
        str.getClass();
        switch (str) {
            case "add":
                return JPushConstants.MainWhat.TAG_ADD;
            case "del":
                return JPushConstants.MainWhat.TAG_DELETE;
            case "get":
                return JPushConstants.MainWhat.TAG_QUERY_ALL;
            case "set":
                return JPushConstants.MainWhat.TAG_UPDATE;
            case "clean":
                return JPushConstants.MainWhat.TAG_DELETE_ALL;
            case "valid":
                return JPushConstants.MainWhat.TAG_QUERY;
            default:
                return 0;
        }
    }

    private String[] convertToStringArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            strArr[i11] = jSONArray.optString(i11);
        }
        return strArr;
    }

    public static JTagBusiness getInstance() {
        if (instance == null) {
            synchronized (JTagBusiness.class) {
                instance = new JTagBusiness();
            }
        }
        return instance;
    }

    private TagMessage onTagQueryAll(Context context, int i11, int i12, int i13, int i14, String[] strArr) {
        if (i14 != 0 && i13 != 0) {
            try {
                if (this.tagMap.containsKey(Integer.valueOf(i12))) {
                    String[] strArr2 = this.tagMap.get(Integer.valueOf(i12));
                    String[] strArr3 = (String[]) Arrays.copyOf(strArr, strArr.length + strArr2.length);
                    System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
                    strArr = strArr3;
                }
                if (i13 >= i14) {
                    this.tagMap.remove(Integer.valueOf(i12));
                    return new TagMessage().setSequence(i12).setCode(i11).setTags(strArr);
                }
                this.tagMap.put(Integer.valueOf(i12), strArr);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("platform", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
                jSONObject.put("op", OP_TAG_QUERY);
                jSONObject.put("curr", i13 + 1);
                String string = jSONObject.toString();
                JCommonLog.m5430d(TAG, "sendTagOperation sequence:" + i12 + ", content:" + JCommonLog.toLogString(jSONObject));
                JProtocol threadName = new JProtocol().setRid((long) i12).setCommand(28).setVersion(1).setBody(JPushProtocol.packageOperationBody(string)).setThreadName(JPush.THREAD_PUSH);
                Bundle bundle = new Bundle();
                bundle.putParcelable("protocol", threadName);
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.UPLOAD, bundle);
                return null;
            } catch (Throwable th2) {
                JCommonLog.m5433w(TAG, "onTagQueryAll failed " + th2.getMessage());
            }
        }
        return null;
    }

    public void onTagOperationFailed(Context context, Bundle bundle) {
        try {
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            if (jProtocol == null) {
                return;
            }
            int rid = (int) jProtocol.getRid();
            String[] strArr = this.tagMap.get(Integer.valueOf(rid));
            this.tagMap.remove(Integer.valueOf(rid));
            TagMessage tags = new TagMessage().setSequence(rid).setCode(JPushPrivatesApi.Code.TIMEOUT).setTags(strArr);
            JCommonLog.m5430d(TAG, "onAliasOperationFailed sequence:" + rid + ", tagMessage:" + tags.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("tag", tags);
            JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.TAG_ADD, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onAliasOperationFailed failed " + th2.getMessage());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    public void onTagOperationSuccess(Context context, Bundle bundle) {
        Throwable th2;
        byte b11;
        try {
            JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
            if (jProtocol == null) {
                return;
            }
            int rid = (int) jProtocol.getRid();
            JSONObject jSONObject = new JSONObject(StringUtil.getTlv2(ByteBuffer.wrap(jProtocol.getBody())));
            JCommonLog.m5430d(TAG, "onTagOperationSuccess sequence:" + rid + ", content:" + JCommonLog.toLogString(jSONObject));
            int iOptInt = jSONObject.optInt("code");
            TagMessage code = new TagMessage().setSequence(rid).setCode(iOptInt);
            String strOptString = jSONObject.optString("op");
            int iConvertToMainWhat = convertToMainWhat(strOptString);
            try {
                switch (strOptString) {
                    case "add":
                        b11 = 0;
                        break;
                    case "del":
                        b11 = 1;
                        break;
                    case "get":
                        b11 = 5;
                        break;
                    case "set":
                        b11 = 2;
                        break;
                    case "clean":
                        b11 = 4;
                        break;
                    case "valid":
                        b11 = 3;
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                try {
                    if (b11 == 0 || b11 == 1 || b11 == 2) {
                        String[] strArr = this.tagMap.get(Integer.valueOf(rid));
                        this.tagMap.remove(Integer.valueOf(rid));
                        code.setTags(strArr);
                    } else if (b11 == 3) {
                        String str = this.tagMap.get(Integer.valueOf(rid))[0];
                        this.tagMap.remove(Integer.valueOf(rid));
                        code.setQueryTag(str).setQueryTagValid(jSONObject.optBoolean("validated"));
                    } else if (b11 == 5) {
                        code = onTagQueryAll(context, iOptInt, rid, jSONObject.optInt("curr"), jSONObject.optInt("total"), convertToStringArray(jSONObject.optJSONArray(C33616e0.f69644s)));
                        context = context;
                    }
                    if (code == null) {
                        return;
                    }
                    JCommonLog.m5430d(TAG, "onTagOperationSuccess tagMessage:" + code.toString());
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("tag", code);
                    JCommonPrivatesApi.sendMessageToMainProcess(context, iConvertToMainWhat, bundle2);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        JCommonLog.m5433w(TAG, "onTagOperationSuccess failed " + th2.getMessage());
    }

    @Override // cn.jiguang.privates.push.business.operation.JOperationBusiness
    public void processMainMessage(Context context, int i11, Bundle bundle) {
        JCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(TagMessage.class.getClassLoader());
            TagMessage tagMessage = (TagMessage) bundle.getParcelable("tag");
            if (tagMessage != null && (commonReceiver = JGlobal.getCommonReceiver(context)) != null) {
                switch (i11) {
                    case JPushConstants.MainWhat.TAG_ADD /* 3011 */:
                    case JPushConstants.MainWhat.TAG_DELETE /* 3012 */:
                    case JPushConstants.MainWhat.TAG_UPDATE /* 3013 */:
                    case JPushConstants.MainWhat.TAG_QUERY /* 3014 */:
                    case JPushConstants.MainWhat.TAG_DELETE_ALL /* 3015 */:
                    case JPushConstants.MainWhat.TAG_QUERY_ALL /* 3016 */:
                        commonReceiver.onTagMessage(context, tagMessage);
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
        try {
            int i12 = bundle.getInt(JPushConstants.Operation.KEY_SEQUENCE);
            String strConvertToOperation = convertToOperation(i11);
            int iConvertToMainWhat = convertToMainWhat(i11);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
            jSONObject.put("op", strConvertToOperation);
            switch (i11) {
                case JPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                    jSONObject.put("curr", 1);
                    break;
                case JPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                    String string = bundle.getString("tag");
                    int iCheckTag = checkTag(string);
                    if (iCheckTag != 0) {
                        TagMessage queryTag = new TagMessage().setSequence(i12).setCode(iCheckTag).setQueryTag(string);
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("tag", queryTag);
                        JCommonPrivatesApi.sendMessageToMainProcess(context, iConvertToMainWhat, bundle2);
                        return;
                    }
                    this.tagMap.put(Integer.valueOf(i12), new String[]{string});
                    jSONObject.put(C33616e0.f69644s, string);
                    break;
                case JPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                case JPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                case JPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                    String[] stringArray = bundle.getStringArray("tag");
                    int iCheckTag2 = checkTag(stringArray);
                    if (iCheckTag2 != 0) {
                        TagMessage tags = new TagMessage().setSequence(i12).setCode(iCheckTag2).setTags(stringArray);
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("tag", tags);
                        JCommonPrivatesApi.sendMessageToMainProcess(context, iConvertToMainWhat, bundle3);
                        return;
                    }
                    this.tagMap.put(Integer.valueOf(i12), stringArray);
                    jSONObject.put(C33616e0.f69644s, convertToJsonArray(stringArray));
                    break;
            }
            JCommonLog.m5430d(TAG, "sendAliasOperation sequence:" + i12 + ", content:" + JCommonLog.toLogString(jSONObject));
            byte[] bArrPackageOperationBody = JPushProtocol.packageOperationBody(jSONObject.toString());
            if (bArrPackageOperationBody == null) {
                return;
            }
            JProtocol threadName = new JProtocol().setRid(i12).setCommand(28).setVersion(1).setBody(bArrPackageOperationBody).setThreadName(JPush.THREAD_PUSH);
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("protocol", threadName);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.UPLOAD, bundle4);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "sendTagOperation failed " + th2.getMessage());
        }
    }

    private String convertToOperation(int i11) {
        switch (i11) {
            case JPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                return OP_TAG_QUERY_ALL;
            case JPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                return OP_TAG_DELETE_ALL;
            case JPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                return OP_TAG_QUERY;
            case JPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                return OP_TAG_UPDATE;
            case JPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                return OP_TAG_DELETE;
            case JPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                return OP_TAG_ADD;
            default:
                return "";
        }
    }

    private int checkTag(String str) {
        if (TextUtils.isEmpty(str)) {
            return JPushPrivatesApi.Code.INVALID_TAGS;
        }
        if (!Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
            return JPushPrivatesApi.Code.INVALID_TAGS;
        }
        try {
            if (str.getBytes("UTF-8").length > 40) {
                return JPushPrivatesApi.Code.TOO_LONG_TAG;
            }
            return 0;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getBytes failed " + th2.getMessage());
            return 0;
        }
    }
}
