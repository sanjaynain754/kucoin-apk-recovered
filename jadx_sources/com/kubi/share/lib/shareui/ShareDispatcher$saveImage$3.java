package com.kubi.share.lib.shareui;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.kubi.share.R$string;
import com.kubi.utils.ToastCompat;
import java.io.OutputStream;
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
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z10.C46646a;

/* JADX INFO: compiled from: ShareDispatcher.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3", m90122f = "ShareDispatcher.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3}, m90124l = {264, 269, 277, 283}, m90125m = "invokeSuspend", m90126n = {"fileName", "mimeType", "contentValues", "resolver", "collection", "imageUri", "outputStream", "fileName", "mimeType", "contentValues", "resolver", "collection", "imageUri", "outputStream", "fileName", "mimeType", "contentValues", "resolver", "collection", "imageUri", "e"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0"})
@SourceDebugExtension({"SMAP\nShareDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,324:1\n45#2,4:325\n*S KotlinDebug\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3\n*L\n282#1:325,4\n*E\n"})
public final class ShareDispatcher$saveImage$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Function0<Unit> $closeDailog;
    final /* synthetic */ AbsShareDailogFragment $fragment;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$1 */
    /* JADX INFO: compiled from: ShareDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$1", m90122f = "ShareDispatcher.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245811 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $closeDailog;
        final /* synthetic */ AbsShareDailogFragment $fragment;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C245811(AbsShareDailogFragment absShareDailogFragment, Function0<Unit> function0, Continuation<? super C245811> continuation) {
            super(2, continuation);
            this.$fragment = absShareDailogFragment;
            this.$closeDailog = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245811(this.$fragment, this.$closeDailog, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245811) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66441G(this.$fragment.getString(R$string.save_success), new Object[0]);
                this.$closeDailog.invoke();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$2 */
    /* JADX INFO: compiled from: ShareDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$2", m90122f = "ShareDispatcher.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245822 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C245822(Continuation<? super C245822> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245822(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245822) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66437C(R$string.failed);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$3 */
    /* JADX INFO: compiled from: ShareDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$3", m90122f = "ShareDispatcher.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245833 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C245833(Continuation<? super C245833> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245833(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245833) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66437C(R$string.failed);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$4 */
    /* JADX INFO: compiled from: ShareDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3$4", m90122f = "ShareDispatcher.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245844 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C245844(Continuation<? super C245844> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245844(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245844) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66437C(R$string.failed);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDispatcher$saveImage$3(AbsShareDailogFragment absShareDailogFragment, Bitmap bitmap, Function0<Unit> function0, Continuation<? super ShareDispatcher$saveImage$3> continuation) {
        super(2, continuation);
        this.$fragment = absShareDailogFragment;
        this.$bitmap = bitmap;
        this.$closeDailog = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareDispatcher$saveImage$3(this.$fragment, this.$bitmap, this.$closeDailog, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ShareDispatcher$saveImage$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0196 A[Catch: Exception -> 0x0045, TRY_ENTER, TryCatch #2 {Exception -> 0x0045, blocks: (B:12:0x0040, B:45:0x0196, B:49:0x019e, B:50:0x01a1, B:23:0x008e, B:26:0x00c1, B:27:0x00e0, B:29:0x00ec, B:31:0x00f5, B:51:0x01a2, B:30:0x00f3), top: B:64:0x000d }] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0190, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r6, r16) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d5, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r5, r16) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0205, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r4, r16) == r2) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        ?? r11 = 3;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = "share_" + System.currentTimeMillis() + ".jpg";
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/jpeg");
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 29) {
                        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/KuCoin");
                        contentValues.put("is_pending", Boxing.boxInt(1));
                    }
                    ContentResolver contentResolver = this.$fragment.requireContext().getContentResolver();
                    Uri contentUri = i12 >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    Uri uriInsert = contentResolver.insert(contentUri, contentValues);
                    if (uriInsert != null) {
                        try {
                            outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            if (outputStreamOpenOutputStream != null) {
                                this.$bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStreamOpenOutputStream);
                                outputStreamOpenOutputStream.flush();
                                if (i12 >= 29) {
                                    contentValues.clear();
                                    contentValues.put("is_pending", Boxing.boxInt(0));
                                    contentResolver.update(uriInsert, contentValues, null, null);
                                }
                                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                                C245811 c245811 = new C245811(this.$fragment, this.$closeDailog, null);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                                this.L$1 = SpillingKt.nullOutSpilledVariable("image/jpeg");
                                this.L$2 = SpillingKt.nullOutSpilledVariable(contentValues);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(contentResolver);
                                this.L$4 = SpillingKt.nullOutSpilledVariable(contentUri);
                                this.L$5 = SpillingKt.nullOutSpilledVariable(uriInsert);
                                this.L$6 = outputStreamOpenOutputStream;
                                this.label = 1;
                                if (C41686h.m91049g(abstractC41697j0M94121c, c245811, this) == coroutine_suspended) {
                                }
                                if (outputStreamOpenOutputStream != null) {
                                    outputStreamOpenOutputStream.close();
                                }
                            } else {
                                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                                C245822 c245822 = new C245822(null);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                                this.L$1 = SpillingKt.nullOutSpilledVariable("image/jpeg");
                                this.L$2 = SpillingKt.nullOutSpilledVariable(contentValues);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(contentResolver);
                                this.L$4 = SpillingKt.nullOutSpilledVariable(contentUri);
                                this.L$5 = SpillingKt.nullOutSpilledVariable(uriInsert);
                                this.L$6 = outputStreamOpenOutputStream;
                                this.label = 2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = 0;
                            if (r11 != 0) {
                                r11.close();
                            }
                            throw th;
                        }
                    } else {
                        AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
                        C245833 c245833 = new C245833(null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                        this.L$1 = SpillingKt.nullOutSpilledVariable("image/jpeg");
                        this.L$2 = SpillingKt.nullOutSpilledVariable(contentValues);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(contentResolver);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(contentUri);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(uriInsert);
                        this.label = 3;
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1 || i11 == 2) {
                    outputStreamOpenOutputStream = (OutputStream) this.L$6;
                    ResultKt.throwOnFailure(obj);
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                } else if (i11 == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C46646a.m102888b(e11, "ShareExt");
            }
            AbstractC41697j0 abstractC41697j0M94121c4 = C42911a.m94121c();
            C245844 c245844 = new C245844(null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(e11);
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 4;
        }
        return Unit.INSTANCE;
    }
}
