package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class CreateWindowAction extends NavigationAction {
    boolean isDialog;
    int windowId;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CreateWindowAction createWindowAction = (CreateWindowAction) obj;
        return this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog;
    }

    public int getWindowId() {
        return this.windowId;
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void setDialog(boolean z11) {
        this.isDialog = z11;
    }

    public void setWindowId(int i11) {
        this.windowId = i11;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public String toString() {
        return "CreateWindowAction{windowId=" + this.windowId + ", isDialog=" + this.isDialog + ", request=" + this.request + ", isForMainFrame=" + this.isForMainFrame + ", hasGesture=" + this.hasGesture + ", isRedirect=" + this.isRedirect + '}';
    }

    public CreateWindowAction(URLRequest uRLRequest, boolean z11, boolean z12, boolean z13, int i11, boolean z14) {
        super(uRLRequest, z11, z12, z13);
        this.windowId = i11;
        this.isDialog = z14;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public int hashCode() {
        return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("windowId", Integer.valueOf(this.windowId));
        map.put("isDialog", Boolean.valueOf(this.isDialog));
        map.put("windowFeatures", null);
        return map;
    }
}
