package com.swmansion.gesturehandler.core;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.util.Constants;
import com.kubi.payment.fast.data.entities.RecurringPlan;
import com.swmansion.gesturehandler.RNSVGHitTester;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rb0.C43974h;
import rb0.InterfaceC43969c;
import rb0.InterfaceC43978l;

/* JADX INFO: compiled from: GestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b)\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b.\b\u0016\u0018\u0000 æ\u0001*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0006ì\u0001í\u0001\u008e\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\n \"*\u0004\u0018\u00010!0!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00028\u0000H\u0004¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010,J\u000f\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0015H\u0016¢\u0006\u0004\b4\u0010\u0004J\u0019\u00106\u001a\u00020\u000f2\n\u00105\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00028\u00002\u0006\u00108\u001a\u00020\u000f¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u000f¢\u0006\u0004\b<\u0010:J\u0015\u0010>\u001a\u00028\u00002\u0006\u0010=\u001a\u00020\u000f¢\u0006\u0004\b>\u0010:J=\u0010F\u001a\u00028\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020?¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00028\u00002\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u001b\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010L\u001a\u00020\n¢\u0006\u0004\bM\u0010NJ!\u0010S\u001a\u00020\u00152\b\u0010P\u001a\u0004\u0018\u00010O2\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0015H\u0014¢\u0006\u0004\bU\u0010\u0004J\u0015\u0010W\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010'J\u0015\u0010X\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bX\u0010'J\u001d\u0010Z\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\bZ\u0010\u0017J\u001d\u0010[\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b[\u0010\u0017J\u000f\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b_\u0010^J\r\u0010`\u001a\u00020\u000f¢\u0006\u0004\b`\u0010aJ\u001b\u0010c\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\bc\u00107J\u0019\u0010d\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\bd\u00107J\u001b\u0010e\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\be\u00107J\u001b\u0010f\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\bf\u00107J'\u0010i\u001a\u00020\u000f2\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010g\u001a\u00020?2\u0006\u0010h\u001a\u00020?¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0015¢\u0006\u0004\bk\u0010\u0004J\r\u0010l\u001a\u00020\u0015¢\u0006\u0004\bl\u0010\u0004J\r\u0010m\u001a\u00020\u0015¢\u0006\u0004\bm\u0010\u0004J\u0017\u0010o\u001a\u00020\u00152\u0006\u0010n\u001a\u00020\u000fH\u0016¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020\u0015¢\u0006\u0004\bq\u0010\u0004J\r\u0010r\u001a\u00020\u0015¢\u0006\u0004\br\u0010\u0004J\u0019\u0010t\u001a\u00020\u000f2\n\u0010s\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\bt\u00107J\u000f\u0010u\u001a\u00020\u0015H\u0016¢\u0006\u0004\bu\u0010\u0004J\u001f\u0010v\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\bv\u0010\u0017J\u001f\u0010w\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\bw\u0010\u0017J\u001f\u0010y\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\n2\u0006\u0010x\u001a\u00020\nH\u0014¢\u0006\u0004\by\u00101J\u000f\u0010z\u001a\u00020\u0015H\u0014¢\u0006\u0004\bz\u0010\u0004J\u000f\u0010{\u001a\u00020\u0015H\u0014¢\u0006\u0004\b{\u0010\u0004J\u0017\u0010|\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0004¢\u0006\u0004\b|\u0010\u0011J\u0018\u0010\u007f\u001a\u00020}2\u0006\u0010~\u001a\u00020}H\u0004¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u000f\u0010\u0081\u0001\u001a\u00020\u0015¢\u0006\u0005\b\u0081\u0001\u0010\u0004J \u0010\u0084\u0001\u001a\u00020\u00152\u000e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0082\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J \u0010\u0088\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0013\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008f\u0001R'\u0010\u0099\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0096\u0001\u0010\u0092\u0001\u001a\u0005\b\u0097\u0001\u0010\f\"\u0005\b\u0098\u0001\u0010'R-\u0010P\u001a\u0004\u0018\u00010O2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010O8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R)\u0010¡\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u009f\u0001\u0010\u0092\u0001\u001a\u0005\b \u0001\u0010\fR(\u0010\u0019\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¢\u0001\u0010\b\u001a\u0006\b£\u0001\u0010¤\u0001R(\u0010\u0018\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¥\u0001\u0010\b\u001a\u0006\b¦\u0001\u0010¤\u0001R'\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bm\u0010)\u001a\u0005\b§\u0001\u0010aR'\u0010ª\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bo\u0010)\u001a\u0005\b©\u0001\u0010aR&\u0010\u00ad\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0012\u0010\u0092\u0001\u001a\u0005\b«\u0001\u0010\f\"\u0005\b¬\u0001\u0010'R,\u0010°\u0001\u001a\u0004\u0018\u00010\\2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\\8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u001e\u0010®\u0001\u001a\u0005\b¯\u0001\u0010^R,\u0010²\u0001\u001a\u0004\u0018\u00010\\2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\\8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b \u0010®\u0001\u001a\u0005\b±\u0001\u0010^R(\u0010´\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bq\u0010\u0092\u0001\u001a\u0005\b³\u0001\u0010\fR(\u0010¶\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bk\u0010\u0092\u0001\u001a\u0005\bµ\u0001\u0010\fR\u001f\u0010¹\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010¸\u0001R%\u0010¼\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b_\u0010)\u001a\u0005\bº\u0001\u0010a\"\u0005\b»\u0001\u0010pR\u001b\u0010¿\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010¾\u0001R+\u0010Ã\u0001\u001a\u00030À\u00012\b\u0010\u009a\u0001\u001a\u00030À\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b#\u0010³\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R(\u0010Å\u0001\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\b2\u0010\b\u001a\u0006\bÄ\u0001\u0010¤\u0001R(\u0010Ç\u0001\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\b0\u0010\b\u001a\u0006\bÆ\u0001\u0010¤\u0001R\u0016\u0010=\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0017\u0010È\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\bR\u0017\u0010É\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0016\u00108\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R(\u0010Ë\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\br\u0010\u0092\u0001\u001a\u0005\bÊ\u0001\u0010\fR)\u0010R\u001a\u0004\u0018\u00010Q8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b\u001a\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u001b\u0010Ò\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010Ñ\u0001R\u001a\u0010Ô\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010Ó\u0001R)\u0010Ö\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b«\u0001\u0010\u0092\u0001\u001a\u0005\bÕ\u0001\u0010\fR&\u0010L\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b×\u0001\u0010\u0092\u0001\u001a\u0005\bØ\u0001\u0010\f\"\u0005\bÙ\u0001\u0010'R&\u0010Û\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\b\u0010\u0092\u0001\u001a\u0005\b×\u0001\u0010\f\"\u0005\bÚ\u0001\u0010'R&\u0010Þ\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÁ\u0001\u0010)\u001a\u0005\bÜ\u0001\u0010a\"\u0005\bÝ\u0001\u0010pR&\u0010â\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bß\u0001\u0010)\u001a\u0005\bà\u0001\u0010a\"\u0005\bá\u0001\u0010pR&\u0010å\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010)\u001a\u0005\bã\u0001\u0010a\"\u0005\bä\u0001\u0010pR\u0014\u0010ç\u0001\u001a\u00020?8F¢\u0006\b\u001a\u0006\bæ\u0001\u0010¤\u0001R\u0014\u0010é\u0001\u001a\u00020?8F¢\u0006\b\u001a\u0006\bè\u0001\u0010¤\u0001R\u0014\u0010ê\u0001\u001a\u00020?8F¢\u0006\b\u001a\u0006\bß\u0001\u0010¤\u0001R\u0014\u0010ë\u0001\u001a\u00020?8F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010¤\u0001¨\u0006î\u0001"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler;", "ConcreteGestureHandlerT", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "F", "(Landroid/content/Context;)Landroid/app/Activity;", "", "C", "()I", "Landroid/view/MotionEvent;", "event", "", "f0", "(Landroid/view/MotionEvent;)Z", "k", "(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;", "sourceEvent", "", "v", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "y", "x", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "p", "Lcom/swmansion/gesturehandler/core/GestureHandler$a;", "pointerData", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V", "m", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)Lcom/facebook/react/bridge/WritableMap;", "newState", "e0", "(I)V", "clickedButton", "Z", "(I)Z", "D0", "(Landroid/view/MotionEvent;)V", "q0", "()Lcom/swmansion/gesturehandler/core/GestureHandler;", "prevState", "u", "(II)V", "t", "w", "o0", "other", ExifInterface.LONGITUDE_WEST, "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "shouldCancelWhenOutside", "E0", "(Z)Lcom/swmansion/gesturehandler/core/GestureHandler;", "enabled", "v0", "manualActivation", "z0", "", "leftPad", "topPad", "rightPad", "bottomPad", "width", "height", "x0", "(FFFFFF)Lcom/swmansion/gesturehandler/core/GestureHandler;", "Lrb0/c;", "controller", "y0", "(Lrb0/c;)Lcom/swmansion/gesturehandler/core/GestureHandler;", "mouseButton", "A0", "(I)Lcom/swmansion/gesturehandler/core/GestureHandler;", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;", "orchestrator", "m0", "(Landroid/view/View;Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;)V", "j0", "pointerId", "M0", "N0", "transformedEvent", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "P0", "Lcom/facebook/react/bridge/WritableArray;", "r", "()Lcom/facebook/react/bridge/WritableArray;", "q", "Q0", "()Z", "handler", "K0", "L0", "J0", "I0", "posX", "posY", "d0", "(Landroid/view/View;FF)Z", "o", "B", "i", "force", "j", "(Z)V", "n", "z", "of", "a0", "p0", "h0", "i0", "previousState", "l0", "k0", "g0", "H0", "Landroid/graphics/PointF;", "point", "O0", "(Landroid/graphics/PointF;)Landroid/graphics/PointF;", "n0", "Lkotlin/Function0;", "closure", "R0", "(Lkotlin/jvm/functions/Function0;)V", "Lrb0/l;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "C0", "(Lrb0/l;)Lcom/swmansion/gesturehandler/core/GestureHandler;", "", "toString", "()Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[I", "trackedPointerIDs", "b", "I", "trackedPointersIDsCount", "c", "windowOffset", "d", "R", "G0", "tag", "value", "e", "Landroid/view/View;", "U", "()Landroid/view/View;", "f", "Q", "state", "g", "getX", "()F", CmcdData.Factory.STREAMING_FORMAT_HLS, "getY", "c0", "isWithinBounds", "b0", Constants.ENABLE_DISABLE, "D", "r0", "actionType", "Lcom/facebook/react/bridge/WritableArray;", "getChangedTouchesPayload", "changedTouchesPayload", "getAllTouchesPayload", "allTouchesPayload", ExifInterface.LATITUDE_SOUTH, "touchEventType", ExifInterface.GPS_DIRECTION_TRUE, "trackedPointersCount", "", "[Lcom/swmansion/gesturehandler/core/GestureHandler$a;", "trackedPointers", "L", "B0", "needsPointerData", "", "[F", "hitSlop", "", "G", "()S", "eventCoalescingKey", "getLastAbsolutePositionX", "lastAbsolutePositionX", "getLastAbsolutePositionY", "lastAbsolutePositionY", "lastEventOffsetX", "lastEventOffsetY", "M", "numberOfPointers", "Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;", "N", "()Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;", "setOrchestrator", "(Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;)V", "Lrb0/l;", "onTouchEventListener", "Lrb0/c;", "interactionController", "O", "pointerType", ExifInterface.LONGITUDE_EAST, "getMouseButton", "setMouseButton", "s0", "activationIndex", "X", "t0", "isActive", "H", "Y", "u0", "isAwaiting", "P", "F0", "shouldResetProgress", "J", "lastRelativePositionX", "K", "lastRelativePositionY", "lastPositionInWindowX", "lastPositionInWindowY", "AdaptEventException", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGestureHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureHandler.kt\ncom/swmansion/gesturehandler/core/GestureHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,893:1\n80#1:895\n80#1:897\n80#1:899\n80#1:901\n80#1:903\n1#2:894\n1#2:896\n1#2:898\n1#2:900\n1#2:902\n1#2:904\n*S KotlinDebug\n*F\n+ 1 GestureHandler.kt\ncom/swmansion/gesturehandler/core/GestureHandler\n*L\n120#1:895\n122#1:897\n135#1:899\n144#1:901\n165#1:903\n120#1:896\n122#1:898\n135#1:900\n144#1:902\n165#1:904\n*E\n"})
public class GestureHandler<ConcreteGestureHandlerT extends GestureHandler<ConcreteGestureHandlerT>> {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: K */
    public static MotionEvent.PointerProperties[] f68144K;

    /* JADX INFO: renamed from: L */
    public static MotionEvent.PointerCoords[] f68145L;

    /* JADX INFO: renamed from: M */
    public static short f68146M;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public GestureHandlerOrchestrator orchestrator;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public InterfaceC43978l onTouchEventListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public InterfaceC43969c interactionController;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int pointerType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int mouseButton;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int activationIndex;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean isActive;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean isAwaiting;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean shouldResetProgress;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final int[] trackedPointerIDs = new int[12];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int trackedPointersIDsCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final int[] windowOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public View view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float x;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float y;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isWithinBounds;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int actionType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public WritableArray changedTouchesPayload;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public WritableArray allTouchesPayload;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int touchEventType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int trackedPointersCount;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final PointerData[] trackedPointers;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean needsPointerData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public float[] hitSlop;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public short eventCoalescingKey;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float lastAbsolutePositionX;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float lastAbsolutePositionY;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean manualActivation;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float lastEventOffsetX;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public float lastEventOffsetY;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean shouldCancelWhenOutside;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int numberOfPointers;

    /* JADX INFO: compiled from: GestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$AdaptEventException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handler", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "event", "Landroid/view/MotionEvent;", "e", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;Ljava/lang/IllegalArgumentException;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class AdaptEventException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdaptEventException(@NotNull GestureHandler<?> handler, @NotNull MotionEvent event, @NotNull IllegalArgumentException e11) {
            super(StringsKt.trimIndent("\n    handler: " + Reflection.getOrCreateKotlinClass(handler.getClass()).getSimpleName() + "\n    state: " + handler.getState() + "\n    view: " + handler.getView() + "\n    orchestrator: " + handler.getOrchestrator() + "\n    isEnabled: " + handler.getIsEnabled() + "\n    isActive: " + handler.getIsActive() + "\n    isAwaiting: " + handler.getIsAwaiting() + "\n    trackedPointersCount: " + handler.trackedPointersIDsCount + "\n    trackedPointers: " + ArraysKt.joinToString$default(handler.trackedPointerIDs, (CharSequence) ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "\n    while handling event: " + event + "\n    "), e11);
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(e11, "e");
        }
    }

    /* JADX INFO: compiled from: GestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0013R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0013R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0013R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0013R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0013R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0013R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0013R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0013R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0013R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0013R\u001e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;", "", "<init>", "()V", "", "state", "", "stateToString", "(I)Ljava/lang/String;", "size", "", "b", "(I)V", "", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(F)Z", "STATE_UNDETERMINED", "I", "STATE_FAILED", "STATE_BEGAN", "STATE_CANCELLED", "STATE_ACTIVE", "STATE_END", "HIT_SLOP_NONE", "F", "HIT_SLOP_LEFT_IDX", "HIT_SLOP_TOP_IDX", "HIT_SLOP_RIGHT_IDX", "HIT_SLOP_BOTTOM_IDX", "HIT_SLOP_WIDTH_IDX", "HIT_SLOP_HEIGHT_IDX", "DIRECTION_RIGHT", "DIRECTION_LEFT", "DIRECTION_UP", "DIRECTION_DOWN", "ACTION_TYPE_REANIMATED_WORKLET", "ACTION_TYPE_NATIVE_ANIMATED_EVENT", "ACTION_TYPE_JS_FUNCTION_OLD_API", "ACTION_TYPE_JS_FUNCTION_NEW_API", "POINTER_TYPE_TOUCH", "POINTER_TYPE_STYLUS", "POINTER_TYPE_MOUSE", "POINTER_TYPE_OTHER", "MAX_POINTERS_COUNT", "", "Landroid/view/MotionEvent$PointerProperties;", "pointerProps", "[Landroid/view/MotionEvent$PointerProperties;", "Landroid/view/MotionEvent$PointerCoords;", "pointerCoords", "[Landroid/view/MotionEvent$PointerCoords;", "", "nextEventCoalescingKey", ExifInterface.LATITUDE_SOUTH, "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final String stateToString(int state) {
            if (state == 0) {
                return "UNDETERMINED";
            }
            if (state == 1) {
                return "FAILED";
            }
            if (state == 2) {
                return "BEGIN";
            }
            if (state == 3) {
                return RecurringPlan.CANCELLED;
            }
            if (state == 4) {
                return "ACTIVE";
            }
            if (state != 5) {
                return null;
            }
            return "END";
        }

        /* JADX INFO: renamed from: a */
        public final boolean m71810a(float value) {
            return !Float.isNaN(value);
        }

        /* JADX INFO: renamed from: b */
        public final void m71811b(int size) {
            if (GestureHandler.f68144K == null) {
                GestureHandler.f68144K = new MotionEvent.PointerProperties[12];
                GestureHandler.f68145L = new MotionEvent.PointerCoords[12];
            }
            while (size > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = GestureHandler.f68144K;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i11 = size - 1;
                if (pointerPropertiesArr[i11] == null) {
                    MotionEvent.PointerProperties[] pointerPropertiesArr2 = GestureHandler.f68144K;
                    if (pointerPropertiesArr2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                        pointerPropertiesArr2 = null;
                    }
                    pointerPropertiesArr2[i11] = new MotionEvent.PointerProperties();
                    MotionEvent.PointerCoords[] pointerCoordsArr2 = GestureHandler.f68145L;
                    if (pointerCoordsArr2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                    } else {
                        pointerCoordsArr = pointerCoordsArr2;
                    }
                    pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                    size--;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.GestureHandler$a, reason: from toString */
    /* JADX INFO: compiled from: GestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006!"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$a;", "", "", "pointerId", "", "x", "y", "absoluteX", "absoluteY", "<init>", "(IFFFF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "c", "b", "F", "d", "()F", CmcdData.Factory.STREAMING_FORMAT_HLS, "(F)V", "e", "i", "f", "g", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class PointerData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int pointerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public float x;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public float y;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public float absoluteX;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        public float absoluteY;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointerData)) {
                return false;
            }
            PointerData pointerData = (PointerData) other;
            return this.pointerId == pointerData.pointerId && Float.compare(this.x, pointerData.x) == 0 && Float.compare(this.y, pointerData.y) == 0 && Float.compare(this.absoluteX, pointerData.absoluteX) == 0 && Float.compare(this.absoluteY, pointerData.absoluteY) == 0;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getAbsoluteX() {
            return this.absoluteX;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getAbsoluteY() {
            return this.absoluteY;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getPointerId() {
            return this.pointerId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: f */
        public final void m71817f(float f11) {
            this.absoluteX = f11;
        }

        /* JADX INFO: renamed from: g */
        public final void m71818g(float f11) {
            this.absoluteY = f11;
        }

        /* JADX INFO: renamed from: h */
        public final void m71819h(float f11) {
            this.x = f11;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.pointerId) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.absoluteX)) * 31) + Float.hashCode(this.absoluteY);
        }

        /* JADX INFO: renamed from: i */
        public final void m71820i(float f11) {
            this.y = f11;
        }

        @NotNull
        public String toString() {
            return "PointerData(pointerId=" + this.pointerId + ", x=" + this.x + ", y=" + this.y + ", absoluteX=" + this.absoluteX + ", absoluteY=" + this.absoluteY + ")";
        }

        public PointerData(int i11, float f11, float f12, float f13, float f14) {
            this.pointerId = i11;
            this.x = f11;
            this.y = f12;
            this.absoluteX = f13;
            this.absoluteY = f14;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m71728A() {
        this.allTouchesPayload = null;
        for (PointerData pointerData : this.trackedPointers) {
            if (pointerData != null) {
                m71784m(pointerData);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m71732C() {
        int[] iArr;
        int i11 = 0;
        while (i11 < this.trackedPointersIDsCount) {
            int i12 = 0;
            while (true) {
                iArr = this.trackedPointerIDs;
                if (i12 >= iArr.length || iArr[i12] == i11) {
                    break;
                }
                i12++;
            }
            if (i12 == iArr.length) {
                break;
            }
            i11++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: i */
    public final void m71778i() {
        mo71716j(false);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m71787n0() {
        this.view = null;
        this.orchestrator = null;
        Arrays.fill(this.trackedPointerIDs, -1);
        this.trackedPointersIDsCount = 0;
        this.trackedPointersCount = 0;
        ArraysKt.fill$default(this.trackedPointers, (Object) null, 0, 0, 6, (Object) null);
        this.touchEventType = 0;
        mo71717k0();
    }

    /* JADX INFO: renamed from: o0 */
    public void mo71718o0() {
        this.needsPointerData = false;
        this.manualActivation = false;
        this.shouldCancelWhenOutside = false;
        this.isEnabled = true;
        this.hitSlop = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m71789p() {
        this.touchEventType = 4;
        this.changedTouchesPayload = null;
        m71728A();
        for (PointerData pointerData : this.trackedPointers) {
            if (pointerData != null) {
                m71782l(pointerData);
            }
        }
        this.trackedPointersCount = 0;
        ArraysKt.fill$default(this.trackedPointers, (Object) null, 0, 0, 6, (Object) null);
        m71803w();
    }

    /* JADX INFO: renamed from: v */
    public final void m71801v(MotionEvent event, MotionEvent sourceEvent) {
        this.changedTouchesPayload = null;
        this.touchEventType = 1;
        int pointerId = event.getPointerId(event.getActionIndex());
        this.trackedPointers[pointerId] = new PointerData(pointerId, event.getX(event.getActionIndex()), event.getY(event.getActionIndex()), (sourceEvent.getX(event.getActionIndex()) + (sourceEvent.getRawX() - sourceEvent.getX())) - this.windowOffset[0], (sourceEvent.getY(event.getActionIndex()) + (sourceEvent.getRawY() - sourceEvent.getY())) - this.windowOffset[1]);
        this.trackedPointersCount++;
        PointerData pointerData = this.trackedPointers[pointerId];
        Intrinsics.checkNotNull(pointerData);
        m71782l(pointerData);
        m71728A();
        m71803w();
    }

    /* JADX INFO: renamed from: x */
    public final void m71804x(MotionEvent event, MotionEvent sourceEvent) {
        this.changedTouchesPayload = null;
        this.touchEventType = 2;
        float rawX = sourceEvent.getRawX() - sourceEvent.getX();
        float rawY = sourceEvent.getRawY() - sourceEvent.getY();
        int pointerCount = event.getPointerCount();
        int i11 = 0;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            PointerData pointerData = this.trackedPointers[event.getPointerId(i12)];
            if (pointerData != null && (pointerData.getX() != event.getX(i12) || pointerData.getY() != event.getY(i12))) {
                pointerData.m71819h(event.getX(i12));
                pointerData.m71820i(event.getY(i12));
                pointerData.m71817f((sourceEvent.getX(i12) + rawX) - this.windowOffset[0]);
                pointerData.m71818g((sourceEvent.getY(i12) + rawY) - this.windowOffset[1]);
                m71782l(pointerData);
                i11++;
            }
        }
        if (i11 > 0) {
            m71728A();
            m71803w();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final GestureHandler<ConcreteGestureHandlerT> m71729A0(int mouseButton) {
        this.mouseButton = mouseButton;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final void m71730B() {
        int i11 = this.state;
        if (i11 == 4 || i11 == 0 || i11 == 2) {
            m71776e0(1);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m71731B0(boolean z11) {
        this.needsPointerData = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public final GestureHandler<?> m71733C0(@Nullable InterfaceC43978l listener) {
        this.onTouchEventListener = listener;
        return this;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getActivationIndex() {
        return this.activationIndex;
    }

    /* JADX INFO: renamed from: F */
    public final Activity m71738F(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m71738F(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m71739F0(boolean z11) {
        this.shouldResetProgress = z11;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final short getEventCoalescingKey() {
        return this.eventCoalescingKey;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m71741G0(int i11) {
        this.tag = i11;
    }

    /* JADX INFO: renamed from: H */
    public final float m71742H() {
        return (this.lastAbsolutePositionX + this.lastEventOffsetX) - this.windowOffset[0];
    }

    /* JADX INFO: renamed from: I */
    public final float m71744I() {
        return (this.lastAbsolutePositionY + this.lastEventOffsetY) - this.windowOffset[1];
    }

    /* JADX INFO: renamed from: I0 */
    public boolean mo71745I0(@NotNull GestureHandler<?> handler) {
        InterfaceC43969c interfaceC43969c;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (interfaceC43969c = this.interactionController) == null) {
            return false;
        }
        return interfaceC43969c.mo71999d(this, handler);
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final float getLastAbsolutePositionX() {
        return this.lastAbsolutePositionX;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean mo71747J0(@NotNull GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this) {
            return true;
        }
        InterfaceC43969c interfaceC43969c = this.interactionController;
        if (interfaceC43969c != null) {
            return interfaceC43969c.mo71998c(this, handler);
        }
        return false;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final float getLastAbsolutePositionY() {
        return this.lastAbsolutePositionY;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean mo71749K0(@NotNull GestureHandler<?> handler) {
        InterfaceC43969c interfaceC43969c;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (interfaceC43969c = this.interactionController) == null) {
            return false;
        }
        return interfaceC43969c.mo71997b(this, handler);
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getNeedsPointerData() {
        return this.needsPointerData;
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m71751L0(@NotNull GestureHandler<?> handler) {
        InterfaceC43969c interfaceC43969c;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (interfaceC43969c = this.interactionController) == null) {
            return false;
        }
        return interfaceC43969c.mo71996a(this, handler);
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final int getNumberOfPointers() {
        return this.numberOfPointers;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m71753M0(int pointerId) {
        int[] iArr = this.trackedPointerIDs;
        if (iArr[pointerId] == -1) {
            iArr[pointerId] = m71732C();
            this.trackedPointersIDsCount++;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: N, reason: from getter */
    public final GestureHandlerOrchestrator getOrchestrator() {
        return this.orchestrator;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m71755N0(int pointerId) {
        int[] iArr = this.trackedPointerIDs;
        if (iArr[pointerId] != -1) {
            iArr[pointerId] = -1;
            this.trackedPointersIDsCount--;
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getPointerType() {
        return this.pointerType;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final boolean getShouldResetProgress() {
        return this.shouldResetProgress;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m71759P0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            m71801v(event, sourceEvent);
            m71804x(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            m71804x(event, sourceEvent);
            m71806y(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            m71804x(event, sourceEvent);
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m71761Q0() {
        int i11;
        return (!this.isEnabled || (i11 = this.state) == 1 || i11 == 3 || i11 == 5 || this.trackedPointersIDsCount <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m71763R0(@NotNull Function0<Unit> closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        this.isWithinBounds = true;
        closure.invoke();
        this.isWithinBounds = false;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final int getTouchEventType() {
        return this.touchEventType;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final int getTrackedPointersCount() {
        return this.trackedPointersCount;
    }

    @Nullable
    /* JADX INFO: renamed from: U, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final boolean getIsAwaiting() {
        return this.isAwaiting;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m71771Z(int clickedButton) {
        int i11 = this.mouseButton;
        if (i11 == 0) {
            return clickedButton == 1;
        }
        return (clickedButton & i11) != 0;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final boolean getIsWithinBounds() {
        return this.isWithinBounds;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m71775d0(@Nullable View view, float posX, float posY) {
        float f11;
        RNSVGHitTester.Companion companion = RNSVGHitTester.INSTANCE;
        Intrinsics.checkNotNull(view);
        if (companion.isSvgElement(view)) {
            return companion.hitTest(view, posX, posY);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.hitSlop;
        float f12 = 0.0f;
        if (fArr != null) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            Companion companion2 = INSTANCE;
            float f17 = companion2.m71810a(f13) ? 0.0f - f13 : 0.0f;
            f12 = companion2.m71810a(f14) ? 0.0f - f14 : 0.0f;
            if (companion2.m71810a(f15)) {
                width += f15;
            }
            if (companion2.m71810a(f16)) {
                height += f16;
            }
            float f18 = fArr[4];
            float f19 = fArr[5];
            if (companion2.m71810a(f18)) {
                if (!companion2.m71810a(f13)) {
                    f17 = width - f18;
                } else if (!companion2.m71810a(f15)) {
                    width = f18 + f17;
                }
            }
            if (companion2.m71810a(f19)) {
                if (!companion2.m71810a(f14)) {
                    f12 = height - f19;
                } else if (!companion2.m71810a(f16)) {
                    height = f19 + f12;
                }
            }
            f11 = f12;
            f12 = f17;
        } else {
            f11 = 0.0f;
        }
        return f12 <= posX && posX <= width && f11 <= posY && posY <= height;
    }

    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        m71776e0(1);
    }

    /* JADX INFO: renamed from: i0 */
    public void mo71779i0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
    }

    /* JADX INFO: renamed from: j */
    public void mo71716j(boolean force) {
        if (!this.manualActivation || force) {
            int i11 = this.state;
            if (i11 == 0 || i11 == 2) {
                m71776e0(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX INFO: renamed from: k */
    public final MotionEvent m71781k(MotionEvent event) throws AdaptEventException {
        int actionIndex;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        if (!m71777f0(event)) {
            return event;
        }
        int actionMasked = event.getActionMasked();
        int i11 = 2;
        int i12 = 0;
        if (actionMasked == 0) {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 0;
                } else {
                    i11 = 5;
                }
            }
        } else if (actionMasked == 1) {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 1;
                } else {
                    i11 = 6;
                }
            }
        } else if (actionMasked == 5) {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 0;
                } else {
                    i11 = 5;
                }
            }
        } else if (actionMasked != 6) {
            i11 = actionMasked;
            actionIndex = -1;
        } else {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 1;
                } else {
                    i11 = 6;
                }
            }
        }
        INSTANCE.m71811b(this.trackedPointersIDsCount);
        float rawX = event.getRawX() - event.getX();
        float rawY = event.getRawY() - event.getY();
        event.offsetLocation(rawX, rawY);
        int pointerCount = event.getPointerCount();
        int i13 = i11;
        int i14 = 0;
        while (true) {
            pointerPropertiesArr = null;
            MotionEvent.PointerCoords[] pointerCoordsArr2 = null;
            if (i12 >= pointerCount) {
                break;
            }
            int pointerId = event.getPointerId(i12);
            if (this.trackedPointerIDs[pointerId] != -1) {
                MotionEvent.PointerProperties[] pointerPropertiesArr3 = f68144K;
                if (pointerPropertiesArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr3 = null;
                }
                event.getPointerProperties(i12, pointerPropertiesArr3[i14]);
                MotionEvent.PointerProperties[] pointerPropertiesArr4 = f68144K;
                if (pointerPropertiesArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr4 = null;
                }
                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr4[i14];
                Intrinsics.checkNotNull(pointerProperties);
                pointerProperties.id = this.trackedPointerIDs[pointerId];
                MotionEvent.PointerCoords[] pointerCoordsArr3 = f68145L;
                if (pointerCoordsArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                } else {
                    pointerCoordsArr2 = pointerCoordsArr3;
                }
                event.getPointerCoords(i12, pointerCoordsArr2[i14]);
                if (i12 == actionIndex) {
                    i13 |= i14 << 8;
                }
                i14++;
            }
            i12++;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr5 = f68144K;
        if (pointerPropertiesArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
            pointerPropertiesArr5 = null;
        }
        if (pointerPropertiesArr5.length != 0) {
            MotionEvent.PointerCoords[] pointerCoordsArr4 = f68145L;
            if (pointerCoordsArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                pointerCoordsArr4 = null;
            }
            if (pointerCoordsArr4.length != 0) {
                try {
                    long downTime = event.getDownTime();
                    long eventTime = event.getEventTime();
                    MotionEvent.PointerProperties[] pointerPropertiesArr6 = f68144K;
                    if (pointerPropertiesArr6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                        pointerPropertiesArr2 = null;
                    } else {
                        pointerPropertiesArr2 = pointerPropertiesArr6;
                    }
                    MotionEvent.PointerCoords[] pointerCoordsArr5 = f68145L;
                    if (pointerCoordsArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                        pointerCoordsArr = null;
                    } else {
                        pointerCoordsArr = pointerCoordsArr5;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(downTime, eventTime, i13, i14, pointerPropertiesArr2, pointerCoordsArr, event.getMetaState(), event.getButtonState(), event.getXPrecision(), event.getYPrecision(), event.getDeviceId(), event.getEdgeFlags(), event.getSource(), event.getFlags());
                    float f11 = -rawX;
                    float f12 = -rawY;
                    event.offsetLocation(f11, f12);
                    motionEventObtain.offsetLocation(f11, f12);
                    return motionEventObtain;
                } catch (IllegalArgumentException e11) {
                    throw new AdaptEventException(this, event, e11);
                }
            }
        }
        MotionEvent.PointerCoords[] pointerCoordsArr6 = f68145L;
        if (pointerCoordsArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
            pointerCoordsArr6 = null;
        }
        int length = pointerCoordsArr6.length;
        MotionEvent.PointerProperties[] pointerPropertiesArr7 = f68144K;
        if (pointerPropertiesArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
        } else {
            pointerPropertiesArr = pointerPropertiesArr7;
        }
        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerPropertiesArr.length);
    }

    /* JADX INFO: renamed from: l */
    public final void m71782l(PointerData pointerData) {
        if (this.changedTouchesPayload == null) {
            this.changedTouchesPayload = Arguments.createArray();
        }
        WritableArray writableArray = this.changedTouchesPayload;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(m71795s(pointerData));
    }

    /* JADX INFO: renamed from: m */
    public final void m71784m(PointerData pointerData) {
        if (this.allTouchesPayload == null) {
            this.allTouchesPayload = Arguments.createArray();
        }
        WritableArray writableArray = this.allTouchesPayload;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(m71795s(pointerData));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m71785m0(@Nullable View view, @Nullable GestureHandlerOrchestrator orchestrator) {
        if (this.view != null || this.orchestrator != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.trackedPointerIDs, -1);
        this.trackedPointersIDsCount = 0;
        this.state = 0;
        this.view = view;
        this.orchestrator = orchestrator;
        Activity activityM71738F = m71738F(view != null ? view.getContext() : null);
        View viewFindViewById = activityM71738F != null ? activityM71738F.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.windowOffset);
        } else {
            int[] iArr = this.windowOffset;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        mo71780j0();
    }

    /* JADX INFO: renamed from: n */
    public final void m71786n() {
        if (this.state == 0) {
            m71776e0(2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m71788o() {
        int i11 = this.state;
        if (i11 == 4 || i11 == 0 || i11 == 2 || this.isAwaiting) {
            mo71714g0();
            m71776e0(3);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final WritableArray m71791q() {
        WritableArray writableArray = this.allTouchesPayload;
        this.allTouchesPayload = null;
        return writableArray;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final WritableArray m71793r() {
        WritableArray writableArray = this.changedTouchesPayload;
        this.changedTouchesPayload = null;
        return writableArray;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m71794r0(int i11) {
        this.actionType = i11;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m71796s0(int i11) {
        this.activationIndex = i11;
    }

    /* JADX INFO: renamed from: t */
    public void mo71797t(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC43978l interfaceC43978l = this.onTouchEventListener;
        if (interfaceC43978l != null) {
            interfaceC43978l.mo72036c(m71792q0(), event);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m71798t0(boolean z11) {
        this.isActive = z11;
    }

    @NotNull
    public String toString() {
        String simpleName;
        View view = this.view;
        if (view == null) {
            simpleName = null;
        } else {
            Intrinsics.checkNotNull(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.tag + "]:" + simpleName;
    }

    /* JADX INFO: renamed from: u */
    public void mo71799u(int newState, int prevState) {
        InterfaceC43978l interfaceC43978l = this.onTouchEventListener;
        if (interfaceC43978l != null) {
            interfaceC43978l.mo72034a(m71792q0(), newState, prevState);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m71800u0(boolean z11) {
        this.isAwaiting = z11;
    }

    /* JADX INFO: renamed from: w */
    public void m71803w() {
        InterfaceC43978l interfaceC43978l;
        if (this.changedTouchesPayload == null || (interfaceC43978l = this.onTouchEventListener) == null) {
            return;
        }
        interfaceC43978l.mo72035b(m71792q0());
    }

    /* JADX INFO: renamed from: z */
    public final void m71808z() {
        int i11 = this.state;
        if (i11 == 2 || i11 == 4) {
            m71776e0(5);
        }
    }

    public GestureHandler() {
        int[] iArr = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr[i11] = 0;
        }
        this.windowOffset = iArr;
        this.isEnabled = true;
        PointerData[] pointerDataArr = new PointerData[12];
        for (int i12 = 0; i12 < 12; i12++) {
            pointerDataArr[i12] = null;
        }
        this.trackedPointers = pointerDataArr;
        this.pointerType = 3;
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m71727w0(GestureHandler gestureHandler) {
        gestureHandler.m71788o();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m71735D0(MotionEvent event) {
        int toolType = event.getToolType(event.getActionIndex());
        int i11 = 1;
        if (toolType != 1) {
            if (toolType != 2) {
                i11 = 3;
                if (toolType == 3) {
                    i11 = 2;
                }
            }
        } else {
            i11 = 0;
        }
        this.pointerType = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final ConcreteGestureHandlerT m71737E0(boolean shouldCancelWhenOutside) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m71792q0();
        concretegesturehandlert.shouldCancelWhenOutside = shouldCancelWhenOutside;
        return concretegesturehandlert;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m71743H0(@NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || (sourceEvent.getAction() != 2 && !m71771Z(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !m71771Z(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final PointF m71757O0(@NotNull PointF point) {
        PointF pointFM71839K;
        Intrinsics.checkNotNullParameter(point, "point");
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        if (gestureHandlerOrchestrator != null && (pointFM71839K = gestureHandlerOrchestrator.m71839K(this.view, point)) != null) {
            return pointFM71839K;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    /* JADX INFO: renamed from: V */
    public final void m71767V(@NotNull MotionEvent transformedEvent, @NotNull MotionEvent sourceEvent) {
        int i11;
        Intrinsics.checkNotNullParameter(transformedEvent, "transformedEvent");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (this.isEnabled && (i11 = this.state) != 3 && i11 != 1 && i11 != 5 && this.trackedPointersIDsCount >= 1) {
            try {
                MotionEvent[] motionEventArr = {m71781k(transformedEvent), m71781k(sourceEvent)};
                MotionEvent motionEvent = motionEventArr[0];
                MotionEvent motionEvent2 = motionEventArr[1];
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
                this.numberOfPointers = motionEvent.getPointerCount();
                boolean zM71775d0 = m71775d0(this.view, this.x, this.y);
                this.isWithinBounds = zM71775d0;
                if (this.shouldCancelWhenOutside && !zM71775d0) {
                    int i12 = this.state;
                    if (i12 == 4) {
                        m71788o();
                        return;
                    } else {
                        if (i12 == 2) {
                            m71730B();
                            return;
                        }
                        return;
                    }
                }
                C43974h c43974h = C43974h.f97180a;
                this.lastAbsolutePositionX = c43974h.m96912b(motionEvent, true);
                this.lastAbsolutePositionY = c43974h.m96913c(motionEvent, true);
                this.lastEventOffsetX = motionEvent.getRawX() - motionEvent.getX();
                this.lastEventOffsetY = motionEvent.getRawY() - motionEvent.getY();
                if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                    m71735D0(sourceEvent);
                }
                if (sourceEvent.getAction() != 9 && sourceEvent.getAction() != 7 && sourceEvent.getAction() != 10) {
                    mo71715h0(motionEvent, motionEvent2);
                } else {
                    mo71779i0(motionEvent, motionEvent2);
                }
                if (!Intrinsics.areEqual(motionEvent, transformedEvent)) {
                    motionEvent.recycle();
                }
                if (!Intrinsics.areEqual(motionEvent2, sourceEvent)) {
                    motionEvent2.recycle();
                }
            } catch (AdaptEventException unused) {
                m71730B();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m71768W(@NotNull GestureHandler<?> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.trackedPointerIDs.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.trackedPointerIDs[i11] != -1 && other.trackedPointerIDs[i11] != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        r0 = null;
     */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m71772a0(@NotNull GestureHandler<?> of2) {
        Object parent;
        View view;
        Intrinsics.checkNotNullParameter(of2, "of");
        View view2 = this.view;
        if (view2 != null) {
            parent = view2.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null) {
                if (Intrinsics.areEqual(view, of2.view)) {
                    return true;
                }
                Object parent2 = view.getParent();
                if (!(parent2 instanceof View)) {
                    view = null;
                } else {
                    view = (View) parent2;
                }
            }
            return false;
        }
        view = null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m71776e0(int newState) {
        UiThreadUtil.assertOnUiThread();
        if (this.state == newState) {
            return;
        }
        if (this.trackedPointersCount > 0 && (newState == 5 || newState == 3 || newState == 1)) {
            m71789p();
        }
        int i11 = this.state;
        this.state = newState;
        if (newState == 4) {
            short s11 = f68146M;
            f68146M = (short) (s11 + 1);
            this.eventCoalescingKey = s11;
        }
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        Intrinsics.checkNotNull(gestureHandlerOrchestrator);
        gestureHandlerOrchestrator.m71829A(this, newState, i11);
        mo71783l0(newState, i11);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m71777f0(MotionEvent event) {
        if (event.getPointerCount() != this.trackedPointersIDsCount) {
            return true;
        }
        int length = this.trackedPointerIDs.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = this.trackedPointerIDs[i11];
            if (i12 != -1 && i12 != i11) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final ConcreteGestureHandlerT m71792q0() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type ConcreteGestureHandlerT of com.swmansion.gesturehandler.core.GestureHandler");
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final WritableMap m71795s(PointerData pointerData) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", pointerData.getPointerId());
        writableMapCreateMap.putDouble("x", PixelUtil.toDIPFromPixel(pointerData.getX()));
        writableMapCreateMap.putDouble("y", PixelUtil.toDIPFromPixel(pointerData.getY()));
        writableMapCreateMap.putDouble("absoluteX", PixelUtil.toDIPFromPixel(pointerData.getAbsoluteX()));
        writableMapCreateMap.putDouble("absoluteY", PixelUtil.toDIPFromPixel(pointerData.getAbsoluteY()));
        return writableMapCreateMap;
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public final ConcreteGestureHandlerT m71802v0(boolean enabled) {
        final ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m71792q0();
        if (concretegesturehandlert.view != null && concretegesturehandlert.isEnabled != enabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: rb0.b
                @Override // java.lang.Runnable
                public final void run() {
                    GestureHandler.m71727w0(this.f97178b);
                }
            });
        }
        concretegesturehandlert.isEnabled = enabled;
        return concretegesturehandlert;
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final ConcreteGestureHandlerT m71805x0(float leftPad, float topPad, float rightPad, float bottomPad, float width, float height) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m71792q0();
        if (concretegesturehandlert.hitSlop == null) {
            concretegesturehandlert.hitSlop = new float[6];
        }
        float[] fArr = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = leftPad;
        float[] fArr2 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr2);
        fArr2[1] = topPad;
        float[] fArr3 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr3);
        fArr3[2] = rightPad;
        float[] fArr4 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr4);
        fArr4[3] = bottomPad;
        float[] fArr5 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr5);
        fArr5[4] = width;
        float[] fArr6 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr6);
        fArr6[5] = height;
        Companion companion = INSTANCE;
        if (companion.m71810a(width) && companion.m71810a(leftPad) && companion.m71810a(rightPad)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (companion.m71810a(width) && !companion.m71810a(leftPad) && !companion.m71810a(rightPad)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (companion.m71810a(height) && companion.m71810a(bottomPad) && companion.m71810a(topPad)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (companion.m71810a(height) && !companion.m71810a(bottomPad) && !companion.m71810a(topPad)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
        return concretegesturehandlert;
    }

    /* JADX INFO: renamed from: y */
    public final void m71806y(MotionEvent event, MotionEvent sourceEvent) {
        m71728A();
        this.changedTouchesPayload = null;
        this.touchEventType = 3;
        int pointerId = event.getPointerId(event.getActionIndex());
        this.trackedPointers[pointerId] = new PointerData(pointerId, event.getX(event.getActionIndex()), event.getY(event.getActionIndex()), (sourceEvent.getX(event.getActionIndex()) + (sourceEvent.getRawX() - sourceEvent.getX())) - this.windowOffset[0], (sourceEvent.getY(event.getActionIndex()) + (sourceEvent.getRawY() - sourceEvent.getY())) - this.windowOffset[1]);
        PointerData pointerData = this.trackedPointers[pointerId];
        Intrinsics.checkNotNull(pointerData);
        m71782l(pointerData);
        this.trackedPointers[pointerId] = null;
        this.trackedPointersCount--;
        m71803w();
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final ConcreteGestureHandlerT m71807y0(@Nullable InterfaceC43969c controller) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m71792q0();
        concretegesturehandlert.interactionController = controller;
        return concretegesturehandlert;
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final ConcreteGestureHandlerT m71809z0(boolean manualActivation) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m71792q0();
        concretegesturehandlert.manualActivation = manualActivation;
        return concretegesturehandlert;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo71714g0() {
    }

    /* JADX INFO: renamed from: j0 */
    public void mo71780j0() {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
    }

    /* JADX INFO: renamed from: p0 */
    public void mo71790p0() {
    }

    /* JADX INFO: renamed from: l0 */
    public void mo71783l0(int newState, int previousState) {
    }
}
