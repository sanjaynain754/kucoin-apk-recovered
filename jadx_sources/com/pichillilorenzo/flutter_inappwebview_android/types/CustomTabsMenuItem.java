package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.firebase.messaging.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class CustomTabsMenuItem {

    /* JADX INFO: renamed from: id */
    private int f55831id;
    private String label;

    public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem(((Integer) map.get("id")).intValue(), (String) map.get(Constants.ScionAnalytics.PARAM_LABEL));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
        if (this.f55831id != customTabsMenuItem.f55831id) {
            return false;
        }
        return this.label.equals(customTabsMenuItem.label);
    }

    public int getId() {
        return this.f55831id;
    }

    public String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.f55831id * 31) + this.label.hashCode();
    }

    public void setId(int i11) {
        this.f55831id = i11;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String toString() {
        return "CustomTabsMenuItem{id=" + this.f55831id + ", label='" + this.label + "'}";
    }

    public CustomTabsMenuItem(int i11, String str) {
        this.f55831id = i11;
        this.label = str;
    }
}
