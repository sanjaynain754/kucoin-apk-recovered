package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EarnEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bu\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ¶\u00012\u00020\u0001:\u0002¶\u0001B\u008f\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b:\u0010;J\u0006\u0010t\u001a\u00020\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¡\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0002\u0010iJ\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\u0011\u0010§\u0001\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0002\u0010qJ\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0080\u0005\u0010©\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010ª\u0001J\u0007\u0010«\u0001\u001a\u000208J\u0016\u0010¬\u0001\u001a\u0002002\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001HÖ\u0003J\n\u0010¯\u0001\u001a\u000208HÖ\u0001J\n\u0010°\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010±\u0001\u001a\u00030²\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u000208R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010=R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010=R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010=R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010=R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010=R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010=R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010=R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010=R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010=R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010=R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010=R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010=R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010=R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010=R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010=R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010=R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010=R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010=R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010=R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010=R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010=R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010=R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010=R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010=R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010=R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010=R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010=R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010=R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010=R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010=R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010=R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010=R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010=R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010=R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010=R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010=R\u0015\u0010/\u001a\u0004\u0018\u000100¢\u0006\n\n\u0002\u0010j\u001a\u0004\b/\u0010iR\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010=R\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010=R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010=R\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010=R\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0015\u00107\u001a\u0004\u0018\u000108¢\u0006\n\n\u0002\u0010r\u001a\u0004\b7\u0010qR\u0013\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010=¨\u0006·\u0001"}, m90084d2 = {"Lcom/kubi/assets/entity/EarnAccountItem;", "Landroid/os/Parcelable;", "amount", "", "applyEndTime", "applyStartTime", "avg7Return", "baseStakingReturn", "category", FirebaseAnalytics.Param.CURRENCY, "strikeCurrency", "targetCurrency", "dropAmount", "dropCurrency", "freezingAmount", "fundCurrency", "fundLockDuration", "id", "incomeReleaseAmount", "incomeCurrency", "lockAmount", "lockEndTime", "lockPeriod", "lockStartTime", "lockTime", "name", "currencyFullName", "polReleaseAmount", "polReturn", "polkaRewardAmount", "polkaRewardCurrency", "polkaStatus", "productId", "recentIncomeAmount", "recentPolAmount", "stakingReturn", "status", "totalReturn", "type", "unlockPeriod", "unlockedAmount", "unlockingAmount", "jumpUrl", TUIConstants.TUIChat.INPUT_MORE_ICON, "jumpType", "categoryText", "personalLockEndTime", "isCanLock", "", "minReturn", "maxReturn", "bigCurrencyIcon", "smallCurrencyIcon", "leverage", "Ljava/math/BigDecimal;", "isHoldEarnOpen", "", "holdEarnApr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getApplyEndTime", "getApplyStartTime", "getAvg7Return", "getBaseStakingReturn", "getCategory", "getCurrency", "getStrikeCurrency", "getTargetCurrency", "getDropAmount", "getDropCurrency", "getFreezingAmount", "getFundCurrency", "getFundLockDuration", "getId", "getIncomeReleaseAmount", "getIncomeCurrency", "getLockAmount", "getLockEndTime", "getLockPeriod", "getLockStartTime", "getLockTime", "getName", "getCurrencyFullName", "getPolReleaseAmount", "getPolReturn", "getPolkaRewardAmount", "getPolkaRewardCurrency", "getPolkaStatus", "getProductId", "getRecentIncomeAmount", "getRecentPolAmount", "getStakingReturn", "getStatus", "getTotalReturn", "getType", "getUnlockPeriod", "getUnlockedAmount", "getUnlockingAmount", "getJumpUrl", "getIcon", "getJumpType", "getCategoryText", "getPersonalLockEndTime", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinReturn", "getMaxReturn", "getBigCurrencyIcon", "getSmallCurrencyIcon", "getLeverage", "()Ljava/math/BigDecimal;", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHoldEarnApr", "getHoldEarnAprText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/assets/entity/EarnAccountItem;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EarnAccountItem implements Parcelable {

    @NotNull
    public static final String STATUS_DUAL_PENDING = "PENDING";

    @NotNull
    public static final String TYPE_FUTURE_PLUS = "FUTURE_PLUS";

    @NotNull
    public static final String TYPE_TWIN_WIN = "TWIN_WIN";

    @Nullable
    private final String amount;

    @Nullable
    private final String applyEndTime;

    @Nullable
    private final String applyStartTime;

    @Nullable
    private final String avg7Return;

    @Nullable
    private final String baseStakingReturn;

    @Nullable
    private final String bigCurrencyIcon;

    @Nullable
    private final String category;

    @Nullable
    private final String categoryText;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyFullName;

    @Nullable
    private final String dropAmount;

    @Nullable
    private final String dropCurrency;

    @Nullable
    private final String freezingAmount;

    @Nullable
    private final String fundCurrency;

    @Nullable
    private final String fundLockDuration;

    @Nullable
    private final String holdEarnApr;

    @Nullable
    private final String icon;

    @Nullable
    private final String id;

    @Nullable
    private final String incomeCurrency;

    @Nullable
    private final String incomeReleaseAmount;

    @Nullable
    private final Boolean isCanLock;

    @Nullable
    private final Integer isHoldEarnOpen;

    @Nullable
    private final String jumpType;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final String lockAmount;

    @Nullable
    private final String lockEndTime;

    @Nullable
    private final String lockPeriod;

    @Nullable
    private final String lockStartTime;

    @Nullable
    private final String lockTime;

    @Nullable
    private final String maxReturn;

    @Nullable
    private final String minReturn;

    @Nullable
    private final String name;

    @Nullable
    private final String personalLockEndTime;

    @Nullable
    private final String polReleaseAmount;

    @Nullable
    private final String polReturn;

    @Nullable
    private final String polkaRewardAmount;

    @Nullable
    private final String polkaRewardCurrency;

    @Nullable
    private final String polkaStatus;

    @Nullable
    private final String productId;

    @Nullable
    private final String recentIncomeAmount;

    @Nullable
    private final String recentPolAmount;

    @Nullable
    private final String smallCurrencyIcon;

    @Nullable
    private final String stakingReturn;

    @Nullable
    private final String status;

    @Nullable
    private final String strikeCurrency;

    @Nullable
    private final String targetCurrency;

    @Nullable
    private final String totalReturn;

    @Nullable
    private final String type;

    @Nullable
    private final String unlockPeriod;

    @Nullable
    private final String unlockedAmount;

    @Nullable
    private final String unlockingAmount;

    @NotNull
    public static final Parcelable.Creator<EarnAccountItem> CREATOR = new Creator();

    /* JADX INFO: compiled from: EarnEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EarnAccountItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnAccountItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            String string44 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EarnAccountItem(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnAccountItem[] newArray(int i11) {
            return new EarnAccountItem[i11];
        }
    }

    public EarnAccountItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable Boolean bool, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, @Nullable BigDecimal bigDecimal, @Nullable Integer num, @Nullable String str49) {
        this.amount = str;
        this.applyEndTime = str2;
        this.applyStartTime = str3;
        this.avg7Return = str4;
        this.baseStakingReturn = str5;
        this.category = str6;
        this.currency = str7;
        this.strikeCurrency = str8;
        this.targetCurrency = str9;
        this.dropAmount = str10;
        this.dropCurrency = str11;
        this.freezingAmount = str12;
        this.fundCurrency = str13;
        this.fundLockDuration = str14;
        this.id = str15;
        this.incomeReleaseAmount = str16;
        this.incomeCurrency = str17;
        this.lockAmount = str18;
        this.lockEndTime = str19;
        this.lockPeriod = str20;
        this.lockStartTime = str21;
        this.lockTime = str22;
        this.name = str23;
        this.currencyFullName = str24;
        this.polReleaseAmount = str25;
        this.polReturn = str26;
        this.polkaRewardAmount = str27;
        this.polkaRewardCurrency = str28;
        this.polkaStatus = str29;
        this.productId = str30;
        this.recentIncomeAmount = str31;
        this.recentPolAmount = str32;
        this.stakingReturn = str33;
        this.status = str34;
        this.totalReturn = str35;
        this.type = str36;
        this.unlockPeriod = str37;
        this.unlockedAmount = str38;
        this.unlockingAmount = str39;
        this.jumpUrl = str40;
        this.icon = str41;
        this.jumpType = str42;
        this.categoryText = str43;
        this.personalLockEndTime = str44;
        this.isCanLock = bool;
        this.minReturn = str45;
        this.maxReturn = str46;
        this.bigCurrencyIcon = str47;
        this.smallCurrencyIcon = str48;
        this.leverage = bigDecimal;
        this.isHoldEarnOpen = num;
        this.holdEarnApr = str49;
    }

    @NotNull
    public final EarnAccountItem copy(@Nullable String amount, @Nullable String applyEndTime, @Nullable String applyStartTime, @Nullable String avg7Return, @Nullable String baseStakingReturn, @Nullable String category, @Nullable String currency, @Nullable String strikeCurrency, @Nullable String targetCurrency, @Nullable String dropAmount, @Nullable String dropCurrency, @Nullable String freezingAmount, @Nullable String fundCurrency, @Nullable String fundLockDuration, @Nullable String id2, @Nullable String incomeReleaseAmount, @Nullable String incomeCurrency, @Nullable String lockAmount, @Nullable String lockEndTime, @Nullable String lockPeriod, @Nullable String lockStartTime, @Nullable String lockTime, @Nullable String name, @Nullable String currencyFullName, @Nullable String polReleaseAmount, @Nullable String polReturn, @Nullable String polkaRewardAmount, @Nullable String polkaRewardCurrency, @Nullable String polkaStatus, @Nullable String productId, @Nullable String recentIncomeAmount, @Nullable String recentPolAmount, @Nullable String stakingReturn, @Nullable String status, @Nullable String totalReturn, @Nullable String type, @Nullable String unlockPeriod, @Nullable String unlockedAmount, @Nullable String unlockingAmount, @Nullable String jumpUrl, @Nullable String icon, @Nullable String jumpType, @Nullable String categoryText, @Nullable String personalLockEndTime, @Nullable Boolean isCanLock, @Nullable String minReturn, @Nullable String maxReturn, @Nullable String bigCurrencyIcon, @Nullable String smallCurrencyIcon, @Nullable BigDecimal leverage, @Nullable Integer isHoldEarnOpen, @Nullable String holdEarnApr) {
        return new EarnAccountItem(amount, applyEndTime, applyStartTime, avg7Return, baseStakingReturn, category, currency, strikeCurrency, targetCurrency, dropAmount, dropCurrency, freezingAmount, fundCurrency, fundLockDuration, id2, incomeReleaseAmount, incomeCurrency, lockAmount, lockEndTime, lockPeriod, lockStartTime, lockTime, name, currencyFullName, polReleaseAmount, polReturn, polkaRewardAmount, polkaRewardCurrency, polkaStatus, productId, recentIncomeAmount, recentPolAmount, stakingReturn, status, totalReturn, type, unlockPeriod, unlockedAmount, unlockingAmount, jumpUrl, icon, jumpType, categoryText, personalLockEndTime, isCanLock, minReturn, maxReturn, bigCurrencyIcon, smallCurrencyIcon, leverage, isHoldEarnOpen, holdEarnApr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarnAccountItem)) {
            return false;
        }
        EarnAccountItem earnAccountItem = (EarnAccountItem) other;
        return Intrinsics.areEqual(this.amount, earnAccountItem.amount) && Intrinsics.areEqual(this.applyEndTime, earnAccountItem.applyEndTime) && Intrinsics.areEqual(this.applyStartTime, earnAccountItem.applyStartTime) && Intrinsics.areEqual(this.avg7Return, earnAccountItem.avg7Return) && Intrinsics.areEqual(this.baseStakingReturn, earnAccountItem.baseStakingReturn) && Intrinsics.areEqual(this.category, earnAccountItem.category) && Intrinsics.areEqual(this.currency, earnAccountItem.currency) && Intrinsics.areEqual(this.strikeCurrency, earnAccountItem.strikeCurrency) && Intrinsics.areEqual(this.targetCurrency, earnAccountItem.targetCurrency) && Intrinsics.areEqual(this.dropAmount, earnAccountItem.dropAmount) && Intrinsics.areEqual(this.dropCurrency, earnAccountItem.dropCurrency) && Intrinsics.areEqual(this.freezingAmount, earnAccountItem.freezingAmount) && Intrinsics.areEqual(this.fundCurrency, earnAccountItem.fundCurrency) && Intrinsics.areEqual(this.fundLockDuration, earnAccountItem.fundLockDuration) && Intrinsics.areEqual(this.id, earnAccountItem.id) && Intrinsics.areEqual(this.incomeReleaseAmount, earnAccountItem.incomeReleaseAmount) && Intrinsics.areEqual(this.incomeCurrency, earnAccountItem.incomeCurrency) && Intrinsics.areEqual(this.lockAmount, earnAccountItem.lockAmount) && Intrinsics.areEqual(this.lockEndTime, earnAccountItem.lockEndTime) && Intrinsics.areEqual(this.lockPeriod, earnAccountItem.lockPeriod) && Intrinsics.areEqual(this.lockStartTime, earnAccountItem.lockStartTime) && Intrinsics.areEqual(this.lockTime, earnAccountItem.lockTime) && Intrinsics.areEqual(this.name, earnAccountItem.name) && Intrinsics.areEqual(this.currencyFullName, earnAccountItem.currencyFullName) && Intrinsics.areEqual(this.polReleaseAmount, earnAccountItem.polReleaseAmount) && Intrinsics.areEqual(this.polReturn, earnAccountItem.polReturn) && Intrinsics.areEqual(this.polkaRewardAmount, earnAccountItem.polkaRewardAmount) && Intrinsics.areEqual(this.polkaRewardCurrency, earnAccountItem.polkaRewardCurrency) && Intrinsics.areEqual(this.polkaStatus, earnAccountItem.polkaStatus) && Intrinsics.areEqual(this.productId, earnAccountItem.productId) && Intrinsics.areEqual(this.recentIncomeAmount, earnAccountItem.recentIncomeAmount) && Intrinsics.areEqual(this.recentPolAmount, earnAccountItem.recentPolAmount) && Intrinsics.areEqual(this.stakingReturn, earnAccountItem.stakingReturn) && Intrinsics.areEqual(this.status, earnAccountItem.status) && Intrinsics.areEqual(this.totalReturn, earnAccountItem.totalReturn) && Intrinsics.areEqual(this.type, earnAccountItem.type) && Intrinsics.areEqual(this.unlockPeriod, earnAccountItem.unlockPeriod) && Intrinsics.areEqual(this.unlockedAmount, earnAccountItem.unlockedAmount) && Intrinsics.areEqual(this.unlockingAmount, earnAccountItem.unlockingAmount) && Intrinsics.areEqual(this.jumpUrl, earnAccountItem.jumpUrl) && Intrinsics.areEqual(this.icon, earnAccountItem.icon) && Intrinsics.areEqual(this.jumpType, earnAccountItem.jumpType) && Intrinsics.areEqual(this.categoryText, earnAccountItem.categoryText) && Intrinsics.areEqual(this.personalLockEndTime, earnAccountItem.personalLockEndTime) && Intrinsics.areEqual(this.isCanLock, earnAccountItem.isCanLock) && Intrinsics.areEqual(this.minReturn, earnAccountItem.minReturn) && Intrinsics.areEqual(this.maxReturn, earnAccountItem.maxReturn) && Intrinsics.areEqual(this.bigCurrencyIcon, earnAccountItem.bigCurrencyIcon) && Intrinsics.areEqual(this.smallCurrencyIcon, earnAccountItem.smallCurrencyIcon) && Intrinsics.areEqual(this.leverage, earnAccountItem.leverage) && Intrinsics.areEqual(this.isHoldEarnOpen, earnAccountItem.isHoldEarnOpen) && Intrinsics.areEqual(this.holdEarnApr, earnAccountItem.holdEarnApr);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDropAmount() {
        return this.dropAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDropCurrency() {
        return this.dropCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFreezingAmount() {
        return this.freezingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFundCurrency() {
        return this.fundCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFundLockDuration() {
        return this.fundLockDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIncomeReleaseAmount() {
        return this.incomeReleaseAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIncomeCurrency() {
        return this.incomeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getLockAmount() {
        return this.lockAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getLockEndTime() {
        return this.lockEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplyEndTime() {
        return this.applyEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getLockPeriod() {
        return this.lockPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getLockStartTime() {
        return this.lockStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getLockTime() {
        return this.lockTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPolReleaseAmount() {
        return this.polReleaseAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPolReturn() {
        return this.polReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPolkaRewardAmount() {
        return this.polkaRewardAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPolkaRewardCurrency() {
        return this.polkaRewardCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPolkaStatus() {
        return this.polkaStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplyStartTime() {
        return this.applyStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getRecentIncomeAmount() {
        return this.recentIncomeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getRecentPolAmount() {
        return this.recentPolAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getStakingReturn() {
        return this.stakingReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getUnlockPeriod() {
        return this.unlockPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getUnlockedAmount() {
        return this.unlockedAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getUnlockingAmount() {
        return this.unlockingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvg7Return() {
        return this.avg7Return;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getPersonalLockEndTime() {
        return this.personalLockEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Boolean getIsCanLock() {
        return this.isCanLock;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getMinReturn() {
        return this.minReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getMaxReturn() {
        return this.maxReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getBigCurrencyIcon() {
        return this.bigCurrencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getSmallCurrencyIcon() {
        return this.smallCurrencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseStakingReturn() {
        return this.baseStakingReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Integer getIsHoldEarnOpen() {
        return this.isHoldEarnOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getHoldEarnApr() {
        return this.holdEarnApr;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStrikeCurrency() {
        return this.strikeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTargetCurrency() {
        return this.targetCurrency;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getApplyEndTime() {
        return this.applyEndTime;
    }

    @Nullable
    public final String getApplyStartTime() {
        return this.applyStartTime;
    }

    @Nullable
    public final String getAvg7Return() {
        return this.avg7Return;
    }

    @Nullable
    public final String getBaseStakingReturn() {
        return this.baseStakingReturn;
    }

    @Nullable
    public final String getBigCurrencyIcon() {
        return this.bigCurrencyIcon;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getDropAmount() {
        return this.dropAmount;
    }

    @Nullable
    public final String getDropCurrency() {
        return this.dropCurrency;
    }

    @Nullable
    public final String getFreezingAmount() {
        return this.freezingAmount;
    }

    @Nullable
    public final String getFundCurrency() {
        return this.fundCurrency;
    }

    @Nullable
    public final String getFundLockDuration() {
        return this.fundLockDuration;
    }

    @Nullable
    public final String getHoldEarnApr() {
        return this.holdEarnApr;
    }

    @NotNull
    public final String getHoldEarnAprText() {
        String strM85565d;
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(this.holdEarnApr);
        if (bigDecimalM66536f == null || bigDecimalM66536f.compareTo(new BigDecimal("1")) <= 0) {
            return C27017c.f54310a.m66516f(R$string.kc_hold_earn_name, new Object[0]);
        }
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.kc_hold_earn_apr_tip;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(this.holdEarnApr);
        String strM93905f = null;
        if (bigDecimalM66536f2 != null && (strM85565d = C37885i.m85565d(bigDecimalM66536f2, 0, 0, 1, null)) != null) {
            strM93905f = C42828b.m93905f(strM85565d, "%", true, false);
        }
        sb2.append(strM93905f);
        return c27017c.m66516f(i11, sb2.toString());
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIncomeCurrency() {
        return this.incomeCurrency;
    }

    @Nullable
    public final String getIncomeReleaseAmount() {
        return this.incomeReleaseAmount;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getLockAmount() {
        return this.lockAmount;
    }

    @Nullable
    public final String getLockEndTime() {
        return this.lockEndTime;
    }

    @Nullable
    public final String getLockPeriod() {
        return this.lockPeriod;
    }

    @Nullable
    public final String getLockStartTime() {
        return this.lockStartTime;
    }

    @Nullable
    public final String getLockTime() {
        return this.lockTime;
    }

    @Nullable
    public final String getMaxReturn() {
        return this.maxReturn;
    }

    @Nullable
    public final String getMinReturn() {
        return this.minReturn;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPersonalLockEndTime() {
        return this.personalLockEndTime;
    }

    @Nullable
    public final String getPolReleaseAmount() {
        return this.polReleaseAmount;
    }

    @Nullable
    public final String getPolReturn() {
        return this.polReturn;
    }

    @Nullable
    public final String getPolkaRewardAmount() {
        return this.polkaRewardAmount;
    }

    @Nullable
    public final String getPolkaRewardCurrency() {
        return this.polkaRewardCurrency;
    }

    @Nullable
    public final String getPolkaStatus() {
        return this.polkaStatus;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getRecentIncomeAmount() {
        return this.recentIncomeAmount;
    }

    @Nullable
    public final String getRecentPolAmount() {
        return this.recentPolAmount;
    }

    @Nullable
    public final String getSmallCurrencyIcon() {
        return this.smallCurrencyIcon;
    }

    @Nullable
    public final String getStakingReturn() {
        return this.stakingReturn;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStrikeCurrency() {
        return this.strikeCurrency;
    }

    @Nullable
    public final String getTargetCurrency() {
        return this.targetCurrency;
    }

    @Nullable
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUnlockPeriod() {
        return this.unlockPeriod;
    }

    @Nullable
    public final String getUnlockedAmount() {
        return this.unlockedAmount;
    }

    @Nullable
    public final String getUnlockingAmount() {
        return this.unlockingAmount;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applyEndTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applyStartTime;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avg7Return;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.baseStakingReturn;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.category;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currency;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.strikeCurrency;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.targetCurrency;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dropAmount;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dropCurrency;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.freezingAmount;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fundCurrency;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fundLockDuration;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.id;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.incomeReleaseAmount;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.incomeCurrency;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.lockAmount;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.lockEndTime;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.lockPeriod;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.lockStartTime;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.lockTime;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.name;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.currencyFullName;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.polReleaseAmount;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.polReturn;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.polkaRewardAmount;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.polkaRewardCurrency;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.polkaStatus;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.productId;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.recentIncomeAmount;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.recentPolAmount;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.stakingReturn;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.status;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.totalReturn;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.type;
        int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.unlockPeriod;
        int iHashCode37 = (iHashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.unlockedAmount;
        int iHashCode38 = (iHashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.unlockingAmount;
        int iHashCode39 = (iHashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.jumpUrl;
        int iHashCode40 = (iHashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.icon;
        int iHashCode41 = (iHashCode40 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.jumpType;
        int iHashCode42 = (iHashCode41 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.categoryText;
        int iHashCode43 = (iHashCode42 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.personalLockEndTime;
        int iHashCode44 = (iHashCode43 + (str44 == null ? 0 : str44.hashCode())) * 31;
        Boolean bool = this.isCanLock;
        int iHashCode45 = (iHashCode44 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str45 = this.minReturn;
        int iHashCode46 = (iHashCode45 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.maxReturn;
        int iHashCode47 = (iHashCode46 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.bigCurrencyIcon;
        int iHashCode48 = (iHashCode47 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.smallCurrencyIcon;
        int iHashCode49 = (iHashCode48 + (str48 == null ? 0 : str48.hashCode())) * 31;
        BigDecimal bigDecimal = this.leverage;
        int iHashCode50 = (iHashCode49 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.isHoldEarnOpen;
        int iHashCode51 = (iHashCode50 + (num == null ? 0 : num.hashCode())) * 31;
        String str49 = this.holdEarnApr;
        return iHashCode51 + (str49 != null ? str49.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCanLock() {
        return this.isCanLock;
    }

    @Nullable
    public final Integer isHoldEarnOpen() {
        return this.isHoldEarnOpen;
    }

    @NotNull
    public String toString() {
        return "EarnAccountItem(amount=" + this.amount + ", applyEndTime=" + this.applyEndTime + ", applyStartTime=" + this.applyStartTime + ", avg7Return=" + this.avg7Return + ", baseStakingReturn=" + this.baseStakingReturn + ", category=" + this.category + ", currency=" + this.currency + ", strikeCurrency=" + this.strikeCurrency + ", targetCurrency=" + this.targetCurrency + ", dropAmount=" + this.dropAmount + ", dropCurrency=" + this.dropCurrency + ", freezingAmount=" + this.freezingAmount + ", fundCurrency=" + this.fundCurrency + ", fundLockDuration=" + this.fundLockDuration + ", id=" + this.id + ", incomeReleaseAmount=" + this.incomeReleaseAmount + ", incomeCurrency=" + this.incomeCurrency + ", lockAmount=" + this.lockAmount + ", lockEndTime=" + this.lockEndTime + ", lockPeriod=" + this.lockPeriod + ", lockStartTime=" + this.lockStartTime + ", lockTime=" + this.lockTime + ", name=" + this.name + ", currencyFullName=" + this.currencyFullName + ", polReleaseAmount=" + this.polReleaseAmount + ", polReturn=" + this.polReturn + ", polkaRewardAmount=" + this.polkaRewardAmount + ", polkaRewardCurrency=" + this.polkaRewardCurrency + ", polkaStatus=" + this.polkaStatus + ", productId=" + this.productId + ", recentIncomeAmount=" + this.recentIncomeAmount + ", recentPolAmount=" + this.recentPolAmount + ", stakingReturn=" + this.stakingReturn + ", status=" + this.status + ", totalReturn=" + this.totalReturn + ", type=" + this.type + ", unlockPeriod=" + this.unlockPeriod + ", unlockedAmount=" + this.unlockedAmount + ", unlockingAmount=" + this.unlockingAmount + ", jumpUrl=" + this.jumpUrl + ", icon=" + this.icon + ", jumpType=" + this.jumpType + ", categoryText=" + this.categoryText + ", personalLockEndTime=" + this.personalLockEndTime + ", isCanLock=" + this.isCanLock + ", minReturn=" + this.minReturn + ", maxReturn=" + this.maxReturn + ", bigCurrencyIcon=" + this.bigCurrencyIcon + ", smallCurrencyIcon=" + this.smallCurrencyIcon + ", leverage=" + this.leverage + ", isHoldEarnOpen=" + this.isHoldEarnOpen + ", holdEarnApr=" + this.holdEarnApr + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        dest.writeString(this.applyEndTime);
        dest.writeString(this.applyStartTime);
        dest.writeString(this.avg7Return);
        dest.writeString(this.baseStakingReturn);
        dest.writeString(this.category);
        dest.writeString(this.currency);
        dest.writeString(this.strikeCurrency);
        dest.writeString(this.targetCurrency);
        dest.writeString(this.dropAmount);
        dest.writeString(this.dropCurrency);
        dest.writeString(this.freezingAmount);
        dest.writeString(this.fundCurrency);
        dest.writeString(this.fundLockDuration);
        dest.writeString(this.id);
        dest.writeString(this.incomeReleaseAmount);
        dest.writeString(this.incomeCurrency);
        dest.writeString(this.lockAmount);
        dest.writeString(this.lockEndTime);
        dest.writeString(this.lockPeriod);
        dest.writeString(this.lockStartTime);
        dest.writeString(this.lockTime);
        dest.writeString(this.name);
        dest.writeString(this.currencyFullName);
        dest.writeString(this.polReleaseAmount);
        dest.writeString(this.polReturn);
        dest.writeString(this.polkaRewardAmount);
        dest.writeString(this.polkaRewardCurrency);
        dest.writeString(this.polkaStatus);
        dest.writeString(this.productId);
        dest.writeString(this.recentIncomeAmount);
        dest.writeString(this.recentPolAmount);
        dest.writeString(this.stakingReturn);
        dest.writeString(this.status);
        dest.writeString(this.totalReturn);
        dest.writeString(this.type);
        dest.writeString(this.unlockPeriod);
        dest.writeString(this.unlockedAmount);
        dest.writeString(this.unlockingAmount);
        dest.writeString(this.jumpUrl);
        dest.writeString(this.icon);
        dest.writeString(this.jumpType);
        dest.writeString(this.categoryText);
        dest.writeString(this.personalLockEndTime);
        Boolean bool = this.isCanLock;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.minReturn);
        dest.writeString(this.maxReturn);
        dest.writeString(this.bigCurrencyIcon);
        dest.writeString(this.smallCurrencyIcon);
        dest.writeSerializable(this.leverage);
        Integer num = this.isHoldEarnOpen;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.holdEarnApr);
    }
}
