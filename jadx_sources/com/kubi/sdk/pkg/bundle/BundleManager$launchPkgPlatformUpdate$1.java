package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$launchPkgPlatformUpdate$1", m90122f = "BundleManager.kt", m90123i = {}, m90124l = {346}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$launchPkgPlatformUpdate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n1855#2,2:892\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$launchPkgPlatformUpdate$1\n*L\n349#1:892,2\n*E\n"})
public final class BundleManager$launchPkgPlatformUpdate$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $biz;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleManager$launchPkgPlatformUpdate$1(String str, Context context, Continuation<? super BundleManager$launchPkgPlatformUpdate$1> continuation) {
        super(2, continuation);
        this.$biz = str;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleManager$launchPkgPlatformUpdate$1(this.$biz, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((BundleManager$launchPkgPlatformUpdate$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C23985b.f47489a.m57877e("pkgPlatform", "launchPkgPlatformUpdate biz=" + this.$biz + " [NORMAL]");
            PkgPlatformManager pkgPlatformManager = PkgPlatformManager.f47352a;
            Context context = this.$context;
            String str = this.$biz;
            DownloadPriority downloadPriority = DownloadPriority.NORMAL;
            this.label = 1;
            obj = pkgPlatformManager.m57629u(context, str, downloadPriority, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        TaskStatus taskStatus = (TaskStatus) obj;
        if (taskStatus.getCode() == 2002 && !taskStatus.m57806g().isEmpty()) {
            C23985b.f47489a.m57877e("pkgPlatform", "launchPkgPlatformUpdate notify: " + taskStatus.m57806g());
            Iterator it = BundleManager.rolledBackListeners.iterator();
            while (it.hasNext()) {
                ((BundleManager.InterfaceC23925a) it.next()).mo56151a(taskStatus.m57806g());
            }
        }
        return Unit.INSTANCE;
    }
}
