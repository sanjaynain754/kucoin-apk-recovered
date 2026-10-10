package com.kubi.sdk.pkg.bundle.i18n;

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
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: RnI18nPrefetchTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.i18n.RnI18nPrefetchTask$execute$2$1$1", m90122f = "RnI18nPrefetchTask.kt", m90123i = {0, 1}, m90124l = {166, 54}, m90125m = "invokeSuspend", m90126n = {"$this$withPermit$iv", "$this$withPermit$iv"}, m90127s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nRnI18nPrefetchTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$execute$2$1$1\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,161:1\n81#2,9:162\n*S KotlinDebug\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$execute$2$1$1\n*L\n53#1:162,9\n*E\n"})
public final class RnI18nPrefetchTask$execute$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ RnI18nPrefetchTask.DownloadItem $item;
    final /* synthetic */ RnI18nLocaleContext $locale;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ RnI18nPrefetchTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnI18nPrefetchTask$execute$2$1$1(RnI18nPrefetchTask rnI18nPrefetchTask, RnI18nPrefetchTask.DownloadItem downloadItem, RnI18nLocaleContext rnI18nLocaleContext, Continuation<? super RnI18nPrefetchTask$execute$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rnI18nPrefetchTask;
        this.$item = downloadItem;
        this.$locale = rnI18nLocaleContext;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RnI18nPrefetchTask$execute$2$1$1(this.this$0, this.$item, this.$locale, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((RnI18nPrefetchTask$execute$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        InterfaceC44088g interfaceC44088g;
        RnI18nPrefetchTask rnI18nPrefetchTask;
        RnI18nPrefetchTask.DownloadItem downloadItem;
        RnI18nLocaleContext rnI18nLocaleContext;
        InterfaceC44088g interfaceC44088g2;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        interfaceC44088g2 = (InterfaceC44088g) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            interfaceC44088g2.release();
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC44088g2.release();
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rnI18nLocaleContext = (RnI18nLocaleContext) this.L$3;
                downloadItem = (RnI18nPrefetchTask.DownloadItem) this.L$2;
                rnI18nPrefetchTask = (RnI18nPrefetchTask) this.L$1;
                InterfaceC44088g interfaceC44088g3 = (InterfaceC44088g) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44088g = interfaceC44088g3;
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC44088g = this.this$0.semaphore;
                rnI18nPrefetchTask = this.this$0;
                RnI18nPrefetchTask.DownloadItem downloadItem2 = this.$item;
                RnI18nLocaleContext rnI18nLocaleContext2 = this.$locale;
                this.L$0 = interfaceC44088g;
                this.L$1 = rnI18nPrefetchTask;
                this.L$2 = downloadItem2;
                this.L$3 = rnI18nLocaleContext2;
                this.label = 1;
                if (interfaceC44088g.m97146c(this) != coroutine_suspended) {
                    downloadItem = downloadItem2;
                    rnI18nLocaleContext = rnI18nLocaleContext2;
                }
                return coroutine_suspended;
            }
            this.L$0 = interfaceC44088g;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (rnI18nPrefetchTask.m57573h(downloadItem, rnI18nLocaleContext, this) != coroutine_suspended) {
                interfaceC44088g2 = interfaceC44088g;
                Unit unit2 = Unit.INSTANCE;
                interfaceC44088g2.release();
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            interfaceC44088g2 = interfaceC44088g;
            th2 = th4;
            interfaceC44088g2.release();
            throw th2;
        }
    }
}
