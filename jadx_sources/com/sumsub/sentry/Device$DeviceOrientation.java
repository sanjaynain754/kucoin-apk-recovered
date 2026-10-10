package com.sumsub.sentry;

import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.C41829i0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"com/sumsub/sentry/Device$DeviceOrientation", "", "Lcom/sumsub/sentry/Device$DeviceOrientation;", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/sumsub/sentry/w", "PORTRAIT", "LANDSCAPE", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public enum Device$DeviceOrientation {
    PORTRAIT,
    LANDSCAPE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C28008w Companion = new C28008w();

    @NotNull
    private static final Lazy<InterfaceC44951d<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sentry.l1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Device$DeviceOrientation._init_$_anonymous_();
        }
    });

    @NotNull
    public static EnumEntries<Device$DeviceOrientation> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _init_$_anonymous_() {
        return C41829i0.m91591a("com.sumsub.sentry.Device.DeviceOrientation", values(), new String[]{"portrait", "landscape"}, new Annotation[][]{null, null}, null);
    }
}
