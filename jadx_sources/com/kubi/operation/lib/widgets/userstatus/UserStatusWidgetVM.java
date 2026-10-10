package com.kubi.operation.lib.widgets.userstatus;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.operation.api.entity.WelfareSignupEntity;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.cards.welfare.utils.WelfareTaskType;
import com.kubi.operation.lib.entity.NewUserStatusInfoEntity;
import com.kubi.operation.lib.entity.UserStatusInfoResponseEntity;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.utils.OperationStoreId;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p294gz.C38057a;
import p502oj.C43103h;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: UserStatusWidgetVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0094@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;", "<init>", "()V", "tag", "", "repo", "Lcom/kubi/operation/lib/api/OperationRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCountDownFinish", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "loadDataFromWelfare", "checkWelfare", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "loadDataFromHome", "taskSigned", "", "applyJoinTask", "taskId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserStatusWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStatusWidgetVM.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 8 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,180:1\n473#2,4:181\n473#2,4:185\n473#2,4:189\n136#3:193\n153#3,2:194\n15#3:198\n126#3,2:199\n144#3,2:202\n126#3,2:204\n153#3,2:206\n144#3,2:209\n15#3:211\n126#3,2:212\n126#3,2:214\n178#4:196\n178#4:208\n99#5:197\n1#6:201\n35#7,4:216\n39#7:222\n35#7,4:223\n39#7:229\n44#8,2:220\n44#8,2:227\n*S KotlinDebug\n*F\n+ 1 UserStatusWidgetVM.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM\n*L\n58#1:181,4\n59#1:185,4\n60#1:189,4\n75#1:193\n91#1:194,2\n116#1:198\n117#1:199,2\n121#1:202,2\n122#1:204,2\n133#1:206,2\n161#1:209,2\n165#1:211\n166#1:212,2\n170#1:214,2\n91#1:196\n133#1:208\n113#1:197\n39#1:216,4\n39#1:222\n45#1:223,4\n45#1:229\n39#1:220,2\n45#1:227,2\n*E\n"})
public final class UserStatusWidgetVM extends AbstractC19291m<UserStatusWidgetContract$UIState> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f37005b0 = new Companion(null);

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Lazy<Boolean> f37006c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(UserStatusWidgetVM.m43884C());
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Lazy<Boolean> f37007d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(UserStatusWidgetVM.m43883B());
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f37008X = "UserStatus";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final OperationRepo f37009Y = new OperationRepo();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f37010Z = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a0 */
    public boolean f37011a0;

    /* JADX INFO: compiled from: UserStatusWidgetVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;", "", "<init>", "()V", "useNewInterface", "", "getUseNewInterface", "()Z", "useNewInterface$delegate", "Lkotlin/Lazy;", "skipWhenGuideFinish", "getSkipWhenGuideFinish", "skipWhenGuideFinish$delegate", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m43899a() {
            return ((Boolean) UserStatusWidgetVM.f37007d0.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m43900b() {
            return ((Boolean) UserStatusWidgetVM.f37006c0.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetVM$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C19603a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetVM$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C19604b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: UserStatusWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetVM", m90122f = "UserStatusWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m90124l = {58, 59, 60}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-UserStatusWidgetVM$dispatchIntent$2", "intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-UserStatusWidgetVM$dispatchIntent$3", "intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-UserStatusWidgetVM$dispatchIntent$4"}, m90127s = {"L$0", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C196051 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C196051(Continuation<? super C196051> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserStatusWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m43895v(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        Object next;
        String taskType = welfareTaskInfoEntity != null ? welfareTaskInfoEntity.getTaskType() : null;
        if (taskType == null) {
            taskType = "";
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = taskType.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (UserInfo.a.n() && Intrinsics.areEqual(upperCase, "SIGN_UP")) {
            C44128b.m97261e(this.f37008X, "hasLogin, but taskType is SIGN_UP, maybe token refresh now");
            return;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new WelfareTaskType[]{WelfareTaskType.SIGN_UP, WelfareTaskType.KYC, WelfareTaskType.OLD_KYC, WelfareTaskType.DEPOSIT}).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((WelfareTaskType) next).equalString(upperCase));
        boolean z11 = next != null;
        if (welfareTaskInfoEntity == null || z11) {
            if (!C27025c.m66566d(welfareTaskInfoEntity != null ? welfareTaskInfoEntity.getTaskCompletion() : null)) {
                C44128b.m97259c(this.f37008X, "showGuide-network");
                if (welfareTaskInfoEntity != null) {
                    C46392a.m102331n(OperationStoreId.f36892a.m43683d(), welfareTaskInfoEntity);
                }
                C46392a.m102328k(OperationStoreId.f36892a.m43682c(), false);
                send(new C19623i0(false, new UserStatusInfoResponseEntity(welfareTaskInfoEntity, null, null, 6, null)));
                return;
            }
        }
        String str = this.f37008X;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showAssetView,isGuideType=");
        sb2.append(z11);
        sb2.append(",completion=");
        sb2.append(welfareTaskInfoEntity != null ? welfareTaskInfoEntity.getTaskCompletion() : null);
        C44128b.m97259c(str, sb2.toString());
        OperationStoreId operationStoreId = OperationStoreId.f36892a;
        C46392a.m102335r(operationStoreId.m43683d());
        C46392a.m102328k(operationStoreId.m43682c(), true);
        send(new C19623i0(true, null, 2, null));
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m43883B() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C19603a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_home_user_widget_skip_on_guide_finish", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m43884C() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C19604b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_home_user_widget_new_interface", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m43892u(String str, Continuation<? super Unit> continuation) {
        UserStatusWidgetVM$applyJoinTask$1 userStatusWidgetVM$applyJoinTask$1;
        UserStatusWidgetVM userStatusWidgetVM;
        if (continuation instanceof UserStatusWidgetVM$applyJoinTask$1) {
            userStatusWidgetVM$applyJoinTask$1 = (UserStatusWidgetVM$applyJoinTask$1) continuation;
            int i11 = userStatusWidgetVM$applyJoinTask$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userStatusWidgetVM$applyJoinTask$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userStatusWidgetVM$applyJoinTask$1 = new UserStatusWidgetVM$applyJoinTask$1(this, continuation);
            }
        } else {
            userStatusWidgetVM$applyJoinTask$1 = new UserStatusWidgetVM$applyJoinTask$1(this, continuation);
        }
        Object objM43278s = userStatusWidgetVM$applyJoinTask$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userStatusWidgetVM$applyJoinTask$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM43278s);
            if (str.length() == 0 || this.f37011a0) {
                return Unit.INSTANCE;
            }
            OperationRepo operationRepo = this.f37009Y;
            userStatusWidgetVM$applyJoinTask$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            userStatusWidgetVM$applyJoinTask$1.L$1 = this;
            userStatusWidgetVM$applyJoinTask$1.label = 1;
            objM43278s = operationRepo.m43278s(str, userStatusWidgetVM$applyJoinTask$1);
            if (objM43278s == coroutine_suspended) {
                return coroutine_suspended;
            }
            userStatusWidgetVM = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userStatusWidgetVM = (UserStatusWidgetVM) userStatusWidgetVM$applyJoinTask$1.L$1;
            ResultKt.throwOnFailure(objM43278s);
        }
        WelfareSignupEntity welfareSignupEntity = (WelfareSignupEntity) objM43278s;
        userStatusWidgetVM.f37011a0 = welfareSignupEntity != null ? Intrinsics.areEqual(welfareSignupEntity.getSigned(), Boxing.boxBoolean(true)) : false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    private final Object m43893x(Continuation<? super Unit> continuation) throws JSONException {
        if (!C38057a.f85671a.m85928a(C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "userStatusGuide", null, 4, null), true)) {
            send(new C19623i0(true, null, 2, null));
            return Unit.INSTANCE;
        }
        Companion companion = f37005b0;
        if (companion.m43899a() && UserInfo.a.n() && C46392a.m102322d(OperationStoreId.f36892a.m43682c(), false)) {
            send(new C19623i0(true, null, 2, null));
            return Unit.INSTANCE;
        }
        if (companion.m43900b()) {
            Object objM43897y = m43897y(continuation);
            return objM43897y == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM43897y : Unit.INSTANCE;
        }
        Object objM43898z = m43898z(continuation);
        return objM43898z == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM43898z : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6 A[PHI: r2 r8 r12
      0x00f6: PHI (r2v10 java.lang.Object) = (r2v23 java.lang.Object), (r2v24 java.lang.Object) binds: [B:27:0x00c2, B:32:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r8v4 com.kubi.mvi.state.d) = (r8v2 com.kubi.mvi.state.d), (r8v5 com.kubi.mvi.state.d) binds: [B:27:0x00c2, B:32:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r12v3 com.kubi.mvi.state.d) = (r12v1 com.kubi.mvi.state.d), (r12v6 com.kubi.mvi.state.d) binds: [B:27:0x00c2, B:32:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011f, code lost:
    
        if (m43894A(r0) == r1) goto L37;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C196051 c196051;
        Object obj;
        InterfaceC19282d interfaceC19282d2;
        Object obj2;
        Object obj3;
        String taskId;
        InterfaceC19282d interfaceC19282d3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (continuation instanceof C196051) {
            c196051 = (C196051) continuation;
            int i11 = c196051.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c196051.label = i11 - Integer.MIN_VALUE;
            } else {
                c196051 = new C196051(continuation);
            }
        } else {
            c196051 = new C196051(continuation);
        }
        Object obj7 = c196051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c196051.label;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC19282d = (InterfaceC19282d) c196051.L$4;
                Object obj8 = (BaseStateVM) c196051.L$2;
                Object obj9 = (BaseStateVM) c196051.L$1;
                interfaceC19282d2 = (InterfaceC19282d) c196051.L$0;
                ResultKt.throwOnFailure(obj7);
                obj4 = obj8;
                obj2 = obj9;
            } else if (i12 == 2) {
                interfaceC19282d = (InterfaceC19282d) c196051.L$3;
                Object obj10 = (BaseStateVM) c196051.L$1;
                interfaceC19282d3 = (InterfaceC19282d) c196051.L$0;
                ResultKt.throwOnFailure(obj7);
                obj6 = obj10;
                interfaceC19282d2 = interfaceC19282d3;
                obj5 = obj6;
                if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.CountDownFinish) {
                    c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d2);
                    c196051.L$1 = SpillingKt.nullOutSpilledVariable(obj5);
                    c196051.L$2 = interfaceC19282d;
                    c196051.L$3 = SpillingKt.nullOutSpilledVariable((UserStatusWidgetContract$UiIntent.CountDownFinish) interfaceC19282d);
                    c196051.L$4 = null;
                    c196051.L$5 = null;
                    c196051.I$0 = 0;
                    c196051.I$1 = 0;
                    c196051.label = 3;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj7);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj7);
        if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.LoadData) {
            c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c196051.L$1 = SpillingKt.nullOutSpilledVariable(this);
            c196051.L$2 = SpillingKt.nullOutSpilledVariable(this);
            c196051.L$3 = SpillingKt.nullOutSpilledVariable(this);
            c196051.L$4 = interfaceC19282d;
            c196051.L$5 = SpillingKt.nullOutSpilledVariable((UserStatusWidgetContract$UiIntent.LoadData) interfaceC19282d);
            c196051.I$0 = 0;
            c196051.I$1 = 0;
            c196051.label = 1;
            if (m43893x(c196051) != coroutine_suspended) {
                Object obj11 = this;
                obj2 = obj11;
                interfaceC19282d2 = interfaceC19282d;
                obj4 = obj11;
            }
        } else {
            Object obj12 = this;
            obj = obj12;
            interfaceC19282d2 = interfaceC19282d;
            obj3 = obj12;
            obj5 = obj;
            if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.ApplyJoinTask) {
                if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.CountDownFinish) {
                    c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d2);
                    c196051.L$1 = SpillingKt.nullOutSpilledVariable(obj5);
                    c196051.L$2 = interfaceC19282d;
                    c196051.L$3 = SpillingKt.nullOutSpilledVariable((UserStatusWidgetContract$UiIntent.CountDownFinish) interfaceC19282d);
                    c196051.L$4 = null;
                    c196051.L$5 = null;
                    c196051.I$0 = 0;
                    c196051.I$1 = 0;
                    c196051.label = 3;
                }
                return Unit.INSTANCE;
            }
            UserStatusWidgetContract$UiIntent.ApplyJoinTask applyJoinTask = (UserStatusWidgetContract$UiIntent.ApplyJoinTask) interfaceC19282d;
            taskId = applyJoinTask.getTaskId();
            c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d2);
            c196051.L$1 = SpillingKt.nullOutSpilledVariable(obj);
            c196051.L$2 = SpillingKt.nullOutSpilledVariable(obj3);
            c196051.L$3 = interfaceC19282d;
            c196051.L$4 = SpillingKt.nullOutSpilledVariable(applyJoinTask);
            c196051.L$5 = null;
            c196051.I$0 = 0;
            c196051.I$1 = 0;
            c196051.label = 2;
            if (m43892u(taskId, c196051) != coroutine_suspended) {
                interfaceC19282d3 = interfaceC19282d2;
                obj6 = obj;
                interfaceC19282d2 = interfaceC19282d3;
                obj5 = obj6;
                if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.CountDownFinish) {
                    c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d2);
                    c196051.L$1 = SpillingKt.nullOutSpilledVariable(obj5);
                    c196051.L$2 = interfaceC19282d;
                    c196051.L$3 = SpillingKt.nullOutSpilledVariable((UserStatusWidgetContract$UiIntent.CountDownFinish) interfaceC19282d);
                    c196051.L$4 = null;
                    c196051.L$5 = null;
                    c196051.I$0 = 0;
                    c196051.I$1 = 0;
                    c196051.label = 3;
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
        obj3 = obj4;
        obj = obj2;
        obj5 = obj;
        if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.ApplyJoinTask) {
            if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.CountDownFinish) {
                c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d2);
                c196051.L$1 = SpillingKt.nullOutSpilledVariable(obj5);
                c196051.L$2 = interfaceC19282d;
                c196051.L$3 = SpillingKt.nullOutSpilledVariable((UserStatusWidgetContract$UiIntent.CountDownFinish) interfaceC19282d);
                c196051.L$4 = null;
                c196051.L$5 = null;
                c196051.I$0 = 0;
                c196051.I$1 = 0;
                c196051.label = 3;
            }
            return Unit.INSTANCE;
        }
        UserStatusWidgetContract$UiIntent.ApplyJoinTask applyJoinTask2 = (UserStatusWidgetContract$UiIntent.ApplyJoinTask) interfaceC19282d;
        taskId = applyJoinTask2.getTaskId();
        c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d2);
        c196051.L$1 = SpillingKt.nullOutSpilledVariable(obj);
        c196051.L$2 = SpillingKt.nullOutSpilledVariable(obj3);
        c196051.L$3 = interfaceC19282d;
        c196051.L$4 = SpillingKt.nullOutSpilledVariable(applyJoinTask2);
        c196051.L$5 = null;
        c196051.I$0 = 0;
        c196051.I$1 = 0;
        c196051.label = 2;
        if (m43892u(taskId, c196051) != coroutine_suspended) {
            interfaceC19282d3 = interfaceC19282d2;
            obj6 = obj;
            interfaceC19282d2 = interfaceC19282d3;
            obj5 = obj6;
            if (interfaceC19282d instanceof UserStatusWidgetContract$UiIntent.CountDownFinish) {
                c196051.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d2);
                c196051.L$1 = SpillingKt.nullOutSpilledVariable(obj5);
                c196051.L$2 = interfaceC19282d;
                c196051.L$3 = SpillingKt.nullOutSpilledVariable((UserStatusWidgetContract$UiIntent.CountDownFinish) interfaceC19282d);
                c196051.L$4 = null;
                c196051.L$5 = null;
                c196051.I$0 = 0;
                c196051.I$1 = 0;
                c196051.label = 3;
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public UserStatusWidgetContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m43897y(Continuation<? super Unit> continuation) throws JSONException {
        UserStatusWidgetVM$loadDataFromHome$1 userStatusWidgetVM$loadDataFromHome$1;
        long j11;
        if (continuation instanceof UserStatusWidgetVM$loadDataFromHome$1) {
            userStatusWidgetVM$loadDataFromHome$1 = (UserStatusWidgetVM$loadDataFromHome$1) continuation;
            int i11 = userStatusWidgetVM$loadDataFromHome$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userStatusWidgetVM$loadDataFromHome$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userStatusWidgetVM$loadDataFromHome$1 = new UserStatusWidgetVM$loadDataFromHome$1(this, continuation);
            }
        } else {
            userStatusWidgetVM$loadDataFromHome$1 = new UserStatusWidgetVM$loadDataFromHome$1(this, continuation);
        }
        Object objM43269j = userStatusWidgetVM$loadDataFromHome$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userStatusWidgetVM$loadDataFromHome$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM43269j);
            boolean zCompareAndSet = this.f37010Z.compareAndSet(true, false);
            if (zCompareAndSet) {
                UserStatusInfoResponseEntity userStatusInfoResponseEntity = (UserStatusInfoResponseEntity) C46392a.f104043a.m102336j(OperationStoreId.f36892a.m43684e(), UserStatusInfoResponseEntity.class, null);
                if (userStatusInfoResponseEntity != null) {
                    C44128b.m97259c(this.f37008X, "showGuide-cache");
                    send(new C19623i0(false, userStatusInfoResponseEntity));
                }
            }
            long jM94718b = C43103h.f95308a.m94718b();
            OperationRepo operationRepo = this.f37009Y;
            userStatusWidgetVM$loadDataFromHome$1.Z$0 = zCompareAndSet;
            userStatusWidgetVM$loadDataFromHome$1.J$0 = jM94718b;
            userStatusWidgetVM$loadDataFromHome$1.label = 1;
            objM43269j = operationRepo.m43269j(userStatusWidgetVM$loadDataFromHome$1);
            if (objM43269j == coroutine_suspended) {
                return coroutine_suspended;
            }
            j11 = jM94718b;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = userStatusWidgetVM$loadDataFromHome$1.J$0;
            ResultKt.throwOnFailure(objM43269j);
        }
        NewUserStatusInfoEntity newUserStatusInfoEntity = (NewUserStatusInfoEntity) objM43269j;
        C43103h c43103h = C43103h.f95308a;
        c43103h.m94720d(HomeWidgetCode.UserStatus.getCode(), c43103h.m94718b() - j11);
        if (newUserStatusInfoEntity == null || !newUserStatusInfoEntity.hitABTest()) {
            m43895v(newUserStatusInfoEntity != null ? newUserStatusInfoEntity.getNewcomerCard() : null);
            return Unit.INSTANCE;
        }
        WelfareTaskInfoEntity newcomerCard = newUserStatusInfoEntity.getNewcomerCard();
        String taskType = newcomerCard != null ? newcomerCard.getTaskType() : null;
        if (taskType == null) {
            taskType = "";
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = taskType.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (UserInfo.a.n() && Intrinsics.areEqual(upperCase, "SIGN_UP")) {
            C44128b.m97261e(this.f37008X, "hasLogin, but taskType is SIGN_UP, maybe token refresh now");
            return Unit.INSTANCE;
        }
        UserStatusInfoResponseEntity userStatusInfoResponseEntity2 = new UserStatusInfoResponseEntity(newUserStatusInfoEntity.getNewcomerCard(), Boxing.boxBoolean(newUserStatusInfoEntity.hitABTest()), newUserStatusInfoEntity.getCommonCardInfo());
        OperationStoreId operationStoreId = OperationStoreId.f36892a;
        C46392a.m102331n(operationStoreId.m43684e(), userStatusInfoResponseEntity2);
        if (C27025c.m66566d(newcomerCard != null ? newcomerCard.getTaskCompletion() : null)) {
            String str = this.f37008X;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("showAssetView,completion=");
            sb2.append(newcomerCard != null ? newcomerCard.getTaskCompletion() : null);
            C44128b.m97259c(str, sb2.toString());
            C46392a.m102335r(operationStoreId.m43683d());
            C46392a.m102328k(operationStoreId.m43682c(), true);
            send(new C19623i0(true, userStatusInfoResponseEntity2));
        } else {
            C44128b.m97259c(this.f37008X, "showGuide-network");
            C46392a.m102328k(operationStoreId.m43682c(), false);
            send(new C19623i0(false, userStatusInfoResponseEntity2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z */
    public final Object m43898z(Continuation<? super Unit> continuation) {
        UserStatusWidgetVM$loadDataFromWelfare$1 userStatusWidgetVM$loadDataFromWelfare$1;
        if (continuation instanceof UserStatusWidgetVM$loadDataFromWelfare$1) {
            userStatusWidgetVM$loadDataFromWelfare$1 = (UserStatusWidgetVM$loadDataFromWelfare$1) continuation;
            int i11 = userStatusWidgetVM$loadDataFromWelfare$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userStatusWidgetVM$loadDataFromWelfare$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userStatusWidgetVM$loadDataFromWelfare$1 = new UserStatusWidgetVM$loadDataFromWelfare$1(this, continuation);
            }
        } else {
            userStatusWidgetVM$loadDataFromWelfare$1 = new UserStatusWidgetVM$loadDataFromWelfare$1(this, continuation);
        }
        Object objM43276q = userStatusWidgetVM$loadDataFromWelfare$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userStatusWidgetVM$loadDataFromWelfare$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM43276q);
            boolean zCompareAndSet = this.f37010Z.compareAndSet(true, false);
            if (zCompareAndSet) {
                WelfareTaskInfoEntity welfareTaskInfoEntity = (WelfareTaskInfoEntity) C46392a.f104043a.m102336j(OperationStoreId.f36892a.m43683d(), WelfareTaskInfoEntity.class, null);
                if (welfareTaskInfoEntity != null) {
                    C44128b.m97259c(this.f37008X, "showGuide-cache");
                    send(new C19623i0(false, new UserStatusInfoResponseEntity(welfareTaskInfoEntity, null, null, 6, null)));
                }
            }
            OperationRepo operationRepo = this.f37009Y;
            userStatusWidgetVM$loadDataFromWelfare$1.Z$0 = zCompareAndSet;
            userStatusWidgetVM$loadDataFromWelfare$1.label = 1;
            objM43276q = operationRepo.m43276q(userStatusWidgetVM$loadDataFromWelfare$1);
            if (objM43276q == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM43276q);
        }
        m43895v((WelfareTaskInfoEntity) objM43276q);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Object m43894A(Continuation<? super Unit> continuation) throws JSONException {
        Object objM43893x = m43893x(continuation);
        if (objM43893x == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM43893x;
        }
        return Unit.INSTANCE;
    }
}
