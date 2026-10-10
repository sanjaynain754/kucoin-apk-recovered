package cn.jiguang.privates.analysis.business.account;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.analysis.api.Account;
import cn.jiguang.privates.analysis.business.report.JReportBusiness;
import cn.jiguang.privates.analysis.cache.JAnalysisConfig;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JAccountBusiness {
    private static final String ACCOUNT_0 = "a0";
    private static final String ACCOUNT_1 = "a1";
    private static final String ACCOUNT_2 = "a2";
    private static final String ACCOUNT_3 = "a3";
    private static final String ACCOUNT_FIRST = "firstAccount";
    private static final String ACCOUNT_FOLLOW = "followAccount";
    private static final String FLAG = "flag";
    private static final int FLAG_FIRST = 0;
    private static final int FLAG_FOLLOW = 1;
    private static final String OFFSET = "offset";
    private static final String TAG = "JAccountBusiness";
    private static volatile JAccountBusiness instance;

    public void onAccount(Context context, Bundle bundle) {
        onAccount(context, (Account) bundle.getParcelable(JAnalysisConstants.Account.KEY_ACCOUNT));
    }

    private String getAccountIds(Context context, List<String> list) {
        JCommonLog.m5430d(TAG, "user set account is:" + list.toString());
        String firstAccount = JAnalysisConfig.getFirstAccount(context);
        if (TextUtils.isEmpty(firstAccount)) {
            return newAccount(context, list, ACCOUNT_FIRST);
        }
        String strOverAccount = overAccount(context, firstAccount, list, ACCOUNT_FIRST);
        if (!TextUtils.isEmpty(strOverAccount)) {
            return strOverAccount;
        }
        String followAccount = JAnalysisConfig.getFollowAccount(context);
        return TextUtils.isEmpty(followAccount) ? newAccount(context, list, ACCOUNT_FOLLOW) : overAccount(context, followAccount, list, ACCOUNT_FOLLOW);
    }

    public static JAccountBusiness getInstance() {
        if (instance == null) {
            synchronized (JAccountBusiness.class) {
                instance = new JAccountBusiness();
            }
        }
        return instance;
    }

    private String newAccount(Context context, List<String> list, String str) {
        String string = list.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        JCommonLog.m5430d(TAG, str + " new user account and save [" + strSubstring + "] to local");
        boolean zIsEmpty = TextUtils.isEmpty(list.get(0));
        str.getClass();
        if (str.equals(ACCOUNT_FIRST)) {
            JAnalysisConfig.setFirstAccount(context, strSubstring);
            JAnalysisConfig.setFirstAccountOffset(context, zIsEmpty ? 1 : 0);
        } else if (str.equals(ACCOUNT_FOLLOW)) {
            JAnalysisConfig.setFollowAccount(context, strSubstring);
            JAnalysisConfig.setFollowAccountOffset(context, zIsEmpty ? 1 : 0);
        }
        return packageAccount(list, !TextUtils.equals(str, ACCOUNT_FIRST) ? 1 : 0, zIsEmpty ? 1 : 0);
    }

    private String overAccount(Context context, String str, List<String> list, String str2) {
        int firstAccountOffset;
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(", ")));
        JCommonLog.m5430d(TAG, "local " + str2 + " is:" + arrayList.toString());
        int i11 = 0;
        boolean z11 = false;
        while (i11 < list.size()) {
            if (arrayList.contains(list.get(i11))) {
                z11 = true;
            }
            i11++;
            z11 = z11;
        }
        if (!z11) {
            return str2.equals(ACCOUNT_FIRST) ? "" : newAccount(context, list, str2);
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            if (!arrayList.contains(list.get(i12)) && arrayList.size() <= 3) {
                arrayList.add(list.get(i12));
                JCommonLog.m5430d(TAG, "over list add:" + list.get(i12) + "," + arrayList.toString());
            }
        }
        int i13 = 1;
        boolean z12 = true;
        while (i13 < arrayList.size()) {
            if (!TextUtils.isEmpty(list.get(0)) && list.get(0).equals(arrayList.get(i13))) {
                z12 = false;
            }
            i13++;
            z12 = z12;
        }
        if (z12 && TextUtils.isEmpty(arrayList.get(0)) && !TextUtils.isEmpty(list.get(0))) {
            arrayList.set(0, list.get(0));
        }
        String string = arrayList.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        str2.getClass();
        if (str2.equals(ACCOUNT_FIRST)) {
            JAnalysisConfig.setFirstAccount(context, strSubstring);
            firstAccountOffset = JAnalysisConfig.getFirstAccountOffset(context);
        } else if (str2.equals(ACCOUNT_FOLLOW)) {
            JAnalysisConfig.setFollowAccount(context, strSubstring);
            firstAccountOffset = JAnalysisConfig.getFollowAccountOffset(context);
        } else {
            firstAccountOffset = 0;
        }
        int i14 = firstAccountOffset != -1 ? firstAccountOffset : 0;
        JCommonLog.m5430d(TAG, "is same with " + str2 + " and save [" + strSubstring + "] to local");
        return packageAccount(arrayList, !TextUtils.equals(str2, ACCOUNT_FIRST) ? 1 : 0, i14);
    }

    private String packageAccount(List<String> list, int i11, int i12) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ACCOUNT_0, list.get(0));
            if (list.size() > 1 && !TextUtils.isEmpty(list.get(1))) {
                jSONObject.put("a1", list.get(1));
            }
            if (list.size() > 2 && !TextUtils.isEmpty(list.get(2))) {
                jSONObject.put("a2", list.get(2));
            }
            if (list.size() > 3 && !TextUtils.isEmpty(list.get(3))) {
                jSONObject.put("a3", list.get(3));
            }
            jSONObject.put(FLAG, i11);
            jSONObject.put("offset", i12);
            return jSONObject.toString();
        } catch (Exception e11) {
            JCommonLog.m5433w(TAG, "packageAccount e:" + e11.getMessage());
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    private JSONObject packageJson(Account account) {
        byte b11;
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, Object> internalAttrMap = account.getInternalAttrMap();
            JSONObject jSONObject2 = new JSONObject();
            if (internalAttrMap != null && internalAttrMap.size() > 0) {
                Iterator<Map.Entry<String, Object>> it = internalAttrMap.entrySet().iterator();
                while (it.hasNext()) {
                    switch (it.next().getKey()) {
                        case "$sex":
                            b11 = 2;
                            break;
                        case "$name":
                            b11 = 1;
                            break;
                        case "$creation_time":
                            b11 = 0;
                            break;
                        case "$email":
                            b11 = 4;
                            break;
                        case "$phone":
                            b11 = 3;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    if (b11 == 0) {
                        jSONObject2.put(JAnalysisConstants.ACCOUNT_INTERNAL_TIME, account.getTime());
                    } else if (b11 == 1) {
                        jSONObject2.put(JAnalysisConstants.ACCOUNT_INTERNAL_NAME, account.getName());
                    } else if (b11 == 2) {
                        jSONObject2.put(JAnalysisConstants.ACCOUNT_INTERNAL_SEX, account.getSex());
                    } else if (b11 == 3) {
                        jSONObject2.put(JAnalysisConstants.ACCOUNT_INTERNAL_PHONE, account.getPhone());
                    } else if (b11 == 4) {
                        jSONObject2.put(JAnalysisConstants.ACCOUNT_INTERNAL_MAIL, account.getEmail());
                    }
                }
            }
            Map<String, Object> extraAttrMap = account.getExtraAttrMap();
            if (extraAttrMap != null && extraAttrMap.size() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Object> entry : extraAttrMap.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, jSONObject3);
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put(JAnalysisConstants.ACCOUNT_SET_ATTR, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e11) {
            JCommonLog.m5430d(TAG, "packageJson e:" + e11.getMessage());
            return null;
        }
    }

    public void init(Context context) {
        try {
            String accountCommonJson = JAnalysisConfig.getAccountCommonJson(context);
            if (!TextUtils.isEmpty(accountCommonJson)) {
                JReportBusiness.getInstance().report(context, new JSONObject(accountCommonJson));
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "init failed " + th2.getMessage());
        }
    }

    public void onAccount(Context context, Account account) {
        List<String> idList = account.getIdList();
        if (idList == null || idList.isEmpty()) {
            JCommonLog.m5430d(TAG, "onAccount failed, idList is empty");
            return;
        }
        String accountIds = getAccountIds(context, idList);
        JCommonLog.m5430d(TAG, "onAccount accountId:" + accountIds);
        JAnalysisConfig.setAccountId(context, accountIds);
        JSONObject jSONObjectPackageJson = packageJson(account);
        if (jSONObjectPackageJson == null) {
            return;
        }
        JSONObject jSONObjectPrepareReportJson = JReportBusiness.getInstance().prepareReportJson(context, JAnalysisConstants.TYPE_ACCOUNT, jSONObjectPackageJson);
        JReportBusiness.getInstance().report(context, jSONObjectPrepareReportJson);
        JAnalysisConfig.setAccountCommonJson(context, jSONObjectPrepareReportJson.toString());
    }
}
