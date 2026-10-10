package com.kubi.share.lib.shareui;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.lib.entity.ShareGalleryEntity;
import com.kubi.share.lib.utils.ShareExtKt;
import java.util.ArrayList;
import java.util.List;
import k10.DialogC40864b;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z10.C46646a;

/* JADX INFO: compiled from: ShareDispatcher.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.shareui.ShareDispatcher$dispatchGallerry$1", m90122f = "ShareDispatcher.kt", m90123i = {0}, m90124l = {70}, m90125m = "invokeSuspend", m90126n = {"loadingDialog"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nShareDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher$dispatchGallerry$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,324:1\n1#2:325\n45#3,4:326\n*S KotlinDebug\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher$dispatchGallerry$1\n*L\n94#1:326,4\n*E\n"})
public final class ShareDispatcher$dispatchGallerry$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ GalleryShareParam $param;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShareDispatcher$dispatchGallerry$1(FragmentActivity fragmentActivity, GalleryShareParam galleryShareParam, Function1<? super Boolean, Unit> function1, Continuation<? super ShareDispatcher$dispatchGallerry$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$param = galleryShareParam;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareDispatcher$dispatchGallerry$1(this.$activity, this.$param, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ShareDispatcher$dispatchGallerry$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:6:0x0012, B:26:0x0069, B:27:0x0071, B:29:0x0076, B:32:0x007d, B:34:0x00e2, B:36:0x00e6, B:33:0x0098, B:13:0x0026, B:15:0x003a, B:18:0x0041, B:21:0x004d, B:22:0x0052), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:6:0x0012, B:26:0x0069, B:27:0x0071, B:29:0x0076, B:32:0x007d, B:34:0x00e2, B:36:0x00e6, B:33:0x0098, B:13:0x0026, B:15:0x003a, B:18:0x0041, B:21:0x004d, B:22:0x0052), top: B:46:0x000a }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DialogC40864b dialogC40864b;
        Object objM91049g;
        DialogC40864b dialogC40864b2;
        List listM59817n;
        Function1<Boolean, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                dialogC40864b = new DialogC40864b(this.$activity, false, 2, null);
                dialogC40864b.show();
                String pic = this.$param.getPic();
                if (pic == null || pic.length() == 0) {
                    AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                    ShareDispatcher$dispatchGallerry$1$imgs$1 shareDispatcher$dispatchGallerry$1$imgs$1 = new ShareDispatcher$dispatchGallerry$1$imgs$1(this.$param, null);
                    this.L$0 = dialogC40864b;
                    this.label = 1;
                    objM91049g = C41686h.m91049g(abstractC41697j0M94120b, shareDispatcher$dispatchGallerry$1$imgs$1, this);
                    if (objM91049g == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialogC40864b2 = dialogC40864b;
                } else {
                    ShareDispatcher shareDispatcher = ShareDispatcher.f49422a;
                    String pic2 = this.$param.getPic();
                    if (pic2 == null) {
                        pic2 = "";
                    }
                    listM59817n = shareDispatcher.m59817n(pic2);
                }
                dialogC40864b.dismiss();
                if (listM59817n != null || listM59817n.isEmpty()) {
                    ShareDispatcher shareDispatcher2 = ShareDispatcher.f49422a;
                    FragmentActivity fragmentActivity = this.$activity;
                    ImageShareParam imageShareParam = new ImageShareParam(this.$param.getUtmSource(), null, false, null, false, null, null, null, null, null, 1022, null);
                    FragmentActivity fragmentActivity2 = this.$activity;
                    GalleryShareParam galleryShareParam = this.$param;
                    imageShareParam.setBitmap(ShareExtKt.m59855n(fragmentActivity2));
                    imageShareParam.setNeedQrCode(galleryShareParam.getNeedQrCode());
                    imageShareParam.setQrCodeUrl(galleryShareParam.getGalleryLink());
                    imageShareParam.setRcode(galleryShareParam.getRcode());
                    imageShareParam.setSupportModifyLink(galleryShareParam.isSupportModifyLink());
                    Unit unit = Unit.INSTANCE;
                    shareDispatcher2.m59810f(fragmentActivity, imageShareParam, this.$callback);
                } else {
                    ArrayList<ShareGalleryEntity> arrayList = new ArrayList<>();
                    arrayList.addAll(listM59817n);
                    GalleryShareDialogFragment.Companion companion = GalleryShareDialogFragment.f49400w0;
                    FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    companion.launch(supportFragmentManager, this.$param, arrayList);
                }
                function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogC40864b2 = (DialogC40864b) this.L$0;
            ResultKt.throwOnFailure(obj);
            objM91049g = obj;
            dialogC40864b = dialogC40864b2;
            listM59817n = (List) objM91049g;
            dialogC40864b.dismiss();
            if (listM59817n != null) {
                ShareDispatcher shareDispatcher3 = ShareDispatcher.f49422a;
                FragmentActivity fragmentActivity3 = this.$activity;
                ImageShareParam imageShareParam2 = new ImageShareParam(this.$param.getUtmSource(), null, false, null, false, null, null, null, null, null, 1022, null);
                FragmentActivity fragmentActivity4 = this.$activity;
                GalleryShareParam galleryShareParam2 = this.$param;
                imageShareParam2.setBitmap(ShareExtKt.m59855n(fragmentActivity4));
                imageShareParam2.setNeedQrCode(galleryShareParam2.getNeedQrCode());
                imageShareParam2.setQrCodeUrl(galleryShareParam2.getGalleryLink());
                imageShareParam2.setRcode(galleryShareParam2.getRcode());
                imageShareParam2.setSupportModifyLink(galleryShareParam2.isSupportModifyLink());
                Unit unit2 = Unit.INSTANCE;
                shareDispatcher3.m59810f(fragmentActivity3, imageShareParam2, this.$callback);
            } else {
                ShareDispatcher shareDispatcher4 = ShareDispatcher.f49422a;
                FragmentActivity fragmentActivity5 = this.$activity;
                ImageShareParam imageShareParam3 = new ImageShareParam(this.$param.getUtmSource(), null, false, null, false, null, null, null, null, null, 1022, null);
                FragmentActivity fragmentActivity6 = this.$activity;
                GalleryShareParam galleryShareParam3 = this.$param;
                imageShareParam3.setBitmap(ShareExtKt.m59855n(fragmentActivity6));
                imageShareParam3.setNeedQrCode(galleryShareParam3.getNeedQrCode());
                imageShareParam3.setQrCodeUrl(galleryShareParam3.getGalleryLink());
                imageShareParam3.setRcode(galleryShareParam3.getRcode());
                imageShareParam3.setSupportModifyLink(galleryShareParam3.isSupportModifyLink());
                Unit unit3 = Unit.INSTANCE;
                shareDispatcher4.m59810f(fragmentActivity5, imageShareParam3, this.$callback);
            }
            function1 = this.$callback;
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(true));
            }
        } catch (Throwable th2) {
            Function1<Boolean, Unit> function2 = this.$callback;
            if (function2 != null) {
                function2.invoke(Boxing.boxBoolean(false));
            }
            if (!C42899b.m94075e(th2)) {
                C46646a.m102888b(th2, "ShareDispatcher");
            }
        }
        return Unit.INSTANCE;
    }
}
