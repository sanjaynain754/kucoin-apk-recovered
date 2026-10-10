package com.kubi.sdk.widget.dialog;

import android.view.View;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.widget.dialog.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: BottomSheetDialogHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0094\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\bHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0011\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010(\"\u0004\b+\u0010*R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016¨\u0006@"}, m90084d2 = {"Lcom/kubi/sdk/widget/dialog/SelectEntity;", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "id", "", Constants.ScionAnalytics.PARAM_LABEL, "", "value", "resourceId", "", "resourceUrl", "resourceText", "resourceView", "Landroid/view/View;", "textColor", "rightText", "clickEnabled", "", "isChecked", "subLabel", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabel", "()Ljava/lang/CharSequence;", "getValue", "getResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResourceUrl", "getResourceText", "getResourceView", "()Landroid/view/View;", "getTextColor", "setTextColor", "(Ljava/lang/Integer;)V", "getRightText", "setRightText", "(Ljava/lang/String;)V", "getClickEnabled", "()Z", "setClickEnabled", "(Z)V", "setChecked", "getSubLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;)Lcom/kubi/sdk/widget/dialog/SelectEntity;", "equals", "other", "", "hashCode", "toString", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SelectEntity implements BottomSheetDialogHelper.InterfaceC24339a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final CharSequence label;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Integer resourceId;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final String resourceUrl;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final String resourceText;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final View resourceView;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public Integer textColor;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public String rightText;

    /* JADX INFO: renamed from: j, reason: from toString */
    public boolean clickEnabled;

    /* JADX INFO: renamed from: k, reason: from toString */
    public boolean isChecked;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public final String subLabel;

    public SelectEntity() {
        this(null, null, null, null, null, null, null, null, null, false, false, null, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectEntity)) {
            return false;
        }
        SelectEntity selectEntity = (SelectEntity) other;
        return Intrinsics.areEqual(this.id, selectEntity.id) && Intrinsics.areEqual(this.label, selectEntity.label) && Intrinsics.areEqual(this.value, selectEntity.value) && Intrinsics.areEqual(this.resourceId, selectEntity.resourceId) && Intrinsics.areEqual(this.resourceUrl, selectEntity.resourceUrl) && Intrinsics.areEqual(this.resourceText, selectEntity.resourceText) && Intrinsics.areEqual(this.resourceView, selectEntity.resourceView) && Intrinsics.areEqual(this.textColor, selectEntity.textColor) && Intrinsics.areEqual(this.rightText, selectEntity.rightText) && this.clickEnabled == selectEntity.clickEnabled && this.isChecked == selectEntity.isChecked && Intrinsics.areEqual(this.subLabel, selectEntity.subLabel);
    }

    public SelectEntity(@NotNull String id2, @NotNull CharSequence label, @NotNull String value, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable View view, @Nullable Integer num2, @Nullable String str3, boolean z11, boolean z12, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.id = id2;
        this.label = label;
        this.value = value;
        this.resourceId = num;
        this.resourceUrl = str;
        this.resourceText = str2;
        this.resourceView = view;
        this.textColor = num2;
        this.rightText = str3;
        this.clickEnabled = z11;
        this.isChecked = z12;
        this.subLabel = str4;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public Integer getResourceId() {
        return this.resourceId;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public Integer getTextColor() {
        return this.textColor;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getRightText() {
        return this.rightText;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getSubLabel() {
        return this.subLabel;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    /* JADX INFO: renamed from: e */
    public void mo59014e(boolean z11) {
        this.clickEnabled = z11;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getClickEnabled() {
        return this.clickEnabled;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @NotNull
    public CharSequence getLabel() {
        return this.label;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @NotNull
    public String getValue() {
        return this.value;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    /* JADX INFO: renamed from: h */
    public void mo59017h(@Nullable String str) {
        this.rightText = str;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.value.hashCode()) * 31;
        Integer num = this.resourceId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.resourceUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resourceText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        View view = this.resourceView;
        int iHashCode5 = (iHashCode4 + (view == null ? 0 : view.hashCode())) * 31;
        Integer num2 = this.textColor;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.rightText;
        int iHashCode7 = (((((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.clickEnabled)) * 31) + Boolean.hashCode(this.isChecked)) * 31;
        String str4 = this.subLabel;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    /* JADX INFO: renamed from: i */
    public void mo59018i(@Nullable Integer num) {
        this.textColor = num;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    /* JADX INFO: renamed from: isChecked, reason: from getter */
    public boolean getIsChecked() {
        return this.isChecked;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public String getResourceText() {
        return this.resourceText;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public View getResourceView() {
        return this.resourceView;
    }

    @Override // com.kubi.sdk.widget.dialog.BottomSheetDialogHelper.InterfaceC24339a
    public void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    @NotNull
    public String toString() {
        return "SelectEntity(id=" + this.id + ", label=" + ((Object) this.label) + ", value=" + this.value + ", resourceId=" + this.resourceId + ", resourceUrl=" + this.resourceUrl + ", resourceText=" + this.resourceText + ", resourceView=" + this.resourceView + ", textColor=" + this.textColor + ", rightText=" + this.rightText + ", clickEnabled=" + this.clickEnabled + ", isChecked=" + this.isChecked + ", subLabel=" + this.subLabel + ')';
    }

    public /* synthetic */ SelectEntity(String str, CharSequence charSequence, String str2, Integer num, String str3, String str4, View view, Integer num2, String str5, boolean z11, boolean z12, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : charSequence, (i11 & 4) == 0 ? str2 : "", (i11 & 8) != 0 ? 0 : num, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : view, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? null : str5, (i11 & 512) != 0 ? true : z11, (i11 & 1024) == 0 ? z12 : false, (i11 & 2048) != 0 ? null : str6);
    }
}
