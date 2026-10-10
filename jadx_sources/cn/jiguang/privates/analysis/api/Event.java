package cn.jiguang.privates.analysis.api;

import android.os.Parcel;
import android.os.Parcelable;
import cn.jiguang.privates.analysis.business.event.JEventBusiness;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.log.JCommonLog;
import com.tencent.bugly.proguard.C33812n7;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: cn.jiguang.privates.analysis.api.Event.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Event[] newArray(int i11) {
            return new Event[i11];
        }
    };
    private static final String TAG = "Event";
    protected HashMap extraAttrMap;
    private String name;

    public Event(String str) {
        this.extraAttrMap = new HashMap();
        this.name = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, Object> getExtraAttrMap() {
        return this.extraAttrMap;
    }

    public String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Event> T putExtraAttr(String str, Object obj) {
        try {
            if (JAnalyticsHelper.isValidParam(str, obj)) {
                HashMap map = this.extraAttrMap;
                if (map == null) {
                    JCommonLog.m5430d(TAG, "can't put [" + str + "], event extraAttrMap is null");
                    return this;
                }
                if (map.size() >= 50) {
                    JCommonLog.m5430d(TAG, "can't put [" + str + "], event extraAttrMap size can't be no more than 50");
                }
                if (!str.equals(C33812n7.f71061t)) {
                    obj = JAnalyticsHelper.cutoutValue(obj);
                }
                if (JAnalyticsHelper.isValidValue(obj)) {
                    if (JEventBusiness.getInstance().getCommonProperty().containsKey(str)) {
                        JCommonLog.m5433w(TAG, "the key [" + str + "] is in commonProperty, please check it");
                        return this;
                    }
                    if (JEventBusiness.getInstance().getDynamicProperty().containsKey(str)) {
                        JCommonLog.m5433w(TAG, "the key [" + str + "] is in dynamicProperty, please check it");
                        return this;
                    }
                    this.extraAttrMap.put(str, obj);
                    JCommonLog.m5430d(TAG, this.name + " put key:" + str + ",value:" + obj);
                    return this;
                }
            }
            return this;
        } catch (Exception e11) {
            JCommonLog.m5433w(TAG, "putExtraAttr e:" + e11.getMessage());
            return null;
        }
    }

    public String toString() {
        return "\n{\n  name='" + this.name + ",\n  extraAttrMap=" + this.extraAttrMap + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.name);
        parcel.writeMap(this.extraAttrMap);
    }

    public Event(Parcel parcel) {
        this.extraAttrMap = new HashMap();
        this.name = parcel.readString();
        this.extraAttrMap = parcel.readHashMap(HashMap.class.getClassLoader());
    }
}
