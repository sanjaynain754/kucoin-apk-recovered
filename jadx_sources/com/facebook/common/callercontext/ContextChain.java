package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C33844oi;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new C5565a();
    private static final char PARENT_SEPARATOR = '/';
    public static final String TAG_INFRA = "i";
    public static final String TAG_PRODUCT = "p";
    public static final String TAG_PRODUCT_AND_INFRA = "pi";
    private static boolean sUseConcurrentHashMap;
    private Map<String, Object> mExtraData;
    private final String mName;
    private final ContextChain mParent;
    private String mSerializedChainString;
    private String mSerializedNodeString;
    private final String mTag;

    /* JADX INFO: renamed from: com.facebook.common.callercontext.ContextChain$a */
    public class C5565a implements Parcelable.Creator<ContextChain> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ContextChain createFromParcel(Parcel parcel) {
            return new ContextChain(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ContextChain[] newArray(int i11) {
            return new ContextChain[i11];
        }
    }

    public ContextChain(String str, String str2, Map<String, String> map, ContextChain contextChain) {
        this.mTag = str;
        this.mName = str2;
        this.mSerializedNodeString = str + C33844oi.f71346o + str2;
        this.mParent = contextChain;
        initializeExtraData(contextChain, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContextChain contextChain = (ContextChain) obj;
            if (Objects.equals(getNodeString(), contextChain.getNodeString()) && Objects.equals(this.mParent, contextChain.mParent)) {
                return true;
            }
        }
        return false;
    }

    private void initializeExtraData(ContextChain contextChain, Map<String, ?> map) {
        Map<String, Object> extraData = contextChain != null ? contextChain.getExtraData() : null;
        if (extraData != null) {
            if (sUseConcurrentHashMap) {
                this.mExtraData = new ConcurrentHashMap(extraData);
            } else {
                this.mExtraData = new HashMap(extraData);
            }
        }
        if (map != null) {
            if (this.mExtraData == null) {
                if (sUseConcurrentHashMap) {
                    this.mExtraData = new ConcurrentHashMap();
                } else {
                    this.mExtraData = new HashMap();
                }
            }
            this.mExtraData.putAll(map);
        }
    }

    public static void setUseConcurrentHashMap(boolean z11) {
        sUseConcurrentHashMap = z11;
    }

    public Map<String, Object> getExtraData() {
        return this.mExtraData;
    }

    public String getName() {
        return this.mName;
    }

    public String getNodeString() {
        return this.mSerializedNodeString;
    }

    public ContextChain getParent() {
        return this.mParent;
    }

    public ContextChain getRootContextChain() {
        ContextChain contextChain = this.mParent;
        return contextChain == null ? this : contextChain.getRootContextChain();
    }

    public String getStringExtra(String str) {
        Object obj;
        Map<String, Object> map = this.mExtraData;
        if (map == null) {
            return null;
        }
        if ((sUseConcurrentHashMap && str == null) || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public String getTag() {
        return this.mTag;
    }

    public int hashCode() {
        return Objects.hash(this.mParent, getNodeString());
    }

    public void putObjectExtra(String str, Object obj) {
        boolean z11 = sUseConcurrentHashMap;
        if (z11 && (str == null || obj == null)) {
            return;
        }
        if (this.mExtraData == null) {
            if (z11) {
                this.mExtraData = new ConcurrentHashMap();
            } else {
                this.mExtraData = new HashMap();
            }
        }
        this.mExtraData.put(str, obj);
    }

    public String toString() {
        if (this.mSerializedChainString == null) {
            this.mSerializedChainString = getNodeString();
            if (this.mParent != null) {
                this.mSerializedChainString = this.mParent.toString() + PARENT_SEPARATOR + this.mSerializedChainString;
            }
        }
        return this.mSerializedChainString;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.mTag);
        parcel.writeString(this.mName);
        parcel.writeString(getNodeString());
        parcel.writeParcelable(this.mParent, i11);
    }

    public String[] toStringArray() {
        return toString().split(String.valueOf(PARENT_SEPARATOR));
    }

    public ContextChain(String str, Map<String, Object> map, ContextChain contextChain) {
        this.mTag = "serialized_tag";
        this.mName = "serialized_name";
        this.mSerializedNodeString = str;
        this.mParent = contextChain;
        initializeExtraData(contextChain, map);
    }

    public ContextChain(String str, ContextChain contextChain) {
        this(str, (Map<String, Object>) null, contextChain);
    }

    public ContextChain(String str, String str2, ContextChain contextChain) {
        this(str, str2, null, contextChain);
    }

    public ContextChain(Parcel parcel) {
        this.mTag = parcel.readString();
        this.mName = parcel.readString();
        this.mSerializedNodeString = parcel.readString();
        this.mParent = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }
}
