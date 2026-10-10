package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.extractor.p021ts.TsExtractor;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.messaging.Constants;
import com.jumio.core.constants.ConstantsKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28385B0;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28507x0;
import com.sumsub.sns.internal.core.common.C28510y0;
import com.sumsub.sns.internal.core.common.InterfaceC28439b1;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28979A3;
import com.sumsub.sns.internal.features.data.model.common.C28984B3;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29115f2;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.C29728z3;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.model.common.remote.C29191A3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29194B1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29199C1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29206D3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29226H3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29230I2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29245L2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29254N1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29265P2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29269Q1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29283T1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29284T2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29314Z2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29325b0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29336c3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29424n3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29635s1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29637s3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29644t3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29663w1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29672x3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29678y2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29685z2;
import com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage$ServerMessage$ScreenShotPayload$Variant;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29468E0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29480I0;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.socket.C30043i;
import com.sumsub.sns.internal.features.data.repository.socket.C30044j;
import com.sumsub.sns.internal.features.data.repository.socket.C30050p;
import com.sumsub.sns.internal.features.data.repository.socket.InterfaceC30035a;
import com.sumsub.sns.internal.features.domain.C30090Y;
import com.sumsub.sns.internal.features.domain.videoident.C30321b;
import com.sumsub.sns.internal.features.domain.videoident.C30323d;
import com.sumsub.sns.internal.features.domain.videoident.C30325f;
import com.sumsub.sns.internal.features.domain.videoident.C30327h;
import com.sumsub.sns.internal.features.domain.videoident.C30329j;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.sumsub.sns.internal.features.presentation.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32896A;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32923x;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32924y;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32925z;
import com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatState;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41673r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import xg0.AbstractC46162a;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u009b\u00022\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u009b\u0002B\u0085\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010&J\u0010\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020$H\u0082@¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020$H\u0082@¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020$H\u0082@¢\u0006\u0004\b,\u0010&J\u0010\u0010-\u001a\u00020$H\u0082@¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020$H\u0082@¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020$H\u0082@¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020$H\u0082@¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020$H\u0082@¢\u0006\u0004\b1\u0010&J\u0018\u00104\u001a\u00020$2\u0006\u00103\u001a\u000202H\u0082@¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\u000202*\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000209H\u0082@¢\u0006\u0004\b<\u0010&J\u0018\u0010?\u001a\u0002092\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u0002092\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u000209H\u0002¢\u0006\u0004\bE\u0010;J\u000f\u0010F\u001a\u000209H\u0002¢\u0006\u0004\bF\u0010;J\u000f\u0010G\u001a\u000209H\u0002¢\u0006\u0004\bG\u0010;J\u000f\u0010H\u001a\u000209H\u0002¢\u0006\u0004\bH\u0010;J\u000f\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u0002092\u0006\u0010L\u001a\u000202H\u0002¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0002H\u0082@¢\u0006\u0004\bO\u0010&J\u0017\u0010Q\u001a\u0002092\u0006\u0010P\u001a\u00020$H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u000209H\u0002¢\u0006\u0004\bS\u0010;J\u000f\u0010T\u001a\u000209H\u0002¢\u0006\u0004\bT\u0010;J\u000f\u0010U\u001a\u000209H\u0002¢\u0006\u0004\bU\u0010;J\u000f\u0010V\u001a\u000209H\u0002¢\u0006\u0004\bV\u0010;J\u0017\u0010Y\u001a\u0002092\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u0002092\u0006\u0010X\u001a\u00020[H\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u0002092\u0006\u0010X\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J\u0019\u0010c\u001a\u0002092\b\u0010b\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u0002092\b\u0010b\u001a\u0004\u0018\u00010eH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u000209H\u0002¢\u0006\u0004\bh\u0010;J\u000f\u0010i\u001a\u000209H\u0002¢\u0006\u0004\bi\u0010;J \u0010n\u001a\u0002092\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020lH\u0082@¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u000209H\u0002¢\u0006\u0004\bp\u0010;J\u0017\u0010s\u001a\u0002092\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ\u0015\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\u0003H\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010z\u001a\u00020y2\u0006\u0010x\u001a\u00020\u0004H\u0002¢\u0006\u0004\bz\u0010{J\u0010\u0010|\u001a\u000209H\u0082@¢\u0006\u0004\b|\u0010&J\u0017\u0010}\u001a\u0002092\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\b}\u0010DJ\u000f\u0010~\u001a\u000209H\u0002¢\u0006\u0004\b~\u0010;J\u000f\u0010\u007f\u001a\u000209H\u0002¢\u0006\u0004\b\u007f\u0010;J\u0011\u0010\u0080\u0001\u001a\u000209H\u0002¢\u0006\u0005\b\u0080\u0001\u0010;J\u0011\u0010\u0081\u0001\u001a\u000209H\u0002¢\u0006\u0005\b\u0081\u0001\u0010;J\u000f\u0010\u0082\u0001\u001a\u000209¢\u0006\u0005\b\u0082\u0001\u0010;J\u0013\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0012\u0010\u0086\u0001\u001a\u000209H\u0094@¢\u0006\u0005\b\u0086\u0001\u0010&J\u000f\u0010\u0087\u0001\u001a\u000209¢\u0006\u0005\b\u0087\u0001\u0010;J\u0011\u0010\u0088\u0001\u001a\u000209H\u0014¢\u0006\u0005\b\u0088\u0001\u0010;J\u000f\u0010\u0089\u0001\u001a\u000209¢\u0006\u0005\b\u0089\u0001\u0010;J\u000f\u0010\u008a\u0001\u001a\u000209¢\u0006\u0005\b\u008a\u0001\u0010;J\u001b\u0010\u008c\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008e\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J\u0019\u0010\u0090\u0001\u001a\u0002092\u0007\u0010\u008f\u0001\u001a\u00020\u001c¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u000209¢\u0006\u0005\b\u0092\u0001\u0010;J\u001b\u0010\u0094\u0001\u001a\u0002092\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010j¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001a\u0010\u0098\u0001\u001a\u0002092\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009c\u0001\u001a\u0002092\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0019\u0010\u009f\u0001\u001a\u0002092\u0007\u0010>\u001a\u00030\u009e\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001c\u0010¢\u0001\u001a\u0002092\u0007\u0010¡\u0001\u001a\u00020jH\u0086@¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u000f\u0010¤\u0001\u001a\u000209¢\u0006\u0005\b¤\u0001\u0010;J\u000f\u0010¥\u0001\u001a\u000209¢\u0006\u0005\b¥\u0001\u0010;J\u001a\u0010¨\u0001\u001a\u0002092\b\u0010§\u0001\u001a\u00030¦\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u000f\u0010ª\u0001\u001a\u000209¢\u0006\u0005\bª\u0001\u0010;J\u000f\u0010«\u0001\u001a\u000209¢\u0006\u0005\b«\u0001\u0010;J\u001a\u0010®\u0001\u001a\u0002092\b\u0010\u00ad\u0001\u001a\u00030¬\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010°\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010´\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010µ\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010¶\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010·\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¸\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010¹\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010º\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010»\u0001R\u0017\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010¼\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010½\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010¾\u0001R\u0018\u0010À\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R2\u0010Å\u0001\u001a\u0002022\u0007\u0010Â\u0001\u001a\u0002028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0005\bÇ\u0001\u0010NR>\u0010Ì\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\r\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bÈ\u0001\u0010Ä\u0001\u001a\u0005\bÉ\u0001\u0010w\"\u0006\bÊ\u0001\u0010Ë\u0001R7\u0010Ñ\u0001\u001a\u0004\u0018\u00010j2\t\u0010Â\u0001\u001a\u0004\u0018\u00010j8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Ä\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010\u0095\u0001R6\u0010Ö\u0001\u001a\u0004\u0018\u00010e2\t\u0010Â\u0001\u001a\u0004\u0018\u00010e8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bÒ\u0001\u0010Ä\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0005\bÕ\u0001\u0010gR7\u0010Ú\u0001\u001a\u0004\u0018\u00010j2\t\u0010Â\u0001\u001a\u0004\u0018\u00010j8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b×\u0001\u0010Ä\u0001\u001a\u0006\bØ\u0001\u0010Ï\u0001\"\u0006\bÙ\u0001\u0010\u0095\u0001R\u0019\u0010Û\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R7\u0010à\u0001\u001a\u0004\u0018\u00010j2\t\u0010Â\u0001\u001a\u0004\u0018\u00010j8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Ä\u0001\u001a\u0006\bÞ\u0001\u0010Ï\u0001\"\u0006\bß\u0001\u0010\u0095\u0001R2\u0010ä\u0001\u001a\u0002022\u0007\u0010Â\u0001\u001a\u0002028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bá\u0001\u0010Ä\u0001\u001a\u0006\bâ\u0001\u0010Æ\u0001\"\u0005\bã\u0001\u0010NR\u0019\u0010å\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010Ü\u0001R\u001c\u0010æ\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001b\u0010è\u0001\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u0018\u0010ë\u0001\u001a\u00030ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001a\u0010í\u0001\u001a\u00030ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010ì\u0001R*\u0010î\u0001\u001a\u00030ê\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bî\u0001\u0010ì\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R \u0010ô\u0001\u001a\u00030ó\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001R \u0010ú\u0001\u001a\u0002028@X\u0080\u0084\u0002¢\u0006\u0010\n\u0006\bø\u0001\u0010Ä\u0001\u001a\u0006\bù\u0001\u0010Æ\u0001R2\u0010ü\u0001\u001a\u000b\u0012\u0004\u0012\u000209\u0018\u00010û\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R2\u0010\u0082\u0002\u001a\u000b\u0012\u0004\u0012\u000209\u0018\u00010û\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010ý\u0001\u001a\u0006\b\u0083\u0002\u0010ÿ\u0001\"\u0006\b\u0084\u0002\u0010\u0081\u0002RI\u0010\u0088\u0002\u001a\"\u0012\u0015\u0012\u001302¢\u0006\u000e\b\u0086\u0002\u0012\t\b\u0087\u0002\u0012\u0004\b\b(L\u0012\u0004\u0012\u000209\u0018\u00010\u0085\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002RI\u0010\u008e\u0002\u001a\"\u0012\u0015\u0012\u00130j¢\u0006\u000e\b\u0086\u0002\u0012\t\b\u0087\u0002\u0012\u0004\b\b(k\u0012\u0004\u0012\u000209\u0018\u00010\u0085\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0002\u0010\u0089\u0002\u001a\u0006\b\u008f\u0002\u0010\u008b\u0002\"\u0006\b\u0090\u0002\u0010\u008d\u0002R\u001b\u0010\u0091\u0002\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001b\u0010\u0093\u0002\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0092\u0002R\u001b\u0010\u0094\u0002\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0092\u0002R\u0015\u0010\u0098\u0002\u001a\u00030\u0095\u00028F¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0019\u0010\u009a\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0007\u001a\u0005\b\u0099\u0002\u0010w¨\u0006\u009c\u0002"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel;", "Lcom/sumsub/sns/core/presentation/base/M0;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "", "Lcom/sumsub/sns/internal/features/data/model/common/Document;", "initialDocs", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lcom/sumsub/sns/internal/features/data/repository/common/a;", "commonRepository", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;", "dataRepository", "Lcom/sumsub/sns/internal/features/data/repository/socket/a;", "webSocketRepository", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/sumsub/sns/internal/features/domain/videoident/h;", "applyUseCase", "Lcom/sumsub/sns/internal/features/domain/videoident/j;", "confirmUseCase", "Lcom/sumsub/sns/internal/features/domain/videoident/f;", "uploadFileUseCase", "Lcom/sumsub/sns/internal/features/domain/videoident/d;", "uploadFileFromStreamUseCase", "Lcom/sumsub/sns/internal/features/domain/videoident/b;", "languagesUseCase", "Lcom/sumsub/sns/internal/features/domain/Y;", "setLanguageUseCase", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;", "videoChatAdapter", "Lcom/sumsub/sns/internal/core/common/b1;", "uriContentLoader", "Lcom/sumsub/sns/internal/features/data/repository/applicant/d;", "applicantRepository", "<init>", "(Ljava/util/List;Lxg0/a;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/socket/a;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/domain/videoident/h;Lcom/sumsub/sns/internal/features/domain/videoident/j;Lcom/sumsub/sns/internal/features/domain/videoident/f;Lcom/sumsub/sns/internal/features/domain/videoident/d;Lcom/sumsub/sns/internal/features/domain/videoident/b;Lcom/sumsub/sns/internal/features/domain/Y;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;Lcom/sumsub/sns/internal/core/common/b1;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "uploadingPhotoState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readyForPhoto", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ConfirmExitDialog;", "exitConfirmationDialog", "videoCallState", "uploadPreview", "uploadFailedState", "connectionLostState", "connectionLostCallAgainState", "waitingForOperatorState", "startCallErrorState", "previewStateLoading", "", "startCallEnabled", "previewState", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/l0;", "isNetworkError", "(Lcom/sumsub/sns/internal/features/data/model/common/l0;)Z", "", "handleRequestLanguagesErrorAction", "()V", "requestAvailableLanguages", "Lcom/sumsub/sns/internal/features/data/model/common/remote/z2;", "status", "handleQueueStatusUpdated", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/z2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;", "data", "handleDataUpdated", "(Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;)V", "cancelUploadJob", "handleRetryUpload", "onStartVideoCallClick", "doStartCall", "Lkotlinx/coroutines/x1;", "onConnectedToRoom", "()Lkotlinx/coroutines/x1;", "isCompleted", "close", "(Z)V", "createParticipantConnectedViewState", "currentState", "switchToReconnectingViewState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;)V", "scheduleDisconnectTimeout", "onOperatorDisconnectTimeout", "cancelDisconnectTimeoutJob", "handleCancelScreenshot", "Lcom/sumsub/sns/internal/features/data/model/common/remote/T2;", "message", "handleMakeScreenshot", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/T2;)V", "Lcom/sumsub/sns/internal/features/data/model/common/remote/c3;", "handleReadyForScreenshot", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/c3;)V", "Lcom/sumsub/sns/internal/features/data/model/common/remote/Z2;", "handleModeratorName", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/Z2;)V", "Lcom/sumsub/sns/internal/features/data/model/common/remote/s3;", "payload", "handleStepChange", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/s3;)V", "Lcom/sumsub/sns/internal/features/data/model/common/remote/n3;", "updateSelectedDocumentInfoWithPayload", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/n3;)V", "handleCompletedMessage", "releaseUploadedBitmap", "", "docSetType", "Ljava/io/File;", "file", "onUploadFileForDocSetType", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSelectingFileError", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/E0;", "response", "handleRoomCreatedResult", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/E0;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem;", "createDocumentItems", "()Ljava/util/List;", "document", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem$State;", "stepStateForDocument", "(Lcom/sumsub/sns/internal/features/data/model/common/Document;)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem$State;", "handleUpdateDocsStatus", "handleDocStatusUpdated", "scheduleWaitForStatusUpdate", "onWaitForStatusUpdateTimeout", "cancelWaitForStatusUpdateJob", "resetFieldAfterMakingPhoto", "onMediaReady", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$Loading;", "getDefaultState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$Loading;", "onPrepare", "onViewStart", "onCleared", "onBackPressed", "onChangeLanguageClick", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onHandleError", "(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V", "onErrorCancelled", "adapter", "updateVideoChatAdapter", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;)V", "handleEnterPhoneResult", "selectedLanguage", "handleLanguageSelectionResult", "(Ljava/lang/String;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/ButtonAction;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "onPrimaryButtonClick", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/ButtonAction;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;", "state", "handleVideoChatState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/PhoneVerificationStatus;", "handlePhoneVerificationStatus", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/PhoneVerificationStatus;)V", "msg", "onChatMessage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDecodingPhotoFrame", "onTertiaryButtonClick", "Landroid/graphics/Bitmap;", "photo", "onPhotoMade", "(Landroid/graphics/Bitmap;)V", "onUploadCancel", "onPhotoMakeError", "Landroid/net/Uri;", "uri", "handleFileSelectedForDocSetType", "(Landroid/net/Uri;)V", "Ljava/util/List;", "Lxg0/a;", "getJson", "()Lxg0/a;", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;", "Lcom/sumsub/sns/internal/features/data/repository/socket/a;", "Lcom/sumsub/sns/internal/features/domain/videoident/h;", "Lcom/sumsub/sns/internal/features/domain/videoident/j;", "Lcom/sumsub/sns/internal/features/domain/videoident/f;", "Lcom/sumsub/sns/internal/features/domain/videoident/d;", "Lcom/sumsub/sns/internal/features/domain/videoident/b;", "Lcom/sumsub/sns/internal/features/domain/Y;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;", "Lcom/sumsub/sns/internal/core/common/b1;", "Lcom/sumsub/sns/internal/features/data/repository/applicant/d;", "Lkotlinx/coroutines/m0;", "videoIdentScope", "Lkotlinx/coroutines/m0;", "<set-?>", "isChatRunning$delegate", "Lcom/sumsub/sns/internal/core/presentation/screen/base/t;", SNSVideoIdentViewModel.KEY_IS_CHAT_RUNNING, "()Z", "setChatRunning", "updatedDocuments$delegate", "getUpdatedDocuments", "setUpdatedDocuments", "(Ljava/util/List;)V", "updatedDocuments", "selectedDocSetType$delegate", "getSelectedDocSetType", "()Ljava/lang/String;", "setSelectedDocSetType", "selectedDocSetType", "requestedDocumentPayload$delegate", "getRequestedDocumentPayload", "()Lcom/sumsub/sns/internal/features/data/model/common/remote/n3;", "setRequestedDocumentPayload", "requestedDocumentPayload", "operatorName$delegate", "getOperatorName", "setOperatorName", "operatorName", "exitingWithBackPress", "Z", "speakingLanguage$delegate", "getSpeakingLanguage", "setSpeakingLanguage", "speakingLanguage", "operatorCompletedCall$delegate", "getOperatorCompletedCall", "setOperatorCompletedCall", "operatorCompletedCall", "showPhotoFrame", "uploadedBitmap", "Landroid/graphics/Bitmap;", "uploadedFile", "Ljava/io/File;", "", "waitForStatusUpdateTimeout", "J", "waitTimeSec", "operatorDisconnectTimeout", "getOperatorDisconnectTimeout", "()J", "setOperatorDisconnectTimeout", "(J)V", "Lcom/sumsub/sns/internal/core/presentation/android/g;", "permissionsController", "Lcom/sumsub/sns/internal/core/presentation/android/g;", "getPermissionsController$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/internal/core/presentation/android/g;", "skipNotificationPermission$delegate", "getSkipNotificationPermission$idensic_mobile_sdk_aar_defaultRelease", "skipNotificationPermission", "Lkotlin/Function0;", "onStartPhoneVerification", "Lkotlin/jvm/functions/Function0;", "getOnStartPhoneVerification", "()Lkotlin/jvm/functions/Function0;", "setOnStartPhoneVerification", "(Lkotlin/jvm/functions/Function0;)V", "onCancelPhoneVerification", "getOnCancelPhoneVerification", "setOnCancelPhoneVerification", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onClose", "Lkotlin/jvm/functions/Function1;", "getOnClose", "()Lkotlin/jvm/functions/Function1;", "setOnClose", "(Lkotlin/jvm/functions/Function1;)V", "onPickFile", "getOnPickFile", "setOnPickFile", "waitForStatusUpdateJob", "Lkotlinx/coroutines/x1;", "disconnectTimeoutJob", "uploadPhotoJob", "", "getRemoteVideoAspectRatioScale", "()F", "remoteVideoAspectRatioScale", "getDocuments", "documents", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSVideoIdentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoIdentViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1441:1\n1#2:1442\n1761#3,3:1443\n1573#3:1446\n1604#3,4:1447\n*S KotlinDebug\n*F\n+ 1 SNSVideoIdentViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel\n*L\n355#1:1443,3\n1218#1:1446\n1218#1:1447,4\n*E\n"})
public final class SNSVideoIdentViewModel extends AbstractC28073M0 {
    private static final float DEFAULT_REMOTE_VIDEO_SCALE = 0.75f;

    @NotNull
    private static final String STRING_ACTION_START = "sns_videoident_action_start";

    @NotNull
    public static final String STRING_CONNECTING = "sns_videoident_state_connecting";

    @NotNull
    private static final String STRING_CONNECTION_LOST = "sns_videoident_error_connectionLost_title";

    @NotNull
    private static final String STRING_FOLLOW_CHECKING_CAMERA_TEXT = "sns_videoident_state_checkingCamera_text";

    @NotNull
    private static final String STRING_FOLLOW_CHECKING_CAMERA_TITLE = "sns_videoident_state_checkingCamera_title";

    @NotNull
    private static final String STRING_FOLLOW_INSTRUCTIONS_TEXT = "sns_videoident_state_followIntructions_text";

    @NotNull
    private static final String STRING_FOLLOW_WAIT_MESSAGE = "sns_videoident_warning_waitForConnect";

    @NotNull
    public static final String STRING_FOLLOW_WAIT_MESSAGE_ADAPTIVE = "sns_videoident_warning_waitForConnect_adaptive";

    @NotNull
    private static final String STRING_LANG_CHANGE_ACTION = "sns_videoident_langPanel_action_change";

    @NotNull
    private static final String STRING_LANG_SELECTED_LANGUAGE_TITLE = "sns_videoident_langPanel_text";

    @NotNull
    private final InterfaceC29921d applicantRepository;

    @NotNull
    private final C30327h applyUseCase;

    @NotNull
    private final C30329j confirmUseCase;

    @NotNull
    private final InterfaceC29984m dataRepository;

    @Nullable
    private InterfaceC41775x1 disconnectTimeoutJob;
    private boolean exitingWithBackPress;

    @NotNull
    private final List<Document> initialDocs;

    /* JADX INFO: renamed from: isChatRunning$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t isChatRunning;

    @NotNull
    private final AbstractC46162a json;

    @NotNull
    private final C30321b languagesUseCase;

    @Nullable
    private Function0<Unit> onCancelPhoneVerification;

    @Nullable
    private Function1<? super Boolean, Unit> onClose;

    @Nullable
    private Function1<? super String, Unit> onPickFile;

    @Nullable
    private Function0<Unit> onStartPhoneVerification;

    /* JADX INFO: renamed from: operatorCompletedCall$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t operatorCompletedCall;
    private long operatorDisconnectTimeout;

    /* JADX INFO: renamed from: operatorName$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t operatorName;

    @NotNull
    private final C28651g permissionsController;

    /* JADX INFO: renamed from: requestedDocumentPayload$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t requestedDocumentPayload;

    /* JADX INFO: renamed from: selectedDocSetType$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t selectedDocSetType;

    @NotNull
    private final C30090Y setLanguageUseCase;
    private boolean showPhotoFrame;

    /* JADX INFO: renamed from: skipNotificationPermission$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t skipNotificationPermission;

    /* JADX INFO: renamed from: speakingLanguage$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t speakingLanguage;

    /* JADX INFO: renamed from: updatedDocuments$delegate, reason: from kotlin metadata */
    @NotNull
    private final C28936t updatedDocuments;

