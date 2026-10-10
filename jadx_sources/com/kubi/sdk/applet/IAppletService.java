package com.kubi.sdk.applet;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IAppletService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aJ \u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00030\fH&J(\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/applet/IAppletService;", "", "handleBack", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "backAction", "Lkotlin/Function0;", "callAppletAddDialog", "shortcutId", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getAppletFormatUrl", "type", "Lcom/kubi/sdk/applet/IAppletService$AppletType;", "url", "bundle", "Landroid/os/Bundle;", "saveForwardUrl", "forwardUrl", "getForwardUrl", "clearForwardUrl", "AppletType", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IAppletService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f46452a = Companion.f46457a;

    /* JADX INFO: compiled from: IAppletService.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/applet/IAppletService$AppletType;", "", "<init>", "(Ljava/lang/String;I)V", "H5", "RN", "FLUTTER", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum AppletType {
        H5,
        RN,
        FLUTTER;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f46456c = EnumEntriesKt.enumEntries(m56508a());

        @NotNull
        public static EnumEntries<AppletType> getEntries() {
            return f46456c;
        }
    }

    /* JADX INFO: compiled from: IAppletService.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/applet/IAppletService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/sdk/applet/IAppletService;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f46457a = new Companion();

        @NotNull
        public final IAppletService get() {
            return (IAppletService) Router.f46192a.m56192n(IAppletService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    String mo15068c(@NotNull AppletType appletType, @Nullable String str, @Nullable Bundle bundle);

    /* JADX INFO: renamed from: d */
    void mo15069d(@Nullable FragmentActivity fragmentActivity, @NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: e */
    void mo15070e(@NotNull FragmentActivity fragmentActivity, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2);

    /* JADX INFO: renamed from: b */
    static /* synthetic */ String m56507b(IAppletService iAppletService, AppletType appletType, String str, Bundle bundle, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppletFormatUrl");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        return iAppletService.mo15068c(appletType, str, bundle);
    }

    /* JADX INFO: renamed from: a */
    default void mo15067a(@NotNull FragmentActivity activity, @NotNull String forwardUrl) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(forwardUrl, "forwardUrl");
    }
}
