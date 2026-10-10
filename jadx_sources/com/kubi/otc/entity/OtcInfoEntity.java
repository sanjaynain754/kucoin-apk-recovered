package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.OtcUserManager;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bw\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0003\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010/\u001a\u0004\u0018\u00010!\u0012\b\u00100\u001a\u0004\u0018\u00010!\u0012\b\u00101\u001a\u0004\u0018\u00010\u0006\u0012\b\u00102\u001a\u0004\u0018\u00010\u0006\u0012\b\u00103\u001a\u0004\u0018\u00010\u0006\u0012\b\u00104\u001a\u0004\u0018\u00010\u0006\u0012\b\u00105\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108J\u0006\u0010s\u001a\u00020\u0017J\u0006\u0010t\u001a\u00020\u0017J\u0006\u0010u\u001a\u00020!J\u0006\u0010v\u001a\u00020\u0017J\u0006\u0010w\u001a\u00020\u0017J\u0006\u0010x\u001a\u00020\u0017J\u0014\u0010y\u001a\u00020\u00172\f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003J\u0006\u0010{\u001a\u00020\u0006J\u0006\u0010|\u001a\u00020\bJ\u0011\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010MJ\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020!HÆ\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0002\u0010[J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0002\u0010[J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0002\u0010[J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0002\u0010[J\u0011\u0010£\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0002\u0010[J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u000106HÆ\u0003J¤\u0004\u0010©\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010!2\n\b\u0002\u00100\u001a\u0004\u0018\u00010!2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u000106HÆ\u0001¢\u0006\u0003\u0010ª\u0001J\u0007\u0010«\u0001\u001a\u00020!J\u0016\u0010¬\u0001\u001a\u00020\u00172\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001HÖ\u0003J\n\u0010¯\u0001\u001a\u00020!HÖ\u0001J\n\u0010°\u0001\u001a\u00020\u0006HÖ\u0001J\u001b\u0010±\u0001\u001a\u00030²\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020!R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010<R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010>R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010>R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010<R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010>R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010>R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010>R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bV\u0010>R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bW\u0010>R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u001a\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\\\u001a\u0004\bZ\u0010[R\u0015\u0010#\u001a\u0004\u0018\u00010!¢\u0006\n\n\u0002\u0010\\\u001a\u0004\b]\u0010[R\u001e\u0010$\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\\\u001a\u0004\b^\u0010[\"\u0004\b_\u0010`R\u0013\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u0013\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bb\u0010<R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010<R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010<R\u0018\u0010+\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010<R\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010<R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010<R\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010<R\u001a\u0010/\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\\\u001a\u0004\bk\u0010[R\u001a\u00100\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\\\u001a\u0004\bl\u0010[R\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010<R\u0018\u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010<R\u0018\u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010<R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010<R\u0018\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010r¨\u0006¶\u0001"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcInfoEntity;", "Landroid/os/Parcelable;", "adPayTypes", "", "Lcom/kubi/otc/entity/AdPayType;", FirebaseAnalytics.Param.CURRENCY, "", "currencyBalanceQuantity", "Ljava/math/BigDecimal;", "currencyQuantity", "floatPrice", "id", "legal", "limitMaxQuote", "limitMinQuote", "limitPrice", "nickName", "portraitURL", "premium", "remarks", "side", "status", "self", "", "legalBalanceQuantity", "updatedAt", "", "dailyQuotaOfKyc1", "dailyQuotaOfKyc2", "dailyQuotaOfNoKyc", "orderQuotaOfKyc1", "orderQuotaOfNoKyc", "kycLevel", "", "foxKingMerchants", "goldMerchants", "adTarget", "dealOrderNum", "dealOrderRate", "adRule", "Lcom/kubi/otc/entity/AdRule;", "tradeLimitTip", "opponentBalanceLimit", "blockStatus", "letter", "onlineStatus", "onlineStatusDescription", "additionalAd", "tradeLimitDialogType", "topTag", "newUserTag", "topTagTip", "newUserTagTip", "foxKingDepositAmount", "Lcom/kubi/otc/entity/FoxKingDepositAmount;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/AdRule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FoxKingDepositAmount;)V", "getAdPayTypes", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "getCurrencyBalanceQuantity", "()Ljava/math/BigDecimal;", "getCurrencyQuantity", "getFloatPrice", "getId", "getLegal", "getLimitMaxQuote", "getLimitMinQuote", "getLimitPrice", "getNickName", "getPortraitURL", "getPremium", "getRemarks", "getSide", "getStatus", "getSelf", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLegalBalanceQuantity", "getUpdatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDailyQuotaOfKyc1", "getDailyQuotaOfKyc2", "getDailyQuotaOfNoKyc", "getOrderQuotaOfKyc1", "getOrderQuotaOfNoKyc", "getKycLevel", "()I", "getFoxKingMerchants", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGoldMerchants", "getAdTarget", "setAdTarget", "(Ljava/lang/Integer;)V", "getDealOrderNum", "getDealOrderRate", "getAdRule", "()Lcom/kubi/otc/entity/AdRule;", "getTradeLimitTip", "getOpponentBalanceLimit", "getBlockStatus", "getLetter", "getOnlineStatus", "getOnlineStatusDescription", "getAdditionalAd", "getTradeLimitDialogType", "getTopTag", "getNewUserTag", "getTopTagTip", "getNewUserTagTip", "getFoxKingDepositAmount", "()Lcom/kubi/otc/entity/FoxKingDepositAmount;", "needHighKyc", "isLimitMerchants", "isBuyValue", "isBuy", "isGoldMerchants", "isFoxKingMerchants", "notMatchPayType", "payTypeList", "getDayLimitQuota", "getSingleLimitQuota", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/AdRule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FoxKingDepositAmount;)Lcom/kubi/otc/entity/OtcInfoEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OtcInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OtcInfoEntity> CREATOR = new Creator();

    @Nullable
    private final List<AdPayType> adPayTypes;

    @Nullable
    private final AdRule adRule;

    @Nullable
    private Integer adTarget;

    @SerializedName("additionalAd")
    @Nullable
    private final Integer additionalAd;

    @SerializedName("blackStatus")
    @Nullable
    private final String blockStatus;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal currencyBalanceQuantity;

    @Nullable
    private final BigDecimal currencyQuantity;

    @Nullable
    private final BigDecimal dailyQuotaOfKyc1;

    @Nullable
    private final BigDecimal dailyQuotaOfKyc2;

    @Nullable
    private final BigDecimal dailyQuotaOfNoKyc;

    @Nullable
    private final String dealOrderNum;

    @Nullable
    private final String dealOrderRate;

    @Nullable
    private final BigDecimal floatPrice;

    @SerializedName("foxKingDepositAmount")
    @Nullable
    private final FoxKingDepositAmount foxKingDepositAmount;

    @SerializedName("foxKingMerchants")
    @Nullable
    private final Integer foxKingMerchants;

    @Nullable
    private final Integer goldMerchants;

    @Nullable
    private final String id;
    private final int kycLevel;

    @Nullable
    private final String legal;

    @Nullable
    private final BigDecimal legalBalanceQuantity;

    @SerializedName("showLetter")
    @Nullable
    private final String letter;

    @Nullable
    private final BigDecimal limitMaxQuote;

    @Nullable
    private final BigDecimal limitMinQuote;

    @Nullable
    private final BigDecimal limitPrice;

    @SerializedName("newUserTag")
    @Nullable
    private final String newUserTag;

    @SerializedName("newUserTagTip")
    @Nullable
    private final String newUserTagTip;

    @Nullable
    private final String nickName;

    @SerializedName("lastActiveStatus")
    @Nullable
    private final String onlineStatus;

    @SerializedName("lastActiveDesc")
    @Nullable
    private final String onlineStatusDescription;

    @SerializedName("opponentBalanceLimit")
    @Nullable
    private final String opponentBalanceLimit;

    @Nullable
    private final BigDecimal orderQuotaOfKyc1;

    @Nullable
    private final BigDecimal orderQuotaOfNoKyc;

    @Nullable
    private final String portraitURL;

    @Nullable
    private final BigDecimal premium;

    @Nullable
    private final String remarks;

    @Nullable
    private final Boolean self;

    @Nullable
    private final String side;

    @Nullable
    private final String status;

    @SerializedName("topTag")
    @Nullable
    private final String topTag;

    @SerializedName("topTagTip")
    @Nullable
    private final String topTagTip;

    @SerializedName("tradeLimitDialogType")
    @Nullable
    private final Integer tradeLimitDialogType;

    @SerializedName("tradeLimitTip")
    @Nullable
    private final String tradeLimitTip;

    @Nullable
    private final Long updatedAt;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OtcInfoEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcInfoEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(AdPayType.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OtcInfoEntity(arrayList, parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdRule.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FoxKingDepositAmount.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcInfoEntity[] newArray(int i11) {
            return new OtcInfoEntity[i11];
        }
    }

    public OtcInfoEntity(@Nullable List<AdPayType> list, @Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal7, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal8, @Nullable Long l11, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, int i11, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str9, @Nullable String str10, @Nullable AdRule adRule, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable FoxKingDepositAmount foxKingDepositAmount) {
        this.adPayTypes = list;
        this.currency = str;
        this.currencyBalanceQuantity = bigDecimal;
        this.currencyQuantity = bigDecimal2;
        this.floatPrice = bigDecimal3;
        this.id = str2;
        this.legal = str3;
        this.limitMaxQuote = bigDecimal4;
        this.limitMinQuote = bigDecimal5;
        this.limitPrice = bigDecimal6;
        this.nickName = str4;
        this.portraitURL = str5;
        this.premium = bigDecimal7;
        this.remarks = str6;
        this.side = str7;
        this.status = str8;
        this.self = bool;
        this.legalBalanceQuantity = bigDecimal8;
        this.updatedAt = l11;
        this.dailyQuotaOfKyc1 = bigDecimal9;
        this.dailyQuotaOfKyc2 = bigDecimal10;
        this.dailyQuotaOfNoKyc = bigDecimal11;
        this.orderQuotaOfKyc1 = bigDecimal12;
        this.orderQuotaOfNoKyc = bigDecimal13;
        this.kycLevel = i11;
        this.foxKingMerchants = num;
        this.goldMerchants = num2;
        this.adTarget = num3;
        this.dealOrderNum = str9;
        this.dealOrderRate = str10;
        this.adRule = adRule;
        this.tradeLimitTip = str11;
        this.opponentBalanceLimit = str12;
        this.blockStatus = str13;
        this.letter = str14;
        this.onlineStatus = str15;
        this.onlineStatusDescription = str16;
        this.additionalAd = num4;
        this.tradeLimitDialogType = num5;
        this.topTag = str17;
        this.newUserTag = str18;
        this.topTagTip = str19;
        this.newUserTagTip = str20;
        this.foxKingDepositAmount = foxKingDepositAmount;
    }

    @NotNull
    public final OtcInfoEntity copy(@Nullable List<AdPayType> adPayTypes, @Nullable String currency, @Nullable BigDecimal currencyBalanceQuantity, @Nullable BigDecimal currencyQuantity, @Nullable BigDecimal floatPrice, @Nullable String id2, @Nullable String legal, @Nullable BigDecimal limitMaxQuote, @Nullable BigDecimal limitMinQuote, @Nullable BigDecimal limitPrice, @Nullable String nickName, @Nullable String portraitURL, @Nullable BigDecimal premium, @Nullable String remarks, @Nullable String side, @Nullable String status, @Nullable Boolean self, @Nullable BigDecimal legalBalanceQuantity, @Nullable Long updatedAt, @Nullable BigDecimal dailyQuotaOfKyc1, @Nullable BigDecimal dailyQuotaOfKyc2, @Nullable BigDecimal dailyQuotaOfNoKyc, @Nullable BigDecimal orderQuotaOfKyc1, @Nullable BigDecimal orderQuotaOfNoKyc, int kycLevel, @Nullable Integer foxKingMerchants, @Nullable Integer goldMerchants, @Nullable Integer adTarget, @Nullable String dealOrderNum, @Nullable String dealOrderRate, @Nullable AdRule adRule, @Nullable String tradeLimitTip, @Nullable String opponentBalanceLimit, @Nullable String blockStatus, @Nullable String letter, @Nullable String onlineStatus, @Nullable String onlineStatusDescription, @Nullable Integer additionalAd, @Nullable Integer tradeLimitDialogType, @Nullable String topTag, @Nullable String newUserTag, @Nullable String topTagTip, @Nullable String newUserTagTip, @Nullable FoxKingDepositAmount foxKingDepositAmount) {
        return new OtcInfoEntity(adPayTypes, currency, currencyBalanceQuantity, currencyQuantity, floatPrice, id2, legal, limitMaxQuote, limitMinQuote, limitPrice, nickName, portraitURL, premium, remarks, side, status, self, legalBalanceQuantity, updatedAt, dailyQuotaOfKyc1, dailyQuotaOfKyc2, dailyQuotaOfNoKyc, orderQuotaOfKyc1, orderQuotaOfNoKyc, kycLevel, foxKingMerchants, goldMerchants, adTarget, dealOrderNum, dealOrderRate, adRule, tradeLimitTip, opponentBalanceLimit, blockStatus, letter, onlineStatus, onlineStatusDescription, additionalAd, tradeLimitDialogType, topTag, newUserTag, topTagTip, newUserTagTip, foxKingDepositAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtcInfoEntity)) {
            return false;
        }
        OtcInfoEntity otcInfoEntity = (OtcInfoEntity) other;
        return Intrinsics.areEqual(this.adPayTypes, otcInfoEntity.adPayTypes) && Intrinsics.areEqual(this.currency, otcInfoEntity.currency) && Intrinsics.areEqual(this.currencyBalanceQuantity, otcInfoEntity.currencyBalanceQuantity) && Intrinsics.areEqual(this.currencyQuantity, otcInfoEntity.currencyQuantity) && Intrinsics.areEqual(this.floatPrice, otcInfoEntity.floatPrice) && Intrinsics.areEqual(this.id, otcInfoEntity.id) && Intrinsics.areEqual(this.legal, otcInfoEntity.legal) && Intrinsics.areEqual(this.limitMaxQuote, otcInfoEntity.limitMaxQuote) && Intrinsics.areEqual(this.limitMinQuote, otcInfoEntity.limitMinQuote) && Intrinsics.areEqual(this.limitPrice, otcInfoEntity.limitPrice) && Intrinsics.areEqual(this.nickName, otcInfoEntity.nickName) && Intrinsics.areEqual(this.portraitURL, otcInfoEntity.portraitURL) && Intrinsics.areEqual(this.premium, otcInfoEntity.premium) && Intrinsics.areEqual(this.remarks, otcInfoEntity.remarks) && Intrinsics.areEqual(this.side, otcInfoEntity.side) && Intrinsics.areEqual(this.status, otcInfoEntity.status) && Intrinsics.areEqual(this.self, otcInfoEntity.self) && Intrinsics.areEqual(this.legalBalanceQuantity, otcInfoEntity.legalBalanceQuantity) && Intrinsics.areEqual(this.updatedAt, otcInfoEntity.updatedAt) && Intrinsics.areEqual(this.dailyQuotaOfKyc1, otcInfoEntity.dailyQuotaOfKyc1) && Intrinsics.areEqual(this.dailyQuotaOfKyc2, otcInfoEntity.dailyQuotaOfKyc2) && Intrinsics.areEqual(this.dailyQuotaOfNoKyc, otcInfoEntity.dailyQuotaOfNoKyc) && Intrinsics.areEqual(this.orderQuotaOfKyc1, otcInfoEntity.orderQuotaOfKyc1) && Intrinsics.areEqual(this.orderQuotaOfNoKyc, otcInfoEntity.orderQuotaOfNoKyc) && this.kycLevel == otcInfoEntity.kycLevel && Intrinsics.areEqual(this.foxKingMerchants, otcInfoEntity.foxKingMerchants) && Intrinsics.areEqual(this.goldMerchants, otcInfoEntity.goldMerchants) && Intrinsics.areEqual(this.adTarget, otcInfoEntity.adTarget) && Intrinsics.areEqual(this.dealOrderNum, otcInfoEntity.dealOrderNum) && Intrinsics.areEqual(this.dealOrderRate, otcInfoEntity.dealOrderRate) && Intrinsics.areEqual(this.adRule, otcInfoEntity.adRule) && Intrinsics.areEqual(this.tradeLimitTip, otcInfoEntity.tradeLimitTip) && Intrinsics.areEqual(this.opponentBalanceLimit, otcInfoEntity.opponentBalanceLimit) && Intrinsics.areEqual(this.blockStatus, otcInfoEntity.blockStatus) && Intrinsics.areEqual(this.letter, otcInfoEntity.letter) && Intrinsics.areEqual(this.onlineStatus, otcInfoEntity.onlineStatus) && Intrinsics.areEqual(this.onlineStatusDescription, otcInfoEntity.onlineStatusDescription) && Intrinsics.areEqual(this.additionalAd, otcInfoEntity.additionalAd) && Intrinsics.areEqual(this.tradeLimitDialogType, otcInfoEntity.tradeLimitDialogType) && Intrinsics.areEqual(this.topTag, otcInfoEntity.topTag) && Intrinsics.areEqual(this.newUserTag, otcInfoEntity.newUserTag) && Intrinsics.areEqual(this.topTagTip, otcInfoEntity.topTagTip) && Intrinsics.areEqual(this.newUserTagTip, otcInfoEntity.newUserTagTip) && Intrinsics.areEqual(this.foxKingDepositAmount, otcInfoEntity.foxKingDepositAmount);
    }

    @Nullable
    public final List<AdPayType> component1() {
        return this.adPayTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPortraitURL() {
        return this.portraitURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getPremium() {
        return this.premium;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getSelf() {
        return this.self;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getLegalBalanceQuantity() {
        return this.legalBalanceQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getDailyQuotaOfKyc1() {
        return this.dailyQuotaOfKyc1;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getDailyQuotaOfKyc2() {
        return this.dailyQuotaOfKyc2;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getDailyQuotaOfNoKyc() {
        return this.dailyQuotaOfNoKyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getOrderQuotaOfKyc1() {
        return this.orderQuotaOfKyc1;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getOrderQuotaOfNoKyc() {
        return this.orderQuotaOfNoKyc;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getFoxKingMerchants() {
        return this.foxKingMerchants;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getGoldMerchants() {
        return this.goldMerchants;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getAdTarget() {
        return this.adTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDealOrderNum() {
        return this.dealOrderNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getCurrencyBalanceQuantity() {
        return this.currencyBalanceQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getDealOrderRate() {
        return this.dealOrderRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final AdRule getAdRule() {
        return this.adRule;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getTradeLimitTip() {
        return this.tradeLimitTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getOpponentBalanceLimit() {
        return this.opponentBalanceLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getBlockStatus() {
        return this.blockStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getLetter() {
        return this.letter;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getOnlineStatus() {
        return this.onlineStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getOnlineStatusDescription() {
        return this.onlineStatusDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Integer getAdditionalAd() {
        return this.additionalAd;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Integer getTradeLimitDialogType() {
        return this.tradeLimitDialogType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getCurrencyQuantity() {
        return this.currencyQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getTopTag() {
        return this.topTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getNewUserTag() {
        return this.newUserTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getTopTagTip() {
        return this.topTagTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getNewUserTagTip() {
        return this.newUserTagTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final FoxKingDepositAmount getFoxKingDepositAmount() {
        return this.foxKingDepositAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getFloatPrice() {
        return this.floatPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getLimitMaxQuote() {
        return this.limitMaxQuote;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getLimitMinQuote() {
        return this.limitMinQuote;
    }

    @Nullable
    public final List<AdPayType> getAdPayTypes() {
        return this.adPayTypes;
    }

    @Nullable
    public final AdRule getAdRule() {
        return this.adRule;
    }

    @Nullable
    public final Integer getAdTarget() {
        return this.adTarget;
    }

    @Nullable
    public final Integer getAdditionalAd() {
        return this.additionalAd;
    }

    @Nullable
    public final String getBlockStatus() {
        return this.blockStatus;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getCurrencyBalanceQuantity() {
        return this.currencyBalanceQuantity;
    }

    @Nullable
    public final BigDecimal getCurrencyQuantity() {
        return this.currencyQuantity;
    }

    @Nullable
    public final BigDecimal getDailyQuotaOfKyc1() {
        return this.dailyQuotaOfKyc1;
    }

    @Nullable
    public final BigDecimal getDailyQuotaOfKyc2() {
        return this.dailyQuotaOfKyc2;
    }

    @Nullable
    public final BigDecimal getDailyQuotaOfNoKyc() {
        return this.dailyQuotaOfNoKyc;
    }

    @NotNull
    public final String getDayLimitQuota() {
        BigDecimal bigDecimalM11724a;
        BigDecimal bigDecimalM11724a2;
        String plainString = null;
        if (OtcUserManager.f38144a.m45490j().isRealLowKycLevel()) {
            BigDecimal bigDecimal = this.dailyQuotaOfKyc1;
            if (bigDecimal != null && (bigDecimalM11724a2 = C6447a.m11724a(bigDecimal)) != null) {
                plainString = bigDecimalM11724a2.toPlainString();
            }
            return C27041f.m66668h(plainString);
        }
        BigDecimal bigDecimal2 = this.dailyQuotaOfNoKyc;
        if (bigDecimal2 != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimal2)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        }
        return C27041f.m66668h(plainString);
    }

    @Nullable
    public final String getDealOrderNum() {
        return this.dealOrderNum;
    }

    @Nullable
    public final String getDealOrderRate() {
        return this.dealOrderRate;
    }

    @Nullable
    public final BigDecimal getFloatPrice() {
        return this.floatPrice;
    }

    @Nullable
    public final FoxKingDepositAmount getFoxKingDepositAmount() {
        return this.foxKingDepositAmount;
    }

    @Nullable
    public final Integer getFoxKingMerchants() {
        return this.foxKingMerchants;
    }

    @Nullable
    public final Integer getGoldMerchants() {
        return this.goldMerchants;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final int getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    public final BigDecimal getLegalBalanceQuantity() {
        return this.legalBalanceQuantity;
    }

    @Nullable
    public final String getLetter() {
        return this.letter;
    }

    @Nullable
    public final BigDecimal getLimitMaxQuote() {
        return this.limitMaxQuote;
    }

    @Nullable
    public final BigDecimal getLimitMinQuote() {
        return this.limitMinQuote;
    }

    @Nullable
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    @Nullable
    public final String getNewUserTag() {
        return this.newUserTag;
    }

    @Nullable
    public final String getNewUserTagTip() {
        return this.newUserTagTip;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getOnlineStatus() {
        return this.onlineStatus;
    }

    @Nullable
    public final String getOnlineStatusDescription() {
        return this.onlineStatusDescription;
    }

    @Nullable
    public final String getOpponentBalanceLimit() {
        return this.opponentBalanceLimit;
    }

    @Nullable
    public final BigDecimal getOrderQuotaOfKyc1() {
        return this.orderQuotaOfKyc1;
    }

    @Nullable
    public final BigDecimal getOrderQuotaOfNoKyc() {
        return this.orderQuotaOfNoKyc;
    }

    @Nullable
    public final String getPortraitURL() {
        return this.portraitURL;
    }

    @Nullable
    public final BigDecimal getPremium() {
        return this.premium;
    }

    @Nullable
    public final String getRemarks() {
        return this.remarks;
    }

    @Nullable
    public final Boolean getSelf() {
        return this.self;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final BigDecimal getSingleLimitQuota() {
        return OtcUserManager.f38144a.m45490j().isRealLowKycLevel() ? C41014a.m89922G(this.orderQuotaOfKyc1, null, 1, null) : C41014a.m89922G(this.orderQuotaOfNoKyc, null, 1, null);
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTopTag() {
        return this.topTag;
    }

    @Nullable
    public final String getTopTagTip() {
        return this.topTagTip;
    }

    @Nullable
    public final Integer getTradeLimitDialogType() {
        return this.tradeLimitDialogType;
    }

    @Nullable
    public final String getTradeLimitTip() {
        return this.tradeLimitTip;
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        List<AdPayType> list = this.adPayTypes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.currencyBalanceQuantity;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.currencyQuantity;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.floatPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.legal;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.limitMaxQuote;
        int iHashCode8 = (iHashCode7 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.limitMinQuote;
        int iHashCode9 = (iHashCode8 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.limitPrice;
        int iHashCode10 = (iHashCode9 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str4 = this.nickName;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.portraitURL;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.premium;
        int iHashCode13 = (iHashCode12 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str6 = this.remarks;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.side;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.self;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.legalBalanceQuantity;
        int iHashCode18 = (iHashCode17 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Long l11 = this.updatedAt;
        int iHashCode19 = (iHashCode18 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.dailyQuotaOfKyc1;
        int iHashCode20 = (iHashCode19 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.dailyQuotaOfKyc2;
        int iHashCode21 = (iHashCode20 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.dailyQuotaOfNoKyc;
        int iHashCode22 = (iHashCode21 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.orderQuotaOfKyc1;
        int iHashCode23 = (iHashCode22 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.orderQuotaOfNoKyc;
        int iHashCode24 = (((iHashCode23 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31) + Integer.hashCode(this.kycLevel)) * 31;
        Integer num = this.foxKingMerchants;
        int iHashCode25 = (iHashCode24 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.goldMerchants;
        int iHashCode26 = (iHashCode25 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.adTarget;
        int iHashCode27 = (iHashCode26 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.dealOrderNum;
        int iHashCode28 = (iHashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dealOrderRate;
        int iHashCode29 = (iHashCode28 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AdRule adRule = this.adRule;
        int iHashCode30 = (iHashCode29 + (adRule == null ? 0 : adRule.hashCode())) * 31;
        String str11 = this.tradeLimitTip;
        int iHashCode31 = (iHashCode30 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.opponentBalanceLimit;
        int iHashCode32 = (iHashCode31 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.blockStatus;
        int iHashCode33 = (iHashCode32 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.letter;
        int iHashCode34 = (iHashCode33 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.onlineStatus;
        int iHashCode35 = (iHashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.onlineStatusDescription;
        int iHashCode36 = (iHashCode35 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num4 = this.additionalAd;
        int iHashCode37 = (iHashCode36 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tradeLimitDialogType;
        int iHashCode38 = (iHashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str17 = this.topTag;
        int iHashCode39 = (iHashCode38 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.newUserTag;
        int iHashCode40 = (iHashCode39 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.topTagTip;
        int iHashCode41 = (iHashCode40 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.newUserTagTip;
        int iHashCode42 = (iHashCode41 + (str20 == null ? 0 : str20.hashCode())) * 31;
        FoxKingDepositAmount foxKingDepositAmount = this.foxKingDepositAmount;
        return iHashCode42 + (foxKingDepositAmount != null ? foxKingDepositAmount.hashCode() : 0);
    }

    public final boolean isBuy() {
        return Intrinsics.areEqual(this.side, "SELL");
    }

    public final int isBuyValue() {
        return Intrinsics.areEqual(this.side, "SELL") ? 1 : 0;
    }

    public final boolean isFoxKingMerchants() {
        Integer num = this.foxKingMerchants;
        return num != null && num.intValue() == 1;
    }

    public final boolean isGoldMerchants() {
        Integer num = this.goldMerchants;
        return num != null && num.intValue() == 1;
    }

    public final boolean isLimitMerchants() {
        Integer num = this.adTarget;
        return num != null && num.intValue() == 2 && C27025c.m66566d(OtcUserManager.f38144a.m45490j().getMerchant());
    }

    public final boolean needHighKyc() {
        return this.kycLevel == 2;
    }

    public final boolean notMatchPayType(@NotNull List<String> payTypeList) {
        Intrinsics.checkNotNullParameter(payTypeList, "payTypeList");
        for (String str : payTypeList) {
            Iterator it = C27024b.m66560c(this.adPayTypes).iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(str, ((AdPayType) it.next()).getPayTypeCode())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void setAdTarget(@Nullable Integer num) {
        this.adTarget = num;
    }

    @NotNull
    public String toString() {
        return "OtcInfoEntity(adPayTypes=" + this.adPayTypes + ", currency=" + this.currency + ", currencyBalanceQuantity=" + this.currencyBalanceQuantity + ", currencyQuantity=" + this.currencyQuantity + ", floatPrice=" + this.floatPrice + ", id=" + this.id + ", legal=" + this.legal + ", limitMaxQuote=" + this.limitMaxQuote + ", limitMinQuote=" + this.limitMinQuote + ", limitPrice=" + this.limitPrice + ", nickName=" + this.nickName + ", portraitURL=" + this.portraitURL + ", premium=" + this.premium + ", remarks=" + this.remarks + ", side=" + this.side + ", status=" + this.status + ", self=" + this.self + ", legalBalanceQuantity=" + this.legalBalanceQuantity + ", updatedAt=" + this.updatedAt + ", dailyQuotaOfKyc1=" + this.dailyQuotaOfKyc1 + ", dailyQuotaOfKyc2=" + this.dailyQuotaOfKyc2 + ", dailyQuotaOfNoKyc=" + this.dailyQuotaOfNoKyc + ", orderQuotaOfKyc1=" + this.orderQuotaOfKyc1 + ", orderQuotaOfNoKyc=" + this.orderQuotaOfNoKyc + ", kycLevel=" + this.kycLevel + ", foxKingMerchants=" + this.foxKingMerchants + ", goldMerchants=" + this.goldMerchants + ", adTarget=" + this.adTarget + ", dealOrderNum=" + this.dealOrderNum + ", dealOrderRate=" + this.dealOrderRate + ", adRule=" + this.adRule + ", tradeLimitTip=" + this.tradeLimitTip + ", opponentBalanceLimit=" + this.opponentBalanceLimit + ", blockStatus=" + this.blockStatus + ", letter=" + this.letter + ", onlineStatus=" + this.onlineStatus + ", onlineStatusDescription=" + this.onlineStatusDescription + ", additionalAd=" + this.additionalAd + ", tradeLimitDialogType=" + this.tradeLimitDialogType + ", topTag=" + this.topTag + ", newUserTag=" + this.newUserTag + ", topTagTip=" + this.topTagTip + ", newUserTagTip=" + this.newUserTagTip + ", foxKingDepositAmount=" + this.foxKingDepositAmount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<AdPayType> list = this.adPayTypes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AdPayType> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.currency);
        dest.writeSerializable(this.currencyBalanceQuantity);
        dest.writeSerializable(this.currencyQuantity);
        dest.writeSerializable(this.floatPrice);
        dest.writeString(this.id);
        dest.writeString(this.legal);
        dest.writeSerializable(this.limitMaxQuote);
        dest.writeSerializable(this.limitMinQuote);
        dest.writeSerializable(this.limitPrice);
        dest.writeString(this.nickName);
        dest.writeString(this.portraitURL);
        dest.writeSerializable(this.premium);
        dest.writeString(this.remarks);
        dest.writeString(this.side);
        dest.writeString(this.status);
        Boolean bool = this.self;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.legalBalanceQuantity);
        Long l11 = this.updatedAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.dailyQuotaOfKyc1);
        dest.writeSerializable(this.dailyQuotaOfKyc2);
        dest.writeSerializable(this.dailyQuotaOfNoKyc);
        dest.writeSerializable(this.orderQuotaOfKyc1);
        dest.writeSerializable(this.orderQuotaOfNoKyc);
        dest.writeInt(this.kycLevel);
        Integer num = this.foxKingMerchants;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.goldMerchants;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.adTarget;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.dealOrderNum);
        dest.writeString(this.dealOrderRate);
        AdRule adRule = this.adRule;
        if (adRule == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            adRule.writeToParcel(dest, flags);
        }
        dest.writeString(this.tradeLimitTip);
        dest.writeString(this.opponentBalanceLimit);
        dest.writeString(this.blockStatus);
        dest.writeString(this.letter);
        dest.writeString(this.onlineStatus);
        dest.writeString(this.onlineStatusDescription);
        Integer num4 = this.additionalAd;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.tradeLimitDialogType;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        dest.writeString(this.topTag);
        dest.writeString(this.newUserTag);
        dest.writeString(this.topTagTip);
        dest.writeString(this.newUserTagTip);
        FoxKingDepositAmount foxKingDepositAmount = this.foxKingDepositAmount;
        if (foxKingDepositAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            foxKingDepositAmount.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ OtcInfoEntity(List list, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, String str3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str4, String str5, BigDecimal bigDecimal7, String str6, String str7, String str8, Boolean bool, BigDecimal bigDecimal8, Long l11, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, int i11, Integer num, Integer num2, Integer num3, String str9, String str10, AdRule adRule, String str11, String str12, String str13, String str14, String str15, String str16, Integer num4, Integer num5, String str17, String str18, String str19, String str20, FoxKingDepositAmount foxKingDepositAmount, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, bigDecimal, bigDecimal2, bigDecimal3, str2, str3, bigDecimal4, bigDecimal5, bigDecimal6, str4, str5, bigDecimal7, str6, str7, str8, bool, bigDecimal8, l11, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, (i12 & 16777216) != 0 ? 0 : i11, num, num2, num3, str9, str10, adRule, str11, str12, str13, str14, str15, str16, num4, num5, str17, str18, str19, str20, foxKingDepositAmount);
    }
}
