package cn.jiguang.privates.analysis.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public class Account implements Parcelable {
    public static final int SEX_FEMALE = 2;
    public static final int SEX_MALE = 1;
    public static final int SEX_NOT_DEFINE = 0;
    private static final String TAG = "Account";
    private String email;
    public HashMap extraAttrMap;
    private List<String> idList;
    public HashMap internalAttrMap;
    private String name;
    private String phone;
    private int sex;
    private long time;
    private static final Pattern phonePattern = Pattern.compile("^[+|(|0-9][0-9|\\-|(|)| ]{1,19}$");
    private static final Pattern emailPattern = Pattern.compile("^.+@.+\\..+$");
    public static final Parcelable.Creator<Account> CREATOR = new Parcelable.Creator<Account>() { // from class: cn.jiguang.privates.analysis.api.Account.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Account createFromParcel(Parcel parcel) {
            return new Account(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Account[] newArray(int i11) {
            return new Account[i11];
        }
    };

    public Account(String... strArr) {
        this.extraAttrMap = new HashMap();
        this.internalAttrMap = new HashMap();
        try {
            if (strArr == null) {
                JCommonLog.m5433w(TAG, "ids must not be empty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i11 >= length) {
                    if (!z11) {
                        JCommonLog.m5433w(TAG, "all id is empty");
                        return;
                    }
                    for (int i12 = 1; i12 < strArr.length; i12++) {
                        if (!strArr[0].equals(strArr[i12]) && JAnalyticsHelper.isValidId(strArr[i12]) && !arrayList.contains(strArr[i12])) {
                            arrayList.add(strArr[i12]);
                        }
                    }
                    arrayList.add(0, JAnalyticsHelper.isValidId(strArr[0]) ? strArr[0] : "");
                    this.idList = arrayList;
                    return;
                }
                String str = strArr[i11];
                if (str == null) {
                    JCommonLog.m5433w(TAG, "has null id");
                    return;
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        z11 = true;
                    }
                    i11++;
                }
            }
        } catch (Exception e11) {
            JCommonLog.m5433w(TAG, "Account e:" + e11.getMessage());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private void putInternalAttr(String str, Object obj) {
        try {
            if (JAnalyticsHelper.isValidValue(obj)) {
                Object objCutoutValue = JAnalyticsHelper.cutoutValue(obj);
                if (JAnalyticsHelper.isValidValue(objCutoutValue)) {
                    this.internalAttrMap.put(str, objCutoutValue);
                    JCommonLog.m5430d(TAG, "putInternalAttr key:" + str + ",value:" + objCutoutValue);
                }
            }
        } catch (Exception e11) {
            JCommonLog.m5430d(TAG, "putInternalAttr failed " + e11.getMessage());
        }
    }

    public String getEmail() {
        return this.email;
    }

    public Map<String, Object> getExtraAttrMap() {
        return this.extraAttrMap;
    }

    public List<String> getIdList() {
        return this.idList;
    }

    public Map<String, Object> getInternalAttrMap() {
        return this.internalAttrMap;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getSex() {
        return this.sex;
    }

    public long getTime() {
        return this.time;
    }

    public Account putExtraAttr(String str, Object obj) {
        try {
            if (JAnalyticsHelper.isValidParam(str, obj)) {
                if (str.startsWith("$")) {
                    JCommonLog.m5430d(TAG, "extra key can't startWith $");
                    return this;
                }
                if (this.extraAttrMap.size() >= 30 && !this.extraAttrMap.containsKey(str)) {
                    JCommonLog.m5430d(TAG, "can't put key [" + str + "], account extraAttrMap size can't be no more than 30");
                    return this;
                }
                Object objCutoutValue = JAnalyticsHelper.cutoutValue(obj);
                if (JAnalyticsHelper.isValidValue(objCutoutValue)) {
                    this.extraAttrMap.put("_" + str, objCutoutValue);
                    JCommonLog.m5430d(TAG, "putExtraAttr key:" + str + ",value:" + objCutoutValue);
                    return this;
                }
            }
        } catch (Exception e11) {
            JCommonLog.m5430d(TAG, "putExtraAttr failed " + e11.getMessage());
        }
        return this;
    }

    public Account setSex(int i11) {
        if (i11 < 0 || i11 > 2) {
            JCommonLog.m5430d(TAG, "sex range is [0,2],0 is no define,1 is male,2 is female");
            return this;
        }
        this.sex = i11;
        putInternalAttr(JAnalysisConstants.ACCOUNT_INTERNAL_SEX, Integer.valueOf(i11));
        return this;
    }

    public Account setTime(long j11) {
        if (j11 < 0) {
            JCommonLog.m5430d(TAG, "time can't be no less than 0");
            return this;
        }
        this.time = j11;
        putInternalAttr(JAnalysisConstants.ACCOUNT_INTERNAL_TIME, Long.valueOf(j11));
        return this;
    }

    public String toString() {
        return "\n{\n  idList='" + this.idList + ",\n  time=" + this.time + ",\n  name='" + this.name + ",\n  sex='" + this.sex + ",\n  phone='" + this.phone + ",\n  email='" + this.email + ",\n  extraAttrMap='" + this.extraAttrMap + ",\n  internalAttrMap=" + this.internalAttrMap + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.idList);
        parcel.writeLong(this.time);
        parcel.writeString(this.name);
        parcel.writeInt(this.sex);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        parcel.writeMap(this.extraAttrMap);
        parcel.writeMap(this.internalAttrMap);
    }

    public Account setEmail(String str) {
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5430d(TAG, "mail can't be empty");
            return this;
        }
        if (!emailPattern.matcher(str).matches()) {
            JCommonLog.m5430d(TAG, "mail is invalid, mail:" + str);
            return this;
        }
        this.email = str;
        putInternalAttr(JAnalysisConstants.ACCOUNT_INTERNAL_MAIL, str);
        return this;
    }

    public Account setName(String str) {
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5430d(TAG, "name must not be empty");
            return this;
        }
        this.name = str;
        putInternalAttr(JAnalysisConstants.ACCOUNT_INTERNAL_NAME, str);
        return this;
    }

    public Account setPhone(String str) {
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5430d(TAG, "phone can't be empty");
            return this;
        }
        if (!phonePattern.matcher(str).matches()) {
            JCommonLog.m5430d(TAG, "phone is invalid, phone:" + str);
            return this;
        }
        this.phone = str;
        putInternalAttr(JAnalysisConstants.ACCOUNT_INTERNAL_PHONE, str);
        return this;
    }

    public Account(Parcel parcel) {
        this.extraAttrMap = new HashMap();
        this.internalAttrMap = new HashMap();
        this.idList = parcel.createStringArrayList();
        this.time = parcel.readLong();
        this.name = parcel.readString();
        this.sex = parcel.readInt();
        this.phone = parcel.readString();
        this.email = parcel.readString();
        this.extraAttrMap = parcel.readHashMap(HashMap.class.getClassLoader());
        this.internalAttrMap = parcel.readHashMap(HashMap.class.getClassLoader());
    }
}
