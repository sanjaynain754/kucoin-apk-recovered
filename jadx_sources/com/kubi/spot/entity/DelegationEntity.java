package com.kubi.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import gf.C37886j;
import gf.C37890n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p30.InterfaceC43379a;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: DelegationEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\bC\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ¯\u00012\u00020\u0001:\u0002¯\u0001Bû\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010%¢\u0006\u0004\b&\u0010'J\u0010\u0010t\u001a\u00020\b2\b\u0010u\u001a\u0004\u0018\u00010\u0003J\u0018\u0010v\u001a\u00020\b2\b\u0010u\u001a\u0004\u0018\u00010\u00032\u0006\u0010w\u001a\u00020\u0005J\b\u0010x\u001a\u0004\u0018\u00010\"J\u0006\u0010y\u001a\u00020\u0005J\u0006\u0010z\u001a\u00020\bJ\u000e\u0010{\u001a\u00020\b2\u0006\u0010|\u001a\u00020iJ\u000e\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020iJ\u000e\u0010\u007f\u001a\u00020\u00052\u0006\u0010~\u001a\u00020iJ\u0007\u0010\u0080\u0001\u001a\u00020\u0005J\u000f\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010~\u001a\u00020iJ\u0007\u0010\u0082\u0001\u001a\u00020\bJ\u0017\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010%H\u0002J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\"HÂ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\bHÂ\u0003J\u0018\u0010¡\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010%HÂ\u0003J\u0084\u0003\u0010¢\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010%HÆ\u0001¢\u0006\u0003\u0010£\u0001J\u0007\u0010¤\u0001\u001a\u00020iJ\u0016\u0010¥\u0001\u001a\u00020\u00052\n\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001HÖ\u0003J\n\u0010¨\u0001\u001a\u00020iHÖ\u0001J\n\u0010©\u0001\u001a\u00020\bHÖ\u0001J\u001b\u0010ª\u0001\u001a\u00030«\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0007\u0010®\u0001\u001a\u00020iR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010)\"\u0004\b2\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b9\u0010-\"\u0004\b:\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010)\"\u0004\b<\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bA\u0010-\"\u0004\bB\u0010/R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00104\"\u0004\bI\u00106R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00104\"\u0004\bM\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bP\u0010-\"\u0004\bQ\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00104\"\u0004\bS\u00106R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bT\u0010D\"\u0004\bU\u0010FR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00104\"\u0004\bY\u00106R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00104\"\u0004\b[\u00106R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010)\"\u0004\b]\u0010+R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00104\"\u0004\b_\u00106R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010)\"\u0004\ba\u0010+R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bb\u0010-\"\u0004\bc\u0010/R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00104\"\u0004\be\u00106R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010)\"\u0004\bg\u0010+R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010h\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0011\u0010l\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\bm\u0010kR\u0011\u0010n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bo\u00104R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010)R\u0011\u0010r\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\bs\u0010k¨\u0006°\u0001"}, m90084d2 = {"Lcom/kubi/spot/entity/DelegationEntity;", "Landroid/os/Parcelable;", "averagePrice", "Ljava/math/BigDecimal;", "cancelExist", "", "dealSize", "displayType", "", ViewProps.HIDDEN, "iceberge", "limitPrice", "orderId", FirebaseAnalytics.Param.PRICE, "priceLimitTrigger", JPushConstants.Operation.KEY_SEQUENCE, "", "side", "size", InterfaceC33730j9.f70350a, "stopPrice", "stopTriggered", "symbol", "time", "type", "unit", "activateCondition", "pop", "status", "triggerPrice", "postOnly", "timeInForce", "targetPrice", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "showSymbol", "typeStrMap", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/String;Ljava/util/Map;)V", "getAveragePrice", "()Ljava/math/BigDecimal;", "setAveragePrice", "(Ljava/math/BigDecimal;)V", "getCancelExist", "()Ljava/lang/Boolean;", "setCancelExist", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getDealSize", "setDealSize", "getDisplayType", "()Ljava/lang/String;", "setDisplayType", "(Ljava/lang/String;)V", "getHidden", "setHidden", "getIceberge", "setIceberge", "getLimitPrice", "setLimitPrice", "getOrderId", "setOrderId", "getPrice", "setPrice", "getPriceLimitTrigger", "setPriceLimitTrigger", "getSequence", "()Ljava/lang/Long;", "setSequence", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSide", "setSide", "getSize", "setSize", "getStop", "setStop", "getStopPrice", "setStopPrice", "getStopTriggered", "setStopTriggered", "getSymbol", "setSymbol", "getTime", "setTime", "getType", "setType", "getUnit", "setUnit", "getActivateCondition", "setActivateCondition", "getPop", "setPop", "getStatus", "setStatus", "getTriggerPrice", "setTriggerPrice", "getPostOnly", "setPostOnly", "getTimeInForce", "setTimeInForce", "getTargetPrice", "setTargetPrice", "sideString", "", "getSideString", "()I", "dealProgress", "getDealProgress", "dealPercent", "getDealPercent", "dealPercentValue", "getDealPercentValue", "statusString", "getStatusString", "getPriceFormatterStr", "value", "getAmountFormatterStr", "isQuote", "getSymbolInfoEntity", "needShowHideTag", "getShowSymbol", "getTypeString", "typeValue", "isOCO", "by", "isTradingStop", "isShowTrigger", "isMarket", "getSubType", "getTypeStrMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/spot/entity/DelegationEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DelegationEntity implements Parcelable {

    @Nullable
    private String activateCondition;

    @Nullable
    private BigDecimal averagePrice;

    @Nullable
    private Boolean cancelExist;

    @Nullable
    private BigDecimal dealSize;

    @Nullable
    private String displayType;

    @Nullable
    private Boolean hidden;

    @Nullable
    private Boolean iceberge;

    @Nullable
    private BigDecimal limitPrice;

    @Nullable
    private String orderId;

    @Nullable
    private BigDecimal pop;

    @Nullable
    private Boolean postOnly;

    @Nullable
    private BigDecimal price;

    @Nullable
    private Boolean priceLimitTrigger;

    @Nullable
    private Long sequence;

    @Nullable
    private String showSymbol;

    @Nullable
    private String side;

    @Nullable
    private BigDecimal size;

    @Nullable
    private String status;

    @Nullable
    private String stop;

    @Nullable
    private BigDecimal stopPrice;

    @Nullable
    private Boolean stopTriggered;

    @Nullable
    private String symbol;

    @Nullable
    private SymbolInfoEntity symbolInfoEntity;

    @Nullable
    private BigDecimal targetPrice;

    @Nullable
    private Long time;

    @Nullable
    private String timeInForce;

    @Nullable
    private BigDecimal triggerPrice;

    @Nullable
    private String type;

    @Nullable
    private Map<String, String> typeStrMap;

    @Nullable
    private String unit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DelegationEntity> CREATOR = new Creator();

    /* JADX INFO: compiled from: DelegationEntity.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/entity/DelegationEntity$Companion;", "", "<init>", "()V", "getOrderTypeMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "isSupportSubOrderType", "", "getUnifiedOrderTypeMap", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDelegationEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationEntity.kt\ncom/kubi/spot/entity/DelegationEntity$Companion\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,345:1\n17#2,2:346\n17#2,2:348\n*S KotlinDebug\n*F\n+ 1 DelegationEntity.kt\ncom/kubi/spot/entity/DelegationEntity$Companion\n*L\n98#1:346,2\n124#1:348,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LinkedHashMap getOrderTypeMap$default(Companion companion, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            return companion.getOrderTypeMap(z11);
        }

        private Companion() {
        }

        @NotNull
        public final LinkedHashMap<String, String> getOrderTypeMap(boolean isSupportSubOrderType) {
            LinkedHashMap<String, String> linkedHashMapM95541a;
            Object objM56186h = Router.f46192a.m56186h(InterfaceC43379a.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null && (linkedHashMapM95541a = ((InterfaceC43379a) objM56186h).m95541a()) != null) {
                return linkedHashMapM95541a;
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            C27017c c27017c = C27017c.f54310a;
            linkedHashMap.put("LIMIT", c27017c.m66516f(R$string.limit_price_trade, new Object[0]));
            linkedHashMap.put("MARKET", c27017c.m66516f(R$string.market_price_trade, new Object[0]));
            linkedHashMap.put("LIMIT_STOP", c27017c.m66516f(R$string.limit_price_stop, new Object[0]));
            linkedHashMap.put("MARKET_STOP", c27017c.m66516f(R$string.market_price_stop, new Object[0]));
            linkedHashMap.put("LIMIT_OCO", c27017c.m66516f(R$string.oco_order, new Object[0]));
            linkedHashMap.put("LIMIT_TSO", c27017c.m66516f(R$string.kc_spot_trailing_stop, new Object[0]));
            if (isSupportSubOrderType) {
                linkedHashMap.put("LIMIT_TWAP", c27017c.m66516f(R$string.twap_sub_order, new Object[0]));
            }
            return linkedHashMap;
        }

        @NotNull
        public final LinkedHashMap<String, String> getUnifiedOrderTypeMap() {
            LinkedHashMap<String, String> linkedHashMapM95541a;
            Object objM56186h = Router.f46192a.m56186h(InterfaceC43379a.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null && (linkedHashMapM95541a = ((InterfaceC43379a) objM56186h).m95541a()) != null) {
                return linkedHashMapM95541a;
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            C27017c c27017c = C27017c.f54310a;
            linkedHashMap.put("LIMIT", c27017c.m66516f(R$string.limit_price_trade, new Object[0]));
            linkedHashMap.put("MARKET", c27017c.m66516f(R$string.market_price_trade, new Object[0]));
            linkedHashMap.put("ADVANCED_LIMIT", c27017c.m66516f(R$string.kc_advanced_limit_order, new Object[0]));
            linkedHashMap.put("LIMIT_STOP", c27017c.m66516f(R$string.limit_price_stop, new Object[0]));
            linkedHashMap.put("MARKET_STOP", c27017c.m66516f(R$string.market_price_stop, new Object[0]));
            return linkedHashMap;
        }
    }

    /* JADX INFO: compiled from: DelegationEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DelegationEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DelegationEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            Boolean bool = boolValueOf2;
            Boolean bool2 = boolValueOf3;
            String string2 = parcel.readString();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            Boolean bool3 = boolValueOf4;
            Long l11 = lValueOf;
            String string4 = parcel.readString();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string6 = parcel.readString();
            Boolean bool4 = boolValueOf5;
            Long l12 = lValueOf2;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            String string9 = parcel.readString();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string10 = parcel.readString();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(DelegationEntity.class.getClassLoader());
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                int i12 = 0;
                while (i12 != i11) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i12++;
                    i11 = i11;
                }
            }
            return new DelegationEntity(bigDecimal, boolValueOf, bigDecimal2, string, bool, bool2, bigDecimal3, string2, bigDecimal4, bool3, l11, string3, bigDecimal5, string4, bigDecimal6, bool4, string5, l12, string6, string7, string8, bigDecimal7, string9, bigDecimal8, boolValueOf6, string10, bigDecimal9, symbolInfoEntity, string11, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DelegationEntity[] newArray(int i11) {
            return new DelegationEntity[i11];
        }
    }

    public DelegationEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DelegationEntity copy$default(DelegationEntity delegationEntity, BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, String str, Boolean bool2, Boolean bool3, BigDecimal bigDecimal3, String str2, BigDecimal bigDecimal4, Boolean bool4, Long l11, String str3, BigDecimal bigDecimal5, String str4, BigDecimal bigDecimal6, Boolean bool5, String str5, Long l12, String str6, String str7, String str8, BigDecimal bigDecimal7, String str9, BigDecimal bigDecimal8, Boolean bool6, String str10, BigDecimal bigDecimal9, SymbolInfoEntity symbolInfoEntity, String str11, Map map, int i11, Object obj) {
        Map map2;
        String str12;
        BigDecimal bigDecimal10 = (i11 & 1) != 0 ? delegationEntity.averagePrice : bigDecimal;
        Boolean bool7 = (i11 & 2) != 0 ? delegationEntity.cancelExist : bool;
        BigDecimal bigDecimal11 = (i11 & 4) != 0 ? delegationEntity.dealSize : bigDecimal2;
        String str13 = (i11 & 8) != 0 ? delegationEntity.displayType : str;
        Boolean bool8 = (i11 & 16) != 0 ? delegationEntity.hidden : bool2;
        Boolean bool9 = (i11 & 32) != 0 ? delegationEntity.iceberge : bool3;
        BigDecimal bigDecimal12 = (i11 & 64) != 0 ? delegationEntity.limitPrice : bigDecimal3;
        String str14 = (i11 & 128) != 0 ? delegationEntity.orderId : str2;
        BigDecimal bigDecimal13 = (i11 & 256) != 0 ? delegationEntity.price : bigDecimal4;
        Boolean bool10 = (i11 & 512) != 0 ? delegationEntity.priceLimitTrigger : bool4;
        Long l13 = (i11 & 1024) != 0 ? delegationEntity.sequence : l11;
        String str15 = (i11 & 2048) != 0 ? delegationEntity.side : str3;
        BigDecimal bigDecimal14 = (i11 & 4096) != 0 ? delegationEntity.size : bigDecimal5;
        String str16 = (i11 & 8192) != 0 ? delegationEntity.stop : str4;
        BigDecimal bigDecimal15 = bigDecimal10;
        BigDecimal bigDecimal16 = (i11 & 16384) != 0 ? delegationEntity.stopPrice : bigDecimal6;
        Boolean bool11 = (i11 & 32768) != 0 ? delegationEntity.stopTriggered : bool5;
        String str17 = (i11 & 65536) != 0 ? delegationEntity.symbol : str5;
        Long l14 = (i11 & 131072) != 0 ? delegationEntity.time : l12;
        String str18 = (i11 & 262144) != 0 ? delegationEntity.type : str6;
        String str19 = (i11 & 524288) != 0 ? delegationEntity.unit : str7;
        String str20 = (i11 & 1048576) != 0 ? delegationEntity.activateCondition : str8;
        BigDecimal bigDecimal17 = (i11 & 2097152) != 0 ? delegationEntity.pop : bigDecimal7;
        String str21 = (i11 & 4194304) != 0 ? delegationEntity.status : str9;
        BigDecimal bigDecimal18 = (i11 & 8388608) != 0 ? delegationEntity.triggerPrice : bigDecimal8;
        Boolean bool12 = (i11 & 16777216) != 0 ? delegationEntity.postOnly : bool6;
        String str22 = (i11 & 33554432) != 0 ? delegationEntity.timeInForce : str10;
        BigDecimal bigDecimal19 = (i11 & 67108864) != 0 ? delegationEntity.targetPrice : bigDecimal9;
        SymbolInfoEntity symbolInfoEntity2 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? delegationEntity.symbolInfoEntity : symbolInfoEntity;
        String str23 = (i11 & 268435456) != 0 ? delegationEntity.showSymbol : str11;
        if ((i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
            str12 = str23;
            map2 = delegationEntity.typeStrMap;
        } else {
            map2 = map;
            str12 = str23;
        }
        return delegationEntity.copy(bigDecimal15, bool7, bigDecimal11, str13, bool8, bool9, bigDecimal12, str14, bigDecimal13, bool10, l13, str15, bigDecimal14, str16, bigDecimal16, bool11, str17, l14, str18, str19, str20, bigDecimal17, str21, bigDecimal18, bool12, str22, bigDecimal19, symbolInfoEntity2, str12, map2);
    }

    @NotNull
    public final DelegationEntity copy(@Nullable BigDecimal averagePrice, @Nullable Boolean cancelExist, @Nullable BigDecimal dealSize, @Nullable String displayType, @Nullable Boolean hidden, @Nullable Boolean iceberge, @Nullable BigDecimal limitPrice, @Nullable String orderId, @Nullable BigDecimal price, @Nullable Boolean priceLimitTrigger, @Nullable Long sequence, @Nullable String side, @Nullable BigDecimal size, @Nullable String stop, @Nullable BigDecimal stopPrice, @Nullable Boolean stopTriggered, @Nullable String symbol, @Nullable Long time, @Nullable String type, @Nullable String unit, @Nullable String activateCondition, @Nullable BigDecimal pop, @Nullable String status, @Nullable BigDecimal triggerPrice, @Nullable Boolean postOnly, @Nullable String timeInForce, @Nullable BigDecimal targetPrice, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable String showSymbol, @Nullable Map<String, String> typeStrMap) {
        return new DelegationEntity(averagePrice, cancelExist, dealSize, displayType, hidden, iceberge, limitPrice, orderId, price, priceLimitTrigger, sequence, side, size, stop, stopPrice, stopTriggered, symbol, time, type, unit, activateCondition, pop, status, triggerPrice, postOnly, timeInForce, targetPrice, symbolInfoEntity, showSymbol, typeStrMap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelegationEntity)) {
            return false;
        }
        DelegationEntity delegationEntity = (DelegationEntity) other;
        return Intrinsics.areEqual(this.averagePrice, delegationEntity.averagePrice) && Intrinsics.areEqual(this.cancelExist, delegationEntity.cancelExist) && Intrinsics.areEqual(this.dealSize, delegationEntity.dealSize) && Intrinsics.areEqual(this.displayType, delegationEntity.displayType) && Intrinsics.areEqual(this.hidden, delegationEntity.hidden) && Intrinsics.areEqual(this.iceberge, delegationEntity.iceberge) && Intrinsics.areEqual(this.limitPrice, delegationEntity.limitPrice) && Intrinsics.areEqual(this.orderId, delegationEntity.orderId) && Intrinsics.areEqual(this.price, delegationEntity.price) && Intrinsics.areEqual(this.priceLimitTrigger, delegationEntity.priceLimitTrigger) && Intrinsics.areEqual(this.sequence, delegationEntity.sequence) && Intrinsics.areEqual(this.side, delegationEntity.side) && Intrinsics.areEqual(this.size, delegationEntity.size) && Intrinsics.areEqual(this.stop, delegationEntity.stop) && Intrinsics.areEqual(this.stopPrice, delegationEntity.stopPrice) && Intrinsics.areEqual(this.stopTriggered, delegationEntity.stopTriggered) && Intrinsics.areEqual(this.symbol, delegationEntity.symbol) && Intrinsics.areEqual(this.time, delegationEntity.time) && Intrinsics.areEqual(this.type, delegationEntity.type) && Intrinsics.areEqual(this.unit, delegationEntity.unit) && Intrinsics.areEqual(this.activateCondition, delegationEntity.activateCondition) && Intrinsics.areEqual(this.pop, delegationEntity.pop) && Intrinsics.areEqual(this.status, delegationEntity.status) && Intrinsics.areEqual(this.triggerPrice, delegationEntity.triggerPrice) && Intrinsics.areEqual(this.postOnly, delegationEntity.postOnly) && Intrinsics.areEqual(this.timeInForce, delegationEntity.timeInForce) && Intrinsics.areEqual(this.targetPrice, delegationEntity.targetPrice) && Intrinsics.areEqual(this.symbolInfoEntity, delegationEntity.symbolInfoEntity) && Intrinsics.areEqual(this.showSymbol, delegationEntity.showSymbol) && Intrinsics.areEqual(this.typeStrMap, delegationEntity.typeStrMap);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    @NotNull
    public final String getAmountFormatterStr(@Nullable BigDecimal value, boolean isQuote) {
        int baseIncrementPrecision;
        Integer numValueOf;
        if (isQuote) {
            SymbolInfoEntity symbolInfoEntity = getSymbolInfoEntity();
            if (symbolInfoEntity != null) {
                baseIncrementPrecision = symbolInfoEntity.getQuoteIncrementPrecision();
                numValueOf = Integer.valueOf(baseIncrementPrecision);
            } else {
                numValueOf = null;
            }
        } else {
            SymbolInfoEntity symbolInfoEntity2 = getSymbolInfoEntity();
            if (symbolInfoEntity2 != null) {
                baseIncrementPrecision = symbolInfoEntity2.getBaseIncrementPrecision();
                numValueOf = Integer.valueOf(baseIncrementPrecision);
            } else {
                numValueOf = null;
            }
        }
        return C27041f.m66669i(value != null ? C42180b.m92640e(value, RoundingMode.DOWN, C27039d.m66651k(numValueOf, 8), false, true, false, 2, null, 80, null) : null, "--");
    }

    @NotNull
    public final String getTypeString(int typeValue) {
        String str;
        String str2;
        if (typeValue != 1) {
            str = typeValue != 2 ? "" : this.displayType;
        } else {
            str = this.type;
        }
        if (str == null) {
            return C33820nf.f71144W;
        }
        Map<String, String> typeStrMap = getTypeStrMap();
        if (typeStrMap != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            str2 = typeStrMap.get(C27041f.m66668h(upperCase));
        } else {
            str2 = null;
        }
        return C27041f.m66669i(str2, C27017c.f54310a.m66516f(R$string.other, new Object[0]));
    }

    public final boolean isOCO(int by) {
        if (by == 1) {
            return Intrinsics.areEqual("limit_oco", this.type);
        }
        if (by != 2) {
            return false;
        }
        return Intrinsics.areEqual("limit_oco", this.displayType);
    }

    public final boolean isTradingStop(int by) {
        if (by == 1) {
            return Intrinsics.areEqual("limit_tso", this.type);
        }
        if (by != 2) {
            return false;
        }
        return Intrinsics.areEqual("limit_tso", this.displayType);
    }

    public DelegationEntity(@Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BigDecimal bigDecimal3, @Nullable String str2, @Nullable BigDecimal bigDecimal4, @Nullable Boolean bool4, @Nullable Long l11, @Nullable String str3, @Nullable BigDecimal bigDecimal5, @Nullable String str4, @Nullable BigDecimal bigDecimal6, @Nullable Boolean bool5, @Nullable String str5, @Nullable Long l12, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable BigDecimal bigDecimal7, @Nullable String str9, @Nullable BigDecimal bigDecimal8, @Nullable Boolean bool6, @Nullable String str10, @Nullable BigDecimal bigDecimal9, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable String str11, @Nullable Map<String, String> map) {
        this.averagePrice = bigDecimal;
        this.cancelExist = bool;
        this.dealSize = bigDecimal2;
        this.displayType = str;
        this.hidden = bool2;
        this.iceberge = bool3;
        this.limitPrice = bigDecimal3;
        this.orderId = str2;
        this.price = bigDecimal4;
        this.priceLimitTrigger = bool4;
        this.sequence = l11;
        this.side = str3;
        this.size = bigDecimal5;
        this.stop = str4;
        this.stopPrice = bigDecimal6;
        this.stopTriggered = bool5;
        this.symbol = str5;
        this.time = l12;
        this.type = str6;
        this.unit = str7;
        this.activateCondition = str8;
        this.pop = bigDecimal7;
        this.status = str9;
        this.triggerPrice = bigDecimal8;
        this.postOnly = bool6;
        this.timeInForce = str10;
        this.targetPrice = bigDecimal9;
        this.symbolInfoEntity = symbolInfoEntity;
        this.showSymbol = str11;
        this.typeStrMap = map;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    private final SymbolInfoEntity getSymbolInfoEntity() {
        return this.symbolInfoEntity;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    private final String getShowSymbol() {
        return this.showSymbol;
    }

    private final Map<String, String> component30() {
        return this.typeStrMap;
    }

    private final Map<String, String> getTypeStrMap() {
        Map<String, String> map = this.typeStrMap;
        if (map == null || map.isEmpty()) {
            this.typeStrMap = Companion.getOrderTypeMap$default(INSTANCE, false, 1, null);
        }
        return this.typeStrMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAveragePrice() {
        return this.averagePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getPriceLimitTrigger() {
        return this.priceLimitTrigger;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getStopTriggered() {
        return this.stopTriggered;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCancelExist() {
        return this.cancelExist;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getActivateCondition() {
        return this.activateCondition;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getPop() {
        return this.pop;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getTargetPrice() {
        return this.targetPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIceberge() {
        return this.iceberge;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getActivateCondition() {
        return this.activateCondition;
    }

    @Nullable
    public final BigDecimal getAveragePrice() {
        return this.averagePrice;
    }

    @Nullable
    public final Boolean getCancelExist() {
        return this.cancelExist;
    }

    @NotNull
    public final String getDealPercent() {
        BigDecimal bigDecimalM89922G = C41014a.m89922G(this.size, null, 1, null);
        BigDecimal ZERO = BigDecimal.ZERO;
        if (bigDecimalM89922G.compareTo(ZERO) == 0) {
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return C42180b.m92642g(ZERO, null, null, 0, false, false, false, 63, null);
        }
        BigDecimal bigDecimalDivide = C41014a.m89922G(this.dealSize, null, 1, null).divide(C41014a.m89922G(this.size, null, 1, null), 4, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return C42180b.m92642g(bigDecimalDivide, null, null, 0, false, false, false, 63, null);
    }

    @NotNull
    public final BigDecimal getDealPercentValue() {
        BigDecimal bigDecimalM89922G = C41014a.m89922G(this.size, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM89922G.compareTo(bigDecimal) == 0) {
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
        BigDecimal bigDecimalDivide = C41014a.m89922G(this.dealSize, null, 1, null).divide(C41014a.m89922G(this.size, null, 1, null), 4, RoundingMode.DOWN);
        Intrinsics.checkNotNull(bigDecimalDivide);
        return bigDecimalDivide;
    }

    public final int getDealProgress() {
        if (C41014a.m89922G(this.size, null, 1, null).compareTo(BigDecimal.ZERO) == 0) {
            return 0;
        }
        return C41014a.m89922G(this.dealSize, null, 1, null).divide(C41014a.m89922G(this.size, null, 1, null), 2, 4).multiply(new BigDecimal(C33556b3.f68995S)).intValue();
    }

    @Nullable
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    public final Boolean getIceberge() {
        return this.iceberge;
    }

    @Nullable
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final BigDecimal getPop() {
        return this.pop;
    }

    @Nullable
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    public final String getPriceFormatterStr(@Nullable BigDecimal value) {
        return C27041f.m66669i(value != null ? C37886j.m85579c(value, this.symbol, (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.DOWN, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--");
    }

    @Nullable
    public final Boolean getPriceLimitTrigger() {
        return this.priceLimitTrigger;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
    }

    @NotNull
    public final String getShowSymbol() {
        String str = this.showSymbol;
        if (str == null || str.length() == 0) {
            SymbolInfoEntity symbolInfoEntity = getSymbolInfoEntity();
            String strReplace$default = null;
            String showSymbol = symbolInfoEntity != null ? symbolInfoEntity.getShowSymbol() : null;
            if (showSymbol == null || showSymbol.length() == 0) {
                String str2 = this.symbol;
                if (str2 != null) {
                    strReplace$default = StringsKt.replace$default(str2, C33820nf.f71144W, "/", false, 4, (Object) null);
                }
            } else if (symbolInfoEntity != null) {
                strReplace$default = symbolInfoEntity.getShowSymbol();
            }
            this.showSymbol = strReplace$default;
        }
        return C27041f.m66669i(this.showSymbol, "--");
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    public final int getSideString() {
        if (StringsKt.equals(this.side, "buy", true)) {
            return R$string.buy;
        }
        return StringsKt.equals(this.side, "sell", true) ? R$string.sell : R$string.other;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final int getStatusString() {
        BigDecimal bigDecimal;
        return (C27025c.m66566d(this.cancelExist) && (bigDecimal = this.dealSize) != null && bigDecimal.compareTo(BigDecimal.ZERO) == 0) ? R$string.canceled_order : R$string.completed;
    }

    @Nullable
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    @Nullable
    public final Boolean getStopTriggered() {
        return this.stopTriggered;
    }

    @NotNull
    public final String getSubType() {
        if (Intrinsics.areEqual(this.postOnly, Boolean.TRUE)) {
            return '(' + C27017c.f54310a.m66516f(R$string.kc_advanced_limit_post_only_key, new Object[0]) + ')';
        }
        if (Intrinsics.areEqual(this.timeInForce, AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK)) {
            return '(' + C27017c.f54310a.m66516f(R$string.kc_advanced_limit_fok_key, new Object[0]) + ')';
        }
        if (!Intrinsics.areEqual(this.timeInForce, AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC)) {
            return "";
        }
        return '(' + C27017c.f54310a.m66516f(R$string.kc_advanced_limit_ioc_key, new Object[0]) + ')';
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final SymbolInfoEntity getSymbolInfoEntity() {
        if (this.symbolInfoEntity == null) {
            this.symbolInfoEntity = C37890n.f85269a.m85601B(this.symbol);
        }
        return this.symbolInfoEntity;
    }

    @Nullable
    public final BigDecimal getTargetPrice() {
        return this.targetPrice;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.averagePrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Boolean bool = this.cancelExist;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.dealSize;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.displayType;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.hidden;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.iceberge;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.limitPrice;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.orderId;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.price;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Boolean bool4 = this.priceLimitTrigger;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l11 = this.sequence;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.size;
        int iHashCode13 = (iHashCode12 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str4 = this.stop;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.stopPrice;
        int iHashCode15 = (iHashCode14 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        Boolean bool5 = this.stopTriggered;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str5 = this.symbol;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l12 = this.time;
        int iHashCode18 = (iHashCode17 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.unit;
        int iHashCode20 = (iHashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.activateCondition;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.pop;
        int iHashCode22 = (iHashCode21 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str9 = this.status;
        int iHashCode23 = (iHashCode22 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.triggerPrice;
        int iHashCode24 = (iHashCode23 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Boolean bool6 = this.postOnly;
        int iHashCode25 = (iHashCode24 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str10 = this.timeInForce;
        int iHashCode26 = (iHashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.targetPrice;
        int iHashCode27 = (iHashCode26 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        SymbolInfoEntity symbolInfoEntity = this.symbolInfoEntity;
        int iHashCode28 = (iHashCode27 + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
        String str11 = this.showSymbol;
        int iHashCode29 = (iHashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Map<String, String> map = this.typeStrMap;
        return iHashCode29 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isMarket(int by) {
        if (by == 1) {
            return Intrinsics.areEqual("market", this.type) || Intrinsics.areEqual("market_stop", this.type);
        }
        if (by != 2) {
            return false;
        }
        return Intrinsics.areEqual("market", this.displayType) || Intrinsics.areEqual("market_stop", this.displayType);
    }

    public final boolean isShowTrigger() {
        if (Intrinsics.areEqual("limit_oco", this.displayType)) {
            return !C27025c.m66566d(this.stopTriggered) || Intrinsics.areEqual("l_s_o", this.stop) || Intrinsics.areEqual("e_s_o", this.stop);
        }
        return Intrinsics.areEqual("limit_stop", this.displayType) || Intrinsics.areEqual("market_stop", this.displayType);
    }

    public final boolean needShowHideTag() {
        return C27025c.m66566d(this.iceberge) || C27025c.m66566d(this.hidden);
    }

    public final void setActivateCondition(@Nullable String str) {
        this.activateCondition = str;
    }

    public final void setAveragePrice(@Nullable BigDecimal bigDecimal) {
        this.averagePrice = bigDecimal;
    }

    public final void setCancelExist(@Nullable Boolean bool) {
        this.cancelExist = bool;
    }

    public final void setDealSize(@Nullable BigDecimal bigDecimal) {
        this.dealSize = bigDecimal;
    }

    public final void setDisplayType(@Nullable String str) {
        this.displayType = str;
    }

    public final void setHidden(@Nullable Boolean bool) {
        this.hidden = bool;
    }

    public final void setIceberge(@Nullable Boolean bool) {
        this.iceberge = bool;
    }

    public final void setLimitPrice(@Nullable BigDecimal bigDecimal) {
        this.limitPrice = bigDecimal;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setPop(@Nullable BigDecimal bigDecimal) {
        this.pop = bigDecimal;
    }

    public final void setPostOnly(@Nullable Boolean bool) {
        this.postOnly = bool;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setPriceLimitTrigger(@Nullable Boolean bool) {
        this.priceLimitTrigger = bool;
    }

    public final void setSequence(@Nullable Long l11) {
        this.sequence = l11;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setStop(@Nullable String str) {
        this.stop = str;
    }

    public final void setStopPrice(@Nullable BigDecimal bigDecimal) {
        this.stopPrice = bigDecimal;
    }

    public final void setStopTriggered(@Nullable Boolean bool) {
        this.stopTriggered = bool;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTargetPrice(@Nullable BigDecimal bigDecimal) {
        this.targetPrice = bigDecimal;
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    public final void setTimeInForce(@Nullable String str) {
        this.timeInForce = str;
    }

    public final void setTriggerPrice(@Nullable BigDecimal bigDecimal) {
        this.triggerPrice = bigDecimal;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    @NotNull
    public String toString() {
        return "DelegationEntity(averagePrice=" + this.averagePrice + ", cancelExist=" + this.cancelExist + ", dealSize=" + this.dealSize + ", displayType=" + this.displayType + ", hidden=" + this.hidden + ", iceberge=" + this.iceberge + ", limitPrice=" + this.limitPrice + ", orderId=" + this.orderId + ", price=" + this.price + ", priceLimitTrigger=" + this.priceLimitTrigger + ", sequence=" + this.sequence + ", side=" + this.side + ", size=" + this.size + ", stop=" + this.stop + ", stopPrice=" + this.stopPrice + ", stopTriggered=" + this.stopTriggered + ", symbol=" + this.symbol + ", time=" + this.time + ", type=" + this.type + ", unit=" + this.unit + ", activateCondition=" + this.activateCondition + ", pop=" + this.pop + ", status=" + this.status + ", triggerPrice=" + this.triggerPrice + ", postOnly=" + this.postOnly + ", timeInForce=" + this.timeInForce + ", targetPrice=" + this.targetPrice + ", symbolInfoEntity=" + this.symbolInfoEntity + ", showSymbol=" + this.showSymbol + ", typeStrMap=" + this.typeStrMap + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.averagePrice);
        Boolean bool = this.cancelExist;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.dealSize);
        dest.writeString(this.displayType);
        Boolean bool2 = this.hidden;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.iceberge;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.limitPrice);
        dest.writeString(this.orderId);
        dest.writeSerializable(this.price);
        Boolean bool4 = this.priceLimitTrigger;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Long l11 = this.sequence;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.side);
        dest.writeSerializable(this.size);
        dest.writeString(this.stop);
        dest.writeSerializable(this.stopPrice);
        Boolean bool5 = this.stopTriggered;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.symbol);
        Long l12 = this.time;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.type);
        dest.writeString(this.unit);
        dest.writeString(this.activateCondition);
        dest.writeSerializable(this.pop);
        dest.writeString(this.status);
        dest.writeSerializable(this.triggerPrice);
        Boolean bool6 = this.postOnly;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.timeInForce);
        dest.writeSerializable(this.targetPrice);
        dest.writeParcelable(this.symbolInfoEntity, flags);
        dest.writeString(this.showSymbol);
        Map<String, String> map = this.typeStrMap;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public /* synthetic */ DelegationEntity(BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, String str, Boolean bool2, Boolean bool3, BigDecimal bigDecimal3, String str2, BigDecimal bigDecimal4, Boolean bool4, Long l11, String str3, BigDecimal bigDecimal5, String str4, BigDecimal bigDecimal6, Boolean bool5, String str5, Long l12, String str6, String str7, String str8, BigDecimal bigDecimal7, String str9, BigDecimal bigDecimal8, Boolean bool6, String str10, BigDecimal bigDecimal9, SymbolInfoEntity symbolInfoEntity, String str11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : bool3, (i11 & 64) != 0 ? null : bigDecimal3, (i11 & 128) != 0 ? null : str2, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : bool4, (i11 & 1024) != 0 ? null : l11, (i11 & 2048) != 0 ? null : str3, (i11 & 4096) != 0 ? null : bigDecimal5, (i11 & 8192) != 0 ? null : str4, (i11 & 16384) != 0 ? null : bigDecimal6, (i11 & 32768) != 0 ? null : bool5, (i11 & 65536) != 0 ? null : str5, (i11 & 131072) != 0 ? null : l12, (i11 & 262144) != 0 ? null : str6, (i11 & 524288) != 0 ? null : str7, (i11 & 1048576) != 0 ? null : str8, (i11 & 2097152) != 0 ? null : bigDecimal7, (i11 & 4194304) != 0 ? null : str9, (i11 & 8388608) != 0 ? null : bigDecimal8, (i11 & 16777216) != 0 ? null : bool6, (i11 & 33554432) != 0 ? null : str10, (i11 & 67108864) != 0 ? null : bigDecimal9, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : symbolInfoEntity, (i11 & 268435456) != 0 ? null : str11, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : map);
    }
}
