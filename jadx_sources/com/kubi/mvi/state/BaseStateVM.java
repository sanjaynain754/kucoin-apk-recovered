package com.kubi.mvi.state;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.Constants;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p208dr.InterfaceC36952a;
import p734wq.C45916a;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BaseStateVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b'\u0018\u0000 \u0091\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u00020\u0007:\u0002\u0091\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\tJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J(\u0010%\u001a\u00020\u000b2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0002\b#H\u0004¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u000e*\u00028\u0001H\u0004¢\u0006\u0004\b'\u0010(J8\u0010.\u001a\u00020-2'\u0010,\u001a#\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0+\u0012\u0006\u0012\u0004\u0018\u00010\u00060)¢\u0006\u0002\b#H\u0004¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H\u0004¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0094@¢\u0006\u0004\b3\u0010\u0012J\u0018\u00104\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0094@¢\u0006\u0004\b4\u0010\u0012J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0004¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u000e*\u000205H\u0004¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u000eH\u0004¢\u0006\u0004\b:\u0010\tJ\u000f\u0010;\u001a\u00020\u000eH\u0004¢\u0006\u0004\b;\u0010\tJ\u000f\u0010<\u001a\u00020\u000eH\u0004¢\u0006\u0004\b<\u0010\tJ\u000f\u0010=\u001a\u00020\u000eH\u0004¢\u0006\u0004\b=\u0010\tJ\u001e\u0010?\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010>H\u0096@¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u0015H\u0004¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u000eH\u0004¢\u0006\u0004\bF\u0010\tJD\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020H2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\u000b2\b\b\u0002\u0010L\u001a\u00020\u000bH\u0084@¢\u0006\u0004\bM\u0010NJ9\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020H2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\u000bH\u0004¢\u0006\u0004\bK\u0010OJ/\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020H2\b\b\u0002\u0010K\u001a\u00020\u000bH\u0004¢\u0006\u0004\b<\u0010PJJ\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00020Q\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020H2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0+\u0012\u0006\u0012\u0004\u0018\u00010\u00060)H\u0085@¢\u0006\u0004\bR\u0010SJB\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00020Q\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020H2\b\b\u0002\u0010T\u001a\u00020\u000b2\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017H\u0084@¢\u0006\u0004\bV\u0010WJ&\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020HH\u0084@¢\u0006\u0004\bX\u0010YJ0\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020H2\b\b\u0002\u0010Z\u001a\u00020\u000bH\u0084@¢\u0006\u0004\b[\u0010\\J:\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020H2\b\b\u0002\u0010]\u001a\u00020\u000b2\b\b\u0002\u0010J\u001a\u00020IH\u0084@¢\u0006\u0004\b^\u0010_J7\u0010`\u001a\u00020\u0001\"\n\b\u0002\u0010G\u0018\u0001*\u00020\u0001*\u00020\u00012\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u000e0\"H\u0084\bø\u0001\u0000¢\u0006\u0004\b`\u0010aJ&\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u00028\u00020HH\u0084@¢\u0006\u0004\bb\u0010YJ\u0010\u0010c\u001a\u00020\u000eH\u0094@¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u000eH\u0014¢\u0006\u0004\be\u0010\tJ\u000f\u0010f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bf\u0010gJ\u001b\u00109\u001a\u00020\u000e\"\b\b\u0002\u0010G*\u00028\u0000*\u00028\u0002¢\u0006\u0004\b9\u0010!R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010p\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010q\u001a\u00020I8\u0014X\u0094D¢\u0006\f\n\u0004\bq\u0010\u0002\u001a\u0004\br\u0010sR\u001a\u0010t\u001a\u00020\u000b8\u0014X\u0094D¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010gR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010m\u001a\u0004\bx\u0010gR\u001b\u0010\u0014\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010m\u001a\u0004\bz\u0010gR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00010{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u0002050i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010kR\u001d\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0082\u0001\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000H8F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00028\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001d\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00028\u00010H8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u0087\u0001R\u001a\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u0002050H8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u0087\u0001R\u0013\u0010\n\u001a\u00028\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0092\u0001"}, m90084d2 = {"Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/vm/BaseVM;", "", "Lcom/kubi/mvi/state/IViewModelLog;", "<init>", "()V", "state", "", "emitState", "(Lcom/kubi/mvi/state/f;)Z", "", "collectIntent", "intent", "handleDispatchIntent", "(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needCatch", "needMeasureTime", "", "methodName", "Lkotlin/Function0;", "call", "traceMethod", "(ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/kubi/mvi/state/MviConfig;", "mviConfig", "setMVIContext", "(Lcom/kubi/mvi/state/MviConfig;)V", "destroyMVIContext", "sendIntent", "(Lcom/kubi/mvi/state/d;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "reducer", "updateState", "(Lkotlin/jvm/functions/Function1;)Z", "update", "(Lcom/kubi/mvi/state/f;)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "block", "Lkotlinx/coroutines/x1;", "launchOnIO", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", "key", "getStringArguments", "(Ljava/lang/String;)Ljava/lang/String;", "dispatchIntentOnIO", "dispatchIntent", "Ldr/a;", "singleEvent", "sendSingleEvent", "(Ldr/a;)V", C33675gh.f70005k, "showLoadingDialog", "hideLoadingDialog", "showLoadingView", "showContentView", "Lcom/kubi/mvi/state/SyncIntent;", "dispatchSyncIntent", "(Lcom/kubi/mvi/state/SyncIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSyncIntent", "(Lcom/kubi/mvi/state/d;)Lcom/kubi/mvi/state/f;", "msg", "showToast", "(Ljava/lang/String;)V", "finishFragment", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "", "type", "showLoading", "needAutoHide", "startLoading", "(Lkotlinx/coroutines/flow/e;IZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/e;IZ)Lkotlinx/coroutines/flow/e;", "(Lkotlinx/coroutines/flow/e;Z)Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/retrofit/utils/f;", "onApiSuccess", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "autoHandleResult", "retry", "requestNet", "(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startLoadingView", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needShowLoadingView", "startLoadingViewWithCondition", "(Lkotlinx/coroutines/flow/e;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needShowLoading", "startLoadingByCondition", "(Lkotlinx/coroutines/flow/e;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIntent", "(Lcom/kubi/mvi/state/d;Lkotlin/jvm/functions/Function1;)Lcom/kubi/mvi/state/d;", "startLoadingDialog", "handleInitIntent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "isOpenLog", "()Z", "Lcom/kubi/mvi/state/MviConfig;", "Lkotlinx/coroutines/channels/d;", "intentChannel", "Lkotlinx/coroutines/channels/d;", "biz$delegate", "Lkotlin/Lazy;", "getBiz", "()Ljava/lang/String;", Constants.BIZ, "defaultThreadMode", "getDefaultThreadMode", "()I", "needCatchException", "Z", "getNeedCatchException", "needCatch$delegate", "getNeedCatch", "needMeasureTime$delegate", "getNeedMeasureTime", "Lkotlinx/coroutines/flow/n;", "mutableStatedFlow", "Lkotlinx/coroutines/flow/n;", "singleEventChannel", "Lcom/kubi/mvi/state/UniqueTaskChannel;", "mUniqueTask", "Lcom/kubi/mvi/state/UniqueTaskChannel;", "updateLock", "Ljava/lang/Object;", "getUpdateLock", "()Ljava/lang/Object;", "getIntentFlow", "()Lkotlinx/coroutines/flow/e;", "intentFlow", "getInitState", "()Lcom/kubi/mvi/state/f;", "initState", "getStateFlow", "stateFlow", "getSingleEventFlow", "singleEventFlow", "getState", "Companion", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MethodTracker.kt\ncom/kubi/mvi/state/MethodTrackerKt\n+ 5 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 6 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,630:1\n589#1,7:637\n596#1,10:646\n606#1:693\n589#1,7:694\n596#1,10:703\n606#1:750\n589#1,7:751\n596#1,10:760\n606#1:807\n27#2:631\n28#2:633\n27#2:634\n28#2:636\n1#3:632\n1#3:635\n43#4,2:644\n45#4:656\n46#4,3:664\n50#4,6:687\n43#4,2:701\n45#4:713\n46#4,3:721\n50#4,6:744\n43#4,2:758\n45#4:770\n46#4,3:778\n50#4,6:801\n43#4,3:808\n46#4,3:818\n50#4,6:841\n43#4,3:847\n46#4,3:857\n50#4,6:875\n50#5,7:657\n122#5,2:667\n125#5,2:675\n57#5,10:677\n50#5,7:714\n122#5,2:724\n125#5,2:732\n57#5,10:734\n50#5,7:771\n122#5,2:781\n125#5,2:789\n57#5,10:791\n50#5,7:811\n122#5,2:821\n125#5,2:829\n57#5,10:831\n50#5,7:850\n122#5,5:860\n57#5,10:865\n17#6,6:669\n17#6,6:726\n17#6,6:783\n17#6,6:823\n*S KotlinDebug\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n532#1:637,7\n532#1:646,10\n532#1:693\n550#1:694,7\n550#1:703,10\n550#1:750\n560#1:751,7\n560#1:760,10\n560#1:807\n393#1:631\n393#1:633\n413#1:634\n413#1:636\n393#1:632\n413#1:635\n532#1:644,2\n532#1:656\n532#1:664,3\n532#1:687,6\n550#1:701,2\n550#1:713\n550#1:721,3\n550#1:744,6\n560#1:758,2\n560#1:770\n560#1:778,3\n560#1:801,6\n595#1:808,3\n595#1:818,3\n595#1:841,6\n595#1:847,3\n595#1:857,3\n595#1:875,6\n532#1:657,7\n532#1:667,2\n532#1:675,2\n532#1:677,10\n550#1:714,7\n550#1:724,2\n550#1:732,2\n550#1:734,10\n560#1:771,7\n560#1:781,2\n560#1:789,2\n560#1:791,10\n595#1:811,7\n595#1:821,2\n595#1:829,2\n595#1:831,10\n595#1:850,7\n595#1:860,5\n595#1:865,10\n532#1:669,6\n550#1:726,6\n560#1:783,6\n595#1:823,6\n*E\n"})
public abstract class BaseStateVM<I extends InterfaceC19282d, S extends InterfaceC19284f> extends BaseVM implements IViewModelLog {
    public static final int MULTI_THREAD_MODE = 1;
    public static final int SINGLE_THREAD_MODE = 2;

    @Nullable
    private MviConfig mviConfig;
    private final boolean needCatchException;

    @NotNull
    private final InterfaceC41565d<I> intentChannel = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: biz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy biz = LazyKt.lazy(new Function0<String>(this) { // from class: com.kubi.mvi.state.BaseStateVM$biz$2
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // p852kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.this$0.getClass().getSimpleName();
        }
    });
    private final int defaultThreadMode = 1;

    /* JADX INFO: renamed from: needCatch$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy needCatch = LazyKt.lazy(new Function0<Boolean>(this) { // from class: com.kubi.mvi.state.BaseStateVM$needCatch$2
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getNeedCatchException() && !C19241c.f35620a.m42528a());
        }
    });

    /* JADX INFO: renamed from: needMeasureTime$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy needMeasureTime = LazyKt.lazy(new Function0<Boolean>(this) { // from class: com.kubi.mvi.state.BaseStateVM$needMeasureTime$2
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            MviConfig mviConfig = ((BaseStateVM) this.this$0).mviConfig;
            return Boolean.valueOf(C27025c.m66566d(mviConfig != null ? Boolean.valueOf(mviConfig.m42565e()) : null));
        }
    });

    @NotNull
    private final InterfaceC41669n<S> mutableStatedFlow = C41679x.m91009a(getInitState());

    @NotNull
    private final InterfaceC41565d<InterfaceC36952a> singleEventChannel = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);

    @NotNull
    private final UniqueTaskChannel<I> mUniqueTask = new UniqueTaskChannel<>();

    @NotNull
    private final Object updateLock = new Object();

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$collectIntent$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "it", "", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$collectIntent$1", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {500}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192561 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull I i11, @Nullable Continuation<? super Unit> continuation) {
            return ((C192561) create(i11, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192561(BaseStateVM<I, S> baseStateVM, Continuation<? super C192561> continuation) {
            super(2, continuation);
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C192561 c192561 = new C192561(this.this$0, continuation);
            c192561.L$0 = obj;
            return c192561;
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
                InterfaceC19282d interfaceC19282d = (InterfaceC19282d) this.L$0;
                BaseStateVM<I, S> baseStateVM = this.this$0;
                this.label = 1;
                if (baseStateVM.handleDispatchIntent(interfaceC19282d, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$collectIntent$2 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u008a@"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "it", "", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$collectIntent$2", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {507}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192572 extends SuspendLambda implements Function3<InterfaceC41709m0, I, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192572(BaseStateVM<I, S> baseStateVM, Continuation<? super C192572> continuation) {
            super(3, continuation);
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull I i11, @Nullable Continuation<? super Unit> continuation) {
            C192572 c192572 = new C192572(this.this$0, continuation);
            c192572.L$0 = i11;
            return c192572.invokeSuspend(Unit.INSTANCE);
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
                InterfaceC19282d interfaceC19282d = (InterfaceC19282d) this.L$0;
                if (interfaceC19282d instanceof InterfaceC19300v) {
                    ((BaseStateVM) this.this$0).mUniqueTask.m42662d(interfaceC19282d, ViewModelKt.getViewModelScope(this.this$0));
                } else {
                    BaseStateVM<I, S> baseStateVM = this.this$0;
                    this.label = 1;
                    if (baseStateVM.handleDispatchIntent(interfaceC19282d, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM", m90122f = "BaseStateVM.kt", m90123i = {0, 0, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5}, m90124l = {533, 533, 551, 551, 561, 561}, m90125m = "handleDispatchIntent", m90126n = {"$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "start$iv$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "start$iv$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "start$iv$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv"}, m90127s = {"L$1", "L$3", "J$0", "L$1", "L$3", "L$1", "L$3", "J$0", "L$1", "L$3", "L$1", "L$3", "J$0", "L$1", "L$3"})
    public static final class C192591 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192591(BaseStateVM<I, S> baseStateVM, Continuation<? super C192591> continuation) {
            super(continuation);
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleDispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$3 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$3", m90122f = "BaseStateVM.kt", m90123i = {0, 0, 0, 1, 1}, m90124l = {542, 542}, m90125m = "invokeSuspend", m90126n = {"$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "start$iv$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv"}, m90127s = {"L$1", "L$3", "J$0", "L$1", "L$3"})
    @SourceDebugExtension({"SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$3\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 MethodTracker.kt\ncom/kubi/mvi/state/MethodTrackerKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,630:1\n589#2,7:631\n596#2,10:640\n606#2:687\n43#3,2:638\n45#3:650\n46#3,3:658\n50#3,6:681\n50#4,7:651\n122#4,2:661\n125#4,2:669\n57#4,10:671\n17#5,6:663\n*S KotlinDebug\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$3\n*L\n541#1:631,7\n541#1:640,10\n541#1:687\n541#1:638,2\n541#1:650\n541#1:658,3\n541#1:681,6\n541#1:651,7\n541#1:661,2\n541#1:669,2\n541#1:671,10\n541#1:663,6\n*E\n"})
    public static final class C192603 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ I $intent;
        final /* synthetic */ String $intentName;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: Code duplicated, block: B:52:0x013d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0170  */
        /* JADX WARN: Code duplicated, block: B:62:0x017b  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strM66668h;
            String str;
            Throwable th2;
            boolean z11;
            String str2;
            C19288j c19288j;
            Unit unit;
            Function1<Long, Unit> function1;
            boolean z12;
            String str3;
            Function1<Long, Unit> function2;
            C19288j c19288j2;
            long j11;
            long jCurrentTimeMillis;
            Object objM103844constructorimpl;
            Throwable thM103847exceptionOrNullimpl;
            Throwable thM103847exceptionOrNullimpl2;
            Function1<Throwable, Unit> function1M42668a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.J$0;
                    z12 = this.Z$0;
                    function2 = (Function1) this.L$4;
                    str3 = (String) this.L$3;
                    String str4 = (String) this.L$2;
                    c19288j2 = (C19288j) this.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                        strM66668h = str4;
                        try {
                            jCurrentTimeMillis = System.currentTimeMillis() - j11;
                            z11 = z12;
                            str2 = str3;
                            c19288j = c19288j2;
                            function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                            unit = Unit.INSTANCE;
                            str = strM66668h;
                            objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        } catch (Throwable th3) {
                            str = strM66668h;
                            th2 = th3;
                            z11 = z12;
                            str2 = str3;
                            c19288j = c19288j2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        z11 = z12;
                        str2 = str3;
                        str = str4;
                        c19288j = c19288j2;
                        Result.Companion companion = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            if (z11) {
                                throw thM103847exceptionOrNullimpl;
                            }
                            throw thM103847exceptionOrNullimpl;
                        }
                        thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl2 != null) {
                            C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                            function1M42668a = c19288j.m42668a();
                            if (function1M42668a != null) {
                                function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = this.Z$0;
                    function1 = (Function1) this.L$4;
                    str2 = (String) this.L$3;
                    str = (String) this.L$2;
                    c19288j = (C19288j) this.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                        jCurrentTimeMillis = 0;
                        strM66668h = str;
                        function2 = function1;
                        try {
                            function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                            unit = Unit.INSTANCE;
                            str = strM66668h;
                            objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        } catch (Throwable th5) {
                            str = strM66668h;
                            th2 = th5;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
                th2 = th6;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            } else {
                ResultKt.throwOnFailure(obj);
                BaseStateVM<I, S> baseStateVM = this.this$0;
                String intentName = this.$intentName;
                Intrinsics.checkNotNullExpressionValue(intentName, "$intentName");
                BaseStateVM<I, S> baseStateVM2 = this.this$0;
                I i12 = this.$intent;
                boolean needCatch = baseStateVM.getNeedCatch();
                boolean needMeasureTime = baseStateVM.getNeedMeasureTime();
                Boolean boolBoxBoolean = Boxing.boxBoolean(needCatch);
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(needMeasureTime);
                String biz = baseStateVM.getBiz();
                C19288j c19288j3 = new C19288j();
                c19288j3.m42672e(new BaseStateVM$traceMethod$1$1(baseStateVM, intentName));
                c19288j3.m42671d(new BaseStateVM$traceMethod$1$2(baseStateVM, intentName));
                c19288j3.m42673f(new BaseStateVM$traceMethod$1$3(baseStateVM, intentName));
                strM66668h = C27041f.m66668h(biz);
                boolean zM66566d = C27025c.m66566d(boolBoxBoolean);
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    Function0<Unit> function0M42669b = c19288j3.m42669b();
                    if (function0M42669b != null) {
                        function0M42669b.invoke();
                    }
                    Function1<Long, Unit> function1M42670c = c19288j3.m42670c();
                    if (function1M42670c != null) {
                        if (C27025c.m66566d(boolBoxBoolean2)) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            this.L$0 = c19288j3;
                            this.L$1 = c19288j3;
                            this.L$2 = strM66668h;
                            this.L$3 = "crash_issue";
                            this.L$4 = function1M42670c;
                            this.Z$0 = zM66566d;
                            this.J$0 = jCurrentTimeMillis2;
                            this.label = 1;
                            if (baseStateVM2.dispatchIntentOnIO(i12, this) != coroutine_suspended) {
                                z12 = zM66566d;
                                str3 = "crash_issue";
                                function2 = function1M42670c;
                                c19288j2 = c19288j3;
                                j11 = jCurrentTimeMillis2;
                                jCurrentTimeMillis = System.currentTimeMillis() - j11;
                                z11 = z12;
                                str2 = str3;
                                c19288j = c19288j2;
                                function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                                unit = Unit.INSTANCE;
                            }
                        } else {
                            this.L$0 = c19288j3;
                            this.L$1 = c19288j3;
                            this.L$2 = strM66668h;
                            this.L$3 = "crash_issue";
                            this.L$4 = function1M42670c;
                            this.Z$0 = zM66566d;
                            this.label = 2;
                            if (baseStateVM2.dispatchIntentOnIO(i12, this) != coroutine_suspended) {
                                str = strM66668h;
                                z11 = zM66566d;
                                str2 = "crash_issue";
                                function1 = function1M42670c;
                                c19288j = c19288j3;
                                jCurrentTimeMillis = 0;
                                strM66668h = str;
                                function2 = function1;
                                function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                                unit = Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                    unit = null;
                    z11 = zM66566d;
                    str2 = "crash_issue";
                    c19288j = c19288j3;
                    str = strM66668h;
                    objM103844constructorimpl = Result.m103844constructorimpl(unit);
                } catch (Throwable th7) {
                    str = strM66668h;
                    th2 = th7;
                    z11 = zM66566d;
                    str2 = "crash_issue";
                    c19288j = c19288j3;
                }
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (z11 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f(str2, str2 + "->【" + str + " 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                function1M42668a = c19288j.m42668a();
                if (function1M42668a != null) {
                    function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192603(BaseStateVM<I, S> baseStateVM, String str, I i11, Continuation<? super C192603> continuation) {
            super(2, continuation);
            this.this$0 = baseStateVM;
            this.$intentName = str;
            this.$intent = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192603(this.this$0, this.$intentName, this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C192603) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$6 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$6", m90122f = "BaseStateVM.kt", m90123i = {0, 0, 0, 1, 1}, m90124l = {570, 570}, m90125m = "invokeSuspend", m90126n = {"$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "start$iv$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv"}, m90127s = {"L$1", "L$3", "J$0", "L$1", "L$3"})
    @SourceDebugExtension({"SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$6\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 MethodTracker.kt\ncom/kubi/mvi/state/MethodTrackerKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,630:1\n589#2,7:631\n596#2,10:640\n606#2:687\n43#3,2:638\n45#3:650\n46#3,3:658\n50#3,6:681\n50#4,7:651\n122#4,2:661\n125#4,2:669\n57#4,10:671\n17#5,6:663\n*S KotlinDebug\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$6\n*L\n569#1:631,7\n569#1:640,10\n569#1:687\n569#1:638,2\n569#1:650\n569#1:658,3\n569#1:681,6\n569#1:651,7\n569#1:661,2\n569#1:669,2\n569#1:671,10\n569#1:663,6\n*E\n"})
    public static final class C192616 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ I $intent;
        final /* synthetic */ String $intentName;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: Code duplicated, block: B:52:0x013d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0170  */
        /* JADX WARN: Code duplicated, block: B:62:0x017b  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strM66668h;
            String str;
            Throwable th2;
            boolean z11;
            String str2;
            C19288j c19288j;
            Unit unit;
            Function1<Long, Unit> function1;
            boolean z12;
            String str3;
            Function1<Long, Unit> function2;
            C19288j c19288j2;
            long j11;
            long jCurrentTimeMillis;
            Object objM103844constructorimpl;
            Throwable thM103847exceptionOrNullimpl;
            Throwable thM103847exceptionOrNullimpl2;
            Function1<Throwable, Unit> function1M42668a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.J$0;
                    z12 = this.Z$0;
                    function2 = (Function1) this.L$4;
                    str3 = (String) this.L$3;
                    String str4 = (String) this.L$2;
                    c19288j2 = (C19288j) this.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                        strM66668h = str4;
                        try {
                            jCurrentTimeMillis = System.currentTimeMillis() - j11;
                            z11 = z12;
                            str2 = str3;
                            c19288j = c19288j2;
                            function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                            unit = Unit.INSTANCE;
                            str = strM66668h;
                            objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        } catch (Throwable th3) {
                            str = strM66668h;
                            th2 = th3;
                            z11 = z12;
                            str2 = str3;
                            c19288j = c19288j2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        z11 = z12;
                        str2 = str3;
                        str = str4;
                        c19288j = c19288j2;
                        Result.Companion companion = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            if (z11) {
                                throw thM103847exceptionOrNullimpl;
                            }
                            throw thM103847exceptionOrNullimpl;
                        }
                        thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl2 != null) {
                            C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                            function1M42668a = c19288j.m42668a();
                            if (function1M42668a != null) {
                                function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = this.Z$0;
                    function1 = (Function1) this.L$4;
                    str2 = (String) this.L$3;
                    str = (String) this.L$2;
                    c19288j = (C19288j) this.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                        jCurrentTimeMillis = 0;
                        strM66668h = str;
                        function2 = function1;
                        try {
                            function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                            unit = Unit.INSTANCE;
                            str = strM66668h;
                            objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        } catch (Throwable th5) {
                            str = strM66668h;
                            th2 = th5;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
                th2 = th6;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            } else {
                ResultKt.throwOnFailure(obj);
                BaseStateVM<I, S> baseStateVM = this.this$0;
                String intentName = this.$intentName;
                Intrinsics.checkNotNullExpressionValue(intentName, "$intentName");
                BaseStateVM<I, S> baseStateVM2 = this.this$0;
                I i12 = this.$intent;
                boolean needCatch = baseStateVM.getNeedCatch();
                boolean needMeasureTime = baseStateVM.getNeedMeasureTime();
                Boolean boolBoxBoolean = Boxing.boxBoolean(needCatch);
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(needMeasureTime);
                String biz = baseStateVM.getBiz();
                C19288j c19288j3 = new C19288j();
                c19288j3.m42672e(new BaseStateVM$traceMethod$1$1(baseStateVM, intentName));
                c19288j3.m42671d(new BaseStateVM$traceMethod$1$2(baseStateVM, intentName));
                c19288j3.m42673f(new BaseStateVM$traceMethod$1$3(baseStateVM, intentName));
                strM66668h = C27041f.m66668h(biz);
                boolean zM66566d = C27025c.m66566d(boolBoxBoolean);
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    Function0<Unit> function0M42669b = c19288j3.m42669b();
                    if (function0M42669b != null) {
                        function0M42669b.invoke();
                    }
                    Function1<Long, Unit> function1M42670c = c19288j3.m42670c();
                    if (function1M42670c != null) {
                        if (C27025c.m66566d(boolBoxBoolean2)) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            this.L$0 = c19288j3;
                            this.L$1 = c19288j3;
                            this.L$2 = strM66668h;
                            this.L$3 = "crash_issue";
                            this.L$4 = function1M42670c;
                            this.Z$0 = zM66566d;
                            this.J$0 = jCurrentTimeMillis2;
                            this.label = 1;
                            if (baseStateVM2.dispatchIntentOnIO(i12, this) != coroutine_suspended) {
                                z12 = zM66566d;
                                str3 = "crash_issue";
                                function2 = function1M42670c;
                                c19288j2 = c19288j3;
                                j11 = jCurrentTimeMillis2;
                                jCurrentTimeMillis = System.currentTimeMillis() - j11;
                                z11 = z12;
                                str2 = str3;
                                c19288j = c19288j2;
                                function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                                unit = Unit.INSTANCE;
                            }
                        } else {
                            this.L$0 = c19288j3;
                            this.L$1 = c19288j3;
                            this.L$2 = strM66668h;
                            this.L$3 = "crash_issue";
                            this.L$4 = function1M42670c;
                            this.Z$0 = zM66566d;
                            this.label = 2;
                            if (baseStateVM2.dispatchIntentOnIO(i12, this) != coroutine_suspended) {
                                str = strM66668h;
                                z11 = zM66566d;
                                str2 = "crash_issue";
                                function1 = function1M42670c;
                                c19288j = c19288j3;
                                jCurrentTimeMillis = 0;
                                strM66668h = str;
                                function2 = function1;
                                function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                                unit = Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                    unit = null;
                    z11 = zM66566d;
                    str2 = "crash_issue";
                    c19288j = c19288j3;
                    str = strM66668h;
                    objM103844constructorimpl = Result.m103844constructorimpl(unit);
                } catch (Throwable th7) {
                    str = strM66668h;
                    th2 = th7;
                    z11 = zM66566d;
                    str2 = "crash_issue";
                    c19288j = c19288j3;
                }
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (z11 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f(str2, str2 + "->【" + str + " 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                function1M42668a = c19288j.m42668a();
                if (function1M42668a != null) {
                    function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192616(BaseStateVM<I, S> baseStateVM, String str, I i11, Continuation<? super C192616> continuation) {
            super(2, continuation);
            this.this$0 = baseStateVM;
            this.$intentName = str;
            this.$intent = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192616(this.this$0, this.$intentName, this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C192616) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$7 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$7", m90122f = "BaseStateVM.kt", m90123i = {0, 0, 0, 1, 1}, m90124l = {580, 580}, m90125m = "invokeSuspend", m90126n = {"$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv", "start$iv$iv$iv$iv", "$this$callMethod_u24lambda_u242$iv$iv", "reportName$iv$iv$iv"}, m90127s = {"L$1", "L$3", "J$0", "L$1", "L$3"})
    @SourceDebugExtension({"SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 MethodTracker.kt\ncom/kubi/mvi/state/MethodTrackerKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,630:1\n589#2,7:631\n596#2,10:640\n606#2:687\n43#3,2:638\n45#3:650\n46#3,3:658\n50#3,6:681\n50#4,7:651\n122#4,2:661\n125#4,2:669\n57#4,10:671\n17#5,6:663\n*S KotlinDebug\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7\n*L\n579#1:631,7\n579#1:640,10\n579#1:687\n579#1:638,2\n579#1:650\n579#1:658,3\n579#1:681,6\n579#1:651,7\n579#1:661,2\n579#1:669,2\n579#1:671,10\n579#1:663,6\n*E\n"})
    public static final class C192627 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ I $intent;
        final /* synthetic */ String $intentName;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: Code duplicated, block: B:52:0x013d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0170  */
        /* JADX WARN: Code duplicated, block: B:62:0x017b  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strM66668h;
            String str;
            Throwable th2;
            boolean z11;
            String str2;
            C19288j c19288j;
            Unit unit;
            Function1<Long, Unit> function1;
            boolean z12;
            String str3;
            Function1<Long, Unit> function2;
            C19288j c19288j2;
            long j11;
            long jCurrentTimeMillis;
            Object objM103844constructorimpl;
            Throwable thM103847exceptionOrNullimpl;
            Throwable thM103847exceptionOrNullimpl2;
            Function1<Throwable, Unit> function1M42668a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.J$0;
                    z12 = this.Z$0;
                    function2 = (Function1) this.L$4;
                    str3 = (String) this.L$3;
                    String str4 = (String) this.L$2;
                    c19288j2 = (C19288j) this.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                        strM66668h = str4;
                        try {
                            jCurrentTimeMillis = System.currentTimeMillis() - j11;
                            z11 = z12;
                            str2 = str3;
                            c19288j = c19288j2;
                            function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                            unit = Unit.INSTANCE;
                            str = strM66668h;
                            objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        } catch (Throwable th3) {
                            str = strM66668h;
                            th2 = th3;
                            z11 = z12;
                            str2 = str3;
                            c19288j = c19288j2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        z11 = z12;
                        str2 = str3;
                        str = str4;
                        c19288j = c19288j2;
                        Result.Companion companion = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            if (z11) {
                                throw thM103847exceptionOrNullimpl;
                            }
                            throw thM103847exceptionOrNullimpl;
                        }
                        thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl2 != null) {
                            C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                            function1M42668a = c19288j.m42668a();
                            if (function1M42668a != null) {
                                function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = this.Z$0;
                    function1 = (Function1) this.L$4;
                    str2 = (String) this.L$3;
                    str = (String) this.L$2;
                    c19288j = (C19288j) this.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                        jCurrentTimeMillis = 0;
                        strM66668h = str;
                        function2 = function1;
                        try {
                            function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                            unit = Unit.INSTANCE;
                            str = strM66668h;
                            objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        } catch (Throwable th5) {
                            str = strM66668h;
                            th2 = th5;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
                th2 = th6;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            } else {
                ResultKt.throwOnFailure(obj);
                BaseStateVM<I, S> baseStateVM = this.this$0;
                String intentName = this.$intentName;
                Intrinsics.checkNotNullExpressionValue(intentName, "$intentName");
                BaseStateVM<I, S> baseStateVM2 = this.this$0;
                I i12 = this.$intent;
                boolean needCatch = baseStateVM.getNeedCatch();
                boolean needMeasureTime = baseStateVM.getNeedMeasureTime();
                Boolean boolBoxBoolean = Boxing.boxBoolean(needCatch);
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(needMeasureTime);
                String biz = baseStateVM.getBiz();
                C19288j c19288j3 = new C19288j();
                c19288j3.m42672e(new BaseStateVM$traceMethod$1$1(baseStateVM, intentName));
                c19288j3.m42671d(new BaseStateVM$traceMethod$1$2(baseStateVM, intentName));
                c19288j3.m42673f(new BaseStateVM$traceMethod$1$3(baseStateVM, intentName));
                strM66668h = C27041f.m66668h(biz);
                boolean zM66566d = C27025c.m66566d(boolBoxBoolean);
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    Function0<Unit> function0M42669b = c19288j3.m42669b();
                    if (function0M42669b != null) {
                        function0M42669b.invoke();
                    }
                    Function1<Long, Unit> function1M42670c = c19288j3.m42670c();
                    if (function1M42670c != null) {
                        if (C27025c.m66566d(boolBoxBoolean2)) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            this.L$0 = c19288j3;
                            this.L$1 = c19288j3;
                            this.L$2 = strM66668h;
                            this.L$3 = "crash_issue";
                            this.L$4 = function1M42670c;
                            this.Z$0 = zM66566d;
                            this.J$0 = jCurrentTimeMillis2;
                            this.label = 1;
                            if (baseStateVM2.dispatchIntentOnIO(i12, this) != coroutine_suspended) {
                                z12 = zM66566d;
                                str3 = "crash_issue";
                                function2 = function1M42670c;
                                c19288j2 = c19288j3;
                                j11 = jCurrentTimeMillis2;
                                jCurrentTimeMillis = System.currentTimeMillis() - j11;
                                z11 = z12;
                                str2 = str3;
                                c19288j = c19288j2;
                                function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                                unit = Unit.INSTANCE;
                            }
                        } else {
                            this.L$0 = c19288j3;
                            this.L$1 = c19288j3;
                            this.L$2 = strM66668h;
                            this.L$3 = "crash_issue";
                            this.L$4 = function1M42670c;
                            this.Z$0 = zM66566d;
                            this.label = 2;
                            if (baseStateVM2.dispatchIntentOnIO(i12, this) != coroutine_suspended) {
                                str = strM66668h;
                                z11 = zM66566d;
                                str2 = "crash_issue";
                                function1 = function1M42670c;
                                c19288j = c19288j3;
                                jCurrentTimeMillis = 0;
                                strM66668h = str;
                                function2 = function1;
                                function2.invoke(Boxing.boxLong(jCurrentTimeMillis));
                                unit = Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                    unit = null;
                    z11 = zM66566d;
                    str2 = "crash_issue";
                    c19288j = c19288j3;
                    str = strM66668h;
                    objM103844constructorimpl = Result.m103844constructorimpl(unit);
                } catch (Throwable th7) {
                    str = strM66668h;
                    th2 = th7;
                    z11 = zM66566d;
                    str2 = "crash_issue";
                    c19288j = c19288j3;
                }
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (z11 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f(str2, str2 + "->【" + str + " 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                function1M42668a = c19288j.m42668a();
                if (function1M42668a != null) {
                    function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192627(BaseStateVM<I, S> baseStateVM, String str, I i11, Continuation<? super C192627> continuation) {
            super(2, continuation);
            this.this$0 = baseStateVM;
            this.$intentName = str;
            this.$intent = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192627(this.this$0, this.$intentName, this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C192627) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$launchOnIO$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$launchOnIO$1", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {205}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192631 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C192631(Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C192631> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C192631 c192631 = new C192631(this.$block, continuation);
            c192631.L$0 = obj;
            return c192631;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C192631) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (function2.invoke(interfaceC41709m0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$onApiSuccess$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM", m90122f = "BaseStateVM.kt", m90123i = {0}, m90124l = {391}, m90125m = "onApiSuccess", m90126n = {"this"}, m90127s = {"L$0"})
    public static final class C192641<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192641(BaseStateVM<I, S> baseStateVM, Continuation<? super C192641> continuation) {
            super(continuation);
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onApiSuccess(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$requestNet$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM", m90122f = "BaseStateVM.kt", m90123i = {0, 0, 0}, m90124l = {409}, m90125m = "requestNet", m90126n = {"this", "retry", "autoHandleResult"}, m90127s = {"L$0", "L$1", "Z$0"})
    public static final class C192651<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192651(BaseStateVM<I, S> baseStateVM, Continuation<? super C192651> continuation) {
            super(continuation);
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.requestNet(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$send$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$send$1", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192661 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC36952a $this_send;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192661(BaseStateVM<I, S> baseStateVM, InterfaceC36952a interfaceC36952a, Continuation<? super C192661> continuation) {
            super(2, continuation);
            this.this$0 = baseStateVM;
            this.$this_send = interfaceC36952a;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192661(this.this$0, this.$this_send, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C192661) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41565d interfaceC41565d = ((BaseStateVM) this.this$0).singleEventChannel;
                InterfaceC36952a interfaceC36952a = this.$this_send;
                this.label = 1;
                if (interfaceC41565d.send(interfaceC36952a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$sendIntent$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$sendIntent$1", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {BuiltinOperator.RANDOM_UNIFORM}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192671 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ I $intent;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192671(BaseStateVM<I, S> baseStateVM, I i11, Continuation<? super C192671> continuation) {
            super(2, continuation);
            this.this$0 = baseStateVM;
            this.$intent = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192671(this.this$0, this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C192671) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41565d interfaceC41565d = ((BaseStateVM) this.this$0).intentChannel;
                I i12 = this.$intent;
                this.label = 1;
                if (interfaceC41565d.send(i12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$sendSyncIntent$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$sendSyncIntent$1", m90122f = "BaseStateVM.kt", m90123i = {0}, m90124l = {303, 304}, m90125m = "invokeSuspend", m90126n = {"syncIntent"}, m90127s = {"L$0"})
    public static final class C192681 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super S>, Object> {
        final /* synthetic */ I $intent;
        Object L$0;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192681(I i11, BaseStateVM<I, S> baseStateVM, Continuation<? super C192681> continuation) {
            super(2, continuation);
            this.$intent = i11;
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192681(this.$intent, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super S> continuation) {
            return ((C192681) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SyncIntent<S> syncIntent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                syncIntent = (SyncIntent) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                syncIntent = new SyncIntent<>(this.$intent);
                BaseStateVM<I, S> baseStateVM = this.this$0;
                this.L$0 = syncIntent;
                this.label = 1;
                if (baseStateVM.dispatchSyncIntent(syncIntent, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            Object objAwait = syncIntent.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objAwait;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$showLoading$1 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/flow/f;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$showLoading$1", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192691<T> extends SuspendLambda implements Function2<InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $showLoading;
        final /* synthetic */ int $type;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192691(boolean z11, int i11, BaseStateVM<I, S> baseStateVM, Continuation<? super C192691> continuation) {
            super(2, continuation);
            this.$showLoading = z11;
            this.$type = i11;
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192691(this.$showLoading, this.$type, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
            return ((C192691) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BaseStateVM<I, S> baseStateVM;
            InterfaceC36952a interfaceC36952a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$showLoading) {
                    if (this.$type == 1) {
                        baseStateVM = this.this$0;
                        interfaceC36952a = SingleEvent.C19252h.f35631b;
                    } else {
                        baseStateVM = this.this$0;
                        interfaceC36952a = SingleEvent.C19253i.f35632b;
                    }
                    baseStateVM.send(interfaceC36952a);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$startLoading$2 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/flow/f;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$startLoading$2", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {337, 337}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192702<T> extends SuspendLambda implements Function2<InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $showLoading;
        final /* synthetic */ int $type;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192702(boolean z11, int i11, BaseStateVM<I, S> baseStateVM, Continuation<? super C192702> continuation) {
            super(2, continuation);
            this.$showLoading = z11;
            this.$type = i11;
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C192702(this.$showLoading, this.$type, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
            return ((C192702) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        
            if (r5.send(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r5.send(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            return r0;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.$showLoading) {
                    if (this.$type == 1) {
                        InterfaceC41565d interfaceC41565d = ((BaseStateVM) this.this$0).singleEventChannel;
                        SingleEvent.C19252h c19252h = SingleEvent.C19252h.f35631b;
                        this.label = 1;
                    } else {
                        InterfaceC41565d interfaceC41565d2 = ((BaseStateVM) this.this$0).singleEventChannel;
                        SingleEvent.C19253i c19253i = SingleEvent.C19253i.f35632b;
                        this.label = 2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateVM$startLoading$3 */
    /* JADX INFO: compiled from: BaseStateVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/flow/f;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Throwable;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateVM$startLoading$3", m90122f = "BaseStateVM.kt", m90123i = {}, m90124l = {343, 343}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192713<T> extends SuspendLambda implements Function3<InterfaceC41635f<? super T>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $needAutoHide;
        final /* synthetic */ int $type;
        int label;
        final /* synthetic */ BaseStateVM<I, S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192713(boolean z11, int i11, BaseStateVM<I, S> baseStateVM, Continuation<? super C192713> continuation) {
            super(3, continuation);
            this.$needAutoHide = z11;
            this.$type = i11;
            this.this$0 = baseStateVM;
        }

        @Override // p852kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @Nullable Throwable th2, @Nullable Continuation<? super Unit> continuation) {
            return new C192713(this.$needAutoHide, this.$type, this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        
            if (r5.send(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r5.send(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            return r0;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.$needAutoHide) {
                    if (this.$type == 1) {
                        InterfaceC41565d interfaceC41565d = ((BaseStateVM) this.this$0).singleEventChannel;
                        SingleEvent.C19246b c19246b = SingleEvent.C19246b.f35625b;
                        this.label = 1;
                    } else {
                        InterfaceC41565d interfaceC41565d2 = ((BaseStateVM) this.this$0).singleEventChannel;
                        SingleEvent.C19248d c19248d = SingleEvent.C19248d.f35627b;
                        this.label = 2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:128:0x0374  */
    /* JADX WARN: Code duplicated, block: B:129:0x0376  */
    /* JADX WARN: Code duplicated, block: B:133:0x039c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:136:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:174:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:178:0x04d9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:181:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:183:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0230  */
    /* JADX WARN: Code duplicated, block: B:83:0x0232  */
    /* JADX WARN: Code duplicated, block: B:87:0x0258 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:90:0x025f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0268  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.state.BaseStateVM<I extends com.kubi.mvi.state.d, S extends com.kubi.mvi.state.f>] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object handleDispatchIntent(I i11, Continuation<? super Unit> continuation) throws Throwable {
        C192591 c192591;
        String str;
        Unit unit;
        String str2;
        C19288j c19288j;
        String strM66668h;
        boolean z11;
        Function1<Long, Unit> function1;
        long jCurrentTimeMillis;
        C19288j c19288j2;
        String strM66668h2;
        boolean z12;
        Function1<Long, Unit> function2;
        long jCurrentTimeMillis2;
        String strM66668h3;
        ?? M66566d;
        ?? r11;
        C19288j c19288j3;
        boolean z13;
        Function1<Long, Unit> function1M42670c;
        long jCurrentTimeMillis3;
        long jCurrentTimeMillis4;
        Object objM103844constructorimpl;
        ?? r12;
        Throwable thM103847exceptionOrNullimpl;
        Throwable thM103847exceptionOrNullimpl2;
        Function1<Throwable, Unit> function1M42668a;
        ?? r13;
        Object obj;
        long jCurrentTimeMillis5;
        Object objM103844constructorimpl2;
        Throwable thM103847exceptionOrNullimpl3;
        Throwable thM103847exceptionOrNullimpl4;
        Function1<Throwable, Unit> function1M42668a2;
        long jCurrentTimeMillis6;
        Object objM103844constructorimpl3;
        Throwable thM103847exceptionOrNullimpl5;
        Throwable thM103847exceptionOrNullimpl6;
        Function1<Throwable, Unit> function1M42668a3;
        if (continuation instanceof C192591) {
            c192591 = (C192591) continuation;
            int i12 = c192591.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c192591.label = i12 - Integer.MIN_VALUE;
            } else {
                c192591 = new C192591(this, continuation);
            }
        } else {
            c192591 = new C192591(this, continuation);
        }
        Object obj2 = c192591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c192591.label) {
            case 0:
                ResultKt.throwOnFailure(obj2);
                String simpleName = i11.getClass().getSimpleName();
                logIntent(getBiz() + "->分发Intent->" + simpleName);
                logIntent(getBiz() + "->分发Intent详细数据->" + i11);
                str = "crash_issue";
                unit = null;
                if (i11 instanceof InitIntent) {
                    Intrinsics.checkNotNull(simpleName);
                    boolean needCatch = getNeedCatch();
                    boolean needMeasureTime = getNeedMeasureTime();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(needCatch);
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(needMeasureTime);
                    String biz = getBiz();
                    C19288j c19288j4 = new C19288j();
                    c19288j4.m42672e(new BaseStateVM$traceMethod$1$1(this, simpleName));
                    c19288j4.m42671d(new BaseStateVM$traceMethod$1$2(this, simpleName));
                    c19288j4.m42673f(new BaseStateVM$traceMethod$1$3(this, simpleName));
                    strM66668h3 = C27041f.m66668h(biz);
                    boolean zM66566d = C27025c.m66566d(boolBoxBoolean);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Function0<Unit> function0M42669b = c19288j4.m42669b();
                        if (function0M42669b != null) {
                            try {
                                function0M42669b.invoke();
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                r11 = " 发生错误:needCatch->";
                                c19288j3 = c19288j4;
                                z13 = zM66566d;
                                Result.Companion companion2 = Result.INSTANCE;
                                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                r12 = r11;
                            }
                        }
                        function1M42670c = c19288j4.m42670c();
                        if (function1M42670c != null) {
                            M66566d = C27025c.m66566d(boolBoxBoolean2);
                            try {
                                if (M66566d != 0) {
                                    Object obj3 = " 发生错误:needCatch->";
                                    jCurrentTimeMillis3 = System.currentTimeMillis();
                                    c192591.L$0 = c19288j4;
                                    c192591.L$1 = c19288j4;
                                    c192591.L$2 = strM66668h3;
                                    c192591.L$3 = "crash_issue";
                                    c192591.L$4 = function1M42670c;
                                    c192591.Z$0 = zM66566d;
                                    c192591.J$0 = jCurrentTimeMillis3;
                                    c192591.label = 1;
                                    M66566d = obj3;
                                    if (handleInitIntent(c192591) != coroutine_suspended) {
                                        strM66668h3 = strM66668h3;
                                        c19288j3 = c19288j4;
                                        z13 = zM66566d;
                                        r11 = obj3;
                                        try {
                                            jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                                            r13 = r11;
                                            function1M42670c.invoke(Boxing.boxLong(jCurrentTimeMillis4));
                                            unit = Unit.INSTANCE;
                                            r11 = r13;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Result.Companion companion3 = Result.INSTANCE;
                                            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                            r12 = r11;
                                        }
                                    }
                                } else {
                                    Object obj4 = " 发生错误:needCatch->";
                                    c192591.L$0 = c19288j4;
                                    c192591.L$1 = c19288j4;
                                    c192591.L$2 = strM66668h3;
                                    c192591.L$3 = "crash_issue";
                                    c192591.L$4 = function1M42670c;
                                    c192591.Z$0 = zM66566d;
                                    c192591.label = 2;
                                    M66566d = obj4;
                                    if (handleInitIntent(c192591) != coroutine_suspended) {
                                        strM66668h3 = strM66668h3;
                                        c19288j3 = c19288j4;
                                        z13 = zM66566d;
                                        obj = obj4;
                                        jCurrentTimeMillis4 = 0;
                                        r13 = obj;
                                        function1M42670c.invoke(Boxing.boxLong(jCurrentTimeMillis4));
                                        unit = Unit.INSTANCE;
                                        r11 = r13;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r11 = M66566d;
                                c19288j3 = c19288j4;
                                z13 = zM66566d;
                                Result.Companion companion4 = Result.INSTANCE;
                                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                r12 = r11;
                            }
                        } else {
                            r11 = " 发生错误:needCatch->";
                            strM66668h3 = strM66668h3;
                            c19288j3 = c19288j4;
                            z13 = zM66566d;
                        }
                        objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        r12 = r11;
                        break;
                    } catch (Throwable th5) {
                        th = th5;
                        M66566d = " 发生错误:needCatch->";
                    }
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        if (z13 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                            throw thM103847exceptionOrNullimpl;
                        }
                        C44128b.m97262f(str, str + "->【" + strM66668h3 + r12 + z13 + (char) 12305, thM103847exceptionOrNullimpl);
                    }
                    thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl2 != null) {
                        C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                        function1M42668a = c19288j3.m42668a();
                        if (function1M42668a != null) {
                            function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                str2 = " 发生错误:needCatch->";
                if (!(i11 instanceof InterfaceC19283e)) {
                    if (i11 instanceof InterfaceC19292n) {
                        logIntent(getBiz() + "->单线程分发Intent->" + simpleName);
                        Intrinsics.checkNotNull(simpleName);
                        boolean needCatch2 = getNeedCatch();
                        boolean needMeasureTime2 = getNeedMeasureTime();
                        Boolean boolBoxBoolean3 = Boxing.boxBoolean(needCatch2);
                        Boolean boolBoxBoolean4 = Boxing.boxBoolean(needMeasureTime2);
                        String biz2 = getBiz();
                        c19288j2 = new C19288j();
                        c19288j2.m42672e(new BaseStateVM$traceMethod$1$1(this, simpleName));
                        c19288j2.m42671d(new BaseStateVM$traceMethod$1$2(this, simpleName));
                        c19288j2.m42673f(new BaseStateVM$traceMethod$1$3(this, simpleName));
                        strM66668h2 = C27041f.m66668h(biz2);
                        boolean zM66566d2 = C27025c.m66566d(boolBoxBoolean3);
                        try {
                            Result.Companion companion5 = Result.INSTANCE;
                            Function0<Unit> function0M42669b2 = c19288j2.m42669b();
                            if (function0M42669b2 != null) {
                                function0M42669b2.invoke();
                                Unit unit4 = Unit.INSTANCE;
                            }
                            Function1<Long, Unit> function1M42670c2 = c19288j2.m42670c();
                            if (function1M42670c2 == null) {
                                z12 = zM66566d2;
                            } else if (C27025c.m66566d(boolBoxBoolean4)) {
                                jCurrentTimeMillis2 = System.currentTimeMillis();
                                c192591.L$0 = c19288j2;
                                c192591.L$1 = c19288j2;
                                c192591.L$2 = strM66668h2;
                                c192591.L$3 = "crash_issue";
                                c192591.L$4 = function1M42670c2;
                                c192591.Z$0 = zM66566d2;
                                c192591.J$0 = jCurrentTimeMillis2;
                                c192591.label = 3;
                                if (dispatchIntent(i11, c192591) != coroutine_suspended) {
                                    z12 = zM66566d2;
                                    function2 = function1M42670c2;
                                    try {
                                        jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis2;
                                        function2.invoke(Boxing.boxLong(jCurrentTimeMillis5));
                                        unit = Unit.INSTANCE;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        Result.Companion companion6 = Result.INSTANCE;
                                        objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                    }
                                }
                            } else {
                                c192591.L$0 = c19288j2;
                                c192591.L$1 = c19288j2;
                                c192591.L$2 = strM66668h2;
                                c192591.L$3 = "crash_issue";
                                c192591.L$4 = function1M42670c2;
                                c192591.Z$0 = zM66566d2;
                                c192591.label = 4;
                                if (dispatchIntent(i11, c192591) != coroutine_suspended) {
                                    z12 = zM66566d2;
                                    function2 = function1M42670c2;
                                    jCurrentTimeMillis5 = 0;
                                    function2.invoke(Boxing.boxLong(jCurrentTimeMillis5));
                                    unit = Unit.INSTANCE;
                                }
                            }
                            objM103844constructorimpl2 = Result.m103844constructorimpl(unit);
                        } catch (Throwable th7) {
                            th = th7;
                            z12 = zM66566d2;
                            Result.Companion companion7 = Result.INSTANCE;
                            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                        }
                        thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                        if (thM103847exceptionOrNullimpl3 != null) {
                            if (z12 || (thM103847exceptionOrNullimpl3 instanceof CancellationException)) {
                                throw thM103847exceptionOrNullimpl3;
                            }
                            C44128b.m97262f(str, str + "->【" + strM66668h2 + str2 + z12 + (char) 12305, thM103847exceptionOrNullimpl3);
                        }
                        thM103847exceptionOrNullimpl4 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                        if (thM103847exceptionOrNullimpl4 != null) {
                            C45916a.m101366a(thM103847exceptionOrNullimpl4, "MethodTracker");
                            function1M42668a2 = c19288j2.m42668a();
                            if (function1M42668a2 != null) {
                                function1M42668a2.invoke(thM103847exceptionOrNullimpl4);
                                Unit unit5 = Unit.INSTANCE;
                            }
                        }
                    } else {
                        int defaultThreadMode = getDefaultThreadMode();
                        if (defaultThreadMode == 1) {
                            logIntent(getBiz() + "->多线程分发Intent->" + simpleName);
                            launchOnIO(new C192616(this, simpleName, i11, null));
                        } else if (defaultThreadMode != 2) {
                            logIntent(getBiz() + "->多线程分发Intent->" + simpleName);
                            launchOnIO(new C192627(this, simpleName, i11, null));
                        } else {
                            logIntent(getBiz() + "->单线程分发Intent->" + simpleName);
                            Intrinsics.checkNotNull(simpleName);
                            boolean needCatch3 = getNeedCatch();
                            boolean needMeasureTime3 = getNeedMeasureTime();
                            Boolean boolBoxBoolean5 = Boxing.boxBoolean(needCatch3);
                            Boolean boolBoxBoolean6 = Boxing.boxBoolean(needMeasureTime3);
                            String biz3 = getBiz();
                            c19288j = new C19288j();
                            c19288j.m42672e(new BaseStateVM$traceMethod$1$1(this, simpleName));
                            c19288j.m42671d(new BaseStateVM$traceMethod$1$2(this, simpleName));
                            c19288j.m42673f(new BaseStateVM$traceMethod$1$3(this, simpleName));
                            strM66668h = C27041f.m66668h(biz3);
                            boolean zM66566d3 = C27025c.m66566d(boolBoxBoolean5);
                            try {
                                Result.Companion companion8 = Result.INSTANCE;
                                Function0<Unit> function0M42669b3 = c19288j.m42669b();
                                if (function0M42669b3 != null) {
                                    function0M42669b3.invoke();
                                    Unit unit6 = Unit.INSTANCE;
                                }
                                Function1<Long, Unit> function1M42670c3 = c19288j.m42670c();
                                if (function1M42670c3 == null) {
                                    z11 = zM66566d3;
                                } else if (C27025c.m66566d(boolBoxBoolean6)) {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                    c192591.L$0 = c19288j;
                                    c192591.L$1 = c19288j;
                                    c192591.L$2 = strM66668h;
                                    c192591.L$3 = "crash_issue";
                                    c192591.L$4 = function1M42670c3;
                                    c192591.Z$0 = zM66566d3;
                                    c192591.J$0 = jCurrentTimeMillis;
                                    c192591.label = 5;
                                    if (dispatchIntent(i11, c192591) != coroutine_suspended) {
                                        z11 = zM66566d3;
                                        function1 = function1M42670c3;
                                        try {
                                            jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis;
                                            function1.invoke(Boxing.boxLong(jCurrentTimeMillis6));
                                            unit = Unit.INSTANCE;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            Result.Companion companion9 = Result.INSTANCE;
                                            objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                        }
                                    }
                                } else {
                                    c192591.L$0 = c19288j;
                                    c192591.L$1 = c19288j;
                                    c192591.L$2 = strM66668h;
                                    c192591.L$3 = "crash_issue";
                                    c192591.L$4 = function1M42670c3;
                                    c192591.Z$0 = zM66566d3;
                                    c192591.label = 6;
                                    if (dispatchIntent(i11, c192591) != coroutine_suspended) {
                                        z11 = zM66566d3;
                                        function1 = function1M42670c3;
                                        jCurrentTimeMillis6 = 0;
                                        function1.invoke(Boxing.boxLong(jCurrentTimeMillis6));
                                        unit = Unit.INSTANCE;
                                    }
                                }
                                objM103844constructorimpl3 = Result.m103844constructorimpl(unit);
                            } catch (Throwable th9) {
                                th = th9;
                                z11 = zM66566d3;
                                Result.Companion companion10 = Result.INSTANCE;
                                objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                            }
                            thM103847exceptionOrNullimpl5 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
                            if (thM103847exceptionOrNullimpl5 != null) {
                                if (z11 || (thM103847exceptionOrNullimpl5 instanceof CancellationException)) {
                                    throw thM103847exceptionOrNullimpl5;
                                }
                                C44128b.m97262f(str, str + "->【" + strM66668h + str2 + z11 + (char) 12305, thM103847exceptionOrNullimpl5);
                            }
                            thM103847exceptionOrNullimpl6 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
                            if (thM103847exceptionOrNullimpl6 != null) {
                                C45916a.m101366a(thM103847exceptionOrNullimpl6, "MethodTracker");
                                function1M42668a3 = c19288j.m42668a();
                                if (function1M42668a3 != null) {
                                    function1M42668a3.invoke(thM103847exceptionOrNullimpl6);
                                    Unit unit7 = Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    break;
                } else {
                    logIntent(getBiz() + "->多线程分发Intent->" + simpleName);
                    launchOnIO(new C192603(this, simpleName, i11, null));
                }
                return Unit.INSTANCE;
                return coroutine_suspended;
            case 1:
                long j11 = c192591.J$0;
                boolean z14 = c192591.Z$0;
                function1M42670c = (Function1) c192591.L$4;
                String str3 = (String) c192591.L$3;
                strM66668h3 = (String) c192591.L$2;
                c19288j3 = (C19288j) c192591.L$1;
                try {
                    ResultKt.throwOnFailure(obj2);
                    r11 = " 发生错误:needCatch->";
                    jCurrentTimeMillis3 = j11;
                    z13 = z14;
                    str = str3;
                    jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                    r13 = r11;
                    function1M42670c.invoke(Boxing.boxLong(jCurrentTimeMillis4));
                    unit = Unit.INSTANCE;
                    r11 = r13;
                    objM103844constructorimpl = Result.m103844constructorimpl(unit);
                    r12 = r11;
                    break;
                } catch (Throwable th10) {
                    th = th10;
                    r11 = " 发生错误:needCatch->";
                    z13 = z14;
                    str = str3;
                    Result.Companion companion11 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                    r12 = r11;
                }
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    if (z13) {
                        throw thM103847exceptionOrNullimpl;
                    }
                    throw thM103847exceptionOrNullimpl;
                }
                thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl2 != null) {
                    C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                    function1M42668a = c19288j3.m42668a();
                    if (function1M42668a != null) {
                        function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                        Unit unit8 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                z13 = c192591.Z$0;
                function1M42670c = (Function1) c192591.L$4;
                String str4 = (String) c192591.L$3;
                strM66668h3 = (String) c192591.L$2;
                c19288j3 = (C19288j) c192591.L$1;
                try {
                    ResultKt.throwOnFailure(obj2);
                    str = str4;
                    obj = " 发生错误:needCatch->";
                    jCurrentTimeMillis4 = 0;
                    r13 = obj;
                    function1M42670c.invoke(Boxing.boxLong(jCurrentTimeMillis4));
                    unit = Unit.INSTANCE;
                    r11 = r13;
                    objM103844constructorimpl = Result.m103844constructorimpl(unit);
                    r12 = r11;
                    break;
                } catch (Throwable th11) {
                    th = th11;
                    str = str4;
                    r11 = " 发生错误:needCatch->";
                    Result.Companion companion12 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                    r12 = r11;
                }
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    if (z13) {
                        throw thM103847exceptionOrNullimpl;
                    }
                    throw thM103847exceptionOrNullimpl;
                }
                thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl2 != null) {
                    C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
                    function1M42668a = c19288j3.m42668a();
                    if (function1M42668a != null) {
                        function1M42668a.invoke(thM103847exceptionOrNullimpl2);
                        Unit unit9 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                long j12 = c192591.J$0;
                boolean z15 = c192591.Z$0;
                function2 = (Function1) c192591.L$4;
                String str5 = (String) c192591.L$3;
                strM66668h2 = (String) c192591.L$2;
                c19288j2 = (C19288j) c192591.L$1;
                try {
                    ResultKt.throwOnFailure(obj2);
                    str = str5;
                    str2 = " 发生错误:needCatch->";
                    z12 = z15;
                    jCurrentTimeMillis2 = j12;
                    jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    function2.invoke(Boxing.boxLong(jCurrentTimeMillis5));
                    unit = Unit.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(unit);
                    break;
                } catch (Throwable th12) {
                    th = th12;
                    str2 = " 发生错误:needCatch->";
                    z12 = z15;
                    str = str5;
                    Result.Companion companion13 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
                thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                if (thM103847exceptionOrNullimpl3 != null) {
                    if (z12) {
                        throw thM103847exceptionOrNullimpl3;
                    }
                    throw thM103847exceptionOrNullimpl3;
                }
                thM103847exceptionOrNullimpl4 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                if (thM103847exceptionOrNullimpl4 != null) {
                    C45916a.m101366a(thM103847exceptionOrNullimpl4, "MethodTracker");
                    function1M42668a2 = c19288j2.m42668a();
                    if (function1M42668a2 != null) {
                        function1M42668a2.invoke(thM103847exceptionOrNullimpl4);
                        Unit unit10 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 4:
                z12 = c192591.Z$0;
                function2 = (Function1) c192591.L$4;
                String str6 = (String) c192591.L$3;
                strM66668h2 = (String) c192591.L$2;
                c19288j2 = (C19288j) c192591.L$1;
                try {
                    ResultKt.throwOnFailure(obj2);
                    str = str6;
                    str2 = " 发生错误:needCatch->";
                    jCurrentTimeMillis5 = 0;
                    function2.invoke(Boxing.boxLong(jCurrentTimeMillis5));
                    unit = Unit.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(unit);
                    break;
                } catch (Throwable th13) {
                    th = th13;
                    str = str6;
                    str2 = " 发生错误:needCatch->";
                    Result.Companion companion14 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
                thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                if (thM103847exceptionOrNullimpl3 != null) {
                    if (z12) {
                        throw thM103847exceptionOrNullimpl3;
                    }
                    throw thM103847exceptionOrNullimpl3;
                }
                thM103847exceptionOrNullimpl4 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                if (thM103847exceptionOrNullimpl4 != null) {
                    C45916a.m101366a(thM103847exceptionOrNullimpl4, "MethodTracker");
                    function1M42668a2 = c19288j2.m42668a();
                    if (function1M42668a2 != null) {
                        function1M42668a2.invoke(thM103847exceptionOrNullimpl4);
                        Unit unit11 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                long j13 = c192591.J$0;
                boolean z16 = c192591.Z$0;
                function1 = (Function1) c192591.L$4;
                String str7 = (String) c192591.L$3;
                strM66668h = (String) c192591.L$2;
                c19288j = (C19288j) c192591.L$1;
                try {
                    ResultKt.throwOnFailure(obj2);
                    str = str7;
                    str2 = " 发生错误:needCatch->";
                    z11 = z16;
                    jCurrentTimeMillis = j13;
                    jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis;
                    function1.invoke(Boxing.boxLong(jCurrentTimeMillis6));
                    unit = Unit.INSTANCE;
                    objM103844constructorimpl3 = Result.m103844constructorimpl(unit);
                    break;
                } catch (Throwable th14) {
                    th = th14;
                    str2 = " 发生错误:needCatch->";
                    z11 = z16;
                    str = str7;
                    Result.Companion companion15 = Result.INSTANCE;
                    objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
                thM103847exceptionOrNullimpl5 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
                if (thM103847exceptionOrNullimpl5 != null) {
                    if (z11) {
                        throw thM103847exceptionOrNullimpl5;
                    }
                    throw thM103847exceptionOrNullimpl5;
                }
                thM103847exceptionOrNullimpl6 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
                if (thM103847exceptionOrNullimpl6 != null) {
                    C45916a.m101366a(thM103847exceptionOrNullimpl6, "MethodTracker");
                    function1M42668a3 = c19288j.m42668a();
                    if (function1M42668a3 != null) {
                        function1M42668a3.invoke(thM103847exceptionOrNullimpl6);
                        Unit unit12 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                z11 = c192591.Z$0;
                function1 = (Function1) c192591.L$4;
                String str8 = (String) c192591.L$3;
                strM66668h = (String) c192591.L$2;
                c19288j = (C19288j) c192591.L$1;
                try {
                    ResultKt.throwOnFailure(obj2);
                    str = str8;
                    str2 = " 发生错误:needCatch->";
                    jCurrentTimeMillis6 = 0;
                    function1.invoke(Boxing.boxLong(jCurrentTimeMillis6));
                    unit = Unit.INSTANCE;
                    objM103844constructorimpl3 = Result.m103844constructorimpl(unit);
                    break;
                } catch (Throwable th15) {
                    th = th15;
                    str = str8;
                    str2 = " 发生错误:needCatch->";
                    Result.Companion companion16 = Result.INSTANCE;
                    objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
                thM103847exceptionOrNullimpl5 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
                if (thM103847exceptionOrNullimpl5 != null) {
                    if (z11) {
                        throw thM103847exceptionOrNullimpl5;
                    }
                    throw thM103847exceptionOrNullimpl5;
                }
                thM103847exceptionOrNullimpl6 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
                if (thM103847exceptionOrNullimpl6 != null) {
                    C45916a.m101366a(thM103847exceptionOrNullimpl6, "MethodTracker");
                    function1M42668a3 = c19288j.m42668a();
                    if (function1M42668a3 != null) {
                        function1M42668a3.invoke(thM103847exceptionOrNullimpl6);
                        Unit unit13 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void destroyMVIContext() {
        this.mviConfig = null;
    }

    @NotNull
    public abstract S getInitState();

    public final void send(@NotNull InterfaceC36952a interfaceC36952a) {
        Intrinsics.checkNotNullParameter(interfaceC36952a, "<this>");
        C19243e.m42536e("send event start:" + interfaceC36952a, getBiz());
        if (ChannelResult.m90676i(this.singleEventChannel.mo90594e(interfaceC36952a))) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C192661(this, interfaceC36952a, null), 3, null);
        }
        C19243e.m42536e("send event end:" + interfaceC36952a, getBiz());
    }

    public final void showLoadingView() {
        sendSingleEvent(SingleEvent.C19253i.f35632b);
    }

    @Nullable
    public final <T> Object startLoadingDialog(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Continuation<? super InterfaceC41634e<? extends T>> continuation) {
        return startLoading$default(this, interfaceC41634e, 1, false, false, continuation, 6, null);
    }

    @Nullable
    public final <T> Object startLoadingView(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Continuation<? super InterfaceC41634e<? extends T>> continuation) {
        return startLoading$default(this, interfaceC41634e, 2, false, false, continuation, 6, null);
    }

    private final void collectIntent() {
        this.mUniqueTask.m42663e(ViewModelKt.getViewModelScope(this), new C192561(this, null));
        MviExKt.m42505a(getIntentFlow(), ViewModelKt.getViewModelScope(this), new C192572(this, null));
    }

    public static /* synthetic */ <I extends InterfaceC19282d, S extends InterfaceC19284f> Object dispatchIntent$suspendImpl(BaseStateVM<I, S> baseStateVM, I i11, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ <I extends InterfaceC19282d, S extends InterfaceC19284f> Object dispatchIntentOnIO$suspendImpl(BaseStateVM<I, S> baseStateVM, I i11, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ <I extends InterfaceC19282d, S extends InterfaceC19284f> Object dispatchSyncIntent$suspendImpl(BaseStateVM<I, S> baseStateVM, SyncIntent<S> syncIntent, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    private final boolean emitState(final S state) {
        boolean z11;
        MviExKt.m42510f(false, new Function0<Unit>() { // from class: com.kubi.mvi.state.BaseStateVM.emitState.1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str = Intrinsics.areEqual(state, this.getState()) ? "界面【不会刷新】" : "界面【会刷新】";
                BaseStateVM<I, S> baseStateVM = this;
                baseStateVM.logState(baseStateVM.getBiz() + "->发送状态->" + state.getClass().getName() + ' ' + str);
            }
        }, 1, null);
        synchronized (this.updateLock) {
            z11 = !Intrinsics.areEqual(this.mutableStatedFlow.getValue(), state);
            this.mutableStatedFlow.setValue(state);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getNeedCatch() {
        return ((Boolean) this.needCatch.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getNeedMeasureTime() {
        return ((Boolean) this.needMeasureTime.getValue()).booleanValue();
    }

    public static /* synthetic */ <I extends InterfaceC19282d, S extends InterfaceC19284f> Object handleInitIntent$suspendImpl(BaseStateVM<I, S> baseStateVM, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object requestNet$default(BaseStateVM baseStateVM, InterfaceC41634e interfaceC41634e, boolean z11, Function0 function0, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestNet");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return baseStateVM.requestNet(interfaceC41634e, z11, function0, continuation);
    }

    public static /* synthetic */ InterfaceC41634e showLoading$default(BaseStateVM baseStateVM, InterfaceC41634e interfaceC41634e, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
        }
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        return baseStateVM.showLoading(interfaceC41634e, i11, z11);
    }

    public static /* synthetic */ InterfaceC41634e showLoadingView$default(BaseStateVM baseStateVM, InterfaceC41634e interfaceC41634e, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadingView");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return baseStateVM.showLoadingView(interfaceC41634e, z11);
    }

    public static /* synthetic */ Object startLoading$default(BaseStateVM baseStateVM, InterfaceC41634e interfaceC41634e, int i11, boolean z11, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoading");
        }
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        return baseStateVM.startLoading(interfaceC41634e, i11, z11, z12, continuation);
    }

    public static /* synthetic */ Object startLoadingByCondition$default(BaseStateVM baseStateVM, InterfaceC41634e interfaceC41634e, boolean z11, int i11, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoadingByCondition");
        }
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        return baseStateVM.startLoadingByCondition(interfaceC41634e, z11, i11, continuation);
    }

    public static /* synthetic */ Object startLoadingViewWithCondition$default(BaseStateVM baseStateVM, InterfaceC41634e interfaceC41634e, boolean z11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoadingViewWithCondition");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return baseStateVM.startLoadingViewWithCondition(interfaceC41634e, z11, continuation);
    }

    public static /* synthetic */ void traceMethod$default(BaseStateVM baseStateVM, boolean z11, boolean z12, String str, Function0 function0, int i11, Object obj) throws Throwable {
        Object objM103844constructorimpl;
        Unit unit;
        long jCurrentTimeMillis;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: traceMethod");
        }
        if ((i11 & 1) != 0) {
            z11 = baseStateVM.getNeedCatch();
        }
        if ((i11 & 2) != 0) {
            z12 = baseStateVM.getNeedMeasureTime();
        }
        Boolean boolValueOf = Boolean.valueOf(z11);
        Boolean boolValueOf2 = Boolean.valueOf(z12);
        String biz = baseStateVM.getBiz();
        C19288j c19288j = new C19288j();
        c19288j.m42672e(new BaseStateVM$traceMethod$1$1(baseStateVM, str));
        c19288j.m42671d(new BaseStateVM$traceMethod$1$2(baseStateVM, str));
        c19288j.m42673f(new BaseStateVM$traceMethod$1$3(baseStateVM, str));
        String strM66668h = C27041f.m66668h(biz);
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        try {
            Result.Companion companion = Result.INSTANCE;
            Function0<Unit> function0M42669b = c19288j.m42669b();
            if (function0M42669b != null) {
                function0M42669b.invoke();
            }
            Function1<Long, Unit> function1M42670c = c19288j.m42670c();
            if (function1M42670c != null) {
                if (C27025c.m66566d(boolValueOf2)) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    function0.invoke();
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                } else {
                    function0.invoke();
                    jCurrentTimeMillis = 0;
                }
                function1M42670c.invoke(Long.valueOf(jCurrentTimeMillis));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!zM66566d || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【" + strM66668h + " 发生错误:needCatch->" + zM66566d + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
            Function1<Throwable, Unit> function1M42668a = c19288j.m42668a();
            if (function1M42668a != null) {
                function1M42668a.invoke(thM103847exceptionOrNullimpl2);
            }
        }
    }

    public final /* synthetic */ <T extends InterfaceC19282d> InterfaceC19282d checkIntent(InterfaceC19282d interfaceC19282d, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(interfaceC19282d, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (interfaceC19282d != null) {
            block.invoke(interfaceC19282d);
        }
        return interfaceC19282d;
    }

    public final void finishFragment() {
        send(SingleEvent.C19245a.f35624b);
    }

    @Override // com.kubi.mvi.state.IViewModelLog
    @NotNull
    public String getBiz() {
        Object value = this.biz.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    public int getDefaultThreadMode() {
        return this.defaultThreadMode;
    }

    @NotNull
    public final InterfaceC41634e<I> getIntentFlow() {
        return C41636g.m90936s(this.intentChannel);
    }

    public boolean getNeedCatchException() {
        return this.needCatchException;
    }

    @NotNull
    public final InterfaceC41634e<InterfaceC36952a> getSingleEventFlow() {
        return C41636g.m90936s(this.singleEventChannel);
    }

    @NotNull
    public final S getState() {
        return this.mutableStatedFlow.getValue();
    }

    @NotNull
    public InterfaceC41634e<S> getStateFlow() {
        return C41636g.m90907c(this.mutableStatedFlow);
    }

    @NotNull
    public final String getStringArguments(@NotNull String key) {
        Bundle bundleM42561a;
        Intrinsics.checkNotNullParameter(key, "key");
        MviConfig mviConfig = this.mviConfig;
        return C27041f.m66668h((mviConfig == null || (bundleM42561a = mviConfig.getArguments()) == null) ? null : bundleM42561a.getString(key, ""));
    }

    @NotNull
    public final Object getUpdateLock() {
        return this.updateLock;
    }

    public final void hideLoadingDialog() {
        sendSingleEvent(SingleEvent.C19246b.f35625b);
    }

    public boolean isOpenLog() {
        MviConfig mviConfig = this.mviConfig;
        return C27025c.m66566d(mviConfig != null ? Boolean.valueOf(mviConfig.m42572l()) : null);
    }

    @NotNull
    public final InterfaceC41775x1 launchOnIO(@NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C192631(block, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "使用requestNet", replaceWith = @ReplaceWith(expression = "requestNet", imports = {}))
    @Nullable
    public final <T> Object onApiSuccess(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super C19334f<T>> continuation) {
        C192641 c192641;
        BaseStateVM<I, S> baseStateVM;
        if (continuation instanceof C192641) {
            c192641 = (C192641) continuation;
            int i11 = c192641.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c192641.label = i11 - Integer.MIN_VALUE;
            } else {
                c192641 = new C192641(this, continuation);
            }
        } else {
            c192641 = new C192641(this, continuation);
        }
        C192641 c192642 = c192641;
        Object objM42824e = c192642.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c192642.label;
        int i13 = 1;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            c192642.L$0 = this;
            c192642.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634e, false, function2, c192642, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseStateVM = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseStateVM = (BaseStateVM) c192642.L$0;
            ResultKt.throwOnFailure(objM42824e);
        }
        C19334f c19334f = (C19334f) objM42824e;
        baseStateVM.send(SingleEvent.C19248d.f35627b);
        if (c19334f.getThrowable() == null) {
            return c19334f;
        }
        baseStateVM.send(new SingleEvent.C19250f(null, i13, 0 == true ? 1 : 0));
        return c19334f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final <T> Object requestNet(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11, @Nullable Function0<Unit> function0, @NotNull Continuation<? super C19334f<T>> continuation) {
        C192651 c192651;
        BaseStateVM<I, S> baseStateVM;
        if (continuation instanceof C192651) {
            c192651 = (C192651) continuation;
            int i11 = c192651.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c192651.label = i11 - Integer.MIN_VALUE;
            } else {
                c192651 = new C192651(this, continuation);
            }
        } else {
            c192651 = new C192651(this, continuation);
        }
        C192651 c192652 = c192651;
        Object objM42828i = c192652.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c192652.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42828i);
            c192652.L$0 = this;
            c192652.L$1 = function0;
            c192652.Z$0 = z11;
            c192652.label = 1;
            objM42828i = RetrofitFlowExKt.m42828i(interfaceC41634e, false, false, c192652, 3, null);
            if (objM42828i == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseStateVM = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = c192652.Z$0;
            function0 = (Function0) c192652.L$1;
            baseStateVM = (BaseStateVM) c192652.L$0;
            ResultKt.throwOnFailure(objM42828i);
        }
        C19334f c19334f = (C19334f) objM42828i;
        if (z11) {
            baseStateVM.send(SingleEvent.C19248d.f35627b);
        }
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null && z11) {
            if (throwable instanceof ApiException) {
                baseStateVM.send(new SingleEvent.C19251g(function0));
                return c19334f;
            }
            baseStateVM.send(new SingleEvent.C19250f(function0));
        }
        return c19334f;
    }

    public final void sendIntent(@NotNull I intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (ChannelResult.m90676i(this.intentChannel.mo90594e(intent))) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C192671(this, intent, null), 3, null);
        }
    }

    public final void sendSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        send(singleEvent);
    }

    @NotNull
    public final S sendSyncIntent(@NotNull I intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return (S) C41690i.m91067b(null, new C192681(intent, this, null), 1, null);
    }

    public final void setMVIContext(@NotNull MviConfig mviConfig) {
        Intrinsics.checkNotNullParameter(mviConfig, "mviConfig");
        this.mviConfig = mviConfig;
    }

    public final void showContentView() {
        sendSingleEvent(SingleEvent.C19248d.f35627b);
    }

    @NotNull
    public final <T> InterfaceC41634e<T> showLoading(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        return C41636g.m90897U(interfaceC41634e, new C192691(z11, i11, this, null));
    }

    public final void showLoadingDialog() {
        sendSingleEvent(SingleEvent.C19252h.f35631b);
    }

    @NotNull
    public final <T> InterfaceC41634e<T> showLoadingView(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        return showLoading(interfaceC41634e, 2, z11);
    }

    public final void showToast(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        sendSingleEvent(new SingleEvent.C19254j(msg));
    }

    @Nullable
    public final <T> Object startLoading(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, int i11, boolean z11, boolean z12, @NotNull Continuation<? super InterfaceC41634e<? extends T>> continuation) {
        return C41636g.m90895S(C41636g.m90897U(interfaceC41634e, new C192702(z11, i11, this, null)), new C192713(z12, i11, this, null));
    }

    @Nullable
    public final <T> Object startLoadingByCondition(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11, int i11, @NotNull Continuation<? super InterfaceC41634e<? extends T>> continuation) {
        if (!z11) {
            return interfaceC41634e;
        }
        Object objStartLoading$default = startLoading$default(this, interfaceC41634e, i11, false, false, continuation, 6, null);
        return objStartLoading$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStartLoading$default : (InterfaceC41634e) objStartLoading$default;
    }

    @Nullable
    public final <T> Object startLoadingViewWithCondition(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11, @NotNull Continuation<? super InterfaceC41634e<? extends T>> continuation) {
        if (!z11) {
            return interfaceC41634e;
        }
        Object objStartLoading$default = startLoading$default(this, interfaceC41634e, 2, false, false, continuation, 6, null);
        return objStartLoading$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStartLoading$default : (InterfaceC41634e) objStartLoading$default;
    }

    public final void update(@NotNull S s11) {
        Intrinsics.checkNotNullParameter(s11, "<this>");
        synchronized (this.updateLock) {
            emitState(s11);
        }
    }

    public final boolean updateState(@NotNull Function1<? super S, ? extends S> reducer) {
        boolean zEmitState;
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        synchronized (this.updateLock) {
            zEmitState = emitState(reducer.invoke(getState()));
        }
        return zEmitState;
    }

    public BaseStateVM() {
        collectIntent();
    }

    private final void traceMethod(boolean needCatch, boolean needMeasureTime, String methodName, Function0<Unit> call) throws Throwable {
        Object objM103844constructorimpl;
        Unit unit;
        long jCurrentTimeMillis;
        Boolean boolValueOf = Boolean.valueOf(needCatch);
        Boolean boolValueOf2 = Boolean.valueOf(needMeasureTime);
        String biz = getBiz();
        C19288j c19288j = new C19288j();
        c19288j.m42672e(new BaseStateVM$traceMethod$1$1(this, methodName));
        c19288j.m42671d(new BaseStateVM$traceMethod$1$2(this, methodName));
        c19288j.m42673f(new BaseStateVM$traceMethod$1$3(this, methodName));
        String strM66668h = C27041f.m66668h(biz);
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        try {
            Result.Companion companion = Result.INSTANCE;
            Function0<Unit> function0M42669b = c19288j.m42669b();
            if (function0M42669b != null) {
                function0M42669b.invoke();
            }
            Function1<Long, Unit> function1M42670c = c19288j.m42670c();
            if (function1M42670c != null) {
                if (C27025c.m66566d(boolValueOf2)) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    call.invoke();
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                } else {
                    call.invoke();
                    jCurrentTimeMillis = 0;
                }
                function1M42670c.invoke(Long.valueOf(jCurrentTimeMillis));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM66566d && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                C44128b.m97262f("crash_issue", "crash_issue->【" + strM66668h + " 发生错误:needCatch->" + zM66566d + (char) 12305, thM103847exceptionOrNullimpl);
            } else {
                throw thM103847exceptionOrNullimpl;
            }
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C45916a.m101366a(thM103847exceptionOrNullimpl2, "MethodTracker");
            Function1<Throwable, Unit> function1M42668a = c19288j.m42668a();
            if (function1M42668a != null) {
                function1M42668a.invoke(thM103847exceptionOrNullimpl2);
            }
        }
    }

    @Nullable
    public Object dispatchIntent(@NotNull I i11, @NotNull Continuation<? super Unit> continuation) {
        return dispatchIntent$suspendImpl(this, i11, continuation);
    }

    @Nullable
    public Object dispatchIntentOnIO(@NotNull I i11, @NotNull Continuation<? super Unit> continuation) {
        return dispatchIntentOnIO$suspendImpl(this, i11, continuation);
    }

    @Nullable
    public Object dispatchSyncIntent(@NotNull SyncIntent<S> syncIntent, @NotNull Continuation<? super Unit> continuation) {
        return dispatchSyncIntent$suspendImpl(this, syncIntent, continuation);
    }

    @Nullable
    public Object handleInitIntent(@NotNull Continuation<? super Unit> continuation) {
        return handleInitIntent$suspendImpl(this, continuation);
    }

    public void logData(@NotNull String str) {
        IViewModelLog.DefaultImpls.m42549b(this, str);
    }

    public void logIntent(@NotNull String str) {
        IViewModelLog.DefaultImpls.m42550c(this, str);
    }

    public void logState(@NotNull String str) {
        IViewModelLog.DefaultImpls.m42551d(this, str);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C19243e.m42539h(getBiz() + " onCleared", null, 1, null);
    }

    /* JADX WARN: Incorrect types in method signature: <T::TI;>(TT;)V */
    public final void send(@NotNull InterfaceC19282d interfaceC19282d) {
        Intrinsics.checkNotNullParameter(interfaceC19282d, "<this>");
        sendIntent(interfaceC19282d);
    }
}
