package sn;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.kyc.R$string;
import com.kubi.kyc.ui.DialogHelper;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import gn.InterfaceC37974a;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Arrays;
import java.util.List;
import kn.C41076a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import xb0.C46126b;

/* JADX INFO: renamed from: sn.c */
/* JADX INFO: compiled from: PlatformPermissionHelper.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ,\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/vendor/permission/PlatformPermissionHelper;", "", "<init>", "()V", "checkSumsubRuntimePermission", "", "context", "Landroidx/fragment/app/FragmentActivity;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "requestSumsubRuntimePermission", "Lkotlin/Function1;", "", "showOpenCameraDialog", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatformPermissionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformPermissionHelper.kt\ncom/kubi/kyc/vendor/permission/PlatformPermissionHelper\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,85:1\n17#2,2:86\n37#3:88\n36#3,3:89\n*S KotlinDebug\n*F\n+ 1 PlatformPermissionHelper.kt\ncom/kubi/kyc/vendor/permission/PlatformPermissionHelper\n*L\n57#1:86,2\n61#1:88\n61#1:89,3\n*E\n"})
public final class C44525c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44525c f98708a = new C44525c();

    /* JADX INFO: renamed from: d */
    public static final Unit m98531d(Function0 function0, boolean z11) {
        if (z11) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m98532f(FragmentActivity fragmentActivity) {
        C41076a.f91293a.m90059a("-100002");
        f98708a.m98535g(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m98533c(@NotNull FragmentActivity context, @Nullable CompositeDisposable compositeDisposable, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m98534e(context, compositeDisposable, new Function1() { // from class: sn.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44525c.m98531d(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m98534e(@NotNull final FragmentActivity context, @Nullable CompositeDisposable compositeDisposable, @NotNull Function1<? super Boolean, Unit> callback) {
        List<String> listListOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37974a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (listListOf = ((InterfaceC37974a) objM56186h).mo4567a()) == null) {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        String[] strArr = (String[]) listListOf.toArray(new String[0]);
        Disposable disposableM98539d = C44529g.m98539d(PermissionCompatKt.m49936e(new C46126b(context), (String[]) Arrays.copyOf(strArr, strArr.length)), callback, new Function0() { // from class: sn.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44525c.m98532f(context);
            }
        });
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        DisposableKt.addTo(disposableM98539d, compositeDisposable);
    }

    /* JADX INFO: renamed from: g */
    public final void m98535g(FragmentActivity fragmentActivity) {
        String string = fragmentActivity.getString(R$string.camera_authorization_tips, fragmentActivity.getString(R$string.camera_storage_authorization));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogHelper.m37110d(fragmentActivity, string, supportFragmentManager, null, null, 24, null);
    }
}
