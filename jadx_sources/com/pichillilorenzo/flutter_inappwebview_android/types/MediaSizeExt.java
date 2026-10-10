package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class MediaSizeExt {
    private int heightMils;

    /* JADX INFO: renamed from: id */
    private String f55833id;
    private String label;
    private int widthMils;

    public static MediaSizeExt fromMediaSize(PrintAttributes.MediaSize mediaSize) {
        if (mediaSize == null) {
            return null;
        }
        return new MediaSizeExt(mediaSize.getId(), null, mediaSize.getHeightMils(), mediaSize.getWidthMils());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MediaSizeExt mediaSizeExt = (MediaSizeExt) obj;
            if (this.widthMils != mediaSizeExt.widthMils || this.heightMils != mediaSizeExt.heightMils || !this.f55833id.equals(mediaSizeExt.f55833id)) {
                return false;
            }
            String str = this.label;
            String str2 = mediaSizeExt.label;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public static MediaSizeExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MediaSizeExt((String) map.get("id"), (String) map.get(Constants.ScionAnalytics.PARAM_LABEL), ((Integer) map.get("widthMils")).intValue(), ((Integer) map.get("heightMils")).intValue());
    }

    public int getHeightMils() {
        return this.heightMils;
    }

    public String getId() {
        return this.f55833id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getWidthMils() {
        return this.widthMils;
    }

    public int hashCode() {
        int iHashCode = this.f55833id.hashCode() * 31;
        String str = this.label;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.widthMils) * 31) + this.heightMils;
    }

    public void setHeightMils(int i11) {
        this.heightMils = i11;
    }

    public void setId(String str) {
        this.f55833id = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setWidthMils(int i11) {
        this.widthMils = i11;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("id", this.f55833id);
        map.put(Constants.ScionAnalytics.PARAM_LABEL, this.label);
        map.put("heightMils", Integer.valueOf(this.heightMils));
        map.put("widthMils", Integer.valueOf(this.widthMils));
        return map;
    }

    public PrintAttributes.MediaSize toMediaSize() {
        return new PrintAttributes.MediaSize(this.f55833id, TypedValues.Custom.NAME, this.widthMils, this.heightMils);
    }

    public String toString() {
        return "MediaSizeExt{id='" + this.f55833id + "', label='" + this.label + "', widthMils=" + this.widthMils + ", heightMils=" + this.heightMils + '}';
    }

    public MediaSizeExt(String str, String str2, int i11, int i12) {
        this.f55833id = str;
        this.label = str2;
        this.widthMils = i11;
        this.heightMils = i12;
    }
}