    @NotNull
    private final C30323d uploadFileFromStreamUseCase;

    @NotNull
    private final C30325f uploadFileUseCase;

    @Nullable
    private InterfaceC41775x1 uploadPhotoJob;

    @Nullable
    private Bitmap uploadedBitmap;

    @Nullable
    private File uploadedFile;

    @NotNull
    private final InterfaceC28439b1 uriContentLoader;

    @NotNull
    private SNSVideoChatAdapter videoChatAdapter;

    @NotNull
    private final InterfaceC41709m0 videoIdentScope;

    @Nullable
    private InterfaceC41775x1 waitForStatusUpdateJob;
    private final long waitForStatusUpdateTimeout;
    private long waitTimeSec;

    @NotNull
    private final InterfaceC30035a webSocketRepository;

    @NotNull
    public static final String KEY_IS_CHAT_RUNNING = "isChatRunning";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {AbstractC28639a.m69485a(SNSVideoIdentViewModel.class, KEY_IS_CHAT_RUNNING, "isChatRunning()Z", 0), AbstractC28639a.m69485a(SNSVideoIdentViewModel.class, "updatedDocuments", "getUpdatedDocuments()Ljava/util/List;", 0), AbstractC28639a.m69485a(SNSVideoIdentViewModel.class, "selectedDocSetType", "getSelectedDocSetType()Ljava/lang/String;", 0), AbstractC28639a.m69485a(SNSVideoIdentViewModel.class, "requestedDocumentPayload", "getRequestedDocumentPayload()Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$ScreenShotPayload;", 0), AbstractC28639a.m69485a(SNSVideoIdentViewModel.class, "operatorName", "getOperatorName()Ljava/lang/String;", 0), AbstractC28639a.m69485a(SNSVideoIdentViewModel.class, "speakingLanguage", "getSpeakingLanguage()Ljava/lang/String;", 0), AbstractC28639a.m69485a(SNSVideoIdentViewModel.class, "operatorCompletedCall", "getOperatorCompletedCall()Z", 0), AbstractC28118g.m69077a(SNSVideoIdentViewModel.class, "skipNotificationPermission", "getSkipNotificationPermission$idensic_mobile_sdk_aar_defaultRelease()Z", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_OPERATOR_DISCONNECT_TIMEOUT = TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;", "data", "", "<anonymous>", "(Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329341 extends SuspendLambda implements Function2<C29980i, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(C29980i c29980i, Continuation<? super Unit> continuation) {
            return ((C329341) create(c29980i, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329341(Continuation<? super C329341> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329341 c329341 = SNSVideoIdentViewModel.this.new C329341(continuation);
            c329341.L$0 = obj;
            return c329341;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C29980i c29980i = (C29980i) this.L$0;
                if (c29980i != null) {
                    SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                    AbstractC32895a.m71366a("data repository flow updated");
                    sNSVideoIdentViewModel.handleDataUpdated(c29980i);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;", "message", "", "<anonymous>", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {306}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329352 extends SuspendLambda implements Function2<C29226H3, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(C29226H3 c29226h3, Continuation<? super Unit> continuation) {
            return ((C329352) create(c29226h3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329352(Continuation<? super C329352> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329352 c329352 = SNSVideoIdentViewModel.this.new C329352(continuation);
            c329352.L$0 = obj;
            return c329352;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                C29226H3 c29226h3 = (C29226H3) this.L$0;
                if (c29226h3 instanceof C29685z2) {
                    this.label = 1;
                    if (SNSVideoIdentViewModel.this.handleQueueStatusUpdated((C29685z2) c29226h3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel$Companion;", "", "<init>", "()V", "DEFAULT_REMOTE_VIDEO_SCALE", "", "KEY_IS_CHAT_RUNNING", "", "STRING_CONNECTION_LOST", "STRING_FOLLOW_INSTRUCTIONS_TEXT", "STRING_FOLLOW_WAIT_MESSAGE", "STRING_FOLLOW_WAIT_MESSAGE_ADAPTIVE", "STRING_FOLLOW_CHECKING_CAMERA_TITLE", "STRING_FOLLOW_CHECKING_CAMERA_TEXT", "STRING_CONNECTING", "STRING_ACTION_START", "STRING_LANG_SELECTED_LANGUAGE_TITLE", "STRING_LANG_CHANGE_ACTION", "DEFAULT_OPERATOR_DISCONNECT_TIMEOUT", "", "getDEFAULT_OPERATOR_DISCONNECT_TIMEOUT", "()J", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long getDEFAULT_OPERATOR_DISCONNECT_TIMEOUT() {
            return SNSVideoIdentViewModel.DEFAULT_OPERATOR_DISCONNECT_TIMEOUT;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$close$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$close$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {753}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329361 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isCompleted;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329361(boolean z11, Continuation<? super C329361> continuation) {
            super(2, continuation);
            this.$isCompleted = z11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329361 c329361 = SNSVideoIdentViewModel.this.new C329361(this.$isCompleted, continuation);
            c329361.L$0 = obj;
            return c329361;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329361) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC29984m interfaceC29984m = sNSVideoIdentViewModel.dataRepository;
                    this.label = 1;
                    obj = ((C29967J) interfaceC29984m).m70043a(true, (ContinuationImpl) this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Result.m103844constructorimpl((AbstractC29172p) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            SNSVideoIdentViewModel.this.showProgress(false);
            Function1<Boolean, Unit> onClose = SNSVideoIdentViewModel.this.getOnClose();
            if (onClose != null) {
                onClose.invoke(Boxing.boxBoolean(this.$isCompleted));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$connectionLostCallAgainState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {226, 227, 228, 230}, m90125m = "connectionLostCallAgainState", m90126n = {}, m90127s = {})
    public static final class C329371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C329371(Continuation<? super C329371> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.connectionLostCallAgainState(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$connectionLostState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {217, 219, 221}, m90125m = "connectionLostState", m90126n = {}, m90127s = {})
    public static final class C329381 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C329381(Continuation<? super C329381> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.connectionLostState(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$doStartCall$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$doStartCall$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {587}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329391 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329391) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329391(Continuation<? super C329391> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329391(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objPreviewStateLoading = sNSVideoIdentViewModel.previewStateLoading(this);
            if (objPreviewStateLoading == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objPreviewStateLoading;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$doStartCall$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$doStartCall$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {591}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329402 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$doStartCall$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$doStartCall$2$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {601}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            final /* synthetic */ Object $result;
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass1) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SNSVideoIdentViewModel sNSVideoIdentViewModel, Object obj, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
                this.$result = obj;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$result, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
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
                    SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                    this.label = 1;
                    obj = sNSVideoIdentViewModel.startCallErrorState(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return SNSVideoIdentViewModelKt.withWarningMessage((SNSViewState.StateWithVideo) obj, this.this$0.getStrings(), (Exception) Result.m103847exceptionOrNullimpl(this.$result));
            }
        }

        public C329402(Continuation<? super C329402> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329402(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329402) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM70189a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objM70189a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC32895a.m71366a("applying for a room ...");
                C30327h c30327h = SNSVideoIdentViewModel.this.applyUseCase;
                this.label = 1;
                objM70189a = c30327h.m70189a(this);
                if (objM70189a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (Result.m103851isSuccessimpl(objM70189a)) {
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                ResultKt.throwOnFailure(objM70189a);
                sNSVideoIdentViewModel.handleRoomCreatedResult((C29468E0) objM70189a);
            } else {
                C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "apply room error", (Exception) Result.m103847exceptionOrNullimpl(objM70189a));
                SNSVideoIdentViewModel sNSVideoIdentViewModel2 = SNSVideoIdentViewModel.this;
                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel2, false, new AnonymousClass1(sNSVideoIdentViewModel2, objM70189a, null), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$exitConfirmationDialog$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {163, 165, TPPixelFormat.TP_PIX_FMT_MEDIACODEC, 168}, m90125m = "exitConfirmationDialog", m90126n = {}, m90127s = {})
    public static final class C329411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C329411(Continuation<? super C329411> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.exitConfirmationDialog(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleCancelScreenshot$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleCancelScreenshot$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {901}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329421 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329421) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329421(Continuation<? super C329421> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329421(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objVideoCallState = sNSVideoIdentViewModel.videoCallState(this);
            if (objVideoCallState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objVideoCallState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleEnterPhoneResult$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleEnterPhoneResult$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {441}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329431 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C329431(Continuation<? super C329431> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329431(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329431) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                if (sNSVideoIdentViewModel.requestAvailableLanguages(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1321, 1329, 1343}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329441 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass1) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return SNSViewState.Loading.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$6", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1360}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass6 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass6) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                this.label = 1;
                Object objVideoCallState = sNSVideoIdentViewModel.videoCallState(this);
                if (objVideoCallState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objVideoCallState;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329441(Uri uri, Continuation<? super C329441> continuation) {
            super(2, continuation);
            this.$uri = uri;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329441(this.$uri, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329441) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0064  */
        /* JADX WARN: Code duplicated, block: B:28:0x0074  */
        /* JADX WARN: Code duplicated, block: B:30:0x0077  */
        /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:41:0x00c5, B:31:0x008c, B:33:0x009a, B:35:0x00a4, B:37:0x00ae, B:38:0x00b3), top: B:49:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ae A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:41:0x00c5, B:31:0x008c, B:33:0x009a, B:35:0x00a4, B:37:0x00ae, B:38:0x00b3), top: B:49:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:41:0x00c5, B:31:0x008c, B:33:0x009a, B:35:0x00a4, B:37:0x00ae, B:38:0x00b3), top: B:49:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
        
            if (r14 == r0) goto L40;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmapM69274a;
            String str;
            String str2;
            File file;
            String fileExtensionFromUrl;
            String mimeTypeFromExtension;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            str = (String) obj;
                            if (str != null) {
                                if (StringsKt.startsWith$default(str, "file://", false, 2, (Object) null) && str.length() == 0) {
                                    str2 = null;
                                } else {
                                    str2 = str;
                                }
                                if (str2 != null) {
                                    file = new File(StringsKt.replace$default(str2, "file://", "", false, 4, (Object) null));
                                    SNSVideoIdentViewModel.this.uploadedFile = file;
                                    fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
                                    if (fileExtensionFromUrl != null) {
                                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                                    } else {
                                        mimeTypeFromExtension = null;
                                    }
                                    if (Intrinsics.areEqual(mimeTypeFromExtension, ConstantsKt.MIME_TYPE_PDF)) {
                                        bitmapM69274a = AbstractC28385B0.m69274a(file, 1920, 0);
                                    } else {
                                        this.label = 3;
                                        obj = C41686h.m91049g(C41782z0.m91392b(), new C28510y0(file, 1920, null), this);
                                    }
                                    if (bitmapM69274a != null) {
                                        SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                                        AbstractC28073M0.updateState$default(sNSVideoIdentViewModel, false, new SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1(sNSVideoIdentViewModel, bitmapM69274a, null), 1, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                            SNSVideoIdentViewModel.this.uploadedFile = null;
                            SNSVideoIdentViewModel.this.resetFieldAfterMakingPhoto();
                            SNSVideoIdentViewModel sNSVideoIdentViewModel2 = SNSVideoIdentViewModel.this;
                            AbstractC28073M0.updateState$default(sNSVideoIdentViewModel2, false, new AnonymousClass6(sNSVideoIdentViewModel2, null), 1, null);
                            SNSVideoIdentViewModel.this.onSelectingFileError();
                            return Unit.INSTANCE;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    bitmapM69274a = (Bitmap) obj;
                    if (bitmapM69274a != null) {
                        SNSVideoIdentViewModel sNSVideoIdentViewModel3 = SNSVideoIdentViewModel.this;
                        AbstractC28073M0.updateState$default(sNSVideoIdentViewModel3, false, new SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1(sNSVideoIdentViewModel3, bitmapM69274a, null), 1, null);
                        return Unit.INSTANCE;
                    }
                    SNSVideoIdentViewModel.this.uploadedFile = null;
                    SNSVideoIdentViewModel.this.resetFieldAfterMakingPhoto();
                    SNSVideoIdentViewModel sNSVideoIdentViewModel4 = SNSVideoIdentViewModel.this;
                    AbstractC28073M0.updateState$default(sNSVideoIdentViewModel4, false, new AnonymousClass6(sNSVideoIdentViewModel4, null), 1, null);
                    SNSVideoIdentViewModel.this.onSelectingFileError();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                SNSVideoIdentViewModel sNSVideoIdentViewModel5 = SNSVideoIdentViewModel.this;
                this.label = 1;
                if (sNSVideoIdentViewModel5.awaitViewModelPrepared(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
                AbstractC28073M0.updateState$default(SNSVideoIdentViewModel.this, false, new AnonymousClass1(null), 1, null);
                AbstractC32895a.m71366a("handleFileSelectedForDocSetType: creating preview ...");
                AbstractC41697j0 abstractC41697j0M91391a = C41782z0.m91391a();
                C32945x30ef1187 c32945x30ef1187 = new C32945x30ef1187(SNSVideoIdentViewModel.this, this.$uri, null);
                this.label = 2;
                obj = C41686h.m91049g(abstractC41697j0M91391a, c32945x30ef1187, this);
                if (obj != coroutine_suspended) {
                    str = (String) obj;
                    if (str != null) {
                        if (StringsKt.startsWith$default(str, "file://", false, 2, (Object) null)) {
                            str2 = str;
                        } else {
                            str2 = str;
                        }
                        if (str2 != null) {
                            file = new File(StringsKt.replace$default(str2, "file://", "", false, 4, (Object) null));
                            SNSVideoIdentViewModel.this.uploadedFile = file;
                            fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
                            if (fileExtensionFromUrl != null) {
                                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                            } else {
                                mimeTypeFromExtension = null;
                            }
                            if (Intrinsics.areEqual(mimeTypeFromExtension, ConstantsKt.MIME_TYPE_PDF)) {
                                bitmapM69274a = AbstractC28385B0.m69274a(file, 1920, 0);
                            } else {
                                this.label = 3;
                                obj = C41686h.m91049g(C41782z0.m91392b(), new C28510y0(file, 1920, null), this);
                            }
                            if (bitmapM69274a != null) {
                                SNSVideoIdentViewModel sNSVideoIdentViewModel6 = SNSVideoIdentViewModel.this;
                                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel6, false, new SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1(sNSVideoIdentViewModel6, bitmapM69274a, null), 1, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    SNSVideoIdentViewModel.this.uploadedFile = null;
                    SNSVideoIdentViewModel.this.resetFieldAfterMakingPhoto();
                    SNSVideoIdentViewModel sNSVideoIdentViewModel7 = SNSVideoIdentViewModel.this;
                    AbstractC28073M0.updateState$default(sNSVideoIdentViewModel7, false, new AnonymousClass6(sNSVideoIdentViewModel7, null), 1, null);
                    SNSVideoIdentViewModel.this.onSelectingFileError();
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                C33272c c33272c = C33272c.f67812a;
                C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(SNSVideoIdent.logTag, "decoding image failed", th2);
                bitmapM69274a = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleLanguageSelectionResult$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleLanguageSelectionResult$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {488}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329461 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $selectedLanguage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329461(String str, Continuation<? super C329461> continuation) {
            super(2, continuation);
            this.$selectedLanguage = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329461(this.$selectedLanguage, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329461) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM70109a;
            Throwable thM103847exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objM70109a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C30090Y c30090y = SNSVideoIdentViewModel.this.setLanguageUseCase;
                String str = this.$selectedLanguage;
                InterfaceC29921d interfaceC29921d = SNSVideoIdentViewModel.this.applicantRepository;
                this.label = 1;
                objM70109a = c30090y.m70109a(str, interfaceC29921d, this);
                if (objM70109a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (Result.m103850isFailureimpl(objM70109a) && (thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70109a)) != null) {
                SNSVideoIdentViewModel.this.throwError(thM103847exceptionOrNullimpl, "TYPE_UNKNOWN", new SNSViewState.LanguageSelection(null, CollectionsKt.emptyList(), "VIDEO_IDENT"));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleLanguageSelectionResult$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleLanguageSelectionResult$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329472 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        public C329472(Continuation<? super C329472> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329472) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329472(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return SNSViewState.Permissions.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleModeratorName$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleModeratorName$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329481 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ SNSViewState $state;
        int label;
        final /* synthetic */ SNSVideoIdentViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329481) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329481(SNSViewState sNSViewState, SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super C329481> continuation) {
            super(2, continuation);
            this.$state = sNSViewState;
            this.this$0 = sNSVideoIdentViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329481(this.$state, this.this$0, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSViewState.StateWithVideo stateWithVideo = (SNSViewState.StateWithVideo) this.$state;
            RemoteVideoState remoteVideoState = stateWithVideo.getRemoteVideoState();
            return SNSViewState.StateWithVideo.copy$default(stateWithVideo, null, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, remoteVideoState != null ? RemoteVideoState.copy$default(remoteVideoState, false, 0.0f, this.this$0.getOperatorName(), false, 11, null) : null, null, null, null, null, null, null, null, 16711679, null);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleQueueStatusUpdated$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleQueueStatusUpdated$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {524}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329492 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ long $sec;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329492) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329492(long j11, Continuation<? super C329492> continuation) {
            super(2, continuation);
            this.$sec = j11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329492(this.$sec, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                obj = sNSVideoIdentViewModel.waitingForOperatorState(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return SNSVideoIdentViewModelKt.withAdaptiveWaitingMessage((SNSViewState.StateWithVideo) obj, SNSVideoIdentViewModel.this.getStrings(), this.$sec);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleReadyForScreenshot$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleReadyForScreenshot$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {937}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329501 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ PhotoStepStateHelper.State $state;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329501) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329501(PhotoStepStateHelper.State state, Continuation<? super C329501> continuation) {
            super(2, continuation);
            this.$state = state;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329501(this.$state, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                obj = sNSVideoIdentViewModel.readyForPhoto(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            PhotoStepStateHelper.State state = this.$state;
            SNSViewState.StateWithVideo stateWithVideo = (SNSViewState.StateWithVideo) obj;
            stateWithVideo.setBottomSheetTitle(state.getTitle());
            stateWithVideo.setBottomSheetText(state.getText());
            stateWithVideo.setBottomTertiaryButtonText(state.getUploadText());
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleReadyForScreenshot$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleReadyForScreenshot$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {947}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329512 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ PhotoStepStateHelper.State $state;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329512) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329512(PhotoStepStateHelper.State state, Continuation<? super C329512> continuation) {
            super(2, continuation);
            this.$state = state;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329512(this.$state, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                obj = sNSVideoIdentViewModel.readyForPhoto(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            PhotoStepStateHelper.State state = this.$state;
            SNSViewState.StateWithVideo stateWithVideo = (SNSViewState.StateWithVideo) obj;
            stateWithVideo.setBottomSheetTitle(state.getTitle());
            stateWithVideo.setBottomSheetText(state.getText());
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleRequestLanguagesErrorAction$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleRequestLanguagesErrorAction$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {431}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329521 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C329521(Continuation<? super C329521> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329521(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329521) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel.this.showProgress(true);
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                if (sNSVideoIdentViewModel.requestAvailableLanguages(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleStepChange$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleStepChange$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329531 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ Ref.ObjectRef<SNSViewState> $currentState;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329531) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329531(Ref.ObjectRef<SNSViewState> objectRef, Continuation<? super C329531> continuation) {
            super(2, continuation);
            this.$currentState = objectRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329531(this.$currentState, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return this.$currentState.element;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleUpdateDocsStatus$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleUpdateDocsStatus$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1252}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329542 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329542) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329542(Continuation<? super C329542> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329542(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objUploadingPhotoState = sNSVideoIdentViewModel.uploadingPhotoState(this);
            if (objUploadingPhotoState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUploadingPhotoState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329551 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ SNSViewState $currentState;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329551) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329551(SNSViewState sNSViewState, Continuation<? super C329551> continuation) {
            super(2, continuation);
            this.$currentState = sNSViewState;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329551(this.$currentState, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return ((SNSViewState.StateWithVideo) this.$currentState).getPreviousState();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {655}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329562 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329562) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329562(Continuation<? super C329562> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329562(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objPreviewStateLoading = sNSVideoIdentViewModel.previewStateLoading(this);
            if (objPreviewStateLoading == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objPreviewStateLoading;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$3 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$3", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {659}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329573 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329573) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329573(Continuation<? super C329573> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329573(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objWaitingForOperatorState = sNSVideoIdentViewModel.waitingForOperatorState(this);
            if (objWaitingForOperatorState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objWaitingForOperatorState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$4 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$4", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {669}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329584 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329584) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329584(Continuation<? super C329584> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329584(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objCreateParticipantConnectedViewState = sNSVideoIdentViewModel.createParticipantConnectedViewState(this);
            if (objCreateParticipantConnectedViewState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objCreateParticipantConnectedViewState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$5 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$5", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {679}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329595 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329595) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329595(Continuation<? super C329595> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329595(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objConnectionLostState = sNSVideoIdentViewModel.connectionLostState(this);
            if (objConnectionLostState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objConnectionLostState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {696}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329606 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ SNSVideoChatState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass1) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return SNSViewState.Loading.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {729}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass2) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                this.label = 1;
                Object objConnectionLostCallAgainState = sNSVideoIdentViewModel.connectionLostCallAgainState(this);
                if (objConnectionLostCallAgainState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objConnectionLostCallAgainState;
            }
        }

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6$3", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {C33556b3.f69059k}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass3) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                this.label = 1;
                Object objPreviewState = sNSVideoIdentViewModel.previewState(true, this);
                if (objPreviewState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objPreviewState;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329606(SNSVideoChatState sNSVideoChatState, Continuation<? super C329606> continuation) {
            super(2, continuation);
            this.$state = sNSVideoChatState;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329606 c329606 = SNSVideoIdentViewModel.this.new C329606(this.$state, continuation);
            c329606.L$0 = obj;
            return c329606;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329606) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0086  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:41:0x00bf A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:46:0x00df  */
        /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:55:0x0108  */
        /* JADX WARN: Code duplicated, block: B:57:0x010e  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM103844constructorimpl;
            boolean zBooleanValue;
            Function0<Unit> onCancelPhoneVerification;
            SNSViewState sNSViewState;
            SNSViewState.StateWithVideo stateWithVideo;
            ReviewStatusType reviewStatusType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SNSVideoIdentViewModel.this.setChatRunning(false);
                    SNSVideoIdentViewModel.this.cancelWaitForStatusUpdateJob();
                    if (((C32923x) this.$state).f67366a == null && !SNSVideoIdentViewModel.this.isUnitTest()) {
                        SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                        Result.Companion companion = Result.INSTANCE;
                        InterfaceC29984m interfaceC29984m = sNSVideoIdentViewModel.dataRepository;
                        this.label = 1;
                        obj = ((C29967J) interfaceC29984m).m70043a(true, (ContinuationImpl) this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        zBooleanValue = false;
                    }
                    AbstractC32895a.m71366a("handleVideoChatState: finishOnDisconnect=" + zBooleanValue + ", error=" + ((C32923x) this.$state).f67366a);
                    onCancelPhoneVerification = SNSVideoIdentViewModel.this.getOnCancelPhoneVerification();
                    if (onCancelPhoneVerification != null) {
                        onCancelPhoneVerification.invoke();
                    }
                    if (SNSVideoIdentViewModel.this.exitingWithBackPress) {
                        return Unit.INSTANCE;
                    }
                    if (zBooleanValue) {
                        AbstractC28073M0.updateState$default(SNSVideoIdentViewModel.this, false, new AnonymousClass1(null), 1, null);
                        SNSVideoIdentViewModel.this.close(true);
                        return Unit.INSTANCE;
                    }
                    sNSViewState = (SNSViewState) SNSVideoIdentViewModel.this.currentState();
                    if (sNSViewState instanceof SNSViewState.StateWithVideo) {
                        stateWithVideo = (SNSViewState.StateWithVideo) sNSViewState;
                        if (stateWithVideo.getState() == SNSViewState.VideoStepState.ERROR && stateWithVideo.getErrorState() != SNSViewState.ErrorState.UPLOAD_ERROR) {
                            return Unit.INSTANCE;
                        }
                    }
                    if (((C32923x) this.$state).f67366a != null) {
                        SNSVideoIdentViewModel sNSVideoIdentViewModel2 = SNSVideoIdentViewModel.this;
                        AbstractC28073M0.updateState$default(sNSVideoIdentViewModel2, false, new AnonymousClass2(sNSVideoIdentViewModel2, null), 1, null);
                    } else if (!sNSViewState.isPreview()) {
                        SNSVideoIdentViewModel sNSVideoIdentViewModel3 = SNSVideoIdentViewModel.this;
                        AbstractC28073M0.updateState$default(sNSVideoIdentViewModel3, false, new AnonymousClass3(sNSVideoIdentViewModel3, null), 1, null);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC29172p abstractC29172p = (AbstractC29172p) obj;
                C28984B3 c28984b3 = abstractC29172p.mo69761l().f59120d;
                if (c28984b3 != null) {
                    reviewStatusType = c28984b3.f58905a;
                } else {
                    reviewStatusType = null;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Boxing.boxBoolean(!AbstractC28458h.m69347a(abstractC29172p, reviewStatusType)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            Boolean bool = (Boolean) objM103844constructorimpl;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            AbstractC32895a.m71366a("handleVideoChatState: finishOnDisconnect=" + zBooleanValue + ", error=" + ((C32923x) this.$state).f67366a);
            onCancelPhoneVerification = SNSVideoIdentViewModel.this.getOnCancelPhoneVerification();
            if (onCancelPhoneVerification != null) {
                onCancelPhoneVerification.invoke();
            }
            if (SNSVideoIdentViewModel.this.exitingWithBackPress) {
                return Unit.INSTANCE;
            }
            if (zBooleanValue) {
                AbstractC28073M0.updateState$default(SNSVideoIdentViewModel.this, false, new AnonymousClass1(null), 1, null);
                SNSVideoIdentViewModel.this.close(true);
                return Unit.INSTANCE;
            }
            sNSViewState = (SNSViewState) SNSVideoIdentViewModel.this.currentState();
            if (sNSViewState instanceof SNSViewState.StateWithVideo) {
                stateWithVideo = (SNSViewState.StateWithVideo) sNSViewState;
                if (stateWithVideo.getState() == SNSViewState.VideoStepState.ERROR) {
                    return Unit.INSTANCE;
                }
            }
            if (((C32923x) this.$state).f67366a != null) {
                SNSVideoIdentViewModel sNSVideoIdentViewModel4 = SNSVideoIdentViewModel.this;
                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel4, false, new AnonymousClass2(sNSVideoIdentViewModel4, null), 1, null);
            } else if (!sNSViewState.isPreview()) {
                SNSVideoIdentViewModel sNSVideoIdentViewModel5 = SNSVideoIdentViewModel.this;
                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel5, false, new AnonymousClass3(sNSVideoIdentViewModel5, null), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onChangeLanguageClick$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onChangeLanguageClick$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {398}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329611 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C329611(Continuation<? super C329611> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329611(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329611) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                if (sNSVideoIdentViewModel.requestAvailableLanguages(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onChatMessage$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {0}, m90124l = {836, 884}, m90125m = "onChatMessage", m90126n = {"msg"}, m90127s = {"L$0"})
    public static final class C329621 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C329621(Continuation<? super C329621> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.onChatMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onConnectedToRoom$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onConnectedToRoom$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {TypedValues.MotionType.TYPE_DRAW_PATH}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329631 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onConnectedToRoom$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onConnectedToRoom$1$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {622}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            final /* synthetic */ Object $confirmResult;
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass2) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SNSVideoIdentViewModel sNSVideoIdentViewModel, Object obj, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
                this.$confirmResult = obj;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$confirmResult, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
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
                    SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                    this.label = 1;
                    obj = sNSVideoIdentViewModel.startCallErrorState(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return SNSVideoIdentViewModelKt.withWarningMessage((SNSViewState.StateWithVideo) obj, this.this$0.getStrings(), (Exception) Result.m103847exceptionOrNullimpl(this.$confirmResult));
            }
        }

        public C329631(Continuation<? super C329631> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329631(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329631) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM70190a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objM70190a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC32895a.m71366a("confirming room connection");
                C30329j c30329j = SNSVideoIdentViewModel.this.confirmUseCase;
                this.label = 1;
                objM70190a = c30329j.m70190a(this);
                if (objM70190a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (Result.m103851isSuccessimpl(objM70190a)) {
                AbstractC32895a.m71366a("confirm success");
                InterfaceC28147s interfaceC28147sCurrentState = SNSVideoIdentViewModel.this.currentState();
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                if (((SNSViewState) interfaceC28147sCurrentState).isLoading() && !sNSVideoIdentViewModel.isChatRunning()) {
                    AbstractC28073M0.updateState$default(sNSVideoIdentViewModel, false, new SNSVideoIdentViewModel$onConnectedToRoom$1$1$1(sNSVideoIdentViewModel, null), 1, null);
                    sNSVideoIdentViewModel.setChatRunning(true);
                }
            } else {
                C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, " confirm room error", Result.m103847exceptionOrNullimpl(objM70190a));
                SNSVideoIdentViewModel.this.videoChatAdapter.disconnect();
                SNSVideoIdentViewModel sNSVideoIdentViewModel2 = SNSVideoIdentViewModel.this;
                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel2, false, new AnonymousClass2(sNSVideoIdentViewModel2, objM70190a, null), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onDecodingPhotoFrame$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onDecodingPhotoFrame$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1005}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329641 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329641) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329641(Continuation<? super C329641> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329641(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objUploadingPhotoState = sNSVideoIdentViewModel.uploadingPhotoState(this);
            if (objUploadingPhotoState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUploadingPhotoState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onMediaReady$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onMediaReady$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {325}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329651 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329651) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329651(Continuation<? super C329651> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329651(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objPreviewState = sNSVideoIdentViewModel.previewState(true, this);
            if (objPreviewState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objPreviewState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onOperatorDisconnectTimeout$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onOperatorDisconnectTimeout$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {821}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329661 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329661) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329661(Continuation<? super C329661> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329661(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objConnectionLostCallAgainState = sNSVideoIdentViewModel.connectionLostCallAgainState(this);
            if (objConnectionLostCallAgainState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objConnectionLostCallAgainState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {0, 1, 1, 1}, m90124l = {UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_BD, 1052}, m90125m = "invokeSuspend", m90126n = {"selectedDocumentPayload", "exception", "success", "canTryAgain"}, m90127s = {"L$0", "L$0", "L$1", "I$0"})
    public static final class C329671 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $photo;
        final /* synthetic */ Ref.BooleanRef $releaseBitmap;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1040}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass1) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                this.label = 1;
                Object objUploadingPhotoState = sNSVideoIdentViewModel.uploadingPhotoState(this);
                if (objUploadingPhotoState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objUploadingPhotoState;
            }
        }

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$3", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1088, 1088}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            final /* synthetic */ Ref.BooleanRef $success;
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass3) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Ref.BooleanRef booleanRef, SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$success = booleanRef;
                this.this$0 = sNSVideoIdentViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$success, this.this$0, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
            
                if (r5 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            
                if (r5 == r0) goto L19;
             */
            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return (SNSViewState) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return (SNSViewState) obj;
                }
                ResultKt.throwOnFailure(obj);
                if (this.$success.element) {
                    SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                    this.label = 1;
                    obj = sNSVideoIdentViewModel.uploadingPhotoState(this);
                } else {
                    SNSVideoIdentViewModel sNSVideoIdentViewModel2 = this.this$0;
                    this.label = 2;
                    obj = sNSVideoIdentViewModel2.videoCallState(this);
                }
                return coroutine_suspended;
            }
        }

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$4", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1098}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            final /* synthetic */ Ref.ObjectRef<Exception> $exception;
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass4) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(SNSVideoIdentViewModel sNSVideoIdentViewModel, Ref.ObjectRef<Exception> objectRef, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
                this.$exception = objectRef;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$exception, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
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
                    SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                    this.label = 1;
                    obj = sNSVideoIdentViewModel.uploadFailedState(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Ref.ObjectRef<Exception> objectRef = this.$exception;
                SNSVideoIdentViewModel sNSVideoIdentViewModel2 = this.this$0;
                SNSViewState.StateWithVideo stateWithVideo = (SNSViewState.StateWithVideo) obj;
                if (objectRef.element != null) {
                    return SNSVideoIdentViewModelKt.withWarningMessage(stateWithVideo, sNSVideoIdentViewModel2.getStrings(), objectRef.element);
                }
                return stateWithVideo;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329671(Bitmap bitmap, Ref.BooleanRef booleanRef, Continuation<? super C329671> continuation) {
            super(2, continuation);
            this.$photo = bitmap;
            this.$releaseBitmap = booleanRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329671(this.$photo, this.$releaseBitmap, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329671) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:49:0x0115  */
        /* JADX WARN: Code duplicated, block: B:62:0x0167  */
        /* JADX WARN: Code duplicated, block: B:64:0x017a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0180  */
        /* JADX WARN: Type inference failed for: r6v15, types: [T, java.lang.Exception] */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C29424n3 requestedDocumentPayload;
            Ref.ObjectRef objectRef;
            Ref.BooleanRef booleanRef;
            boolean z11;
            C329671 c329671;
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            Ref.ObjectRef objectRef2;
            Object value;
            Ref.BooleanRef booleanRef2;
            C29307Y0 c29307y0;
            String str5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        i11 = this.I$0;
                        booleanRef2 = (Ref.BooleanRef) this.L$1;
                        objectRef2 = (Ref.ObjectRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        value = ((Result) obj).getValue();
                        c329671 = this;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    requestedDocumentPayload = (C29424n3) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                booleanRef2.element = Result.m103851isSuccessimpl(value);
                if (Result.m103850isFailureimpl(value)) {
                    objectRef2.element = (Exception) Result.m103847exceptionOrNullimpl(value);
                    C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "failed uploading image", (Exception) Result.m103847exceptionOrNullimpl(value));
                }
                if (Result.m103850isFailureimpl(value)) {
                    value = null;
                }
                c29307y0 = (C29307Y0) value;
                if (c29307y0 != null && (str5 = c29307y0.f59320e) != null) {
                    SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                    AbstractC32895a.m71366a("uploaded imageId=" + str5);
                    sNSVideoIdentViewModel.videoChatAdapter.sendMessage(new C29199C1(new C29194B1(str5)));
                }
                booleanRef = booleanRef2;
                objectRef = objectRef2;
                if (!booleanRef.element || i11 == 0) {
                    SNSVideoIdentViewModel.this.resetFieldAfterMakingPhoto();
                    SNSVideoIdentViewModel sNSVideoIdentViewModel2 = SNSVideoIdentViewModel.this;
                    AbstractC28073M0.updateState$default(sNSVideoIdentViewModel2, false, new AnonymousClass3(booleanRef, sNSVideoIdentViewModel2, null), 1, null);
                    if (booleanRef.element) {
                        SNSVideoIdentViewModel.this.scheduleWaitForStatusUpdate();
                    } else {
                        SNSVideoIdentViewModel.this.videoChatAdapter.sendMessage(new C29663w1());
                    }
                } else {
                    c329671.$releaseBitmap.element = false;
                    SNSVideoIdentViewModel sNSVideoIdentViewModel3 = SNSVideoIdentViewModel.this;
                    AbstractC28073M0.updateState$default(sNSVideoIdentViewModel3, false, new AnonymousClass4(sNSVideoIdentViewModel3, objectRef, null), 1, null);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            requestedDocumentPayload = SNSVideoIdentViewModel.this.getRequestedDocumentPayload();
            if (requestedDocumentPayload == null) {
                C33272c c33272c = C33272c.f67812a;
                Logger.DefaultImpls.w$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), SNSVideoIdent.logTag, "selected document info missing", null, 4, null);
                AbstractC32895a.m71366a("onPhotoMade: selected document info missing!!!");
            }
            SNSVideoIdentViewModel sNSVideoIdentViewModel4 = SNSVideoIdentViewModel.this;
            AbstractC28073M0.updateState$default(sNSVideoIdentViewModel4, false, new AnonymousClass1(sNSVideoIdentViewModel4, null), 1, null);
            AbstractC32895a.m71366a("onPhotoMade: compressing ...");
            Bitmap bitmap = this.$photo;
            this.L$0 = requestedDocumentPayload;
            this.label = 1;
            obj = C41686h.m91049g(C41782z0.m91392b(), new C28507x0(bitmap, null), this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            InputStream inputStream = (InputStream) obj;
            objectRef = new Ref.ObjectRef();
            booleanRef = new Ref.BooleanRef();
            if (inputStream != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            booleanRef.element = z11;
            if (inputStream != null) {
                AbstractC32895a.m71366a("uploading photo ...");
                C30323d c30323d = SNSVideoIdentViewModel.this.uploadFileFromStreamUseCase;
                if (requestedDocumentPayload == null || (str = requestedDocumentPayload.f59424d) == null) {
                    str = "TYPE_UNKNOWN";
                }
                C29070X c29070x = new C29070X(str);
                if (requestedDocumentPayload == null || (str2 = requestedDocumentPayload.f59421a) == null) {
                    str2 = "";
                }
                C29115f2 c29115f2 = IdentitySide.Companion;
                if (requestedDocumentPayload != null) {
                    str3 = requestedDocumentPayload.f59422b;
                } else {
                    str3 = null;
                }
                c29115f2.getClass();
                IdentitySide identitySideM69768a = C29115f2.m69768a(str3);
                if (requestedDocumentPayload != null) {
                    str4 = requestedDocumentPayload.f59423c;
                } else {
                    str4 = null;
                }
                this.L$0 = objectRef;
                this.L$1 = booleanRef;
                this.I$0 = 1;
                this.label = 2;
                c329671 = this;
                Object objM70187a = c30323d.m70187a(c29070x, str2, identitySideM69768a, str4, inputStream, c329671);
                if (objM70187a != coroutine_suspended) {
                    objectRef2 = objectRef;
                    value = objM70187a;
                    i11 = 1;
                    booleanRef2 = booleanRef;
                    booleanRef2.element = Result.m103851isSuccessimpl(value);
                    if (Result.m103850isFailureimpl(value)) {
                        objectRef2.element = (Exception) Result.m103847exceptionOrNullimpl(value);
                        C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "failed uploading image", (Exception) Result.m103847exceptionOrNullimpl(value));
                    }
                    if (Result.m103850isFailureimpl(value)) {
                        value = null;
                    }
                    c29307y0 = (C29307Y0) value;
                    if (c29307y0 != null) {
                        SNSVideoIdentViewModel sNSVideoIdentViewModel5 = SNSVideoIdentViewModel.this;
                        AbstractC32895a.m71366a("uploaded imageId=" + str5);
                        sNSVideoIdentViewModel5.videoChatAdapter.sendMessage(new C29199C1(new C29194B1(str5)));
                    }
                    booleanRef = booleanRef2;
                    objectRef = objectRef2;
                }
                return coroutine_suspended;
            }
            c329671 = this;
            AbstractC32895a.m71366a("onPhotoMade: failed to get image content stream!");
            i11 = 0;
            if (!booleanRef.element) {
                SNSVideoIdentViewModel.this.resetFieldAfterMakingPhoto();
                SNSVideoIdentViewModel sNSVideoIdentViewModel6 = SNSVideoIdentViewModel.this;
                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel6, false, new AnonymousClass3(booleanRef, sNSVideoIdentViewModel6, null), 1, null);
                if (booleanRef.element) {
                    SNSVideoIdentViewModel.this.scheduleWaitForStatusUpdate();
                } else {
                    SNSVideoIdentViewModel.this.videoChatAdapter.sendMessage(new C29663w1());
                }
            } else {
                SNSVideoIdentViewModel.this.resetFieldAfterMakingPhoto();
                SNSVideoIdentViewModel sNSVideoIdentViewModel7 = SNSVideoIdentViewModel.this;
                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel7, false, new AnonymousClass3(booleanRef, sNSVideoIdentViewModel7, null), 1, null);
                if (booleanRef.element) {
                    SNSVideoIdentViewModel.this.scheduleWaitForStatusUpdate();
                } else {
                    SNSVideoIdentViewModel.this.videoChatAdapter.sendMessage(new C29663w1());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {351}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329682 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329682) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329682(Continuation<? super C329682> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329682(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objPreviewState = sNSVideoIdentViewModel.previewState(false, this);
            if (objPreviewState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objPreviewState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$4 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$4", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329694 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        public C329694(Continuation<? super C329694> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329694) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329694(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return SNSViewState.EnterPhone.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$5 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$5", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {362}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329705 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C329705(Continuation<? super C329705> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329705(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329705) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                if (sNSVideoIdentViewModel.requestAvailableLanguages(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$6 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onPrepare$6", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329716 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        public C329716(Continuation<? super C329716> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329716) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329716(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return SNSViewState.Permissions.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadCancel$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadCancel$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1127}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329721 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329721) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329721(Continuation<? super C329721> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329721(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objVideoCallState = sNSVideoIdentViewModel.videoCallState(this);
            if (objVideoCallState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objVideoCallState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1157}, m90125m = "onUploadFileForDocSetType", m90126n = {}, m90127s = {})
    public static final class C329731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C329731(Continuation<? super C329731> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.onUploadFileForDocSetType(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1154}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329742 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329742) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329742(Continuation<? super C329742> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329742(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
            this.label = 1;
            Object objUploadingPhotoState = sNSVideoIdentViewModel.uploadingPhotoState(this);
            if (objUploadingPhotoState == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUploadingPhotoState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$3 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$3", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1186}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329753 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ Exception $exception;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329753) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329753(Exception exc, Continuation<? super C329753> continuation) {
            super(2, continuation);
            this.$exception = exc;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329753(this.$exception, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.label = 1;
                obj = sNSVideoIdentViewModel.uploadFailedState(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return SNSVideoIdentViewModelKt.withWarningMessage((SNSViewState.StateWithVideo) obj, SNSVideoIdentViewModel.this.getStrings(), this.$exception);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$4 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$4", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1196, 1198}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329764 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ Object $result;
        int label;
        final /* synthetic */ SNSVideoIdentViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329764) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329764(Object obj, SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super C329764> continuation) {
            super(2, continuation);
            this.$result = obj;
            this.this$0 = sNSVideoIdentViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329764(this.$result, this.this$0, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return (SNSViewState) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (SNSViewState) obj;
            }
            ResultKt.throwOnFailure(obj);
            if (Result.m103851isSuccessimpl(this.$result)) {
                this.this$0.scheduleWaitForStatusUpdate();
                SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                this.label = 1;
                obj = sNSVideoIdentViewModel.uploadingPhotoState(this);
            } else {
                SNSVideoIdentViewModel sNSVideoIdentViewModel2 = this.this$0;
                this.label = 2;
                obj = sNSVideoIdentViewModel2.videoCallState(this);
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onWaitForStatusUpdateTimeout$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onWaitForStatusUpdateTimeout$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1298}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329771 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onWaitForStatusUpdateTimeout$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onWaitForStatusUpdateTimeout$1$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1299}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
            int label;
            final /* synthetic */ SNSVideoIdentViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
                return ((AnonymousClass1) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SNSVideoIdentViewModel sNSVideoIdentViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoIdentViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
                this.label = 1;
                Object objVideoCallState = sNSVideoIdentViewModel.videoCallState(this);
                if (objVideoCallState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objVideoCallState;
            }
        }

        public C329771(Continuation<? super C329771> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329771(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329771) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC28147s interfaceC28147s;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC28147s = (InterfaceC28147s) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC28147s interfaceC28147sCurrentState = SNSVideoIdentViewModel.this.currentState();
                SNSVideoIdentViewModel sNSVideoIdentViewModel = SNSVideoIdentViewModel.this;
                this.L$0 = interfaceC28147sCurrentState;
                this.label = 1;
                Object objUploadingPhotoState = sNSVideoIdentViewModel.uploadingPhotoState(this);
                if (objUploadingPhotoState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC28147s = interfaceC28147sCurrentState;
                obj = objUploadingPhotoState;
            }
            if (Intrinsics.areEqual(interfaceC28147s, obj)) {
                SNSVideoIdentViewModel sNSVideoIdentViewModel2 = SNSVideoIdentViewModel.this;
                AbstractC28073M0.updateState$default(sNSVideoIdentViewModel2, false, new AnonymousClass1(sNSVideoIdentViewModel2, null), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$previewState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {0, 1, 2, 3, 4, 5}, m90124l = {270, 271, 272, 275, 276, 278}, m90125m = "previewState", m90126n = {"startCallEnabled", "startCallEnabled", "startCallEnabled", "startCallEnabled", "startCallEnabled", "startCallEnabled"}, m90127s = {"Z$0", "Z$0", "Z$0", "Z$0", "Z$0", "Z$0"})
    public static final class C329781 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C329781(Continuation<? super C329781> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.previewState(false, this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$previewStateLoading$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {259}, m90125m = "previewStateLoading", m90126n = {}, m90127s = {})
    public static final class C329791 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C329791(Continuation<? super C329791> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.previewStateLoading(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$readyForPhoto$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {156, BuiltinOperator.UNSORTED_SEGMENT_MIN, 158}, m90125m = "readyForPhoto", m90126n = {}, m90127s = {})
    public static final class C329801 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C329801(Continuation<? super C329801> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.readyForPhoto(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {448}, m90125m = "requestAvailableLanguages", m90126n = {}, m90127s = {})
    public static final class C329811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C329811(Continuation<? super C329811> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.requestAvailableLanguages(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$2", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329822 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        public C329822(Continuation<? super C329822> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329822) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329822(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return SNSViewState.Loading.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$3 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$3", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329833 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        int label;

        public C329833(Continuation<? super C329833> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329833) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329833(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return SNSViewState.Permissions.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$4 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$4", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329844 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ List<C29325b0> $languages;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329844) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329844(List<C29325b0> list, Continuation<? super C329844> continuation) {
            super(2, continuation);
            this.$languages = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329844(this.$languages, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return new SNSViewState.LanguageSelection(SNSVideoIdentViewModel.this.getSpeakingLanguage(), this.$languages, "VIDEO_IDENT");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$scheduleDisconnectTimeout$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$scheduleDisconnectTimeout$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {812}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329851 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C329851(Continuation<? super C329851> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329851(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329851) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                long operatorDisconnectTimeout = SNSVideoIdentViewModel.this.getOperatorDisconnectTimeout();
                this.label = 1;
                if (DelayKt.m90350b(operatorDisconnectTimeout, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SNSVideoIdentViewModel.this.onOperatorDisconnectTimeout();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$scheduleWaitForStatusUpdate$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$scheduleWaitForStatusUpdate$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1288}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329861 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C329861(Continuation<? super C329861> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329861(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329861) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                long j11 = SNSVideoIdentViewModel.this.waitForStatusUpdateTimeout;
                this.label = 1;
                if (DelayKt.m90350b(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SNSVideoIdentViewModel.this.onWaitForStatusUpdateTimeout();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$startCallErrorState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {246, 250}, m90125m = "startCallErrorState", m90126n = {}, m90127s = {})
    public static final class C329871 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C329871(Continuation<? super C329871> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.startCallErrorState(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$switchToReconnectingViewState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$switchToReconnectingViewState$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSNSVideoIdentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoIdentViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel$switchToReconnectingViewState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1441:1\n1#2:1442\n*E\n"})
    public static final class C329881 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
        final /* synthetic */ SNSViewState.StateWithVideo $currentState;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
            return ((C329881) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329881(SNSViewState.StateWithVideo stateWithVideo, Continuation<? super C329881> continuation) {
            super(2, continuation);
            this.$currentState = stateWithVideo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoIdentViewModel.this.new C329881(this.$currentState, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RemoteVideoState remoteVideoState = new RemoteVideoState(false, SNSVideoIdentViewModel.this.getRemoteVideoAspectRatioScale(), SNSVideoIdentViewModel.this.getOperatorName(), true);
            if (this.$currentState.getRemoteVideoState() == null) {
                remoteVideoState = null;
            }
            RemoteVideoState remoteVideoState2 = remoteVideoState;
            SNSViewState.VideoStepState videoStepState = SNSViewState.VideoStepState.RECONNECTING;
            SNSViewState.StateWithVideo stateWithVideo = this.$currentState;
            return SNSViewState.StateWithVideo.copy$default(stateWithVideo, videoStepState, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, remoteVideoState2, null, null, null, stateWithVideo, null, null, null, 15663102, null);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$uploadFailedState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {4}, m90124l = {202, 203, 204, 206, 208}, m90125m = "uploadFailedState", m90126n = {"it"}, m90127s = {"L$1"})
    public static final class C329891 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C329891(Continuation<? super C329891> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.uploadFailedState(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$uploadPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {193, TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS, 197}, m90125m = "uploadPreview", m90126n = {}, m90127s = {})
    public static final class C329901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C329901(Continuation<? super C329901> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.uploadPreview(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$uploadingPhotoState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {BuiltinOperator.RANDOM_UNIFORM, 151, 152}, m90125m = "uploadingPhotoState", m90126n = {}, m90127s = {})
    public static final class C329911 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C329911(Continuation<? super C329911> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.uploadingPhotoState(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$videoCallState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {0}, m90124l = {176, 186, TsExtractor.TS_PACKET_SIZE}, m90125m = "videoCallState", m90126n = {"chatState"}, m90127s = {"L$0"})
    public static final class C329921 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C329921(Continuation<? super C329921> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.videoCallState(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$waitingForOperatorState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {237, 238, 240}, m90125m = "waitingForOperatorState", m90126n = {}, m90127s = {})
    public static final class C329931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C329931(Continuation<? super C329931> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SNSVideoIdentViewModel.this.waitingForOperatorState(this);
        }
    }

    public SNSVideoIdentViewModel(@NotNull List<Document> list, @NotNull AbstractC46162a abstractC46162a, @NotNull InterfaceC29953a interfaceC29953a, @NotNull InterfaceC29984m interfaceC29984m, @NotNull InterfaceC30035a interfaceC30035a, @NotNull SavedStateHandle savedStateHandle, @NotNull C30327h c30327h, @NotNull C30329j c30329j, @NotNull C30325f c30325f, @NotNull C30323d c30323d, @NotNull C30321b c30321b, @NotNull C30090Y c30090y, @NotNull SNSVideoChatAdapter sNSVideoChatAdapter, @NotNull InterfaceC28439b1 interfaceC28439b1, @NotNull InterfaceC29921d interfaceC29921d) {
        super(interfaceC29953a, interfaceC29984m);
        this.initialDocs = list;
        this.json = abstractC46162a;
        this.dataRepository = interfaceC29984m;
        this.webSocketRepository = interfaceC30035a;
        this.applyUseCase = c30327h;
        this.confirmUseCase = c30329j;
        this.uploadFileUseCase = c30325f;
        this.uploadFileFromStreamUseCase = c30323d;
        this.languagesUseCase = c30321b;
        this.setLanguageUseCase = c30090y;
        this.videoChatAdapter = sNSVideoChatAdapter;
        this.uriContentLoader = interfaceC28439b1;
        this.applicantRepository = interfaceC29921d;
        this.videoIdentScope = C41713n0.m91125a(C41782z0.m91393c().plus(C41727q2.m91192b(null, 1, null)));
        Boolean bool = Boolean.FALSE;
        this.isChatRunning = new C28936t(savedStateHandle, KEY_IS_CHAT_RUNNING, bool, false);
        this.updatedDocuments = new C28936t(savedStateHandle, "documents", CollectionsKt.emptyList(), false);
        this.selectedDocSetType = new C28936t(savedStateHandle, "selectedDocSetType", null, false);
        this.requestedDocumentPayload = new C28936t(savedStateHandle, "selectedDocumentPayload", null, false);
        this.operatorName = new C28936t(savedStateHandle, "operatorName", null, false);
        this.speakingLanguage = new C28936t(savedStateHandle, "speakingLanguage", null, false);
        this.operatorCompletedCall = new C28936t(savedStateHandle, "operatorCompletedCall", bool, false);
        this.waitForStatusUpdateTimeout = TimeUnit.SECONDS.toMillis(1L);
        this.waitTimeSec = TimeUnit.MINUTES.toSeconds(2L);
        AbstractC32895a.m71366a(" created view model, " + this);
        AbstractC28421U.m69306b(((C29967J) interfaceC29984m).f60201i, ViewModelKt.getViewModelScope(this), new C329341(null));
        C30050p c30050p = (C30050p) interfaceC30035a;
        AbstractC28421U.m69306b(C41636g.m90895S(C41636g.m90898V((InterfaceC41673r) c30050p.f60381k.getValue(), new C30043i(c30050p, "SNSVideoIdentViewModel", null)), new C30044j(c30050p, "SNSVideoIdentViewModel", null)), ViewModelKt.getViewModelScope(this), new C329352(null));
        this.operatorDisconnectTimeout = DEFAULT_OPERATOR_DISCONNECT_TIMEOUT;
        this.permissionsController = new C28651g(savedStateHandle);
        this.skipNotificationPermission = new C28936t(savedStateHandle, "skipNotificationPermission", Boolean.valueOf(C33048a.f67472e.m71434a()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close(boolean isCompleted) {
        showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329361(isCompleted, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetFieldAfterMakingPhoto() {
        this.showPhotoFrame = false;
        setRequestedDocumentPayload(null);
        releaseUploadedBitmap();
        this.uploadedFile = null;
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonAction.START_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PhoneVerificationStatus.values().length];
            try {
                iArr2[PhoneVerificationStatus.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PhoneVerificationStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PhoneVerificationStatus.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PhoneVerificationStatus.RETRY_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final void cancelDisconnectTimeoutJob() {
        InterfaceC41775x1 interfaceC41775x1 = this.disconnectTimeoutJob;
        if (interfaceC41775x1 != null) {
            AbstractC32895a.m71366a("cancelDisconnectTimeoutJob");
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            this.disconnectTimeoutJob = null;
        }
    }

    private final void cancelUploadJob() {
        InterfaceC41775x1 interfaceC41775x1 = this.uploadPhotoJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            this.uploadPhotoJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelWaitForStatusUpdateJob() {
        InterfaceC41775x1 interfaceC41775x1 = this.waitForStatusUpdateJob;
        if (interfaceC41775x1 != null) {
            AbstractC32895a.m71366a("cancelWaitForUpdateStatusJob");
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            this.waitForStatusUpdateJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object connectionLostCallAgainState(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329371 c329371;
        SNSViewState.StateWithVideo.Companion companion;
        CharSequence charSequence;
        SNSViewState.StateWithVideo.Companion companion2;
        CharSequence charSequence2;
        Object string;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        ButtonAction buttonAction;
        Object objExitConfirmationDialog;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        SNSViewState.StateWithVideo.Companion companion3;
        ButtonAction buttonAction2;
        if (continuation instanceof C329371) {
            c329371 = (C329371) continuation;
            int i11 = c329371.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329371.label = i11 - Integer.MIN_VALUE;
            } else {
                c329371 = new C329371(continuation);
            }
        } else {
            c329371 = new C329371(continuation);
        }
        Object obj = c329371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329371.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            SNSViewState.StateWithVideo.Companion companion4 = SNSViewState.StateWithVideo.INSTANCE;
            c329371.L$0 = companion4;
            c329371.label = 1;
            Object string2 = getString(STRING_CONNECTION_LOST, c329371);
            if (string2 != coroutine_suspended) {
                companion = companion4;
                obj = string2;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            companion = (SNSViewState.StateWithVideo.Companion) c329371.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 == 2) {
                charSequence = (CharSequence) c329371.L$1;
                companion2 = (SNSViewState.StateWithVideo.Companion) c329371.L$0;
                ResultKt.throwOnFailure(obj);
                charSequence2 = (CharSequence) obj;
                c329371.L$0 = companion2;
                c329371.L$1 = charSequence;
                c329371.L$2 = charSequence2;
                c329371.label = 3;
                string = getString("sns_videoident_action_callAgain", c329371);
                if (string != coroutine_suspended) {
                    CharSequence charSequence9 = charSequence;
                    charSequence3 = charSequence2;
                    obj = string;
                    charSequence4 = charSequence9;
                    charSequence5 = (CharSequence) obj;
                    buttonAction = ButtonAction.START_CALL;
                    c329371.L$0 = companion2;
                    c329371.L$1 = charSequence4;
                    c329371.L$2 = charSequence3;
                    c329371.L$3 = charSequence5;
                    c329371.L$4 = buttonAction;
                    c329371.label = 4;
                    objExitConfirmationDialog = exitConfirmationDialog(c329371);
                    if (objExitConfirmationDialog != coroutine_suspended) {
                        charSequence6 = charSequence3;
                        charSequence7 = charSequence4;
                        charSequence8 = charSequence5;
                        obj = objExitConfirmationDialog;
                        companion3 = companion2;
                        buttonAction2 = buttonAction;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                charSequence3 = (CharSequence) c329371.L$2;
                charSequence4 = (CharSequence) c329371.L$1;
                companion2 = (SNSViewState.StateWithVideo.Companion) c329371.L$0;
                ResultKt.throwOnFailure(obj);
                charSequence5 = (CharSequence) obj;
                buttonAction = ButtonAction.START_CALL;
                c329371.L$0 = companion2;
                c329371.L$1 = charSequence4;
                c329371.L$2 = charSequence3;
                c329371.L$3 = charSequence5;
                c329371.L$4 = buttonAction;
                c329371.label = 4;
                objExitConfirmationDialog = exitConfirmationDialog(c329371);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    charSequence6 = charSequence3;
                    charSequence7 = charSequence4;
                    charSequence8 = charSequence5;
                    obj = objExitConfirmationDialog;
                    companion3 = companion2;
                    buttonAction2 = buttonAction;
                }
                return coroutine_suspended;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ButtonAction buttonAction3 = (ButtonAction) c329371.L$4;
            CharSequence charSequence10 = (CharSequence) c329371.L$3;
            charSequence6 = (CharSequence) c329371.L$2;
            CharSequence charSequence11 = (CharSequence) c329371.L$1;
            companion3 = (SNSViewState.StateWithVideo.Companion) c329371.L$0;
            ResultKt.throwOnFailure(obj);
            charSequence8 = charSequence10;
            charSequence7 = charSequence11;
            buttonAction2 = buttonAction3;
        }
        SNSViewState.StateWithVideo stateWithVideoErrorWithButton$default = SNSViewState.StateWithVideo.Companion.errorWithButton$default(companion3, null, charSequence7, charSequence6, charSequence8, buttonAction2, (SNSViewState.ConfirmExitDialog) obj, 1, null);
        stateWithVideoErrorWithButton$default.setAnalyticsState(AnalyticsCallState.CONNECTION_LOST);
        return stateWithVideoErrorWithButton$default;
        CharSequence charSequence12 = (CharSequence) obj;
        c329371.L$0 = companion;
        c329371.L$1 = charSequence12;
        c329371.label = 2;
        Object string3 = getString("sns_videoident_error_connectionLostFatal", c329371);
        if (string3 != coroutine_suspended) {
            SNSViewState.StateWithVideo.Companion companion5 = companion;
            charSequence = charSequence12;
            obj = string3;
            companion2 = companion5;
            charSequence2 = (CharSequence) obj;
            c329371.L$0 = companion2;
            c329371.L$1 = charSequence;
            c329371.L$2 = charSequence2;
            c329371.label = 3;
            string = getString("sns_videoident_action_callAgain", c329371);
            if (string != coroutine_suspended) {
                CharSequence charSequence13 = charSequence;
                charSequence3 = charSequence2;
                obj = string;
                charSequence4 = charSequence13;
                charSequence5 = (CharSequence) obj;
                buttonAction = ButtonAction.START_CALL;
                c329371.L$0 = companion2;
                c329371.L$1 = charSequence4;
                c329371.L$2 = charSequence3;
                c329371.L$3 = charSequence5;
                c329371.L$4 = buttonAction;
                c329371.label = 4;
                objExitConfirmationDialog = exitConfirmationDialog(c329371);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    charSequence6 = charSequence3;
                    charSequence7 = charSequence4;
                    charSequence8 = charSequence5;
                    obj = objExitConfirmationDialog;
                    companion3 = companion2;
                    buttonAction2 = buttonAction;
                    SNSViewState.StateWithVideo stateWithVideoErrorWithButton$default2 = SNSViewState.StateWithVideo.Companion.errorWithButton$default(companion3, null, charSequence7, charSequence6, charSequence8, buttonAction2, (SNSViewState.ConfirmExitDialog) obj, 1, null);
                    stateWithVideoErrorWithButton$default2.setAnalyticsState(AnalyticsCallState.CONNECTION_LOST);
                    return stateWithVideoErrorWithButton$default2;
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object connectionLostState(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329381 c329381;
        SNSViewState.StateWithVideo.Companion companion;
        float remoteVideoAspectRatioScale;
        int i11;
        SNSViewState.StateWithVideo.Companion companion2;
        RemoteVideoState remoteVideoState;
        String str;
        List<SNSStepViewItem> listCreateDocumentItems;
        Object objExitConfirmationDialog;
        String str2;
        SNSViewState.StateWithVideo.Companion companion3;
        List<SNSStepViewItem> list;
        if (continuation instanceof C329381) {
            c329381 = (C329381) continuation;
            int i12 = c329381.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c329381.label = i12 - Integer.MIN_VALUE;
            } else {
                c329381 = new C329381(continuation);
            }
        } else {
            c329381 = new C329381(continuation);
        }
        Object string = c329381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c329381.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(string);
            companion = SNSViewState.StateWithVideo.INSTANCE;
            remoteVideoAspectRatioScale = getRemoteVideoAspectRatioScale();
            c329381.L$0 = companion;
            c329381.I$0 = 0;
            c329381.F$0 = remoteVideoAspectRatioScale;
            c329381.label = 1;
            string = getString(STRING_CONNECTION_LOST, c329381);
            if (string != coroutine_suspended) {
                i11 = 0;
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            remoteVideoAspectRatioScale = c329381.F$0;
            i11 = c329381.I$0;
            companion = (SNSViewState.StateWithVideo.Companion) c329381.L$0;
            ResultKt.throwOnFailure(string);
        } else {
            if (i13 == 2) {
                RemoteVideoState remoteVideoState2 = (RemoteVideoState) c329381.L$1;
                SNSViewState.StateWithVideo.Companion companion4 = (SNSViewState.StateWithVideo.Companion) c329381.L$0;
                ResultKt.throwOnFailure(string);
                remoteVideoState = remoteVideoState2;
                companion2 = companion4;
                str = (String) string;
                listCreateDocumentItems = createDocumentItems();
                c329381.L$0 = companion2;
                c329381.L$1 = remoteVideoState;
                c329381.L$2 = str;
                c329381.L$3 = listCreateDocumentItems;
                c329381.label = 3;
                objExitConfirmationDialog = exitConfirmationDialog(c329381);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    SNSViewState.StateWithVideo.Companion companion5 = companion2;
                    str2 = str;
                    string = objExitConfirmationDialog;
                    companion3 = companion5;
                    list = listCreateDocumentItems;
                }
                return coroutine_suspended;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c329381.L$3;
            str2 = (String) c329381.L$2;
            remoteVideoState = (RemoteVideoState) c329381.L$1;
            companion3 = (SNSViewState.StateWithVideo.Companion) c329381.L$0;
            ResultKt.throwOnFailure(string);
        }
        return companion3.videoCall(str2, remoteVideoState, list, (SNSViewState.ConfirmExitDialog) string);
        float f11 = remoteVideoAspectRatioScale;
        companion2 = companion;
        RemoteVideoState remoteVideoState3 = new RemoteVideoState(i11 != 0, f11, (CharSequence) string, false, 8, null);
        c329381.L$0 = companion2;
        c329381.L$1 = remoteVideoState3;
        c329381.label = 2;
        string = getString(STRING_FOLLOW_INSTRUCTIONS_TEXT, c329381);
        if (string != coroutine_suspended) {
            remoteVideoState = remoteVideoState3;
            str = (String) string;
            listCreateDocumentItems = createDocumentItems();
            c329381.L$0 = companion2;
            c329381.L$1 = remoteVideoState;
            c329381.L$2 = str;
            c329381.L$3 = listCreateDocumentItems;
            c329381.label = 3;
            objExitConfirmationDialog = exitConfirmationDialog(c329381);
            if (objExitConfirmationDialog != coroutine_suspended) {
                SNSViewState.StateWithVideo.Companion companion6 = companion2;
                str2 = str;
                string = objExitConfirmationDialog;
                companion3 = companion6;
                list = listCreateDocumentItems;
                return companion3.videoCall(str2, remoteVideoState, list, (SNSViewState.ConfirmExitDialog) string);
            }
        }
        return coroutine_suspended;
    }

    private final void doStartCall() {
        AbstractC28073M0.updateState$default(this, false, new C329391(null), 1, null);
        C41696j.m91104d(this.videoIdentScope, null, null, new C329402(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r9 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object exitConfirmationDialog(Continuation<? super SNSViewState.ConfirmExitDialog> continuation) {
        C329411 c329411;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object string;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (continuation instanceof C329411) {
            c329411 = (C329411) continuation;
            int i11 = c329411.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329411.label = i11 - Integer.MIN_VALUE;
            } else {
                c329411 = new C329411(continuation);
            }
        } else {
            c329411 = new C329411(continuation);
        }
        Object string2 = c329411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329411.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string2);
            if (C33048a.f67441D.m71434a()) {
                c329411.label = 1;
                string2 = getString("sns_alert_aboutToExitVerification", c329411);
            } else {
                c329411.label = 2;
                string2 = getString("sns_videoident_alert_aboutToExit", c329411);
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(string2);
            str = (String) string2;
        } else if (i12 == 2) {
            ResultKt.throwOnFailure(string2);
            str = (String) string2;
        } else {
            if (i12 == 3) {
                charSequence = (CharSequence) c329411.L$0;
                ResultKt.throwOnFailure(string2);
                charSequence2 = (CharSequence) string2;
                c329411.L$0 = charSequence;
                c329411.L$1 = charSequence2;
                c329411.label = 4;
                string = getString("sns_alert_action_cancel", c329411);
                if (string != coroutine_suspended) {
                    charSequence3 = charSequence2;
                    string2 = string;
                    charSequence4 = charSequence;
                }
                return coroutine_suspended;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charSequence3 = (CharSequence) c329411.L$1;
            charSequence4 = (CharSequence) c329411.L$0;
            ResultKt.throwOnFailure(string2);
        }
        return new SNSViewState.ConfirmExitDialog(charSequence4, charSequence3, (CharSequence) string2);
        c329411.L$0 = str;
        c329411.label = 3;
        Object string3 = getString("sns_alert_action_confirm", c329411);
        if (string3 != coroutine_suspended) {
            charSequence = str;
            string2 = string3;
            charSequence2 = (CharSequence) string2;
            c329411.L$0 = charSequence;
            c329411.L$1 = charSequence2;
            c329411.label = 4;
            string = getString("sns_alert_action_cancel", c329411);
            if (string != coroutine_suspended) {
                charSequence3 = charSequence2;
                string2 = string;
                charSequence4 = charSequence;
                return new SNSViewState.ConfirmExitDialog(charSequence4, charSequence3, (CharSequence) string2);
            }
        }
        return coroutine_suspended;
    }

    private final boolean getOperatorCompletedCall() {
        C28936t c28936t = this.operatorCompletedCall;
        KProperty<Object> kProperty = $$delegatedProperties[6];
        return ((Boolean) c28936t.m69705a()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getOperatorName() {
        C28936t c28936t = this.operatorName;
        KProperty<Object> kProperty = $$delegatedProperties[4];
        return (String) c28936t.m69705a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C29424n3 getRequestedDocumentPayload() {
        C28936t c28936t = this.requestedDocumentPayload;
        KProperty<Object> kProperty = $$delegatedProperties[3];
        return (C29424n3) c28936t.m69705a();
    }

    private final String getSelectedDocSetType() {
        C28936t c28936t = this.selectedDocSetType;
        KProperty<Object> kProperty = $$delegatedProperties[2];
        return (String) c28936t.m69705a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSpeakingLanguage() {
        C28936t c28936t = this.speakingLanguage;
        KProperty<Object> kProperty = $$delegatedProperties[5];
        return (String) c28936t.m69705a();
    }

    private final List<Document> getUpdatedDocuments() {
        C28936t c28936t = this.updatedDocuments;
        KProperty<Object> kProperty = $$delegatedProperties[1];
        return (List) c28936t.m69705a();
    }

    private final void handleCancelScreenshot() {
        if (this.uploadPhotoJob != null) {
            AbstractC32895a.m71366a("handleCancelScreenshot: skipping. Upload is in progress");
        } else {
            resetFieldAfterMakingPhoto();
            AbstractC28073M0.updateState$default(this, false, new C329421(null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDataUpdated(C29980i data) {
        if (this.waitForStatusUpdateJob != null) {
            handleDocStatusUpdated(data);
        }
    }

    private final void handleDocStatusUpdated(C29980i data) {
        AbstractC32895a.m71366a("handleDocStatusUpdated");
        AbstractC29172p abstractC29172p = (AbstractC29172p) data.f60239a.m70051c();
        if (abstractC29172p == null) {
            C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, " handleDocStatusUpdated getting applicant error", data.f60239a.mo70049a());
        } else {
            setUpdatedDocuments(AbstractC28458h.m69335a(abstractC29172p.mo69761l().f59118b, abstractC29172p));
            AbstractC32895a.m71366a("handleDocStatusUpdated. Docs updated");
        }
    }

    private final void handleMakeScreenshot(C29284T2 message) {
        if (this.uploadPhotoJob != null) {
            AbstractC32895a.m71366a("handleMakeScreenshot: skipping. Upload is in progress");
            return;
        }
        releaseUploadedBitmap();
        this.uploadedFile = null;
        updateSelectedDocumentInfoWithPayload(message.f59298c);
        this.videoChatAdapter.makePhoto();
    }

    private final void handleModeratorName(C29314Z2 message) {
        RemoteVideoState remoteVideoState;
        setOperatorName(message.f59328c.f59323a);
        SNSViewState sNSViewState = (SNSViewState) currentState();
        if ((sNSViewState instanceof SNSViewState.StateWithVideo) && (remoteVideoState = ((SNSViewState.StateWithVideo) sNSViewState).getRemoteVideoState()) != null && remoteVideoState.getShowVideoView()) {
            AbstractC28073M0.updateState$default(this, false, new C329481(sNSViewState, this, null), 1, null);
        }
    }

    private final void handleReadyForScreenshot(C29336c3 message) {
        String str;
        if (this.uploadPhotoJob != null) {
            AbstractC32895a.m71366a("handleReadyForScreenshot: skipping. Upload is in progress");
            return;
        }
        updateSelectedDocumentInfoWithPayload(message.f59353c);
        PhotoStepStateHelper photoStepStateHelper = PhotoStepStateHelper.INSTANCE;
        C29983l strings = getStrings();
        C29424n3 requestedDocumentPayload = getRequestedDocumentPayload();
        if (requestedDocumentPayload == null || (str = requestedDocumentPayload.f59424d) == null) {
            str = "";
        }
        C29115f2 c29115f2 = IdentitySide.Companion;
        C29424n3 requestedDocumentPayload2 = getRequestedDocumentPayload();
        String str2 = requestedDocumentPayload2 != null ? requestedDocumentPayload2.f59422b : null;
        c29115f2.getClass();
        IdentitySide identitySideM69768a = C29115f2.m69768a(str2);
        if (identitySideM69768a == null) {
            identitySideM69768a = IdentitySide.Front;
        }
        C29424n3 requestedDocumentPayload3 = getRequestedDocumentPayload();
        PhotoStepStateHelper.State stateCreateState = photoStepStateHelper.createState(strings, str, identitySideM69768a, requestedDocumentPayload3 != null ? requestedDocumentPayload3.f59421a : null);
        String value = SNSMessage$ServerMessage$ScreenShotPayload$Variant.UPLOAD.getValue();
        C29424n3 requestedDocumentPayload4 = getRequestedDocumentPayload();
        if (Intrinsics.areEqual(value, requestedDocumentPayload4 != null ? requestedDocumentPayload4.f59425e : null)) {
            AbstractC28073M0.updateState$default(this, false, new C329501(stateCreateState, null), 1, null);
        } else {
            AbstractC28073M0.updateState$default(this, false, new C329512(stateCreateState, null), 1, null);
        }
    }

    private final void handleRetryUpload() {
        C29424n3 requestedDocumentPayload;
        String str;
        Bitmap bitmap = this.uploadedBitmap;
        if (bitmap != null) {
            onPhotoMade(bitmap);
            return;
        }
        File file = this.uploadedFile;
        if (file == null || (requestedDocumentPayload = getRequestedDocumentPayload()) == null || (str = requestedDocumentPayload.f59424d) == null) {
            onUploadCancel();
            return;
        }
        cancelUploadJob();
        InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(this.videoIdentScope, null, null, new SNSVideoIdentViewModel$handleRetryUpload$2$1$1(this, str, file, null), 3, null);
        this.uploadPhotoJob = interfaceC41775x1M91104d;
        interfaceC41775x1M91104d.mo90426j(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSVideoIdentViewModel.handleRetryUpload$lambda$13$lambda$12$lambda$11(this.f67416b, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRoomCreatedResult(C29468E0 response) {
        C29480I0 c29480i0;
        String str;
        String str2 = response.f59462a;
        if (str2 == null || (c29480i0 = response.f59463b) == null || (str = c29480i0.f59487a) == null) {
            return;
        }
        this.videoChatAdapter.connectToRoom(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.sumsub.sns.core.presentation.base.s] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState$StateWithVideo] */
    private final void handleStepChange(C29637s3 payload) {
        setSelectedDocSetType(payload != null ? payload.f59695a : null);
        if (getSelectedDocSetType() == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? CurrentState = currentState();
        objectRef.element = CurrentState;
        if ((CurrentState instanceof SNSViewState.StateWithVideo) && !((SNSViewState.StateWithVideo) CurrentState).getDocuments().isEmpty()) {
            ?? Copy$default = SNSViewState.StateWithVideo.copy$default((SNSViewState.StateWithVideo) objectRef.element, null, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 16777215, null);
            objectRef.element = Copy$default;
            Copy$default.setDocuments(createDocumentItems());
            AbstractC28073M0.updateState$default(this, false, new C329531(objectRef, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleUpdateDocsStatus(Continuation<? super Unit> continuation) {
        AbstractC32895a.m71366a("handleUpdateDocsStatus");
        if (this.uploadPhotoJob != null) {
            AbstractC32895a.m71366a("handleUpdateDocsStatus: skipping. Upload is in progress");
            return Unit.INSTANCE;
        }
        AbstractC28073M0.updateState$default(this, false, new C329542(null), 1, null);
        scheduleWaitForStatusUpdate();
        AbstractC32895a.m71366a("handleUpdateDocsStatus: requesting doc status update");
        Object objM70042a = ((C29967J) this.dataRepository).m70042a(true, (Continuation) continuation);
        return objM70042a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70042a : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isChatRunning() {
        C28936t c28936t = this.isChatRunning;
        KProperty<Object> kProperty = $$delegatedProperties[0];
        return ((Boolean) c28936t.m69705a()).booleanValue();
    }

    private final boolean isNetworkError(AbstractC29149l0 abstractC29149l0) {
        return (abstractC29149l0 instanceof C29131i0) && (((C29131i0) abstractC29149l0).f59094b instanceof SNSViewState.LanguageSelection);
    }

    private final InterfaceC41775x1 onConnectedToRoom() {
        return C41696j.m91104d(this.videoIdentScope, null, null, new C329631(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectingFileError() {
        AbstractC32895a.m71366a(" onSelectingFileError!");
        resetFieldAfterMakingPhoto();
        this.videoChatAdapter.sendMessage(new C29663w1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object onUploadFileForDocSetType(String str, File file, Continuation<? super Unit> continuation) {
        C329731 c329731;
        Object objM70188a;
        if (continuation instanceof C329731) {
            c329731 = (C329731) continuation;
            int i11 = c329731.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329731.label = i11 - Integer.MIN_VALUE;
            } else {
                c329731 = new C329731(continuation);
            }
        } else {
            c329731 = new C329731(continuation);
        }
        C329731 c329732 = c329731;
        Object obj = c329732.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329732.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC32895a.m71366a("onUploadFileForDocSetType: " + str + ", file: " + file.getAbsolutePath() + ", documentPayload: " + getRequestedDocumentPayload());
            C29424n3 requestedDocumentPayload = getRequestedDocumentPayload();
            if (requestedDocumentPayload == null) {
                return Unit.INSTANCE;
            }
            AbstractC28073M0.updateState$default(this, false, new C329742(null), 1, null);
            this.uploadedFile = file;
            C30325f c30325f = this.uploadFileUseCase;
            String str2 = requestedDocumentPayload.f59424d;
            if (str2 == null) {
                str2 = "TYPE_UNKNOWN";
            }
            C29070X c29070x = new C29070X(str2);
            String str3 = requestedDocumentPayload.f59421a;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3;
            C29115f2 c29115f2 = IdentitySide.Companion;
            String str5 = requestedDocumentPayload.f59422b;
            c29115f2.getClass();
            IdentitySide identitySideM69768a = C29115f2.m69768a(str5);
            String str6 = requestedDocumentPayload.f59423c;
            c329732.label = 1;
            objM70188a = c30325f.m70188a(c29070x, str4, identitySideM69768a, str6, file, c329732);
            if (objM70188a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM70188a = ((Result) obj).getValue();
        }
        AbstractC32895a.m71366a("onUploadFileForDocSetType: uploaded=" + Result.m103851isSuccessimpl(objM70188a) + ", remoteDoc=" + (Result.m103850isFailureimpl(objM70188a) ? null : objM70188a));
        if (Result.m103851isSuccessimpl(objM70188a)) {
            SNSVideoChatAdapter sNSVideoChatAdapter = this.videoChatAdapter;
            C29307Y0 c29307y0 = (C29307Y0) (Result.m103850isFailureimpl(objM70188a) ? null : objM70188a);
            sNSVideoChatAdapter.sendMessage(new C29199C1(new C29194B1(c29307y0 != null ? c29307y0.f59320e : null)));
        }
        if (!Result.m103850isFailureimpl(objM70188a)) {
            resetFieldAfterMakingPhoto();
            AbstractC28073M0.updateState$default(this, false, new C329764(objM70188a, this, null), 1, null);
            return Unit.INSTANCE;
        }
        Exception exc = (Exception) Result.m103847exceptionOrNullimpl(objM70188a);
        C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "onUploadFileForDocSetType", exc);
        AbstractC28073M0.updateState$default(this, false, new C329753(exc, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00e3 A[PHI: r0 r3 r4 r5
      0x00e3: PHI (r0v7 java.lang.Object) = (r0v6 java.lang.Object), (r0v0 java.lang.Object) binds: [B:23:0x00df, B:16:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:23:0x00df, B:16:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r4v7 java.lang.String) = (r4v4 java.lang.String), (r4v9 java.lang.String) binds: [B:23:0x00df, B:16:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r5v3 com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState$StateWithVideo$Companion) = 
      (r5v1 com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState$StateWithVideo$Companion)
      (r5v6 com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState$StateWithVideo$Companion)
     binds: [B:23:0x00df, B:16:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:32:0x0119 A[PHI: r0 r3 r4 r5 r6 r7
      0x0119: PHI (r0v14 java.lang.Object) = (r0v13 java.lang.Object), (r0v0 java.lang.Object) binds: [B:30:0x0116, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r3v8 boolean) = (r3v6 boolean), (r3v9 boolean) binds: [B:30:0x0116, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r4v14 java.lang.String) = (r4v11 java.lang.String), (r4v17 java.lang.String) binds: [B:30:0x0116, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r5v11 java.lang.String) = (r5v7 java.lang.String), (r5v14 java.lang.String) binds: [B:30:0x0116, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r6v8 java.lang.String) = (r6v4 java.lang.String), (r6v11 java.lang.String) binds: [B:30:0x0116, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r7v3 com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState$StateWithVideo$Companion) = 
      (r7v1 com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState$StateWithVideo$Companion)
      (r7v5 com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState$StateWithVideo$Companion)
     binds: [B:30:0x0116, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0136  */
    /* JADX WARN: Code duplicated, block: B:38:0x0146  */
    /* JADX WARN: Code duplicated, block: B:42:0x0158  */
    /* JADX WARN: Code duplicated, block: B:46:0x0177  */
    /* JADX WARN: Code duplicated, block: B:50:0x019d  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object previewState(boolean z11, Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329781 c329781;
        boolean z12;
        SNSViewState.StateWithVideo.Companion companion;
        String str;
        String str2;
        Object string;
        SNSViewState.StateWithVideo.Companion companion2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object objM70045b;
        String str7;
        String str8;
        String str9;
        String str10;
        C29124h c29124h;
        String speakingLanguage;
        Object string2;
        String str11;
        String str12;
        boolean z13;
        String str13;
        SNSViewState.StateWithVideo.Companion companion3;
        String str14;
        Map mapM69782h;
        AnalyticsCallState analyticsCallState;
        if (continuation instanceof C329781) {
            c329781 = (C329781) continuation;
            int i11 = c329781.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329781.label = i11 - Integer.MIN_VALUE;
            } else {
                c329781 = new C329781(continuation);
            }
        } else {
            c329781 = new C329781(continuation);
        }
        Object string3 = c329781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c329781.label) {
            case 0:
                ResultKt.throwOnFailure(string3);
                SNSViewState.StateWithVideo.Companion companion4 = SNSViewState.StateWithVideo.INSTANCE;
                c329781.L$0 = companion4;
                c329781.Z$0 = z11;
                c329781.label = 1;
                Object string4 = getString(STRING_FOLLOW_CHECKING_CAMERA_TEXT, c329781);
                if (string4 != coroutine_suspended) {
                    z12 = z11;
                    companion = companion4;
                    string3 = string4;
                    str = (String) string3;
                    c329781.L$0 = companion;
                    c329781.L$1 = str;
                    c329781.Z$0 = z12;
                    c329781.label = 2;
                    string3 = getString(STRING_FOLLOW_CHECKING_CAMERA_TITLE, c329781);
                    if (string3 != coroutine_suspended) {
                        str2 = (String) string3;
                        c329781.L$0 = companion;
                        c329781.L$1 = str;
                        c329781.L$2 = str2;
                        c329781.Z$0 = z12;
                        c329781.label = 3;
                        string = getString(STRING_ACTION_START, c329781);
                        if (string != coroutine_suspended) {
                            companion2 = companion;
                            str3 = str2;
                            string3 = string;
                            str4 = str;
                            str5 = (String) string3;
                            c329781.L$0 = companion2;
                            c329781.L$1 = str4;
                            c329781.L$2 = str3;
                            c329781.L$3 = str5;
                            c329781.Z$0 = z12;
                            c329781.label = 4;
                            string3 = getString(STRING_LANG_SELECTED_LANGUAGE_TITLE, c329781);
                            if (string3 != coroutine_suspended) {
                                str6 = (String) string3;
                                InterfaceC29984m interfaceC29984m = this.dataRepository;
                                c329781.L$0 = companion2;
                                c329781.L$1 = str4;
                                c329781.L$2 = str3;
                                c329781.L$3 = str5;
                                c329781.L$4 = str6;
                                c329781.Z$0 = z12;
                                c329781.label = 5;
                                objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c329781);
                                if (objM70045b != coroutine_suspended) {
                                    String str15 = str5;
                                    str7 = str6;
                                    string3 = objM70045b;
                                    str8 = str4;
                                    str9 = str3;
                                    str10 = str15;
                                    c29124h = (C29124h) ((AbstractC29971N) string3).m70051c();
                                    if (c29124h != null || (mapM69782h = AbstractC29130i.m69782h(c29124h)) == null || (speakingLanguage = (String) mapM69782h.get(getSpeakingLanguage())) == null) {
                                        speakingLanguage = getSpeakingLanguage();
                                    }
                                    c329781.L$0 = companion2;
                                    c329781.L$1 = str8;
                                    c329781.L$2 = str9;
                                    c329781.L$3 = str10;
                                    c329781.L$4 = str7;
                                    c329781.L$5 = speakingLanguage;
                                    c329781.Z$0 = z12;
                                    c329781.label = 6;
                                    string2 = getString(STRING_LANG_CHANGE_ACTION, c329781);
                                    if (string2 != coroutine_suspended) {
                                        str11 = str10;
                                        str12 = str9;
                                        z13 = z12;
                                        str13 = speakingLanguage;
                                        string3 = string2;
                                        companion3 = companion2;
                                        str14 = str8;
                                        SNSViewState.StateWithVideo stateWithVideoPreview = companion3.preview(str11, str12, str14, new SNSViewState.StateWithVideo.Companion.LanguageState(str7, str13, (String) string3), z13);
                                        analyticsCallState = AnalyticsCallState.COMPLETED;
                                        if (!Boxing.boxBoolean(getOperatorCompletedCall()).booleanValue()) {
                                            analyticsCallState = null;
                                        }
                                        if (analyticsCallState == null) {
                                            analyticsCallState = AnalyticsCallState.PREPARING;
                                        }
                                        stateWithVideoPreview.setAnalyticsState(analyticsCallState);
                                        return stateWithVideoPreview;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                z12 = c329781.Z$0;
                SNSViewState.StateWithVideo.Companion companion5 = (SNSViewState.StateWithVideo.Companion) c329781.L$0;
                ResultKt.throwOnFailure(string3);
                companion = companion5;
                str = (String) string3;
                c329781.L$0 = companion;
                c329781.L$1 = str;
                c329781.Z$0 = z12;
                c329781.label = 2;
                string3 = getString(STRING_FOLLOW_CHECKING_CAMERA_TITLE, c329781);
                if (string3 != coroutine_suspended) {
                    str2 = (String) string3;
                    c329781.L$0 = companion;
                    c329781.L$1 = str;
                    c329781.L$2 = str2;
                    c329781.Z$0 = z12;
                    c329781.label = 3;
                    string = getString(STRING_ACTION_START, c329781);
                    if (string != coroutine_suspended) {
                        companion2 = companion;
                        str3 = str2;
                        string3 = string;
                        str4 = str;
                        str5 = (String) string3;
                        c329781.L$0 = companion2;
                        c329781.L$1 = str4;
                        c329781.L$2 = str3;
                        c329781.L$3 = str5;
                        c329781.Z$0 = z12;
                        c329781.label = 4;
                        string3 = getString(STRING_LANG_SELECTED_LANGUAGE_TITLE, c329781);
                        if (string3 != coroutine_suspended) {
                            str6 = (String) string3;
                            InterfaceC29984m interfaceC29984m2 = this.dataRepository;
                            c329781.L$0 = companion2;
                            c329781.L$1 = str4;
                            c329781.L$2 = str3;
                            c329781.L$3 = str5;
                            c329781.L$4 = str6;
                            c329781.Z$0 = z12;
                            c329781.label = 5;
                            objM70045b = ((C29967J) interfaceC29984m2).m70045b(false, c329781);
                            if (objM70045b != coroutine_suspended) {
                                String str16 = str5;
                                str7 = str6;
                                string3 = objM70045b;
                                str8 = str4;
                                str9 = str3;
                                str10 = str16;
                                c29124h = (C29124h) ((AbstractC29971N) string3).m70051c();
                                if (c29124h != null) {
                                    speakingLanguage = getSpeakingLanguage();
                                } else {
                                    speakingLanguage = getSpeakingLanguage();
                                }
                                c329781.L$0 = companion2;
                                c329781.L$1 = str8;
                                c329781.L$2 = str9;
                                c329781.L$3 = str10;
                                c329781.L$4 = str7;
                                c329781.L$5 = speakingLanguage;
                                c329781.Z$0 = z12;
                                c329781.label = 6;
                                string2 = getString(STRING_LANG_CHANGE_ACTION, c329781);
                                if (string2 != coroutine_suspended) {
                                    str11 = str10;
                                    str12 = str9;
                                    z13 = z12;
                                    str13 = speakingLanguage;
                                    string3 = string2;
                                    companion3 = companion2;
                                    str14 = str8;
                                    SNSViewState.StateWithVideo stateWithVideoPreview2 = companion3.preview(str11, str12, str14, new SNSViewState.StateWithVideo.Companion.LanguageState(str7, str13, (String) string3), z13);
                                    analyticsCallState = AnalyticsCallState.COMPLETED;
                                    if (!Boxing.boxBoolean(getOperatorCompletedCall()).booleanValue()) {
                                        analyticsCallState = null;
                                    }
                                    if (analyticsCallState == null) {
                                        analyticsCallState = AnalyticsCallState.PREPARING;
                                    }
                                    stateWithVideoPreview2.setAnalyticsState(analyticsCallState);
                                    return stateWithVideoPreview2;
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 2:
                z12 = c329781.Z$0;
                str = (String) c329781.L$1;
                companion = (SNSViewState.StateWithVideo.Companion) c329781.L$0;
                ResultKt.throwOnFailure(string3);
                str2 = (String) string3;
                c329781.L$0 = companion;
                c329781.L$1 = str;
                c329781.L$2 = str2;
                c329781.Z$0 = z12;
                c329781.label = 3;
                string = getString(STRING_ACTION_START, c329781);
                if (string != coroutine_suspended) {
                    companion2 = companion;
                    str3 = str2;
                    string3 = string;
                    str4 = str;
                    str5 = (String) string3;
                    c329781.L$0 = companion2;
                    c329781.L$1 = str4;
                    c329781.L$2 = str3;
                    c329781.L$3 = str5;
                    c329781.Z$0 = z12;
                    c329781.label = 4;
                    string3 = getString(STRING_LANG_SELECTED_LANGUAGE_TITLE, c329781);
                    if (string3 != coroutine_suspended) {
                        str6 = (String) string3;
                        InterfaceC29984m interfaceC29984m3 = this.dataRepository;
                        c329781.L$0 = companion2;
                        c329781.L$1 = str4;
                        c329781.L$2 = str3;
                        c329781.L$3 = str5;
                        c329781.L$4 = str6;
                        c329781.Z$0 = z12;
                        c329781.label = 5;
                        objM70045b = ((C29967J) interfaceC29984m3).m70045b(false, c329781);
                        if (objM70045b != coroutine_suspended) {
                            String str17 = str5;
                            str7 = str6;
                            string3 = objM70045b;
                            str8 = str4;
                            str9 = str3;
                            str10 = str17;
                            c29124h = (C29124h) ((AbstractC29971N) string3).m70051c();
                            if (c29124h != null) {
                                speakingLanguage = getSpeakingLanguage();
                            } else {
                                speakingLanguage = getSpeakingLanguage();
                            }
                            c329781.L$0 = companion2;
                            c329781.L$1 = str8;
                            c329781.L$2 = str9;
                            c329781.L$3 = str10;
                            c329781.L$4 = str7;
                            c329781.L$5 = speakingLanguage;
                            c329781.Z$0 = z12;
                            c329781.label = 6;
                            string2 = getString(STRING_LANG_CHANGE_ACTION, c329781);
                            if (string2 != coroutine_suspended) {
                                str11 = str10;
                                str12 = str9;
                                z13 = z12;
                                str13 = speakingLanguage;
                                string3 = string2;
                                companion3 = companion2;
                                str14 = str8;
                                SNSViewState.StateWithVideo stateWithVideoPreview3 = companion3.preview(str11, str12, str14, new SNSViewState.StateWithVideo.Companion.LanguageState(str7, str13, (String) string3), z13);
                                analyticsCallState = AnalyticsCallState.COMPLETED;
                                if (!Boxing.boxBoolean(getOperatorCompletedCall()).booleanValue()) {
                                    analyticsCallState = null;
                                }
                                if (analyticsCallState == null) {
                                    analyticsCallState = AnalyticsCallState.PREPARING;
                                }
                                stateWithVideoPreview3.setAnalyticsState(analyticsCallState);
                                return stateWithVideoPreview3;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 3:
                z12 = c329781.Z$0;
                String str18 = (String) c329781.L$2;
                String str19 = (String) c329781.L$1;
                SNSViewState.StateWithVideo.Companion companion6 = (SNSViewState.StateWithVideo.Companion) c329781.L$0;
                ResultKt.throwOnFailure(string3);
                companion2 = companion6;
                str4 = str19;
                str3 = str18;
                str5 = (String) string3;
                c329781.L$0 = companion2;
                c329781.L$1 = str4;
                c329781.L$2 = str3;
                c329781.L$3 = str5;
                c329781.Z$0 = z12;
                c329781.label = 4;
                string3 = getString(STRING_LANG_SELECTED_LANGUAGE_TITLE, c329781);
                if (string3 != coroutine_suspended) {
                    str6 = (String) string3;
                    InterfaceC29984m interfaceC29984m4 = this.dataRepository;
                    c329781.L$0 = companion2;
                    c329781.L$1 = str4;
                    c329781.L$2 = str3;
                    c329781.L$3 = str5;
                    c329781.L$4 = str6;
                    c329781.Z$0 = z12;
                    c329781.label = 5;
                    objM70045b = ((C29967J) interfaceC29984m4).m70045b(false, c329781);
                    if (objM70045b != coroutine_suspended) {
                        String str110 = str5;
                        str7 = str6;
                        string3 = objM70045b;
                        str8 = str4;
                        str9 = str3;
                        str10 = str110;
                        c29124h = (C29124h) ((AbstractC29971N) string3).m70051c();
                        if (c29124h != null) {
                            speakingLanguage = getSpeakingLanguage();
                        } else {
                            speakingLanguage = getSpeakingLanguage();
                        }
                        c329781.L$0 = companion2;
                        c329781.L$1 = str8;
                        c329781.L$2 = str9;
                        c329781.L$3 = str10;
                        c329781.L$4 = str7;
                        c329781.L$5 = speakingLanguage;
                        c329781.Z$0 = z12;
                        c329781.label = 6;
                        string2 = getString(STRING_LANG_CHANGE_ACTION, c329781);
                        if (string2 != coroutine_suspended) {
                            str11 = str10;
                            str12 = str9;
                            z13 = z12;
                            str13 = speakingLanguage;
                            string3 = string2;
                            companion3 = companion2;
                            str14 = str8;
                            SNSViewState.StateWithVideo stateWithVideoPreview4 = companion3.preview(str11, str12, str14, new SNSViewState.StateWithVideo.Companion.LanguageState(str7, str13, (String) string3), z13);
                            analyticsCallState = AnalyticsCallState.COMPLETED;
                            if (!Boxing.boxBoolean(getOperatorCompletedCall()).booleanValue()) {
                                analyticsCallState = null;
                            }
                            if (analyticsCallState == null) {
                                analyticsCallState = AnalyticsCallState.PREPARING;
                            }
                            stateWithVideoPreview4.setAnalyticsState(analyticsCallState);
                            return stateWithVideoPreview4;
                        }
                    }
                }
                return coroutine_suspended;
            case 4:
                z12 = c329781.Z$0;
                str5 = (String) c329781.L$3;
                str3 = (String) c329781.L$2;
                str4 = (String) c329781.L$1;
                companion2 = (SNSViewState.StateWithVideo.Companion) c329781.L$0;
                ResultKt.throwOnFailure(string3);
                str6 = (String) string3;
                InterfaceC29984m interfaceC29984m5 = this.dataRepository;
                c329781.L$0 = companion2;
                c329781.L$1 = str4;
                c329781.L$2 = str3;
                c329781.L$3 = str5;
                c329781.L$4 = str6;
                c329781.Z$0 = z12;
                c329781.label = 5;
                objM70045b = ((C29967J) interfaceC29984m5).m70045b(false, c329781);
                if (objM70045b != coroutine_suspended) {
                    String str111 = str5;
                    str7 = str6;
                    string3 = objM70045b;
                    str8 = str4;
                    str9 = str3;
                    str10 = str111;
                    c29124h = (C29124h) ((AbstractC29971N) string3).m70051c();
                    if (c29124h != null) {
                        speakingLanguage = getSpeakingLanguage();
                    } else {
                        speakingLanguage = getSpeakingLanguage();
                    }
                    c329781.L$0 = companion2;
                    c329781.L$1 = str8;
                    c329781.L$2 = str9;
                    c329781.L$3 = str10;
                    c329781.L$4 = str7;
                    c329781.L$5 = speakingLanguage;
                    c329781.Z$0 = z12;
                    c329781.label = 6;
                    string2 = getString(STRING_LANG_CHANGE_ACTION, c329781);
                    if (string2 != coroutine_suspended) {
                        str11 = str10;
                        str12 = str9;
                        z13 = z12;
                        str13 = speakingLanguage;
                        string3 = string2;
                        companion3 = companion2;
                        str14 = str8;
                        SNSViewState.StateWithVideo stateWithVideoPreview5 = companion3.preview(str11, str12, str14, new SNSViewState.StateWithVideo.Companion.LanguageState(str7, str13, (String) string3), z13);
                        analyticsCallState = AnalyticsCallState.COMPLETED;
                        if (!Boxing.boxBoolean(getOperatorCompletedCall()).booleanValue()) {
                            analyticsCallState = null;
                        }
                        if (analyticsCallState == null) {
                            analyticsCallState = AnalyticsCallState.PREPARING;
                        }
                        stateWithVideoPreview5.setAnalyticsState(analyticsCallState);
                        return stateWithVideoPreview5;
                    }
                }
                return coroutine_suspended;
            case 5:
                z12 = c329781.Z$0;
                str7 = (String) c329781.L$4;
                str10 = (String) c329781.L$3;
                str9 = (String) c329781.L$2;
                String str20 = (String) c329781.L$1;
                SNSViewState.StateWithVideo.Companion companion7 = (SNSViewState.StateWithVideo.Companion) c329781.L$0;
                ResultKt.throwOnFailure(string3);
                str8 = str20;
                companion2 = companion7;
                c29124h = (C29124h) ((AbstractC29971N) string3).m70051c();
                if (c29124h != null) {
                    speakingLanguage = getSpeakingLanguage();
                } else {
                    speakingLanguage = getSpeakingLanguage();
                }
                c329781.L$0 = companion2;
                c329781.L$1 = str8;
                c329781.L$2 = str9;
                c329781.L$3 = str10;
                c329781.L$4 = str7;
                c329781.L$5 = speakingLanguage;
                c329781.Z$0 = z12;
                c329781.label = 6;
                string2 = getString(STRING_LANG_CHANGE_ACTION, c329781);
                if (string2 != coroutine_suspended) {
                    str11 = str10;
                    str12 = str9;
                    z13 = z12;
                    str13 = speakingLanguage;
                    string3 = string2;
                    companion3 = companion2;
                    str14 = str8;
                    SNSViewState.StateWithVideo stateWithVideoPreview6 = companion3.preview(str11, str12, str14, new SNSViewState.StateWithVideo.Companion.LanguageState(str7, str13, (String) string3), z13);
                    analyticsCallState = AnalyticsCallState.COMPLETED;
                    if (!Boxing.boxBoolean(getOperatorCompletedCall()).booleanValue()) {
                        analyticsCallState = null;
                    }
                    if (analyticsCallState == null) {
                        analyticsCallState = AnalyticsCallState.PREPARING;
                    }
                    stateWithVideoPreview6.setAnalyticsState(analyticsCallState);
                    return stateWithVideoPreview6;
                }
                return coroutine_suspended;
            case 6:
                boolean z14 = c329781.Z$0;
                str13 = (String) c329781.L$5;
                str7 = (String) c329781.L$4;
                String str21 = (String) c329781.L$3;
                String str22 = (String) c329781.L$2;
                str14 = (String) c329781.L$1;
                companion3 = (SNSViewState.StateWithVideo.Companion) c329781.L$0;
                ResultKt.throwOnFailure(string3);
                z13 = z14;
                str11 = str21;
                str12 = str22;
                SNSViewState.StateWithVideo stateWithVideoPreview7 = companion3.preview(str11, str12, str14, new SNSViewState.StateWithVideo.Companion.LanguageState(str7, str13, (String) string3), z13);
                analyticsCallState = AnalyticsCallState.COMPLETED;
                if (!Boxing.boxBoolean(getOperatorCompletedCall()).booleanValue()) {
                    analyticsCallState = null;
                }
                if (analyticsCallState == null) {
                    analyticsCallState = AnalyticsCallState.PREPARING;
                }
                stateWithVideoPreview7.setAnalyticsState(analyticsCallState);
                return stateWithVideoPreview7;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object previewStateLoading(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329791 c329791;
        SNSViewState.StateWithVideo.Companion companion;
        if (continuation instanceof C329791) {
            c329791 = (C329791) continuation;
            int i11 = c329791.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329791.label = i11 - Integer.MIN_VALUE;
            } else {
                c329791 = new C329791(continuation);
            }
        } else {
            c329791 = new C329791(continuation);
        }
        Object obj = c329791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329791.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            SNSViewState.StateWithVideo.Companion companion2 = SNSViewState.StateWithVideo.INSTANCE;
            c329791.L$0 = companion2;
            c329791.label = 1;
            Object string = getString(STRING_CONNECTING, c329791);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
            obj = string;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (SNSViewState.StateWithVideo.Companion) c329791.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return SNSViewState.StateWithVideo.copy$default(SNSViewState.StateWithVideo.Companion.preview$default(companion, null, (String) obj, null, null, false, 8, null), null, null, true, false, false, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, AnalyticsCallState.CONNECTING, null, null, 14680043, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readyForPhoto(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329801 c329801;
        SNSViewState.StateWithVideo.Companion companion;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object objExitConfirmationDialog;
        CharSequence charSequence3;
        SNSViewState.StateWithVideo.Companion companion2;
        CharSequence charSequence4;
        if (continuation instanceof C329801) {
            c329801 = (C329801) continuation;
            int i11 = c329801.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329801.label = i11 - Integer.MIN_VALUE;
            } else {
                c329801 = new C329801(continuation);
            }
        } else {
            c329801 = new C329801(continuation);
        }
        Object string = c329801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329801.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            companion = SNSViewState.StateWithVideo.INSTANCE;
            c329801.L$0 = companion;
            c329801.label = 1;
            string = getString("sns_step_defaults_scan_frontSide_title", c329801);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            companion = (SNSViewState.StateWithVideo.Companion) c329801.L$0;
            ResultKt.throwOnFailure(string);
        } else {
            if (i12 == 2) {
                CharSequence charSequence5 = (CharSequence) c329801.L$1;
                SNSViewState.StateWithVideo.Companion companion3 = (SNSViewState.StateWithVideo.Companion) c329801.L$0;
                ResultKt.throwOnFailure(string);
                charSequence = charSequence5;
                companion = companion3;
                charSequence2 = (CharSequence) string;
                c329801.L$0 = companion;
                c329801.L$1 = charSequence;
                c329801.L$2 = charSequence2;
                c329801.label = 3;
                objExitConfirmationDialog = exitConfirmationDialog(c329801);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    charSequence3 = charSequence2;
                    string = objExitConfirmationDialog;
                    companion2 = companion;
                    charSequence4 = charSequence;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charSequence3 = (CharSequence) c329801.L$2;
            charSequence4 = (CharSequence) c329801.L$1;
            companion2 = (SNSViewState.StateWithVideo.Companion) c329801.L$0;
            ResultKt.throwOnFailure(string);
        }
        return companion2.readyForPhoto(charSequence4, charSequence3, (SNSViewState.ConfirmExitDialog) string);
        CharSequence charSequence6 = (CharSequence) string;
        c329801.L$0 = companion;
        c329801.L$1 = charSequence6;
        c329801.label = 2;
        Object string2 = getString("sns_step_defaults_scan_frontSide_brief", c329801);
        if (string2 != coroutine_suspended) {
            charSequence = charSequence6;
            string = string2;
            charSequence2 = (CharSequence) string;
            c329801.L$0 = companion;
            c329801.L$1 = charSequence;
            c329801.L$2 = charSequence2;
            c329801.label = 3;
            objExitConfirmationDialog = exitConfirmationDialog(c329801);
            if (objExitConfirmationDialog != coroutine_suspended) {
                charSequence3 = charSequence2;
                string = objExitConfirmationDialog;
                companion2 = companion;
                charSequence4 = charSequence;
                return companion2.readyForPhoto(charSequence4, charSequence3, (SNSViewState.ConfirmExitDialog) string);
            }
        }
        return coroutine_suspended;
    }

    private final void releaseUploadedBitmap() {
        Bitmap bitmap = this.uploadedBitmap;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                AbstractC32895a.m71366a("releaseUploadedBitmap");
                bitmap.recycle();
            }
            this.uploadedBitmap = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object requestAvailableLanguages(Continuation<? super Unit> continuation) {
        C329811 c329811;
        Object objM70186a;
        if (continuation instanceof C329811) {
            c329811 = (C329811) continuation;
            int i11 = c329811.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329811.label = i11 - Integer.MIN_VALUE;
            } else {
                c329811 = new C329811(continuation);
            }
        } else {
            c329811 = new C329811(continuation);
        }
        Object obj = c329811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329811.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC32895a.m71366a("requestAvailableLanguages");
            AbstractC28073M0.updateState$default(this, false, new C329822(null), 1, null);
            C30321b c30321b = this.languagesUseCase;
            c329811.label = 1;
            objM70186a = c30321b.m70186a(c329811);
            if (objM70186a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM70186a = ((Result) obj).getValue();
        }
        if (Result.m103851isSuccessimpl(objM70186a)) {
            if (Result.m103850isFailureimpl(objM70186a)) {
                objM70186a = null;
            }
            List list = (List) objM70186a;
            AbstractC32895a.m71366a("available languages " + (list != null ? Boxing.boxInt(list.size()) : null));
            if (list == null || list.isEmpty()) {
                AbstractC28073M0.updateState$default(this, false, new C329833(null), 1, null);
            } else {
                AbstractC28073M0.updateState$default(this, false, new C329844(list, null), 1, null);
            }
        } else {
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70186a);
            if (thM103847exceptionOrNullimpl == null) {
                return Unit.INSTANCE;
            }
            throwError(thM103847exceptionOrNullimpl, "TYPE_UNKNOWN", new SNSViewState.LanguageSelection(null, CollectionsKt.emptyList(), "VIDEO_IDENT"));
        }
        return Unit.INSTANCE;
    }

    private final void scheduleDisconnectTimeout() {
        if (this.disconnectTimeoutJob != null) {
            AbstractC32895a.m71366a("scheduleDisconnectTimeout: already scheduled");
        } else {
            AbstractC32895a.m71366a("scheduleDisconnectTimeout");
            this.disconnectTimeoutJob = C41696j.m91104d(this.videoIdentScope, null, null, new C329851(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleWaitForStatusUpdate() {
        if (this.waitForStatusUpdateJob != null) {
            AbstractC32895a.m71366a("scheduleWaitForStatusUpdate: already scheduled");
        } else {
            AbstractC32895a.m71366a("scheduleWaitForStatusUpdate");
            this.waitForStatusUpdateJob = C41696j.m91104d(this.videoIdentScope, null, null, new C329861(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChatRunning(boolean z11) {
        C28936t c28936t = this.isChatRunning;
        KProperty<Object> kProperty = $$delegatedProperties[0];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.valueOf(z11));
    }

    private final void setOperatorCompletedCall(boolean z11) {
        C28936t c28936t = this.operatorCompletedCall;
        KProperty<Object> kProperty = $$delegatedProperties[6];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.valueOf(z11));
    }

    private final void setOperatorName(String str) {
        C28936t c28936t = this.operatorName;
        KProperty<Object> kProperty = $$delegatedProperties[4];
        c28936t.f58834a.set(c28936t.f58835b, str);
    }

    private final void setRequestedDocumentPayload(C29424n3 c29424n3) {
        C28936t c28936t = this.requestedDocumentPayload;
        KProperty<Object> kProperty = $$delegatedProperties[3];
        c28936t.f58834a.set(c28936t.f58835b, c29424n3);
    }

    private final void setSelectedDocSetType(String str) {
        C28936t c28936t = this.selectedDocSetType;
        KProperty<Object> kProperty = $$delegatedProperties[2];
        c28936t.f58834a.set(c28936t.f58835b, str);
    }

    private final void setSpeakingLanguage(String str) {
        C28936t c28936t = this.speakingLanguage;
        KProperty<Object> kProperty = $$delegatedProperties[5];
        c28936t.f58834a.set(c28936t.f58835b, str);
    }

    private final void setUpdatedDocuments(List<Document> list) {
        C28936t c28936t = this.updatedDocuments;
        KProperty<Object> kProperty = $$delegatedProperties[1];
        c28936t.f58834a.set(c28936t.f58835b, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object startCallErrorState(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329871 c329871;
        SNSViewState.StateWithVideo.Companion companion;
        SNSViewState.StateWithVideo stateWithVideo;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (continuation instanceof C329871) {
            c329871 = (C329871) continuation;
            int i16 = c329871.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c329871.label = i16 - Integer.MIN_VALUE;
            } else {
                c329871 = new C329871(continuation);
            }
        } else {
            c329871 = new C329871(continuation);
        }
        Object string = c329871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i17 = c329871.label;
        if (i17 == 0) {
            ResultKt.throwOnFailure(string);
            companion = SNSViewState.StateWithVideo.INSTANCE;
            c329871.L$0 = companion;
            c329871.label = 1;
            string = getString("sns_videoident_action_retry", c329871);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i17 == 1) {
            companion = (SNSViewState.StateWithVideo.Companion) c329871.L$0;
            ResultKt.throwOnFailure(string);
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = c329871.I$4;
            i13 = c329871.I$3;
            i14 = c329871.I$2;
            int i18 = c329871.I$1;
            i15 = c329871.I$0;
            SNSViewState.StateWithVideo stateWithVideo2 = (SNSViewState.StateWithVideo) c329871.L$0;
            ResultKt.throwOnFailure(string);
            stateWithVideo = stateWithVideo2;
            i11 = i18;
        }
        if (i15 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i14 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i13 != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (i12 != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        return SNSViewState.StateWithVideo.copy$default(stateWithVideo, null, null, z11, z12, z13, z14, z15, null, null, null, null, null, null, new SNSWarning((CharSequence) string, null), false, false, null, null, null, null, null, AnalyticsCallState.CONNECTION_FAILED, null, null, 14671871, null);
        SNSViewState.StateWithVideo stateWithVideoPreview$default = SNSViewState.StateWithVideo.Companion.preview$default(companion, (String) string, null, null, null, true, 8, null);
        c329871.L$0 = stateWithVideoPreview$default;
        c329871.I$0 = 0;
        c329871.I$1 = 0;
        c329871.I$2 = 0;
        c329871.I$3 = 0;
        c329871.I$4 = 0;
        c329871.label = 2;
        Object string2 = getString("sns_videoident_error_connectionFailed_title", c329871);
        if (string2 != coroutine_suspended) {
            stateWithVideo = stateWithVideoPreview$default;
            string = string2;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            if (i15 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i14 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i13 != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i12 != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            return SNSViewState.StateWithVideo.copy$default(stateWithVideo, null, null, z11, z12, z13, z14, z15, null, null, null, null, null, null, new SNSWarning((CharSequence) string, null), false, false, null, null, null, null, null, AnalyticsCallState.CONNECTION_FAILED, null, null, 14671871, null);
        }
        return coroutine_suspended;
    }

    private final void switchToReconnectingViewState(SNSViewState.StateWithVideo currentState) {
        AbstractC28073M0.updateState$default(this, false, new C329881(currentState, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x010c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0131  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uploadFailedState(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329891 c329891;
        SNSViewState.ErrorState errorState;
        SNSViewState.StateWithVideo.Companion companion;
        CharSequence charSequence;
        SNSViewState.ErrorState errorState2;
        CharSequence charSequence2;
        Object string;
        CharSequence charSequence3;
        SNSViewState.StateWithVideo.Companion companion2;
        SNSViewState.ErrorState errorState3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        ButtonAction buttonAction;
        Object objExitConfirmationDialog;
        SNSViewState.StateWithVideo.Companion companion3;
        CharSequence charSequence6;
        SNSViewState.StateWithVideo stateWithVideoErrorWithButton;
        Object string2;
        SNSViewState.StateWithVideo stateWithVideo;
        SNSViewState.StateWithVideo stateWithVideo2;
        SNSViewState.StateWithVideo stateWithVideo3;
        String str;
        if (continuation instanceof C329891) {
            c329891 = (C329891) continuation;
            int i11 = c329891.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329891.label = i11 - Integer.MIN_VALUE;
            } else {
                c329891 = new C329891(continuation);
            }
        } else {
            c329891 = new C329891(continuation);
        }
        Object obj = c329891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329891.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            SNSViewState.StateWithVideo.Companion companion4 = SNSViewState.StateWithVideo.INSTANCE;
            errorState = SNSViewState.ErrorState.UPLOAD_ERROR;
            c329891.L$0 = companion4;
            c329891.L$1 = errorState;
            c329891.label = 1;
            Object string3 = getString("sns_videoident_error_uploadFailed_title", c329891);
            if (string3 != coroutine_suspended) {
                companion = companion4;
                obj = string3;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            errorState = (SNSViewState.ErrorState) c329891.L$1;
            companion = (SNSViewState.StateWithVideo.Companion) c329891.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 == 2) {
                charSequence = (CharSequence) c329891.L$2;
                errorState2 = (SNSViewState.ErrorState) c329891.L$1;
                companion = (SNSViewState.StateWithVideo.Companion) c329891.L$0;
                ResultKt.throwOnFailure(obj);
                charSequence2 = (CharSequence) obj;
                c329891.L$0 = companion;
                c329891.L$1 = errorState2;
                c329891.L$2 = charSequence;
                c329891.L$3 = charSequence2;
                c329891.label = 3;
                string = getString("sns_videoident_action_retry", c329891);
                if (string != coroutine_suspended) {
                    charSequence3 = charSequence2;
                    obj = string;
                    companion2 = companion;
                    errorState3 = errorState2;
                    charSequence4 = charSequence;
                    charSequence5 = (CharSequence) obj;
                    buttonAction = ButtonAction.UPLOAD;
                    c329891.L$0 = companion2;
                    c329891.L$1 = errorState3;
                    c329891.L$2 = charSequence4;
                    c329891.L$3 = charSequence3;
                    c329891.L$4 = charSequence5;
                    c329891.L$5 = buttonAction;
                    c329891.label = 4;
                    objExitConfirmationDialog = exitConfirmationDialog(c329891);
                    if (objExitConfirmationDialog != coroutine_suspended) {
                        companion3 = companion2;
                        charSequence6 = charSequence5;
                        obj = objExitConfirmationDialog;
                        stateWithVideoErrorWithButton = companion3.errorWithButton(errorState3, charSequence4, charSequence3, charSequence6, buttonAction, (SNSViewState.ConfirmExitDialog) obj);
                        c329891.L$0 = stateWithVideoErrorWithButton;
                        c329891.L$1 = stateWithVideoErrorWithButton;
                        c329891.L$2 = stateWithVideoErrorWithButton;
                        c329891.L$3 = null;
                        c329891.L$4 = null;
                        c329891.L$5 = null;
                        c329891.label = 5;
                        string2 = getString("sns_videoident_action_cancel", c329891);
                        if (string2 != coroutine_suspended) {
                            stateWithVideo = stateWithVideoErrorWithButton;
                            stateWithVideo2 = stateWithVideo;
                            obj = string2;
                            stateWithVideo3 = stateWithVideo2;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                CharSequence charSequence7 = (CharSequence) c329891.L$3;
                CharSequence charSequence8 = (CharSequence) c329891.L$2;
                SNSViewState.ErrorState errorState4 = (SNSViewState.ErrorState) c329891.L$1;
                SNSViewState.StateWithVideo.Companion companion5 = (SNSViewState.StateWithVideo.Companion) c329891.L$0;
                ResultKt.throwOnFailure(obj);
                companion2 = companion5;
                errorState3 = errorState4;
                charSequence4 = charSequence8;
                charSequence3 = charSequence7;
                charSequence5 = (CharSequence) obj;
                buttonAction = ButtonAction.UPLOAD;
                c329891.L$0 = companion2;
                c329891.L$1 = errorState3;
                c329891.L$2 = charSequence4;
                c329891.L$3 = charSequence3;
                c329891.L$4 = charSequence5;
                c329891.L$5 = buttonAction;
                c329891.label = 4;
                objExitConfirmationDialog = exitConfirmationDialog(c329891);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    companion3 = companion2;
                    charSequence6 = charSequence5;
                    obj = objExitConfirmationDialog;
                    stateWithVideoErrorWithButton = companion3.errorWithButton(errorState3, charSequence4, charSequence3, charSequence6, buttonAction, (SNSViewState.ConfirmExitDialog) obj);
                    c329891.L$0 = stateWithVideoErrorWithButton;
                    c329891.L$1 = stateWithVideoErrorWithButton;
                    c329891.L$2 = stateWithVideoErrorWithButton;
                    c329891.L$3 = null;
                    c329891.L$4 = null;
                    c329891.L$5 = null;
                    c329891.label = 5;
                    string2 = getString("sns_videoident_action_cancel", c329891);
                    if (string2 != coroutine_suspended) {
                        stateWithVideo = stateWithVideoErrorWithButton;
                        stateWithVideo2 = stateWithVideo;
                        obj = string2;
                        stateWithVideo3 = stateWithVideo2;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 4) {
                buttonAction = (ButtonAction) c329891.L$5;
                CharSequence charSequence9 = (CharSequence) c329891.L$4;
                charSequence3 = (CharSequence) c329891.L$3;
                charSequence4 = (CharSequence) c329891.L$2;
                errorState3 = (SNSViewState.ErrorState) c329891.L$1;
                SNSViewState.StateWithVideo.Companion companion6 = (SNSViewState.StateWithVideo.Companion) c329891.L$0;
                ResultKt.throwOnFailure(obj);
                companion3 = companion6;
                charSequence6 = charSequence9;
                stateWithVideoErrorWithButton = companion3.errorWithButton(errorState3, charSequence4, charSequence3, charSequence6, buttonAction, (SNSViewState.ConfirmExitDialog) obj);
                c329891.L$0 = stateWithVideoErrorWithButton;
                c329891.L$1 = stateWithVideoErrorWithButton;
                c329891.L$2 = stateWithVideoErrorWithButton;
                c329891.L$3 = null;
                c329891.L$4 = null;
                c329891.L$5 = null;
                c329891.label = 5;
                string2 = getString("sns_videoident_action_cancel", c329891);
                if (string2 != coroutine_suspended) {
                    stateWithVideo = stateWithVideoErrorWithButton;
                    stateWithVideo2 = stateWithVideo;
                    obj = string2;
                    stateWithVideo3 = stateWithVideo2;
                }
                return coroutine_suspended;
            }
            if (i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateWithVideo = (SNSViewState.StateWithVideo) c329891.L$2;
            stateWithVideo2 = (SNSViewState.StateWithVideo) c329891.L$1;
            stateWithVideo3 = (SNSViewState.StateWithVideo) c329891.L$0;
            ResultKt.throwOnFailure(obj);
        }
        str = (String) obj;
        if (str == null) {
            str = "Cancel";
        }
        stateWithVideo.setBottomSecondaryButtonText(str);
        stateWithVideo2.setAnalyticsState(AnalyticsCallState.IN_PROGRESS);
        return stateWithVideo3;
        CharSequence charSequence10 = (CharSequence) obj;
        c329891.L$0 = companion;
        c329891.L$1 = errorState;
        c329891.L$2 = charSequence10;
        c329891.label = 2;
        Object string4 = getString("sns_videoident_error_uploadFailedFatal", c329891);
        if (string4 != coroutine_suspended) {
            SNSViewState.ErrorState errorState5 = errorState;
            charSequence = charSequence10;
            obj = string4;
            errorState2 = errorState5;
            charSequence2 = (CharSequence) obj;
            c329891.L$0 = companion;
            c329891.L$1 = errorState2;
            c329891.L$2 = charSequence;
            c329891.L$3 = charSequence2;
            c329891.label = 3;
            string = getString("sns_videoident_action_retry", c329891);
            if (string != coroutine_suspended) {
                charSequence3 = charSequence2;
                obj = string;
                companion2 = companion;
                errorState3 = errorState2;
                charSequence4 = charSequence;
                charSequence5 = (CharSequence) obj;
                buttonAction = ButtonAction.UPLOAD;
                c329891.L$0 = companion2;
                c329891.L$1 = errorState3;
                c329891.L$2 = charSequence4;
                c329891.L$3 = charSequence3;
                c329891.L$4 = charSequence5;
                c329891.L$5 = buttonAction;
                c329891.label = 4;
                objExitConfirmationDialog = exitConfirmationDialog(c329891);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    companion3 = companion2;
                    charSequence6 = charSequence5;
                    obj = objExitConfirmationDialog;
                    stateWithVideoErrorWithButton = companion3.errorWithButton(errorState3, charSequence4, charSequence3, charSequence6, buttonAction, (SNSViewState.ConfirmExitDialog) obj);
                    c329891.L$0 = stateWithVideoErrorWithButton;
                    c329891.L$1 = stateWithVideoErrorWithButton;
                    c329891.L$2 = stateWithVideoErrorWithButton;
                    c329891.L$3 = null;
                    c329891.L$4 = null;
                    c329891.L$5 = null;
                    c329891.label = 5;
                    string2 = getString("sns_videoident_action_cancel", c329891);
                    if (string2 != coroutine_suspended) {
                        stateWithVideo = stateWithVideoErrorWithButton;
                        stateWithVideo2 = stateWithVideo;
                        obj = string2;
                        stateWithVideo3 = stateWithVideo2;
                        str = (String) obj;
                        if (str == null) {
                            str = "Cancel";
                        }
                        stateWithVideo.setBottomSecondaryButtonText(str);
                        stateWithVideo2.setAnalyticsState(AnalyticsCallState.IN_PROGRESS);
                        return stateWithVideo3;
                    }
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uploadPreview(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329901 c329901;
        SNSViewState.StateWithVideo.Companion companion;
        ButtonAction buttonAction;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object objExitConfirmationDialog;
        CharSequence charSequence3;
        SNSViewState.StateWithVideo.Companion companion2;
        CharSequence charSequence4;
        ButtonAction buttonAction2;
        if (continuation instanceof C329901) {
            c329901 = (C329901) continuation;
            int i11 = c329901.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329901.label = i11 - Integer.MIN_VALUE;
            } else {
                c329901 = new C329901(continuation);
            }
        } else {
            c329901 = new C329901(continuation);
        }
        Object string = c329901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329901.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            companion = SNSViewState.StateWithVideo.INSTANCE;
            c329901.L$0 = companion;
            c329901.label = 1;
            string = getString("sns_videoident_action_upload", c329901);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            companion = (SNSViewState.StateWithVideo.Companion) c329901.L$0;
            ResultKt.throwOnFailure(string);
        } else {
            if (i12 == 2) {
                ButtonAction buttonAction3 = (ButtonAction) c329901.L$2;
                charSequence = (CharSequence) c329901.L$1;
                SNSViewState.StateWithVideo.Companion companion3 = (SNSViewState.StateWithVideo.Companion) c329901.L$0;
                ResultKt.throwOnFailure(string);
                buttonAction = buttonAction3;
                companion = companion3;
                charSequence2 = (CharSequence) string;
                c329901.L$0 = companion;
                c329901.L$1 = charSequence;
                c329901.L$2 = buttonAction;
                c329901.L$3 = charSequence2;
                c329901.label = 3;
                objExitConfirmationDialog = exitConfirmationDialog(c329901);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    charSequence3 = charSequence2;
                    string = objExitConfirmationDialog;
                    companion2 = companion;
                    charSequence4 = charSequence;
                    buttonAction2 = buttonAction;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CharSequence charSequence5 = (CharSequence) c329901.L$3;
            buttonAction2 = (ButtonAction) c329901.L$2;
            CharSequence charSequence6 = (CharSequence) c329901.L$1;
            companion2 = (SNSViewState.StateWithVideo.Companion) c329901.L$0;
            ResultKt.throwOnFailure(string);
            charSequence3 = charSequence5;
            charSequence4 = charSequence6;
        }
        return companion2.previewPhoto(charSequence4, buttonAction2, charSequence3, null, (SNSViewState.ConfirmExitDialog) string);
        CharSequence charSequence7 = (CharSequence) string;
        buttonAction = ButtonAction.UPLOAD;
        c329901.L$0 = companion;
        c329901.L$1 = charSequence7;
        c329901.L$2 = buttonAction;
        c329901.label = 2;
        Object string2 = getString("sns_videoident_action_cancel", c329901);
        if (string2 != coroutine_suspended) {
            charSequence = charSequence7;
            string = string2;
            charSequence2 = (CharSequence) string;
            c329901.L$0 = companion;
            c329901.L$1 = charSequence;
            c329901.L$2 = buttonAction;
            c329901.L$3 = charSequence2;
            c329901.label = 3;
            objExitConfirmationDialog = exitConfirmationDialog(c329901);
            if (objExitConfirmationDialog != coroutine_suspended) {
                charSequence3 = charSequence2;
                string = objExitConfirmationDialog;
                companion2 = companion;
                charSequence4 = charSequence;
                buttonAction2 = buttonAction;
                return companion2.previewPhoto(charSequence4, buttonAction2, charSequence3, null, (SNSViewState.ConfirmExitDialog) string);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object uploadingPhotoState(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329911 c329911;
        List listEmptyList;
        SNSViewState.StateWithVideo stateWithVideo;
        String str;
        Object objExitConfirmationDialog;
        String str2;
        SNSViewState.StateWithVideo stateWithVideo2;
        if (continuation instanceof C329911) {
            c329911 = (C329911) continuation;
            int i11 = c329911.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329911.label = i11 - Integer.MIN_VALUE;
            } else {
                c329911 = new C329911(continuation);
            }
        } else {
            c329911 = new C329911(continuation);
        }
        Object objVideoCallState = c329911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329911.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objVideoCallState);
            c329911.label = 1;
            objVideoCallState = videoCallState(c329911);
            if (objVideoCallState != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objVideoCallState);
        } else {
            if (i12 == 2) {
                listEmptyList = (List) c329911.L$1;
                stateWithVideo = (SNSViewState.StateWithVideo) c329911.L$0;
                ResultKt.throwOnFailure(objVideoCallState);
                str = (String) objVideoCallState;
                c329911.L$0 = stateWithVideo;
                c329911.L$1 = listEmptyList;
                c329911.L$2 = str;
                c329911.label = 3;
                objExitConfirmationDialog = exitConfirmationDialog(c329911);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    str2 = str;
                    objVideoCallState = objExitConfirmationDialog;
                    stateWithVideo2 = stateWithVideo;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) c329911.L$2;
            listEmptyList = (List) c329911.L$1;
            stateWithVideo2 = (SNSViewState.StateWithVideo) c329911.L$0;
            ResultKt.throwOnFailure(objVideoCallState);
            str2 = str3;
        }
        return SNSViewState.StateWithVideo.copy$default(stateWithVideo2, null, null, true, false, false, false, false, null, str2, null, null, null, null, null, false, false, null, null, listEmptyList, null, null, null, (SNSViewState.ConfirmExitDialog) objVideoCallState, null, 12320507, null);
        SNSViewState.StateWithVideo stateWithVideo3 = (SNSViewState.StateWithVideo) objVideoCallState;
        listEmptyList = CollectionsKt.emptyList();
        c329911.L$0 = stateWithVideo3;
        c329911.L$1 = listEmptyList;
        c329911.label = 2;
        Object string = getString("sns_videoident_state_uploading", c329911);
        if (string != coroutine_suspended) {
            stateWithVideo = stateWithVideo3;
            objVideoCallState = string;
            str = (String) objVideoCallState;
            c329911.L$0 = stateWithVideo;
            c329911.L$1 = listEmptyList;
            c329911.L$2 = str;
            c329911.label = 3;
            objExitConfirmationDialog = exitConfirmationDialog(c329911);
            if (objExitConfirmationDialog != coroutine_suspended) {
                str2 = str;
                objVideoCallState = objExitConfirmationDialog;
                stateWithVideo2 = stateWithVideo;
                return SNSViewState.StateWithVideo.copy$default(stateWithVideo2, null, null, true, false, false, false, false, null, str2, null, null, null, null, null, false, false, null, null, listEmptyList, null, null, null, (SNSViewState.ConfirmExitDialog) objVideoCallState, null, 12320507, null);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r14 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object videoCallState(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329921 c329921;
        SNSVideoChatState state;
        String operatorName;
        SNSViewState.StateWithVideo.Companion companion;
        RemoteVideoState remoteVideoState;
        Object string;
        SNSViewState.StateWithVideo.Companion companion2;
        RemoteVideoState remoteVideoState2;
        String str;
        List<SNSStepViewItem> listCreateDocumentItems;
        Object objExitConfirmationDialog;
        RemoteVideoState remoteVideoState3;
        List<SNSStepViewItem> list;
        String str2;
        SNSViewState.StateWithVideo.Companion companion3;
        if (continuation instanceof C329921) {
            c329921 = (C329921) continuation;
            int i11 = c329921.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329921.label = i11 - Integer.MIN_VALUE;
            } else {
                c329921 = new C329921(continuation);
            }
        } else {
            c329921 = new C329921(continuation);
        }
        Object string2 = c329921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329921.label;
        if (i12 != 0) {
            if (i12 == 1) {
                state = (SNSVideoChatState) c329921.L$0;
                ResultKt.throwOnFailure(string2);
            } else {
                if (i12 == 2) {
                    remoteVideoState2 = (RemoteVideoState) c329921.L$1;
                    companion2 = (SNSViewState.StateWithVideo.Companion) c329921.L$0;
                    ResultKt.throwOnFailure(string2);
                    str = (String) string2;
                    listCreateDocumentItems = createDocumentItems();
                    c329921.L$0 = companion2;
                    c329921.L$1 = remoteVideoState2;
                    c329921.L$2 = str;
                    c329921.L$3 = listCreateDocumentItems;
                    c329921.label = 3;
                    objExitConfirmationDialog = exitConfirmationDialog(c329921);
                    if (objExitConfirmationDialog != coroutine_suspended) {
                        remoteVideoState3 = remoteVideoState2;
                        list = listCreateDocumentItems;
                        str2 = str;
                        string2 = objExitConfirmationDialog;
                        companion3 = companion2;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c329921.L$3;
                str2 = (String) c329921.L$2;
                remoteVideoState3 = (RemoteVideoState) c329921.L$1;
                companion3 = (SNSViewState.StateWithVideo.Companion) c329921.L$0;
                ResultKt.throwOnFailure(string2);
            }
            return companion3.videoCall(str2, remoteVideoState3, list, (SNSViewState.ConfirmExitDialog) string2);
        }
        ResultKt.throwOnFailure(string2);
        state = this.videoChatAdapter.getState();
        if (!(state instanceof C32924y) || ((C32924y) state).f67369c) {
            operatorName = getOperatorName();
            String str3 = operatorName;
            companion = SNSViewState.StateWithVideo.INSTANCE;
            remoteVideoState = new RemoteVideoState(!(state instanceof C32924y) && ((C32924y) state).f67368b, getRemoteVideoAspectRatioScale(), str3, false, 8, null);
            if (this.showPhotoFrame) {
                remoteVideoState = null;
            }
            c329921.L$0 = companion;
            c329921.L$1 = remoteVideoState;
            c329921.label = 2;
            string = getString(STRING_FOLLOW_INSTRUCTIONS_TEXT, c329921);
            if (string != coroutine_suspended) {
                companion2 = companion;
                string2 = string;
                remoteVideoState2 = remoteVideoState;
                str = (String) string2;
                listCreateDocumentItems = createDocumentItems();
                c329921.L$0 = companion2;
                c329921.L$1 = remoteVideoState2;
                c329921.L$2 = str;
                c329921.L$3 = listCreateDocumentItems;
                c329921.label = 3;
                objExitConfirmationDialog = exitConfirmationDialog(c329921);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    remoteVideoState3 = remoteVideoState2;
                    list = listCreateDocumentItems;
                    str2 = str;
                    string2 = objExitConfirmationDialog;
                    companion3 = companion2;
                    return companion3.videoCall(str2, remoteVideoState3, list, (SNSViewState.ConfirmExitDialog) string2);
                }
            }
        } else {
            c329921.L$0 = state;
            c329921.label = 1;
            string2 = getString(STRING_CONNECTING, c329921);
        }
        return coroutine_suspended;
        operatorName = (String) string2;
        String str4 = operatorName;
        companion = SNSViewState.StateWithVideo.INSTANCE;
        remoteVideoState = new RemoteVideoState(!(state instanceof C32924y) && ((C32924y) state).f67368b, getRemoteVideoAspectRatioScale(), str4, false, 8, null);
        if (this.showPhotoFrame) {
            remoteVideoState = null;
        }
        c329921.L$0 = companion;
        c329921.L$1 = remoteVideoState;
        c329921.label = 2;
        string = getString(STRING_FOLLOW_INSTRUCTIONS_TEXT, c329921);
        if (string != coroutine_suspended) {
            companion2 = companion;
            string2 = string;
            remoteVideoState2 = remoteVideoState;
            str = (String) string2;
            listCreateDocumentItems = createDocumentItems();
            c329921.L$0 = companion2;
            c329921.L$1 = remoteVideoState2;
            c329921.L$2 = str;
            c329921.L$3 = listCreateDocumentItems;
            c329921.label = 3;
            objExitConfirmationDialog = exitConfirmationDialog(c329921);
            if (objExitConfirmationDialog != coroutine_suspended) {
                remoteVideoState3 = remoteVideoState2;
                list = listCreateDocumentItems;
                str2 = str;
                string2 = objExitConfirmationDialog;
                companion3 = companion2;
                return companion3.videoCall(str2, remoteVideoState3, list, (SNSViewState.ConfirmExitDialog) string2);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object waitingForOperatorState(Continuation<? super SNSViewState.StateWithVideo> continuation) {
        C329931 c329931;
        SNSViewState.StateWithVideo.Companion companion;
        CharSequence charSequence;
        CharSequence charSequence2;
        List<SNSStepViewItem> listCreateDocumentItems;
        Object objExitConfirmationDialog;
        CharSequence charSequence3;
        SNSViewState.StateWithVideo.Companion companion2;
        CharSequence charSequence4;
        List<SNSStepViewItem> list;
        if (continuation instanceof C329931) {
            c329931 = (C329931) continuation;
            int i11 = c329931.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329931.label = i11 - Integer.MIN_VALUE;
            } else {
                c329931 = new C329931(continuation);
            }
        } else {
            c329931 = new C329931(continuation);
        }
        Object string = c329931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329931.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            companion = SNSViewState.StateWithVideo.INSTANCE;
            c329931.L$0 = companion;
            c329931.label = 1;
            string = getString(STRING_FOLLOW_WAIT_MESSAGE, c329931);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            companion = (SNSViewState.StateWithVideo.Companion) c329931.L$0;
            ResultKt.throwOnFailure(string);
        } else {
            if (i12 == 2) {
                CharSequence charSequence5 = (CharSequence) c329931.L$1;
                SNSViewState.StateWithVideo.Companion companion3 = (SNSViewState.StateWithVideo.Companion) c329931.L$0;
                ResultKt.throwOnFailure(string);
                charSequence = charSequence5;
                companion = companion3;
                charSequence2 = (CharSequence) string;
                listCreateDocumentItems = createDocumentItems();
                c329931.L$0 = companion;
                c329931.L$1 = charSequence;
                c329931.L$2 = charSequence2;
                c329931.L$3 = listCreateDocumentItems;
                c329931.label = 3;
                objExitConfirmationDialog = exitConfirmationDialog(c329931);
                if (objExitConfirmationDialog != coroutine_suspended) {
                    SNSViewState.StateWithVideo.Companion companion4 = companion;
                    charSequence3 = charSequence2;
                    string = objExitConfirmationDialog;
                    companion2 = companion4;
                    charSequence4 = charSequence;
                    list = listCreateDocumentItems;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c329931.L$3;
            charSequence3 = (CharSequence) c329931.L$2;
            charSequence4 = (CharSequence) c329931.L$1;
            companion2 = (SNSViewState.StateWithVideo.Companion) c329931.L$0;
            ResultKt.throwOnFailure(string);
        }
        return companion2.waitingForOperator(charSequence4, charSequence3, list, (SNSViewState.ConfirmExitDialog) string);
        CharSequence charSequence6 = (CharSequence) string;
        c329931.L$0 = companion;
        c329931.L$1 = charSequence6;
        c329931.label = 2;
        Object string2 = getString(STRING_FOLLOW_INSTRUCTIONS_TEXT, c329931);
        if (string2 != coroutine_suspended) {
            charSequence = charSequence6;
            string = string2;
            charSequence2 = (CharSequence) string;
            listCreateDocumentItems = createDocumentItems();
            c329931.L$0 = companion;
            c329931.L$1 = charSequence;
            c329931.L$2 = charSequence2;
            c329931.L$3 = listCreateDocumentItems;
            c329931.label = 3;
            objExitConfirmationDialog = exitConfirmationDialog(c329931);
            if (objExitConfirmationDialog != coroutine_suspended) {
                SNSViewState.StateWithVideo.Companion companion5 = companion;
                charSequence3 = charSequence2;
                string = objExitConfirmationDialog;
                companion2 = companion5;
                charSequence4 = charSequence;
                list = listCreateDocumentItems;
                return companion2.waitingForOperator(charSequence4, charSequence3, list, (SNSViewState.ConfirmExitDialog) string);
            }
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    @NotNull
    public SNSViewState.Loading getDefaultState() {
        return SNSViewState.Loading.INSTANCE;
    }

    @NotNull
    public final AbstractC46162a getJson() {
        return this.json;
    }

    @Nullable
    public final Function0<Unit> getOnCancelPhoneVerification() {
        return this.onCancelPhoneVerification;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnClose() {
        return this.onClose;
    }

    @Nullable
    public final Function1<String, Unit> getOnPickFile() {
        return this.onPickFile;
    }

    @Nullable
    public final Function0<Unit> getOnStartPhoneVerification() {
        return this.onStartPhoneVerification;
    }

    public final long getOperatorDisconnectTimeout() {
        return this.operatorDisconnectTimeout;
    }

    @NotNull
    /* JADX INFO: renamed from: getPermissionsController$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final C28651g getPermissionsController() {
        return this.permissionsController;
    }

    /* JADX INFO: renamed from: getSkipNotificationPermission$idensic_mobile_sdk_aar_defaultRelease */
    public final boolean m71422x439e048a() {
        C28936t c28936t = this.skipNotificationPermission;
        KProperty<Object> kProperty = $$delegatedProperties[7];
        return ((Boolean) c28936t.m69705a()).booleanValue();
    }

    public final void handleEnterPhoneResult() {
        AbstractC32895a.m71366a("handleEnterPhoneResult");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329431(null), 3, null);
    }

    public final void handlePhoneVerificationStatus(@NotNull PhoneVerificationStatus status) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i11 == 1) {
            this.videoChatAdapter.sendMessage(new C29254N1());
            return;
        }
        if (i11 == 2) {
            this.videoChatAdapter.sendMessage(new C29283T1());
        } else if (i11 == 3) {
            this.videoChatAdapter.sendMessage(new C29635s1());
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.videoChatAdapter.sendMessage(new C29269Q1());
        }
    }

    public final void handleVideoChatState(@NotNull SNSVideoChatState state) {
        AbstractC32895a.m71366a("handleVideoChatState: " + state + ", exitingWithBackPress=" + this.exitingWithBackPress);
        cancelDisconnectTimeoutJob();
        if (state instanceof C32924y) {
            setChatRunning(true);
            InterfaceC28147s interfaceC28147sCurrentState = currentState();
            SNSViewState.StateWithVideo stateWithVideo = interfaceC28147sCurrentState instanceof SNSViewState.StateWithVideo ? (SNSViewState.StateWithVideo) interfaceC28147sCurrentState : null;
            if (!((C32924y) state).f67370d || (stateWithVideo != null && stateWithVideo.isReconnecting())) {
                AbstractC28073M0.updateState$default(this, false, new C329584(null), 1, null);
                return;
            } else {
                AbstractC32895a.m71366a("handleVideoChatState: skipping view update");
                return;
            }
        }
        if (state instanceof C32925z) {
            setOperatorName(null);
            if (this.exitingWithBackPress) {
                return;
            }
            AbstractC28073M0.updateState$default(this, false, new C329595(null), 1, null);
            scheduleDisconnectTimeout();
            return;
        }
        if (state instanceof C32923x) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329606(state, null), 3, null);
            return;
        }
        if (state instanceof C32896A) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(SNSVideoIdent.logTag, "reconnecting", ((C32896A) state).f67298a);
            InterfaceC28147s interfaceC28147sCurrentState2 = currentState();
            SNSViewState.StateWithVideo stateWithVideo2 = interfaceC28147sCurrentState2 instanceof SNSViewState.StateWithVideo ? (SNSViewState.StateWithVideo) interfaceC28147sCurrentState2 : null;
            if (stateWithVideo2 != null) {
                switchToReconnectingViewState(stateWithVideo2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
    
        if (handleUpdateDocsStatus(r0) == r1) goto L62;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onChatMessage(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        C329621 c329621;
        if (continuation instanceof C329621) {
            c329621 = (C329621) continuation;
            int i11 = c329621.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329621.label = i11 - Integer.MIN_VALUE;
            } else {
                c329621 = new C329621(continuation);
            }
        } else {
            c329621 = new C329621(continuation);
        }
        Object objM91049g = c329621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329621.label;
        if (i12 != 0) {
            if (i12 == 1) {
                str = (String) c329621.L$0;
                ResultKt.throwOnFailure(objM91049g);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM91049g);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM91049g);
        AbstractC41697j0 abstractC41697j0M91391a = C41782z0.m91391a();
        SNSVideoIdentViewModel$onChatMessage$message$1 sNSVideoIdentViewModel$onChatMessage$message$1 = new SNSVideoIdentViewModel$onChatMessage$message$1(this, str, null);
        c329621.L$0 = str;
        c329621.label = 1;
        objM91049g = C41686h.m91049g(abstractC41697j0M91391a, sNSVideoIdentViewModel$onChatMessage$message$1, c329621);
        if (objM91049g != coroutine_suspended) {
        }
        return coroutine_suspended;
        C29226H3 c29226h3 = (C29226H3) objM91049g;
        boolean z11 = c29226h3 instanceof C29314Z2;
        boolean z12 = c29226h3 instanceof C29644t3;
        if ((z11 || (c29226h3 instanceof C29206D3) || (c29226h3 instanceof C29245L2) || (c29226h3 instanceof C29672x3)) ? false : true) {
            cancelWaitForStatusUpdateJob();
        }
        if (c29226h3 instanceof C29245L2) {
            Function0<Unit> function0 = this.onCancelPhoneVerification;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (c29226h3 instanceof C29206D3) {
            Function0<Unit> function1 = this.onStartPhoneVerification;
            if (function1 != null) {
                function1.invoke();
            }
        } else if (z12) {
            handleStepChange(((C29644t3) c29226h3).f59701c);
        } else if (c29226h3 instanceof C29265P2) {
            handleCompletedMessage();
        } else if (z11) {
            handleModeratorName((C29314Z2) c29226h3);
        } else if (c29226h3 instanceof C29336c3) {
            handleReadyForScreenshot((C29336c3) c29226h3);
        } else if (c29226h3 instanceof C29284T2) {
            handleMakeScreenshot((C29284T2) c29226h3);
        } else if (c29226h3 instanceof C29230I2) {
            handleCancelScreenshot();
        } else if (c29226h3 instanceof C29191A3) {
            c329621.L$0 = null;
            c329621.label = 2;
        } else {
            AbstractC32895a.m71366a(" unknown message " + str);
        }
        return Unit.INSTANCE;
    }

    public final void onDecodingPhotoFrame() {
        AbstractC28073M0.updateState$default(this, false, new C329641(null), 1, null);
    }

    public final void onMediaReady() {
        AbstractC28073M0.updateState$default(this, false, new C329651(null), 1, null);
    }

    public final void onPhotoMakeError() {
        AbstractC32895a.m71366a(" onPhotoMakeError!");
        resetFieldAfterMakingPhoto();
        this.videoChatAdapter.sendMessage(new C29663w1());
    }

    public final void onPrimaryButtonClick(@NotNull ButtonAction action) {
        AbstractC32895a.m71366a("onPrimaryButtonClick: " + action);
        int i11 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i11 == 1) {
            handleRetryUpload();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onStartVideoCallClick();
        }
    }

    public final void setOnCancelPhoneVerification(@Nullable Function0<Unit> function0) {
        this.onCancelPhoneVerification = function0;
    }

    public final void setOnClose(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onClose = function1;
    }

    public final void setOnPickFile(@Nullable Function1<? super String, Unit> function1) {
        this.onPickFile = function1;
    }

    public final void setOnStartPhoneVerification(@Nullable Function0<Unit> function0) {
        this.onStartPhoneVerification = function0;
    }

    public final void setOperatorDisconnectTimeout(long j11) {
        this.operatorDisconnectTimeout = j11;
    }

    public final void updateVideoChatAdapter(@NotNull SNSVideoChatAdapter adapter) {
        AbstractC32895a.m71366a("updateVideoChatAdapter: was " + AbstractC28458h.m69333a(this.videoChatAdapter) + " now " + AbstractC28458h.m69333a(adapter));
        this.videoChatAdapter = adapter;
    }

    private final List<SNSStepViewItem> createDocumentItems() {
        List<Document> documents = getDocuments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(documents, 10));
        int i11 = 0;
        for (Object obj : documents) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Document document = (Document) obj;
            arrayList.add(new SNSStepViewItem(document.getType().m69744b(), document.getType().m69745b(getStrings()), stepStateForDocument(document)));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createParticipantConnectedViewState(Continuation<? super SNSViewState> continuation) {
        SNSViewState.StateWithVideo stateWithVideo;
        InterfaceC28147s interfaceC28147sCurrentState = currentState();
        SNSViewState.StateWithVideo stateWithVideo2 = null;
        if (interfaceC28147sCurrentState instanceof SNSViewState.StateWithVideo) {
            stateWithVideo = (SNSViewState.StateWithVideo) interfaceC28147sCurrentState;
        } else {
            stateWithVideo = null;
        }
        if (stateWithVideo == null) {
            return currentState();
        }
        SNSViewState.StateWithVideo previousState = stateWithVideo.getPreviousState();
        if (previousState != null) {
            if (stateWithVideo.isReconnecting()) {
                stateWithVideo2 = previousState;
            }
            if (stateWithVideo2 != null) {
                return stateWithVideo2;
            }
        }
        Object objVideoCallState = videoCallState(continuation);
        if (objVideoCallState == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objVideoCallState;
        }
        return (SNSViewState) objVideoCallState;
    }

    private final void handleCompletedMessage() {
        cancelUploadJob();
        setOperatorCompletedCall(true);
        this.videoChatAdapter.disconnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleQueueStatusUpdated(C29685z2 c29685z2, Continuation<? super Unit> continuation) {
        Long l11;
        if (!((SNSViewState) currentState()).isWaiting()) {
            return Unit.INSTANCE;
        }
        C29678y2 c29678y2 = c29685z2.f59737c;
        if (c29678y2 != null && (l11 = c29678y2.f59730a) != null) {
            long jLongValue = l11.longValue();
            if (this.waitTimeSec == jLongValue) {
                return Unit.INSTANCE;
            }
            this.waitTimeSec = jLongValue;
            AbstractC32895a.m71366a("wait time changed: " + c29685z2);
            AbstractC28073M0.updateState$default(this, false, new C329492(jLongValue, null), 1, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final void handleRequestLanguagesErrorAction() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329521(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleRetryUpload$lambda$13$lambda$12$lambda$11(SNSVideoIdentViewModel sNSVideoIdentViewModel, Throwable th2) {
        sNSVideoIdentViewModel.cancelUploadJob();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOperatorDisconnectTimeout() {
        AbstractC32895a.m71366a("onOperatorDisconnectTimeout");
        cancelDisconnectTimeoutJob();
        if (Intrinsics.areEqual(this.videoChatAdapter.getState(), C32925z.f67371a)) {
            AbstractC28073M0.updateState$default(this, false, new C329661(null), 1, null);
            this.videoChatAdapter.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPhotoMade$lambda$17(SNSVideoIdentViewModel sNSVideoIdentViewModel, Ref.BooleanRef booleanRef, Throwable th2) {
        sNSVideoIdentViewModel.cancelUploadJob();
        if (th2 != null) {
            C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "error after photo made ", th2);
        }
        if (booleanRef.element) {
            sNSVideoIdentViewModel.releaseUploadedBitmap();
        }
        return Unit.INSTANCE;
    }

    private final void onStartVideoCallClick() {
        doStartCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWaitForStatusUpdateTimeout() {
        AbstractC32895a.m71366a("onWaitForStatusUpdateTimeout");
        cancelWaitForStatusUpdateJob();
        C41696j.m91104d(this.videoIdentScope, null, null, new C329771(null), 3, null);
    }

    private final SNSStepViewItem.State stepStateForDocument(Document document) {
        if (Intrinsics.areEqual(getSelectedDocSetType(), document.getType().f59014a)) {
            return SNSStepViewItem.State.SELECTED;
        }
        if (document.isSubmitted()) {
            return SNSStepViewItem.State.DONE;
        }
        return SNSStepViewItem.State.DEFAULT;
    }

    private final void updateSelectedDocumentInfoWithPayload(C29424n3 payload) {
        String str;
        boolean z11;
        setRequestedDocumentPayload(payload);
        if (payload != null) {
            str = payload.f59425e;
        } else {
            str = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(str, SNSMessage$ServerMessage$ScreenShotPayload$Variant.UPLOAD.getValue());
        if (getRequestedDocumentPayload() != null && !zAreEqual) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.showPhotoFrame = z11;
    }

    @NotNull
    public final List<Document> getDocuments() {
        List<Document> updatedDocuments = getUpdatedDocuments();
        if (updatedDocuments.isEmpty()) {
            updatedDocuments = null;
        }
        if (updatedDocuments == null) {
            return this.initialDocs;
        }
        return updatedDocuments;
    }

    public final float getRemoteVideoAspectRatioScale() {
        C28979A3 c28979a3;
        C29728z3 c29728z3;
        int i11;
        int i12;
        C29124h config = getConfig();
        if (config == null || (c28979a3 = config.f59087t) == null || (c29728z3 = c28979a3.f58902a) == null || (i11 = c29728z3.f59795a) <= 0 || (i12 = c29728z3.f59796b) <= 0) {
            return 0.75f;
        }
        return i11 / i12;
    }

    public final void handleFileSelectedForDocSetType(@NotNull Uri uri) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329441(uri, null), 3, null);
    }

    public final void handleLanguageSelectionResult(@Nullable String selectedLanguage) {
        AbstractC32895a.m71366a("handleLanguageSelectionResult: " + getSpeakingLanguage() + " -> " + selectedLanguage);
        if (selectedLanguage == null && getSpeakingLanguage() == null) {
            close(false);
            return;
        }
        if (selectedLanguage != null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329461(selectedLanguage, null), 3, null);
        }
        if (selectedLanguage != null) {
            setSpeakingLanguage(selectedLanguage);
        }
        AbstractC28073M0.updateState$default(this, false, new C329472(null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        boolean z11;
        AbstractC29971N abstractC29971N;
        AbstractC29172p abstractC29172p;
        AbstractC32895a.m71366a("onBackPressed");
        C41713n0.m91129e(this.videoIdentScope, null, 1, null);
        if (this.exitingWithBackPress) {
            return;
        }
        this.exitingWithBackPress = true;
        SNSVideoChatState state = this.videoChatAdapter.getState();
        if (state != null && state.isConnected()) {
            this.videoChatAdapter.disconnect();
        }
        C29980i c29980i = (C29980i) ((C29967J) this.dataRepository).f60201i.getValue();
        if (c29980i != null && (abstractC29971N = c29980i.f60239a) != null && (abstractC29172p = (AbstractC29172p) abstractC29971N.m70051c()) != null && abstractC29172p.m69797d()) {
            z11 = true;
        } else {
            z11 = false;
        }
        close(!z11);
    }

    public final void onChangeLanguageClick() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329611(null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        cancelDisconnectTimeoutJob();
        cancelWaitForStatusUpdateJob();
        releaseUploadedBitmap();
        cancelUploadJob();
        C41713n0.m91129e(this.videoIdentScope, null, 1, null);
        this.uploadedFile = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public void onErrorCancelled(@NotNull AbstractC29149l0 error) {
        if (isNetworkError(error)) {
            close(false);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public void onHandleError(@NotNull AbstractC29149l0 error) {
        if (isNetworkError(error)) {
            handleRequestLanguagesErrorAction();
        } else {
            super.onHandleError(error);
        }
    }

    public final void onPhotoMade(@NotNull Bitmap photo) {
        cancelUploadJob();
        if (photo != this.uploadedBitmap) {
            releaseUploadedBitmap();
        }
        this.uploadedBitmap = photo;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(this.videoIdentScope, null, null, new C329671(photo, booleanRef, null), 3, null);
        this.uploadPhotoJob = interfaceC41775x1M91104d;
        interfaceC41775x1M91104d.mo90426j(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSVideoIdentViewModel.onPhotoMade$lambda$17(this.f67413b, booleanRef, (Throwable) obj);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    @Nullable
    public Object onPrepare(@NotNull Continuation<? super Unit> continuation) {
        List<Document> list;
        AbstractC32895a.m71366a("onPrepared");
        if (isChatRunning()) {
            SNSViewState sNSViewState = (SNSViewState) currentState();
            if ((sNSViewState instanceof SNSViewState.StateWithVideo) && ((SNSViewState.StateWithVideo) sNSViewState).getPreviewImage() != null) {
                AbstractC32895a.m71366a("onPrepared: skipping view update");
                return Unit.INSTANCE;
            }
            AbstractC28073M0.updateState$default(this, false, new C329682(null), 1, null);
            return Unit.INSTANCE;
        }
        if (C33048a.f67469c0.m71434a() && ((list = this.initialDocs) == null || !list.isEmpty())) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(((Document) it.next()).getType().f59014a, "PHONE_VERIFICATION", false, 2, (Object) null)) {
                    AbstractC32895a.m71366a("onPrepare: asking for a phone number...");
                    AbstractC28073M0.updateState$default(this, false, new C329694(null), 1, null);
                    return Unit.INSTANCE;
                }
            }
        }
        if (getSpeakingLanguage() == null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329705(null), 3, null);
            return Unit.INSTANCE;
        }
        AbstractC28073M0.updateState$default(this, false, new C329716(null), 1, null);
        return Unit.INSTANCE;
    }

    public final void onTertiaryButtonClick() {
        String str;
        C29424n3 requestedDocumentPayload = getRequestedDocumentPayload();
        if (requestedDocumentPayload != null) {
            str = requestedDocumentPayload.f59424d;
        } else {
            str = null;
        }
        if (str == null) {
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), SNSVideoIdent.logTag, "onUploadCurrentDocumentClick: no current document", null, 4, null);
        }
        AbstractC32895a.m71366a("upload click " + str);
        releaseUploadedBitmap();
        this.uploadedFile = null;
        Function1<? super String, Unit> function1 = this.onPickFile;
        if (function1 != null) {
            if (str == null) {
                str = "TYPE_UNKNOWN";
            }
            function1.invoke(str);
        }
    }

    public final void onUploadCancel() {
        AbstractC32895a.m71366a("onUploadCancel!");
        releaseUploadedBitmap();
        this.videoChatAdapter.sendMessage(new C29663w1());
        resetFieldAfterMakingPhoto();
        AbstractC28073M0.updateState$default(this, false, new C329721(null), 1, null);
    }

    public final void onViewStart() {
    }
}
