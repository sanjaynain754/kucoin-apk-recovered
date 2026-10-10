package com.tencent.imsdk.p128v2;

import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.imsdk.relationship.UserInfo;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMUserFullInfo extends V2TIMUserInfo {
    public static final String PROFILE_TYPE_KEY_ALLOWTYPE = "Tag_Profile_IM_AllowType";
    public static final String PROFILE_TYPE_KEY_CUSTOM_PREFIX = "Tag_Profile_Custom_";
    public static final String PROFILE_TYPE_KEY_FACEURL = "Tag_Profile_IM_Image";
    public static final String PROFILE_TYPE_KEY_GENDER = "Tag_Profile_IM_Gender";
    public static final String PROFILE_TYPE_KEY_NICK = "Tag_Profile_IM_Nick";
    public static final String PROFILE_TYPE_KEY_SELF_SIGNATURE = "Tag_Profile_IM_SelfSignature";
    public static final int V2TIM_FRIEND_ALLOW_ANY = 0;
    public static final int V2TIM_FRIEND_DENY_ANY = 2;
    public static final int V2TIM_FRIEND_NEED_CONFIRM = 1;
    public static final int V2TIM_GENDER_FEMALE = 2;
    public static final int V2TIM_GENDER_MALE = 1;
    public static final int V2TIM_GENDER_UNKNOWN = 0;

    public int getAllowType() {
        int allowType = this.userInfo.getAllowType();
        if (allowType == 2) {
            return 2;
        }
        return (allowType != 1 && allowType == 0) ? 0 : 1;
    }

    public HashMap<String, byte[]> getCustomInfo() {
        return this.userInfo.getCustomUserInfoString();
    }

    public int getGender() {
        int gender = this.userInfo.getGender();
        if (gender == 1) {
            return 1;
        }
        return gender == 2 ? 2 : 0;
    }

    public int getLevel() {
        return this.userInfo.getLevel();
    }

    public int getRole() {
        return this.userInfo.getRole();
    }

    public String getSelfSignature() {
        return this.userInfo.getSignature();
    }

    public void setAllowType(int i11) {
        if (i11 == 0) {
            this.userInfo.setAllowType(0);
            this.modifyParams.put("Tag_Profile_IM_AllowType", UserInfo.USERINFO_ALLOWTYPE_TYPE_ALLOWANY);
        } else if (2 == i11) {
            this.userInfo.setAllowType(2);
            this.modifyParams.put("Tag_Profile_IM_AllowType", UserInfo.USERINFO_ALLOWTYPE_TYPE_DENYANY);
        } else if (1 == i11) {
            this.userInfo.setAllowType(1);
            this.modifyParams.put("Tag_Profile_IM_AllowType", UserInfo.USERINFO_ALLOWTYPE_TYPE_NEEDCONFIRM);
        } else {
            this.userInfo.setAllowType(1);
            this.modifyParams.put("Tag_Profile_IM_AllowType", UserInfo.USERINFO_ALLOWTYPE_TYPE_NEEDCONFIRM);
        }
    }

    public void setCustomInfo(HashMap<String, byte[]> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (entry.getKey().contains("Tag_Profile_Custom_")) {
                this.modifyParams.put(entry.getKey(), entry.getValue());
            } else {
                this.modifyParams.put("Tag_Profile_Custom_" + entry.getKey(), new String(entry.getValue()));
            }
        }
    }

    public void setGender(int i11) {
        if (1 == i11) {
            this.userInfo.setGender(1);
            this.modifyParams.put("Tag_Profile_IM_Gender", UserInfo.USERINFO_GENDER_TYPE_MALE);
        } else if (2 == i11) {
            this.userInfo.setGender(2);
            this.modifyParams.put("Tag_Profile_IM_Gender", UserInfo.USERINFO_GENDER_TYPE_FEMALE);
        } else {
            this.userInfo.setGender(0);
            this.modifyParams.put("Tag_Profile_IM_Gender", UserInfo.USERINFO_GENDER_TYPE_UNKNOWN);
        }
    }

    public void setLevel(int i11) {
        this.userInfo.setLevel(i11);
        this.modifyParams.put(UserInfo.USERINFO_KEY_LEVEL, Integer.valueOf(i11));
    }

    public void setRole(int i11) {
        this.userInfo.setRole(i11);
        this.modifyParams.put(UserInfo.USERINFO_KEY_ROLE, Integer.valueOf(i11));
    }

    public void setSelfSignature(String str) {
        byte[] bytes;
        this.userInfo.setSignature(str);
        if (TextUtils.isEmpty(str)) {
            bytes = new byte[0];
        } else {
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
                bytes = new byte[0];
            }
        }
        this.modifyParams.put("Tag_Profile_IM_SelfSignature", bytes);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMUserInfo
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("V2TIMUserFullInfo--->");
        HashMap<String, byte[]> customInfo = getCustomInfo();
        StringBuilder sb3 = new StringBuilder();
        if (customInfo != null) {
            sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            for (Map.Entry<String, byte[]> entry : customInfo.entrySet()) {
                sb3.append(" |key:" + entry.getKey() + ", value:" + new String(entry.getValue()));
                sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        sb2.append("userID:");
        sb2.append(getUserID());
        sb2.append(", nickName:");
        sb2.append(getNickName());
        sb2.append(", gender:");
        sb2.append(getGender());
        sb2.append(", faceUrl:");
        sb2.append(getFaceUrl());
        sb2.append(", selfSignature:");
        sb2.append(getSelfSignature());
        sb2.append(", allowType:");
        sb2.append(getAllowType());
        sb2.append(", customInfo:");
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMUserInfo
    public void setFaceUrl(String str) {
        super.setFaceUrl(str);
    }

    public void setNickname(String str) {
        super.setNickName(str);
    }
}
