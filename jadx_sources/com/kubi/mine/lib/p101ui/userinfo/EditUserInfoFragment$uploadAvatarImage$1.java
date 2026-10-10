package com.kubi.mine.lib.p101ui.userinfo;

import android.content.Context;
import android.graphics.Bitmap;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.view.C19215j;
import com.kubi.mine.lib.view.ImageCheckResult;
import com.kubi.mine.lib.view.UploadAvatarImageView;
import com.kubi.utils.ToastCompat;
import gq.C37987h;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import ro.C44128b;

/* JADX INFO: compiled from: EditUserInfoFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.EditUserInfoFragment$uploadAvatarImage$1", m90122f = "EditUserInfoFragment.kt", m90123i = {0, 1, 1, 1, 2, 2, 2, 2}, m90124l = {257, 259, 261}, m90125m = "invokeSuspend", m90126n = {"uploadPath", "uploadPath", "context", "$i$a$-let-EditUserInfoFragment$uploadAvatarImage$1$1", "uploadPath", "context", "rotatedBitmap", "$i$a$-let-EditUserInfoFragment$uploadAvatarImage$1$1"}, m90127s = {"L$0", "L$0", "L$2", "I$0", "L$0", "L$2", "L$3", "I$0"})
public final class EditUserInfoFragment$uploadAvatarImage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $realPath;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ EditUserInfoFragment this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.userinfo.EditUserInfoFragment$uploadAvatarImage$1$a */
    /* JADX INFO: compiled from: EditUserInfoFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C19160a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCheckResult.values().length];
            try {
                iArr[ImageCheckResult.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCheckResult.SIZE_EXCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCheckResult.INVALID_FORMAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditUserInfoFragment$uploadAvatarImage$1(String str, EditUserInfoFragment editUserInfoFragment, Continuation<? super EditUserInfoFragment$uploadAvatarImage$1> continuation) {
        super(2, continuation);
        this.$realPath = str;
        this.this$0 = editUserInfoFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditUserInfoFragment$uploadAvatarImage$1(this.$realPath, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EditUserInfoFragment$uploadAvatarImage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v29, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Context context;
        int i11;
        EditUserInfoFragment editUserInfoFragment;
        Bitmap bitmap;
        EditUserInfoFragment editUserInfoFragment2;
        int i12;
        C37987h c37987hM42318x3;
        UploadAvatarImageView uploadAvatarImageView;
        ?? r12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        editUserInfoFragment2 = (EditUserInfoFragment) this.L$1;
                        objectRef = (Ref.ObjectRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    int i14 = this.I$0;
                    context = (Context) this.L$2;
                    editUserInfoFragment = (EditUserInfoFragment) this.L$1;
                    Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i11 = i14;
                    objectRef = objectRef2;
                    bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        AvatarImageHelper avatarImageHelper = AvatarImageHelper.f35370a;
                        this.L$0 = objectRef;
                        this.L$1 = editUserInfoFragment;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(context);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(bitmap);
                        this.I$0 = i11;
                        this.label = 3;
                        obj = avatarImageHelper.m42291e(context, bitmap, "avatar_cache.jpg", this);
                        if (obj != coroutine_suspended) {
                            editUserInfoFragment2 = editUserInfoFragment;
                        }
                        return coroutine_suspended;
                    }
                    C44128b.m97259c(editUserInfoFragment.getTAG(), "uploadAvatarImage isNeedRotateBitmap is true");
                    C44128b.m97259c(this.this$0.getTAG(), "final upload avatar image path: " + ((String) objectRef.element));
                    i12 = C19160a.$EnumSwitchMapping$0[C19215j.m42378a(C19215j.m42379b((String) objectRef.element)).ordinal()];
                    if (i12 == 1) {
                        c37987hM42318x3 = this.this$0.m42318x3();
                        if (c37987hM42318x3 != null && (uploadAvatarImageView = c37987hM42318x3.f85468b) != null) {
                            uploadAvatarImageView.m42376t((String) objectRef.element);
                        }
                    } else if (i12 != 2) {
                        if (i12 == 3) {
                            ToastCompat.m66437C(R$string.edit_profile_avatar_format_error);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        ToastCompat.m66437C(R$string.edit_profile_avatar_size_error);
                    }
                    return Unit.INSTANCE;
                }
            } else {
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            r12 = (String) obj;
            if (r12 != 0 && r12.length() > 0) {
                objectRef.element = r12;
            }
            editUserInfoFragment = editUserInfoFragment2;
            C44128b.m97259c(editUserInfoFragment.getTAG(), "uploadAvatarImage isNeedRotateBitmap is true");
            C44128b.m97259c(this.this$0.getTAG(), "final upload avatar image path: " + ((String) objectRef.element));
            i12 = C19160a.$EnumSwitchMapping$0[C19215j.m42378a(C19215j.m42379b((String) objectRef.element)).ordinal()];
            if (i12 == 1) {
                c37987hM42318x3 = this.this$0.m42318x3();
                if (c37987hM42318x3 != null) {
                    uploadAvatarImageView.m42376t((String) objectRef.element);
                }
            } else if (i12 != 2) {
                if (i12 == 3) {
                    ToastCompat.m66437C(R$string.edit_profile_avatar_format_error);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                ToastCompat.m66437C(R$string.edit_profile_avatar_size_error);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objectRef = new Ref.ObjectRef();
        ?? r13 = this.$realPath;
        objectRef.element = r13;
        AvatarImageHelper avatarImageHelper2 = AvatarImageHelper.f35370a;
        this.L$0 = objectRef;
        this.label = 1;
        obj = avatarImageHelper2.m42289c(r13, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        if (((Boolean) obj).booleanValue() && (context = this.this$0.getContext()) != null) {
            EditUserInfoFragment editUserInfoFragment3 = this.this$0;
            AvatarImageHelper avatarImageHelper3 = AvatarImageHelper.f35370a;
            String str = (String) objectRef.element;
            this.L$0 = objectRef;
            this.L$1 = editUserInfoFragment3;
            this.L$2 = context;
            i11 = 0;
            this.I$0 = 0;
            this.label = 2;
            Object objM42290d = avatarImageHelper3.m42290d(str, this);
            if (objM42290d != coroutine_suspended) {
                editUserInfoFragment = editUserInfoFragment3;
                obj = objM42290d;
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    AvatarImageHelper avatarImageHelper4 = AvatarImageHelper.f35370a;
                    this.L$0 = objectRef;
                    this.L$1 = editUserInfoFragment;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(context);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(bitmap);
                    this.I$0 = i11;
                    this.label = 3;
                    obj = avatarImageHelper4.m42291e(context, bitmap, "avatar_cache.jpg", this);
                    if (obj != coroutine_suspended) {
                        editUserInfoFragment2 = editUserInfoFragment;
                        r12 = (String) obj;
                        if (r12 != 0) {
                            objectRef.element = r12;
                        }
                        editUserInfoFragment = editUserInfoFragment2;
                    }
                }
                C44128b.m97259c(editUserInfoFragment.getTAG(), "uploadAvatarImage isNeedRotateBitmap is true");
            }
            return coroutine_suspended;
        }
        C44128b.m97259c(this.this$0.getTAG(), "final upload avatar image path: " + ((String) objectRef.element));
        i12 = C19160a.$EnumSwitchMapping$0[C19215j.m42378a(C19215j.m42379b((String) objectRef.element)).ordinal()];
        if (i12 == 1) {
            c37987hM42318x3 = this.this$0.m42318x3();
            if (c37987hM42318x3 != null) {
                uploadAvatarImageView.m42376t((String) objectRef.element);
            }
        } else if (i12 != 2) {
            if (i12 == 3) {
                ToastCompat.m66437C(R$string.edit_profile_avatar_format_error);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ToastCompat.m66437C(R$string.edit_profile_avatar_size_error);
        }
        return Unit.INSTANCE;
    }
}
