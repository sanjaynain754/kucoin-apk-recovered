package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.broker.MultiBizType;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.io.Serializable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0003\bÃ\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BÕ\u0005\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010+\u001a\u00020\u0017\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bE\u0010FJ\t\u0010À\u0001\u001a\u00020\u0000H\u0016J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010×\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0011\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010lJ\u0012\u0010Ú\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010â\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0017HÆ\u0003J\f\u0010å\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010é\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0012\u0010î\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010ï\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010ð\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010ñ\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010÷\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ø\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ù\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÞ\u0005\u0010ý\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010+\u001a\u00020\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010!2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00105\u001a\u0004\u0018\u00010!2\n\b\u0002\u00106\u001a\u0004\u0018\u00010!2\n\b\u0002\u00107\u001a\u0004\u0018\u00010!2\n\b\u0002\u00108\u001a\u0004\u0018\u00010!2\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0003\u0010þ\u0001J\b\u0010ÿ\u0001\u001a\u00030\u0080\u0002J\u0016\u0010\u0081\u0002\u001a\u00020\u00172\n\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0083\u0002HÖ\u0003J\u000b\u0010\u0084\u0002\u001a\u00030\u0080\u0002HÖ\u0001J\n\u0010\u0085\u0002\u001a\u00020\u0005HÖ\u0001J\u001c\u0010\u0086\u0002\u001a\u00030\u0087\u00022\b\u0010\u0088\u0002\u001a\u00030\u0089\u00022\b\u0010\u008a\u0002\u001a\u00030\u0080\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010H\"\u0004\bL\u0010JR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010H\"\u0004\bP\u0010JR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010H\"\u0004\bX\u0010JR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010JR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010R\"\u0004\b\\\u0010TR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010H\"\u0004\b`\u0010JR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010H\"\u0004\bb\u0010JR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010H\"\u0004\bd\u0010JR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010R\"\u0004\bf\u0010TR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010R\"\u0004\bh\u0010TR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010H\"\u0004\bj\u0010JR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\bp\u0010l\"\u0004\bq\u0010nR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\br\u0010l\"\u0004\bs\u0010nR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\bt\u0010l\"\u0004\bu\u0010nR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\bv\u0010l\"\u0004\bw\u0010nR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\bx\u0010l\"\u0004\by\u0010nR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\bz\u0010l\"\u0004\b{\u0010nR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\b|\u0010l\"\u0004\b}\u0010nR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010o\u001a\u0004\b~\u0010l\"\u0004\b\u007f\u0010nR#\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0084\u0001\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010R\"\u0005\b\u0086\u0001\u0010TR\u001e\u0010#\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010R\"\u0005\b\u0088\u0001\u0010TR\u001e\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010R\"\u0005\b\u008a\u0001\u0010TR\u001e\u0010%\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010R\"\u0005\b\u008c\u0001\u0010TR\u001e\u0010&\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010R\"\u0005\b\u008e\u0001\u0010TR\u001e\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010R\"\u0005\b\u0090\u0001\u0010TR\u001e\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010H\"\u0005\b\u0092\u0001\u0010JR\u001e\u0010)\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010R\"\u0005\b\u0094\u0001\u0010TR\u001e\u0010*\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010R\"\u0005\b\u0096\u0001\u0010TR\u001d\u0010+\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b+\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001e\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010H\"\u0005\b\u009b\u0001\u0010JR\u0014\u0010-\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010RR\u0014\u0010.\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010RR\u001e\u0010/\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010H\"\u0005\b\u009f\u0001\u0010JR\u0018\u00100\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u0084\u0001\u001a\u0006\b \u0001\u0010\u0081\u0001R\u0014\u00101\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010RR\u0014\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010HR\u0014\u00103\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010RR\u0014\u00104\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010RR\u0018\u00105\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u0084\u0001\u001a\u0006\b¥\u0001\u0010\u0081\u0001R\u0018\u00106\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u0084\u0001\u001a\u0006\b¦\u0001\u0010\u0081\u0001R\u0018\u00107\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u0084\u0001\u001a\u0006\b§\u0001\u0010\u0081\u0001R\u0018\u00108\u001a\u0004\u0018\u00010!¢\u0006\r\n\u0003\u0010\u0084\u0001\u001a\u0006\b¨\u0001\u0010\u0081\u0001R\u001e\u00109\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010H\"\u0005\bª\u0001\u0010JR\u0014\u0010:\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010HR \u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R\u001e\u0010=\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010R\"\u0005\b±\u0001\u0010TR\u001e\u0010>\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010H\"\u0005\b³\u0001\u0010JR\u001e\u0010?\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010R\"\u0005\bµ\u0001\u0010TR\u001e\u0010@\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010H\"\u0005\b·\u0001\u0010JR\u001e\u0010A\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010R\"\u0005\b¹\u0001\u0010TR\"\u0010B\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010H\"\u0005\b»\u0001\u0010JR\u001e\u0010C\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0001\u0010H\"\u0005\b½\u0001\u0010JR\u001e\u0010D\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010H\"\u0005\b¿\u0001\u0010J¨\u0006\u008b\u0002"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/OrderEntity;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "id", "", "type", "advancedDisplayType", "symbol", "leverage", "Ljava/math/BigDecimal;", AppsFlyerProperties.CHANNEL, "side", InterfaceC33730j9.f70350a, "stopPrice", "stopPriceType", "displayType", "advancedType", "advancedStatus", "activationPrice", "callbackRate", "timeInForce", "cancelExist", "", "stopTriggered", "fromReduce", "closeOnly", "closeOrder", "postOnly", "shortcut", ViewProps.HIDDEN, "iceberg", "createdAt", "", FirebaseAnalytics.Param.PRICE, "dealSize", "dealValue", "cancelSize", "size", "visibleSize", "triggerOrderId", "triggerStopUpPrice", "triggerStopDownPrice", "isTrialFunds", "marginMode", "noMarginSize", "remainHoldAmount", "positionSide", "updatedAt", "avgDealPrice", "twapDistanceType", "twapDistanceValue", "twapPriceLimit", "twapDurationSec", "twapIntervalSec", "twapUsedDurationSec", "twapsubOrderSize", "status", "prizeType", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "pnl", "cancelReason", "estPnl", "estPnlRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/broker/MultiBizType;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getType", "setType", "getAdvancedDisplayType", "setAdvancedDisplayType", "getSymbol", "setSymbol", "getLeverage", "()Ljava/math/BigDecimal;", "setLeverage", "(Ljava/math/BigDecimal;)V", "getChannel", "setChannel", "getSide", "setSide", "getStop", "setStop", "getStopPrice", "setStopPrice", "getStopPriceType", "setStopPriceType", "getDisplayType", "setDisplayType", "getAdvancedType", "setAdvancedType", "getAdvancedStatus", "setAdvancedStatus", "getActivationPrice", "setActivationPrice", "getCallbackRate", "setCallbackRate", "getTimeInForce", "setTimeInForce", "getCancelExist", "()Ljava/lang/Boolean;", "setCancelExist", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getStopTriggered", "setStopTriggered", "getFromReduce", "setFromReduce", "getCloseOnly", "setCloseOnly", "getCloseOrder", "setCloseOrder", "getPostOnly", "setPostOnly", "getShortcut", "setShortcut", "getHidden", "setHidden", "getIceberg", "setIceberg", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPrice", "setPrice", "getDealSize", "setDealSize", "getDealValue", "setDealValue", "getCancelSize", "setCancelSize", "getSize", "setSize", "getVisibleSize", "setVisibleSize", "getTriggerOrderId", "setTriggerOrderId", "getTriggerStopUpPrice", "setTriggerStopUpPrice", "getTriggerStopDownPrice", "setTriggerStopDownPrice", "()Z", "setTrialFunds", "(Z)V", "getMarginMode", "setMarginMode", "getNoMarginSize", "getRemainHoldAmount", "getPositionSide", "setPositionSide", "getUpdatedAt", "getAvgDealPrice", "getTwapDistanceType", "getTwapDistanceValue", "getTwapPriceLimit", "getTwapDurationSec", "getTwapIntervalSec", "getTwapUsedDurationSec", "getTwapsubOrderSize", "getStatus", "setStatus", "getPrizeType", "getMultiBizType", "()Lcom/kubi/broker/MultiBizType;", "setMultiBizType", "(Lcom/kubi/broker/MultiBizType;)V", "getFee", "setFee", "getFeeCurrency", "setFeeCurrency", "getTax", "setTax", "getTaxCurrency", "setTaxCurrency", "getPnl", "setPnl", "getCancelReason", "setCancelReason", "getEstPnl", "setEstPnl", "getEstPnlRate", "setEstPnlRate", "clone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/broker/MultiBizType;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/OrderEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderEntity implements Parcelable, Serializable, Cloneable {

    @NotNull
    public static final Parcelable.Creator<OrderEntity> CREATOR = new C15835a();

    @Nullable
    private BigDecimal activationPrice;

    @Nullable
    private String advancedDisplayType;

    @Nullable
    private String advancedStatus;

    @Nullable
    private String advancedType;

    @Nullable
    private final BigDecimal avgDealPrice;

    @Nullable
    private BigDecimal callbackRate;

    @Nullable
    private Boolean cancelExist;

    @SerializedName("remark")
    @Nullable
    private String cancelReason;

    @Nullable
    private BigDecimal cancelSize;

    @Nullable
    private String channel;

    @Nullable
    private Boolean closeOnly;

    @Nullable
    private Boolean closeOrder;

    @Nullable
    private Long createdAt;

    @Nullable
    private BigDecimal dealSize;

    @Nullable
    private BigDecimal dealValue;

    @Nullable
    private String displayType;

    @Nullable
    private String estPnl;

    @Nullable
    private String estPnlRate;

    @Nullable
    private BigDecimal fee;

    @Nullable
    private String feeCurrency;

    @Nullable
    private Boolean fromReduce;

    @Nullable
    private Boolean hidden;

    @Nullable
    private Boolean iceberg;

    @Nullable
    private String id;
    private boolean isTrialFunds;

    @Nullable
    private BigDecimal leverage;

    @Nullable
    private String marginMode;

    @Nullable
    private MultiBizType multiBizType;

    @Nullable
    private final BigDecimal noMarginSize;

    @Nullable
    private BigDecimal pnl;

    @Nullable
    private String positionSide;

    @Nullable
    private Boolean postOnly;

    @Nullable
    private BigDecimal price;

    @Nullable
    private final String prizeType;

    @Nullable
    private final BigDecimal remainHoldAmount;

    @Nullable
    private Boolean shortcut;

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
    private String stopPriceType;

    @Nullable
    private Boolean stopTriggered;

    @Nullable
    private String symbol;

    @Nullable
    private BigDecimal tax;

    @Nullable
    private String taxCurrency;

    @Nullable
    private String timeInForce;

    @Nullable
    private String triggerOrderId;

    @Nullable
    private BigDecimal triggerStopDownPrice;

    @Nullable
    private BigDecimal triggerStopUpPrice;

    @Nullable
    private final String twapDistanceType;

    @Nullable
    private final BigDecimal twapDistanceValue;

    @Nullable
    private final Long twapDurationSec;

    @Nullable
    private final Long twapIntervalSec;

    @Nullable
    private final BigDecimal twapPriceLimit;

    @Nullable
    private final Long twapUsedDurationSec;

    @Nullable
    private final Long twapsubOrderSize;

    @Nullable
    private String type;

    @Nullable
    private final Long updatedAt;

    @Nullable
    private BigDecimal visibleSize;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.OrderEntity$a */
    /* JADX INFO: compiled from: OrderEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15835a implements Parcelable.Creator<OrderEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            Boolean bool = boolValueOf3;
            Boolean bool2 = boolValueOf5;
            Boolean bool3 = boolValueOf7;
            Boolean bool4 = boolValueOf9;
            String string13 = parcel.readString();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            boolean z11 = parcel.readInt() != 0;
            MultiBizType multiBizTypeValueOf = null;
            String string14 = parcel.readString();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal14 = (BigDecimal) parcel.readSerializable();
            String string15 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal15 = (BigDecimal) parcel.readSerializable();
            String string16 = parcel.readString();
            BigDecimal bigDecimal16 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal17 = (BigDecimal) parcel.readSerializable();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() != 0) {
                multiBizTypeValueOf = MultiBizType.valueOf(parcel.readString());
            }
            return new OrderEntity(string, string2, string3, string4, bigDecimal, string5, string6, string7, bigDecimal2, string8, string9, string10, string11, bigDecimal3, bigDecimal4, string12, boolValueOf, boolValueOf2, bool, boolValueOf4, bool2, boolValueOf6, bool3, boolValueOf8, bool4, lValueOf, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, string13, bigDecimal11, bigDecimal12, z11, string14, bigDecimal13, bigDecimal14, string15, lValueOf2, bigDecimal15, string16, bigDecimal16, bigDecimal17, lValueOf3, lValueOf4, lValueOf5, lValueOf6, string17, string18, multiBizTypeValueOf, (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderEntity[] newArray(int i11) {
            return new OrderEntity[i11];
        }
    }

    public OrderEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 268435455, null);
    }

    @NotNull
    public final OrderEntity copy(@Nullable String id2, @Nullable String type, @Nullable String advancedDisplayType, @Nullable String symbol, @Nullable BigDecimal leverage, @Nullable String channel, @Nullable String side, @Nullable String stop, @Nullable BigDecimal stopPrice, @Nullable String stopPriceType, @Nullable String displayType, @Nullable String advancedType, @Nullable String advancedStatus, @Nullable BigDecimal activationPrice, @Nullable BigDecimal callbackRate, @Nullable String timeInForce, @Nullable Boolean cancelExist, @Nullable Boolean stopTriggered, @Nullable Boolean fromReduce, @Nullable Boolean closeOnly, @Nullable Boolean closeOrder, @Nullable Boolean postOnly, @Nullable Boolean shortcut, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable Long createdAt, @Nullable BigDecimal price, @Nullable BigDecimal dealSize, @Nullable BigDecimal dealValue, @Nullable BigDecimal cancelSize, @Nullable BigDecimal size, @Nullable BigDecimal visibleSize, @Nullable String triggerOrderId, @Nullable BigDecimal triggerStopUpPrice, @Nullable BigDecimal triggerStopDownPrice, boolean isTrialFunds, @Nullable String marginMode, @Nullable BigDecimal noMarginSize, @Nullable BigDecimal remainHoldAmount, @Nullable String positionSide, @Nullable Long updatedAt, @Nullable BigDecimal avgDealPrice, @Nullable String twapDistanceType, @Nullable BigDecimal twapDistanceValue, @Nullable BigDecimal twapPriceLimit, @Nullable Long twapDurationSec, @Nullable Long twapIntervalSec, @Nullable Long twapUsedDurationSec, @Nullable Long twapsubOrderSize, @Nullable String status, @Nullable String prizeType, @Nullable MultiBizType multiBizType, @Nullable BigDecimal fee, @Nullable String feeCurrency, @Nullable BigDecimal tax, @Nullable String taxCurrency, @Nullable BigDecimal pnl, @Nullable String cancelReason, @Nullable String estPnl, @Nullable String estPnlRate) {
        return new OrderEntity(id2, type, advancedDisplayType, symbol, leverage, channel, side, stop, stopPrice, stopPriceType, displayType, advancedType, advancedStatus, activationPrice, callbackRate, timeInForce, cancelExist, stopTriggered, fromReduce, closeOnly, closeOrder, postOnly, shortcut, hidden, iceberg, createdAt, price, dealSize, dealValue, cancelSize, size, visibleSize, triggerOrderId, triggerStopUpPrice, triggerStopDownPrice, isTrialFunds, marginMode, noMarginSize, remainHoldAmount, positionSide, updatedAt, avgDealPrice, twapDistanceType, twapDistanceValue, twapPriceLimit, twapDurationSec, twapIntervalSec, twapUsedDurationSec, twapsubOrderSize, status, prizeType, multiBizType, fee, feeCurrency, tax, taxCurrency, pnl, cancelReason, estPnl, estPnlRate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEntity)) {
            return false;
        }
        OrderEntity orderEntity = (OrderEntity) other;
        return Intrinsics.areEqual(this.id, orderEntity.id) && Intrinsics.areEqual(this.type, orderEntity.type) && Intrinsics.areEqual(this.advancedDisplayType, orderEntity.advancedDisplayType) && Intrinsics.areEqual(this.symbol, orderEntity.symbol) && Intrinsics.areEqual(this.leverage, orderEntity.leverage) && Intrinsics.areEqual(this.channel, orderEntity.channel) && Intrinsics.areEqual(this.side, orderEntity.side) && Intrinsics.areEqual(this.stop, orderEntity.stop) && Intrinsics.areEqual(this.stopPrice, orderEntity.stopPrice) && Intrinsics.areEqual(this.stopPriceType, orderEntity.stopPriceType) && Intrinsics.areEqual(this.displayType, orderEntity.displayType) && Intrinsics.areEqual(this.advancedType, orderEntity.advancedType) && Intrinsics.areEqual(this.advancedStatus, orderEntity.advancedStatus) && Intrinsics.areEqual(this.activationPrice, orderEntity.activationPrice) && Intrinsics.areEqual(this.callbackRate, orderEntity.callbackRate) && Intrinsics.areEqual(this.timeInForce, orderEntity.timeInForce) && Intrinsics.areEqual(this.cancelExist, orderEntity.cancelExist) && Intrinsics.areEqual(this.stopTriggered, orderEntity.stopTriggered) && Intrinsics.areEqual(this.fromReduce, orderEntity.fromReduce) && Intrinsics.areEqual(this.closeOnly, orderEntity.closeOnly) && Intrinsics.areEqual(this.closeOrder, orderEntity.closeOrder) && Intrinsics.areEqual(this.postOnly, orderEntity.postOnly) && Intrinsics.areEqual(this.shortcut, orderEntity.shortcut) && Intrinsics.areEqual(this.hidden, orderEntity.hidden) && Intrinsics.areEqual(this.iceberg, orderEntity.iceberg) && Intrinsics.areEqual(this.createdAt, orderEntity.createdAt) && Intrinsics.areEqual(this.price, orderEntity.price) && Intrinsics.areEqual(this.dealSize, orderEntity.dealSize) && Intrinsics.areEqual(this.dealValue, orderEntity.dealValue) && Intrinsics.areEqual(this.cancelSize, orderEntity.cancelSize) && Intrinsics.areEqual(this.size, orderEntity.size) && Intrinsics.areEqual(this.visibleSize, orderEntity.visibleSize) && Intrinsics.areEqual(this.triggerOrderId, orderEntity.triggerOrderId) && Intrinsics.areEqual(this.triggerStopUpPrice, orderEntity.triggerStopUpPrice) && Intrinsics.areEqual(this.triggerStopDownPrice, orderEntity.triggerStopDownPrice) && this.isTrialFunds == orderEntity.isTrialFunds && Intrinsics.areEqual(this.marginMode, orderEntity.marginMode) && Intrinsics.areEqual(this.noMarginSize, orderEntity.noMarginSize) && Intrinsics.areEqual(this.remainHoldAmount, orderEntity.remainHoldAmount) && Intrinsics.areEqual(this.positionSide, orderEntity.positionSide) && Intrinsics.areEqual(this.updatedAt, orderEntity.updatedAt) && Intrinsics.areEqual(this.avgDealPrice, orderEntity.avgDealPrice) && Intrinsics.areEqual(this.twapDistanceType, orderEntity.twapDistanceType) && Intrinsics.areEqual(this.twapDistanceValue, orderEntity.twapDistanceValue) && Intrinsics.areEqual(this.twapPriceLimit, orderEntity.twapPriceLimit) && Intrinsics.areEqual(this.twapDurationSec, orderEntity.twapDurationSec) && Intrinsics.areEqual(this.twapIntervalSec, orderEntity.twapIntervalSec) && Intrinsics.areEqual(this.twapUsedDurationSec, orderEntity.twapUsedDurationSec) && Intrinsics.areEqual(this.twapsubOrderSize, orderEntity.twapsubOrderSize) && Intrinsics.areEqual(this.status, orderEntity.status) && Intrinsics.areEqual(this.prizeType, orderEntity.prizeType) && this.multiBizType == orderEntity.multiBizType && Intrinsics.areEqual(this.fee, orderEntity.fee) && Intrinsics.areEqual(this.feeCurrency, orderEntity.feeCurrency) && Intrinsics.areEqual(this.tax, orderEntity.tax) && Intrinsics.areEqual(this.taxCurrency, orderEntity.taxCurrency) && Intrinsics.areEqual(this.pnl, orderEntity.pnl) && Intrinsics.areEqual(this.cancelReason, orderEntity.cancelReason) && Intrinsics.areEqual(this.estPnl, orderEntity.estPnl) && Intrinsics.areEqual(this.estPnlRate, orderEntity.estPnlRate);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.advancedDisplayType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.leverage;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str5 = this.channel;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.side;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.stop;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.stopPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str8 = this.stopPriceType;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.displayType;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.advancedType;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.advancedStatus;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.activationPrice;
        int iHashCode14 = (iHashCode13 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.callbackRate;
        int iHashCode15 = (iHashCode14 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str12 = this.timeInForce;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.cancelExist;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.stopTriggered;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.fromReduce;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.closeOnly;
        int iHashCode20 = (iHashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.closeOrder;
        int iHashCode21 = (iHashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.postOnly;
        int iHashCode22 = (iHashCode21 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.shortcut;
        int iHashCode23 = (iHashCode22 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.hidden;
        int iHashCode24 = (iHashCode23 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.iceberg;
        int iHashCode25 = (iHashCode24 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode26 = (iHashCode25 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.price;
        int iHashCode27 = (iHashCode26 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.dealSize;
        int iHashCode28 = (iHashCode27 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.dealValue;
        int iHashCode29 = (iHashCode28 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.cancelSize;
        int iHashCode30 = (iHashCode29 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.size;
        int iHashCode31 = (iHashCode30 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.visibleSize;
        int iHashCode32 = (iHashCode31 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str13 = this.triggerOrderId;
        int iHashCode33 = (iHashCode32 + (str13 == null ? 0 : str13.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.triggerStopUpPrice;
        int iHashCode34 = (iHashCode33 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.triggerStopDownPrice;
        int iHashCode35 = (((iHashCode34 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31) + Boolean.hashCode(this.isTrialFunds)) * 31;
        String str14 = this.marginMode;
        int iHashCode36 = (iHashCode35 + (str14 == null ? 0 : str14.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.noMarginSize;
        int iHashCode37 = (iHashCode36 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.remainHoldAmount;
        int iHashCode38 = (iHashCode37 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        String str15 = this.positionSide;
        int iHashCode39 = (iHashCode38 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l12 = this.updatedAt;
        int iHashCode40 = (iHashCode39 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.avgDealPrice;
        int iHashCode41 = (iHashCode40 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        String str16 = this.twapDistanceType;
        int iHashCode42 = (iHashCode41 + (str16 == null ? 0 : str16.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.twapDistanceValue;
        int iHashCode43 = (iHashCode42 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.twapPriceLimit;
        int iHashCode44 = (iHashCode43 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        Long l13 = this.twapDurationSec;
        int iHashCode45 = (iHashCode44 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.twapIntervalSec;
        int iHashCode46 = (iHashCode45 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.twapUsedDurationSec;
        int iHashCode47 = (iHashCode46 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.twapsubOrderSize;
        int iHashCode48 = (iHashCode47 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str17 = this.status;
        int iHashCode49 = (iHashCode48 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.prizeType;
        int iHashCode50 = (iHashCode49 + (str18 == null ? 0 : str18.hashCode())) * 31;
        MultiBizType multiBizType = this.multiBizType;
        int iHashCode51 = (iHashCode50 + (multiBizType == null ? 0 : multiBizType.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.fee;
        int iHashCode52 = (iHashCode51 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        String str19 = this.feeCurrency;
        int iHashCode53 = (iHashCode52 + (str19 == null ? 0 : str19.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.tax;
        int iHashCode54 = (iHashCode53 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        String str20 = this.taxCurrency;
        int iHashCode55 = (iHashCode54 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.pnl;
        int iHashCode56 = (iHashCode55 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        String str21 = this.cancelReason;
        int iHashCode57 = (iHashCode56 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.estPnl;
        int iHashCode58 = (iHashCode57 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.estPnlRate;
        return iHashCode58 + (str23 != null ? str23.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderEntity(id=" + this.id + ", type=" + this.type + ", advancedDisplayType=" + this.advancedDisplayType + ", symbol=" + this.symbol + ", leverage=" + this.leverage + ", channel=" + this.channel + ", side=" + this.side + ", stop=" + this.stop + ", stopPrice=" + this.stopPrice + ", stopPriceType=" + this.stopPriceType + ", displayType=" + this.displayType + ", advancedType=" + this.advancedType + ", advancedStatus=" + this.advancedStatus + ", activationPrice=" + this.activationPrice + ", callbackRate=" + this.callbackRate + ", timeInForce=" + this.timeInForce + ", cancelExist=" + this.cancelExist + ", stopTriggered=" + this.stopTriggered + ", fromReduce=" + this.fromReduce + ", closeOnly=" + this.closeOnly + ", closeOrder=" + this.closeOrder + ", postOnly=" + this.postOnly + ", shortcut=" + this.shortcut + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", createdAt=" + this.createdAt + ", price=" + this.price + ", dealSize=" + this.dealSize + ", dealValue=" + this.dealValue + ", cancelSize=" + this.cancelSize + ", size=" + this.size + ", visibleSize=" + this.visibleSize + ", triggerOrderId=" + this.triggerOrderId + ", triggerStopUpPrice=" + this.triggerStopUpPrice + ", triggerStopDownPrice=" + this.triggerStopDownPrice + ", isTrialFunds=" + this.isTrialFunds + ", marginMode=" + this.marginMode + ", noMarginSize=" + this.noMarginSize + ", remainHoldAmount=" + this.remainHoldAmount + ", positionSide=" + this.positionSide + ", updatedAt=" + this.updatedAt + ", avgDealPrice=" + this.avgDealPrice + ", twapDistanceType=" + this.twapDistanceType + ", twapDistanceValue=" + this.twapDistanceValue + ", twapPriceLimit=" + this.twapPriceLimit + ", twapDurationSec=" + this.twapDurationSec + ", twapIntervalSec=" + this.twapIntervalSec + ", twapUsedDurationSec=" + this.twapUsedDurationSec + ", twapsubOrderSize=" + this.twapsubOrderSize + ", status=" + this.status + ", prizeType=" + this.prizeType + ", multiBizType=" + this.multiBizType + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", pnl=" + this.pnl + ", cancelReason=" + this.cancelReason + ", estPnl=" + this.estPnl + ", estPnlRate=" + this.estPnlRate + ')';
    }

    public OrderEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal2, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str12, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Long l11, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable String str13, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, boolean z11, @Nullable String str14, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable String str15, @Nullable Long l12, @Nullable BigDecimal bigDecimal15, @Nullable String str16, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16, @Nullable String str17, @Nullable String str18, @Nullable MultiBizType multiBizType, @Nullable BigDecimal bigDecimal18, @Nullable String str19, @Nullable BigDecimal bigDecimal19, @Nullable String str20, @Nullable BigDecimal bigDecimal20, @Nullable String str21, @Nullable String str22, @Nullable String str23) {
        this.id = str;
        this.type = str2;
        this.advancedDisplayType = str3;
        this.symbol = str4;
        this.leverage = bigDecimal;
        this.channel = str5;
        this.side = str6;
        this.stop = str7;
        this.stopPrice = bigDecimal2;
        this.stopPriceType = str8;
        this.displayType = str9;
        this.advancedType = str10;
        this.advancedStatus = str11;
        this.activationPrice = bigDecimal3;
        this.callbackRate = bigDecimal4;
        this.timeInForce = str12;
        this.cancelExist = bool;
        this.stopTriggered = bool2;
        this.fromReduce = bool3;
        this.closeOnly = bool4;
        this.closeOrder = bool5;
        this.postOnly = bool6;
        this.shortcut = bool7;
        this.hidden = bool8;
        this.iceberg = bool9;
        this.createdAt = l11;
        this.price = bigDecimal5;
        this.dealSize = bigDecimal6;
        this.dealValue = bigDecimal7;
        this.cancelSize = bigDecimal8;
        this.size = bigDecimal9;
        this.visibleSize = bigDecimal10;
        this.triggerOrderId = str13;
        this.triggerStopUpPrice = bigDecimal11;
        this.triggerStopDownPrice = bigDecimal12;
        this.isTrialFunds = z11;
        this.marginMode = str14;
        this.noMarginSize = bigDecimal13;
        this.remainHoldAmount = bigDecimal14;
        this.positionSide = str15;
        this.updatedAt = l12;
        this.avgDealPrice = bigDecimal15;
        this.twapDistanceType = str16;
        this.twapDistanceValue = bigDecimal16;
        this.twapPriceLimit = bigDecimal17;
        this.twapDurationSec = l13;
        this.twapIntervalSec = l14;
        this.twapUsedDurationSec = l15;
        this.twapsubOrderSize = l16;
        this.status = str17;
        this.prizeType = str18;
        this.multiBizType = multiBizType;
        this.fee = bigDecimal18;
        this.feeCurrency = str19;
        this.tax = bigDecimal19;
        this.taxCurrency = str20;
        this.pnl = bigDecimal20;
        this.cancelReason = str21;
        this.estPnl = str22;
        this.estPnlRate = str23;
    }

    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public OrderEntity m103794clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type com.kubi.kumex.data.trade.model.OrderEntity");
        return (OrderEntity) objClone;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStopPriceType() {
        return this.stopPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAdvancedType() {
        return this.advancedType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAdvancedStatus() {
        return this.advancedStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getActivationPrice() {
        return this.activationPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getCallbackRate() {
        return this.callbackRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getCancelExist() {
        return this.cancelExist;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getStopTriggered() {
        return this.stopTriggered;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getFromReduce() {
        return this.fromReduce;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getCloseOnly() {
        return this.closeOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getCloseOrder() {
        return this.closeOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getShortcut() {
        return this.shortcut;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final BigDecimal getDealValue() {
        return this.dealValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdvancedDisplayType() {
        return this.advancedDisplayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BigDecimal getCancelSize() {
        return this.cancelSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getTriggerOrderId() {
        return this.triggerOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final BigDecimal getTriggerStopUpPrice() {
        return this.triggerStopUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getTriggerStopDownPrice() {
        return this.triggerStopDownPrice;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final BigDecimal getNoMarginSize() {
        return this.noMarginSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final BigDecimal getRemainHoldAmount() {
        return this.remainHoldAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final BigDecimal getAvgDealPrice() {
        return this.avgDealPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getTwapDistanceType() {
        return this.twapDistanceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final BigDecimal getTwapDistanceValue() {
        return this.twapDistanceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final BigDecimal getTwapPriceLimit() {
        return this.twapPriceLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Long getTwapDurationSec() {
        return this.twapDurationSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Long getTwapIntervalSec() {
        return this.twapIntervalSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Long getTwapUsedDurationSec() {
        return this.twapUsedDurationSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Long getTwapsubOrderSize() {
        return this.twapsubOrderSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final MultiBizType getMultiBizType() {
        return this.multiBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component55, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component57, reason: from getter */
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getEstPnl() {
        return this.estPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getEstPnlRate() {
        return this.estPnlRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    @Nullable
    public final BigDecimal getActivationPrice() {
        return this.activationPrice;
    }

    @Nullable
    public final String getAdvancedDisplayType() {
        return this.advancedDisplayType;
    }

    @Nullable
    public final String getAdvancedStatus() {
        return this.advancedStatus;
    }

    @Nullable
    public final String getAdvancedType() {
        return this.advancedType;
    }

    @Nullable
    public final BigDecimal getAvgDealPrice() {
        return this.avgDealPrice;
    }

    @Nullable
    public final BigDecimal getCallbackRate() {
        return this.callbackRate;
    }

    @Nullable
    public final Boolean getCancelExist() {
        return this.cancelExist;
    }

    @Nullable
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    public final BigDecimal getCancelSize() {
        return this.cancelSize;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final Boolean getCloseOnly() {
        return this.closeOnly;
    }

    @Nullable
    public final Boolean getCloseOrder() {
        return this.closeOrder;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final BigDecimal getDealSize() {
        return this.dealSize;
    }

    @Nullable
    public final BigDecimal getDealValue() {
        return this.dealValue;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getEstPnl() {
        return this.estPnl;
    }

    @Nullable
    public final String getEstPnlRate() {
        return this.estPnlRate;
    }

    @Nullable
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    public final Boolean getFromReduce() {
        return this.fromReduce;
    }

    @Nullable
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final MultiBizType getMultiBizType() {
        return this.multiBizType;
    }

    @Nullable
    public final BigDecimal getNoMarginSize() {
        return this.noMarginSize;
    }

    @Nullable
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final BigDecimal getRemainHoldAmount() {
        return this.remainHoldAmount;
    }

    @Nullable
    public final Boolean getShortcut() {
        return this.shortcut;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
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
    public final String getStopPriceType() {
        return this.stopPriceType;
    }

    @Nullable
    public final Boolean getStopTriggered() {
        return this.stopTriggered;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    public final String getTriggerOrderId() {
        return this.triggerOrderId;
    }

    @Nullable
    public final BigDecimal getTriggerStopDownPrice() {
        return this.triggerStopDownPrice;
    }

    @Nullable
    public final BigDecimal getTriggerStopUpPrice() {
        return this.triggerStopUpPrice;
    }

    @Nullable
    public final String getTwapDistanceType() {
        return this.twapDistanceType;
    }

    @Nullable
    public final BigDecimal getTwapDistanceValue() {
        return this.twapDistanceValue;
    }

    @Nullable
    public final Long getTwapDurationSec() {
        return this.twapDurationSec;
    }

    @Nullable
    public final Long getTwapIntervalSec() {
        return this.twapIntervalSec;
    }

    @Nullable
    public final BigDecimal getTwapPriceLimit() {
        return this.twapPriceLimit;
    }

    @Nullable
    public final Long getTwapUsedDurationSec() {
        return this.twapUsedDurationSec;
    }

    @Nullable
    public final Long getTwapsubOrderSize() {
        return this.twapsubOrderSize;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    public final boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    public final void setActivationPrice(@Nullable BigDecimal bigDecimal) {
        this.activationPrice = bigDecimal;
    }

    public final void setAdvancedDisplayType(@Nullable String str) {
        this.advancedDisplayType = str;
    }

    public final void setAdvancedStatus(@Nullable String str) {
        this.advancedStatus = str;
    }

    public final void setAdvancedType(@Nullable String str) {
        this.advancedType = str;
    }

    public final void setCallbackRate(@Nullable BigDecimal bigDecimal) {
        this.callbackRate = bigDecimal;
    }

    public final void setCancelExist(@Nullable Boolean bool) {
        this.cancelExist = bool;
    }

    public final void setCancelReason(@Nullable String str) {
        this.cancelReason = str;
    }

    public final void setCancelSize(@Nullable BigDecimal bigDecimal) {
        this.cancelSize = bigDecimal;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setCloseOnly(@Nullable Boolean bool) {
        this.closeOnly = bool;
    }

    public final void setCloseOrder(@Nullable Boolean bool) {
        this.closeOrder = bool;
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setDealSize(@Nullable BigDecimal bigDecimal) {
        this.dealSize = bigDecimal;
    }

    public final void setDealValue(@Nullable BigDecimal bigDecimal) {
        this.dealValue = bigDecimal;
    }

    public final void setDisplayType(@Nullable String str) {
        this.displayType = str;
    }

    public final void setEstPnl(@Nullable String str) {
        this.estPnl = str;
    }

    public final void setEstPnlRate(@Nullable String str) {
        this.estPnlRate = str;
    }

    public final void setFee(@Nullable BigDecimal bigDecimal) {
        this.fee = bigDecimal;
    }

    public final void setFeeCurrency(@Nullable String str) {
        this.feeCurrency = str;
    }

    public final void setFromReduce(@Nullable Boolean bool) {
        this.fromReduce = bool;
    }

    public final void setHidden(@Nullable Boolean bool) {
        this.hidden = bool;
    }

    public final void setIceberg(@Nullable Boolean bool) {
        this.iceberg = bool;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLeverage(@Nullable BigDecimal bigDecimal) {
        this.leverage = bigDecimal;
    }

    public final void setMarginMode(@Nullable String str) {
        this.marginMode = str;
    }

    public final void setMultiBizType(@Nullable MultiBizType multiBizType) {
        this.multiBizType = multiBizType;
    }

    public final void setPnl(@Nullable BigDecimal bigDecimal) {
        this.pnl = bigDecimal;
    }

    public final void setPositionSide(@Nullable String str) {
        this.positionSide = str;
    }

    public final void setPostOnly(@Nullable Boolean bool) {
        this.postOnly = bool;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setShortcut(@Nullable Boolean bool) {
        this.shortcut = bool;
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

    public final void setStopPriceType(@Nullable String str) {
        this.stopPriceType = str;
    }

    public final void setStopTriggered(@Nullable Boolean bool) {
        this.stopTriggered = bool;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTax(@Nullable BigDecimal bigDecimal) {
        this.tax = bigDecimal;
    }

    public final void setTaxCurrency(@Nullable String str) {
        this.taxCurrency = str;
    }

    public final void setTimeInForce(@Nullable String str) {
        this.timeInForce = str;
    }

    public final void setTrialFunds(boolean z11) {
        this.isTrialFunds = z11;
    }

    public final void setTriggerOrderId(@Nullable String str) {
        this.triggerOrderId = str;
    }

    public final void setTriggerStopDownPrice(@Nullable BigDecimal bigDecimal) {
        this.triggerStopDownPrice = bigDecimal;
    }

    public final void setTriggerStopUpPrice(@Nullable BigDecimal bigDecimal) {
        this.triggerStopUpPrice = bigDecimal;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setVisibleSize(@Nullable BigDecimal bigDecimal) {
        this.visibleSize = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.advancedDisplayType);
        dest.writeString(this.symbol);
        dest.writeSerializable(this.leverage);
        dest.writeString(this.channel);
        dest.writeString(this.side);
        dest.writeString(this.stop);
        dest.writeSerializable(this.stopPrice);
        dest.writeString(this.stopPriceType);
        dest.writeString(this.displayType);
        dest.writeString(this.advancedType);
        dest.writeString(this.advancedStatus);
        dest.writeSerializable(this.activationPrice);
        dest.writeSerializable(this.callbackRate);
        dest.writeString(this.timeInForce);
        Boolean bool = this.cancelExist;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.stopTriggered;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.fromReduce;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.closeOnly;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.closeOrder;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.postOnly;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.shortcut;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.hidden;
        if (bool8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.iceberg;
        if (bool9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.dealSize);
        dest.writeSerializable(this.dealValue);
        dest.writeSerializable(this.cancelSize);
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.visibleSize);
        dest.writeString(this.triggerOrderId);
        dest.writeSerializable(this.triggerStopUpPrice);
        dest.writeSerializable(this.triggerStopDownPrice);
        dest.writeInt(this.isTrialFunds ? 1 : 0);
        dest.writeString(this.marginMode);
        dest.writeSerializable(this.noMarginSize);
        dest.writeSerializable(this.remainHoldAmount);
        dest.writeString(this.positionSide);
        Long l12 = this.updatedAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeSerializable(this.avgDealPrice);
        dest.writeString(this.twapDistanceType);
        dest.writeSerializable(this.twapDistanceValue);
        dest.writeSerializable(this.twapPriceLimit);
        Long l13 = this.twapDurationSec;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        Long l14 = this.twapIntervalSec;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        Long l15 = this.twapUsedDurationSec;
        if (l15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l15.longValue());
        }
        Long l16 = this.twapsubOrderSize;
        if (l16 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l16.longValue());
        }
        dest.writeString(this.status);
        dest.writeString(this.prizeType);
        MultiBizType multiBizType = this.multiBizType;
        if (multiBizType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(multiBizType.name());
        }
        dest.writeSerializable(this.fee);
        dest.writeString(this.feeCurrency);
        dest.writeSerializable(this.tax);
        dest.writeString(this.taxCurrency);
        dest.writeSerializable(this.pnl);
        dest.writeString(this.cancelReason);
        dest.writeString(this.estPnl);
        dest.writeString(this.estPnlRate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderEntity(String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, String str7, BigDecimal bigDecimal2, String str8, String str9, String str10, String str11, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str12, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l11, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str13, BigDecimal bigDecimal11, BigDecimal bigDecimal12, boolean z11, String str14, BigDecimal bigDecimal13, BigDecimal bigDecimal14, String str15, Long l12, BigDecimal bigDecimal15, String str16, BigDecimal bigDecimal16, BigDecimal bigDecimal17, Long l13, Long l14, Long l15, Long l16, String str17, String str18, MultiBizType multiBizType, BigDecimal bigDecimal18, String str19, BigDecimal bigDecimal19, String str20, BigDecimal bigDecimal20, String str21, String str22, String str23, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String str24 = (i11 & 1) != 0 ? null : str;
        this(str24, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : bigDecimal2, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : str10, (i11 & 4096) != 0 ? null : str11, (i11 & 8192) != 0 ? null : bigDecimal3, (i11 & 16384) != 0 ? null : bigDecimal4, (i11 & 32768) != 0 ? null : str12, (i11 & 65536) != 0 ? null : bool, (i11 & 131072) != 0 ? null : bool2, (i11 & 262144) != 0 ? null : bool3, (i11 & 524288) != 0 ? null : bool4, (i11 & 1048576) != 0 ? null : bool5, (i11 & 2097152) != 0 ? null : bool6, (i11 & 4194304) != 0 ? null : bool7, (i11 & 8388608) != 0 ? null : bool8, (i11 & 16777216) != 0 ? null : bool9, (i11 & 33554432) != 0 ? null : l11, (i11 & 67108864) != 0 ? null : bigDecimal5, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal6, (i11 & 268435456) != 0 ? null : bigDecimal7, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bigDecimal8, (i11 & 1073741824) != 0 ? null : bigDecimal9, (i11 & Integer.MIN_VALUE) != 0 ? null : bigDecimal10, (i12 & 1) != 0 ? null : str13, (i12 & 2) != 0 ? null : bigDecimal11, (i12 & 4) != 0 ? null : bigDecimal12, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? null : str14, (i12 & 32) != 0 ? null : bigDecimal13, (i12 & 64) != 0 ? null : bigDecimal14, (i12 & 128) != 0 ? null : str15, (i12 & 256) != 0 ? null : l12, (i12 & 512) != 0 ? null : bigDecimal15, (i12 & 1024) != 0 ? null : str16, (i12 & 2048) != 0 ? null : bigDecimal16, (i12 & 4096) != 0 ? null : bigDecimal17, (i12 & 8192) != 0 ? null : l13, (i12 & 16384) != 0 ? null : l14, (i12 & 32768) != 0 ? null : l15, (i12 & 65536) != 0 ? null : l16, (i12 & 131072) != 0 ? null : str17, (i12 & 262144) != 0 ? null : str18, (i12 & 524288) != 0 ? null : multiBizType, (i12 & 1048576) != 0 ? null : bigDecimal18, (i12 & 2097152) != 0 ? null : str19, (i12 & 4194304) != 0 ? null : bigDecimal19, (i12 & 8388608) != 0 ? null : str20, (i12 & 16777216) != 0 ? null : bigDecimal20, (i12 & 33554432) != 0 ? null : str21, (i12 & 67108864) != 0 ? null : str22, (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str23);
    }
}
