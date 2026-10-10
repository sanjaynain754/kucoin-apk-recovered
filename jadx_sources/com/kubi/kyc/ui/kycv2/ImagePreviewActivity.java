package com.kubi.kyc.ui.kycv2;

import android.os.Bundle;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kyc.KycKey;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.extensions.core.C27032f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImagePreviewActivity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/ImagePreviewActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "PhotoInfo", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImagePreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePreviewActivity.kt\ncom/kubi/kyc/ui/kycv2/ImagePreviewActivity\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,46:1\n158#2,2:47\n*S KotlinDebug\n*F\n+ 1 ImagePreviewActivity.kt\ncom/kubi/kyc/ui/kycv2/ImagePreviewActivity\n*L\n31#1:47,2\n*E\n"})
public final class ImagePreviewActivity extends BaseActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f31410i = new Companion(null);

    /* JADX INFO: compiled from: ImagePreviewActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/ImagePreviewActivity$Companion;", "", "<init>", "()V", "FRONT_PHOTO_PATH", "", "BACK_PHOTO_PATH", "TYPE_FRONT", "", "TYPE_BACK", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.ImagePreviewActivity$a, reason: from toString */
    /* JADX INFO: compiled from: ImagePreviewActivity.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006!"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/ImagePreviewActivity$PhotoInfo;", "", KycKey.frontPhoto, "", KycKey.backendPhoto, "isSuccess", "", "cameraTypeEnum", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getFrontPhoto", "()Ljava/lang/String;", "setFrontPhoto", "(Ljava/lang/String;)V", "getBackendPhoto", "setBackendPhoto", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCameraTypeEnum", "setCameraTypeEnum", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/kyc/ui/kycv2/ImagePreviewActivity$PhotoInfo;", "equals", "other", "hashCode", "", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PhotoInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public String frontPhoto;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public String backendPhoto;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public Boolean isSuccess;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public String cameraTypeEnum;

        public PhotoInfo() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoInfo)) {
                return false;
            }
            PhotoInfo photoInfo = (PhotoInfo) other;
            return Intrinsics.areEqual(this.frontPhoto, photoInfo.frontPhoto) && Intrinsics.areEqual(this.backendPhoto, photoInfo.backendPhoto) && Intrinsics.areEqual(this.isSuccess, photoInfo.isSuccess) && Intrinsics.areEqual(this.cameraTypeEnum, photoInfo.cameraTypeEnum);
        }

        public PhotoInfo(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
            this.frontPhoto = str;
            this.backendPhoto = str2;
            this.isSuccess = bool;
            this.cameraTypeEnum = str3;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBackendPhoto() {
            return this.backendPhoto;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCameraTypeEnum() {
            return this.cameraTypeEnum;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFrontPhoto() {
            return this.frontPhoto;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public int hashCode() {
            String str = this.frontPhoto;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backendPhoto;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isSuccess;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.cameraTypeEnum;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PhotoInfo(frontPhoto=" + this.frontPhoto + ", backendPhoto=" + this.backendPhoto + ", isSuccess=" + this.isSuccess + ", cameraTypeEnum=" + this.cameraTypeEnum + ')';
        }

        public /* synthetic */ PhotoInfo(String str, String str2, Boolean bool, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : str3);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("front_photo_path");
        String stringExtra2 = getIntent().getStringExtra("back_photo_path");
        String stringExtra3 = getIntent().getStringExtra("data");
        boolean booleanExtra = getIntent().getBooleanExtra("data_1", false);
        setContentView(R$layout.busercenter_activity_image_preview);
        if (C12573b.f21598a.m23696a()) {
            "activity_finish".length();
        }
        C12572a.m23692a(this, false, new ImagePreviewActivity$onCreate$$inlined$bindFlowEvent$1("activity_finish", null, this));
        C27032f.m66626q(this, R$id.root, ImagePreviewFragment.f31415b0.newInstance(stringExtra, stringExtra2, stringExtra3, Boolean.valueOf(booleanExtra)), null, 4, null);
    }
}
