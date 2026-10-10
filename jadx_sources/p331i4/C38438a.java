package p331i4;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p282g4.C37806a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: i4.a */
/* JADX INFO: compiled from: ReactDebugOverlayTags.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0018"}, m90084d2 = {"Li4/a;", "", "<init>", "()V", "Lg4/a;", "b", "Lg4/a;", "PERFORMANCE", "c", "NAVIGATION", "d", "RN_CORE", "e", "BRIDGE_CALLS", "f", "NATIVE_MODULE", "g", "UI_MANAGER", CmcdData.Factory.STREAMING_FORMAT_HLS, "FABRIC_UI_MANAGER", "i", "FABRIC_RECONCILER", "j", "RELAY", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C38438a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38438a f86253a = new C38438a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a PERFORMANCE = new C37806a("Performance", "Markers for Performance", -16711936);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a NAVIGATION = new C37806a("Navigation", "Tag for navigation", Color.rgb(156, 39, 176));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a RN_CORE = new C37806a("RN Core", "Tag for React Native Core", ViewCompat.MEASURED_STATE_MASK);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a BRIDGE_CALLS = new C37806a("Bridge Calls", "JS to Java calls (warning: this is spammy)", -65281);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a NATIVE_MODULE = new C37806a("Native Module", "Native Module init", Color.rgb(128, 0, 128));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a UI_MANAGER = new C37806a("UI Manager", "UI Manager View Operations (requires restart\nwarning: this is spammy)", -16711681);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a FABRIC_UI_MANAGER = new C37806a("FabricUIManager", "Fabric UI Manager View Operations", -16711681);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a FABRIC_RECONCILER = new C37806a("FabricReconciler", "Reconciler for Fabric", -16711681);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final C37806a RELAY = new C37806a("Relay", "including prefetching", Color.rgb(255, 153, 0));
}
