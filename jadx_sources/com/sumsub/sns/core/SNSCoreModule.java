package com.sumsub.sns.core;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C34052z4;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/SNSCoreModule;", "Lcom/sumsub/sns/core/SNSModule;", C34052z4.f72599k, "", "<init>", "(I)V", "isSkipGeolocationForm", "", "()Z", "isFullScreenCamera", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSCoreModule extends SNSModule {

    @Keep
    public static final int FEATURE_FULLSCREEN_CAMERA = 4;

    @Keep
    public static final int FEATURE_SKIP_GEOLOCATION_FORM = 2;
    private final int feature;

    public SNSCoreModule() {
        this(0, 1, null);
    }

    public /* synthetic */ SNSCoreModule(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }

    public final boolean isFullScreenCamera() {
        return (this.feature & 4) != 0;
    }

    public final boolean isSkipGeolocationForm() {
        return (this.feature & 2) != 0;
    }

    public SNSCoreModule(int i11) {
        super("Core module");
        this.feature = i11;
    }
}
