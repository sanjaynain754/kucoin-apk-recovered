package sz;

import android.content.Intent;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.mode.AppMode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: sz.a */
/* JADX INFO: compiled from: ModeEx.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"getFromAppMode", "Lcom/kubi/sdk/mode/AppMode;", "Landroid/content/Intent;", "LMode_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModeEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeEx.kt\ncom/kubi/sdk/mode/ex/ModeExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class C44602a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AppMode m98704a(@NotNull Intent intent) {
        AppMode appModeFromStringDefault;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        String strM56280w = RouteExKt.m56280w(intent, "from");
        return (strM56280w == null || (appModeFromStringDefault = AppMode.INSTANCE.fromStringDefault(strM56280w, AppMode.Pro)) == null) ? AppMode.Pro : appModeFromStringDefault;
    }
}
