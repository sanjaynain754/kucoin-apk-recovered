package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes59.dex */
public class InAppBrowserMenuItem {
    private Object icon;
    private String iconColor;

    /* JADX INFO: renamed from: id */
    private int f55832id;
    private Integer order;
    private boolean showAsAction;
    private String title;

    public static InAppBrowserMenuItem fromMap(Map<String, Object> map) {
        Object obj;
        AndroidResource androidResourceFromMap = null;
        if (map == null) {
            return null;
        }
        int iIntValue = ((Integer) map.get("id")).intValue();
        String str = (String) map.get("title");
        Integer num = (Integer) map.get("order");
        Object obj2 = map.get(TUIConstants.TUIChat.INPUT_MORE_ICON);
        if (!(obj2 instanceof Map)) {
            if (obj2 instanceof byte[]) {
                obj = obj2;
            }
            return new InAppBrowserMenuItem(iIntValue, str, num, obj, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
        }
        androidResourceFromMap = AndroidResource.fromMap((Map) map.get(TUIConstants.TUIChat.INPUT_MORE_ICON));
        obj = androidResourceFromMap;
        return new InAppBrowserMenuItem(iIntValue, str, num, obj, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InAppBrowserMenuItem inAppBrowserMenuItem = (InAppBrowserMenuItem) obj;
        if (this.f55832id == inAppBrowserMenuItem.f55832id && this.showAsAction == inAppBrowserMenuItem.showAsAction && this.title.equals(inAppBrowserMenuItem.title) && Objects.equals(this.order, inAppBrowserMenuItem.order) && Objects.equals(this.icon, inAppBrowserMenuItem.icon)) {
            return Objects.equals(this.iconColor, inAppBrowserMenuItem.iconColor);
        }
        return false;
    }

    public Object getIcon() {
        return this.icon;
    }

    public String getIconColor() {
        return this.iconColor;
    }

    public int getId() {
        return this.f55832id;
    }

    public Integer getOrder() {
        return this.order;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((this.f55832id * 31) + this.title.hashCode()) * 31;
        Integer num = this.order;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        Object obj = this.icon;
        int iHashCode3 = (iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31;
        String str = this.iconColor;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + (this.showAsAction ? 1 : 0);
    }

    public boolean isShowAsAction() {
        return this.showAsAction;
    }

    public void setIcon(Object obj) {
        this.icon = obj;
    }

    public void setIconColor(String str) {
        this.iconColor = str;
    }

    public void setId(int i11) {
        this.f55832id = i11;
    }

    public void setOrder(Integer num) {
        this.order = num;
    }

    public void setShowAsAction(boolean z11) {
        this.showAsAction = z11;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "InAppBrowserMenuItem{id=" + this.f55832id + ", title='" + this.title + "', order=" + this.order + ", icon=" + this.icon + ", iconColor='" + this.iconColor + "', showAsAction=" + this.showAsAction + '}';
    }

    public InAppBrowserMenuItem(int i11, String str, Integer num, Object obj, String str2, boolean z11) {
        this.f55832id = i11;
        this.title = str;
        this.order = num;
        this.icon = obj;
        this.iconColor = str2;
        this.showAsAction = z11;
    }
}
