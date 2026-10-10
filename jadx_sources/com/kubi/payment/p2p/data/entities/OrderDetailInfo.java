package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.entity.AdPayType;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2POrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b|\b\u0087\b\u0018\u0000 µ\u00012\u00020\u0001:\b³\u0001´\u0001µ\u0001¶\u0001Bë\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00106\u001a\u000207\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010;¢\u0006\u0004\b<\u0010=J\u0006\u0010{\u001a\u00020\u0005J\u0006\u0010|\u001a\u00020\u0005J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¥\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u000207HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u000109HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010;HÆ\u0003JÔ\u0004\u0010\u00ad\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00106\u001a\u0002072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;HÆ\u0001¢\u0006\u0003\u0010®\u0001J\u0015\u0010¯\u0001\u001a\u00020\u00052\t\u0010°\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010±\u0001\u001a\u000207HÖ\u0001J\n\u0010²\u0001\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010?R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010?R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010?R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010?R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010?R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010?R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010E\u001a\u0004\bN\u0010DR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010E\u001a\u0004\bO\u0010DR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010?R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010?R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010?R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010E\u001a\u0004\bY\u0010DR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010E\u001a\u0004\bZ\u0010DR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010?R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010B\u001a\u0004\b\\\u0010AR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010?R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010?R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010?R\u0015\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010B\u001a\u0004\b`\u0010AR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010?R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010?R\u0015\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010E\u001a\u0004\bc\u0010DR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010?R\u0015\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010B\u001a\u0004\be\u0010AR\u0015\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010B\u001a\u0004\bf\u0010AR\u0015\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010B\u001a\u0004\bg\u0010AR\u0015\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010B\u001a\u0004\bh\u0010AR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010?R\u0018\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u001a\u0010-\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bl\u0010AR\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010?R\u001a\u0010/\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bn\u0010AR\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010?R\u001a\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bp\u0010AR\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010?R\u0018\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010?R\u0018\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010?R\u0018\u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010?R\u0016\u00106\u001a\u0002078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0018\u00108\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0018\u0010:\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010z¨\u0006·\u0001"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "", "appealStatus", "", "buyerRole", "", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "currencyAmount", "id", "adId", "legalCurrency", "legalCurrencyAmount", "opTraderName", "opTraderNickName", "payCoinAt", "payMoneyAt", "payTypeCode", "payTypes", "", "Lcom/kubi/otc/entity/AdPayType;", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "status", "adRemarks", "autoCancelOrderExpire", "autoPayCoinExpire", "buyerKycName", "displayOpTradeInfo", "appealConsent", "appealBy", "appealReason", "hasRecord", "csTimeLimit", "autoAppealHours", "avgPayCoinLeftTime", "cancelRemark", "unread", "appealSwitch", "requirePayVoucher", "enableNotifyPayCoin", "userAppealConsentResult", "expressInfo", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;", "needPriceReminder", "feeMessage", "canChat", "blockStatus", "needRemind", "nickName", "areaCode", HintConstants.AUTOFILL_HINT_PHONE, "secretPhone", "unreadMsgCount", "", "opUserInfo", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;", "adInfo", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$AdInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$AdInfo;)V", "getAppealStatus", "()Ljava/lang/String;", "getBuyerRole", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getCurrencyAmount", "getId", "getAdId", "getLegalCurrency", "getLegalCurrencyAmount", "getOpTraderName", "getOpTraderNickName", "getPayCoinAt", "getPayMoneyAt", "getPayTypeCode", "getPayTypes", "()Ljava/util/List;", "setPayTypes", "(Ljava/util/List;)V", "getPrice", "()Ljava/math/BigDecimal;", "getStatus", "getAdRemarks", "getAutoCancelOrderExpire", "getAutoPayCoinExpire", "getBuyerKycName", "getDisplayOpTradeInfo", "getAppealConsent", "getAppealBy", "getAppealReason", "getHasRecord", "getCsTimeLimit", "getAutoAppealHours", "getAvgPayCoinLeftTime", "getCancelRemark", "getUnread", "getAppealSwitch", "getRequirePayVoucher", "getEnableNotifyPayCoin", "getUserAppealConsentResult", "getExpressInfo", "()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;", "getNeedPriceReminder", "getFeeMessage", "getCanChat", "getBlockStatus", "getNeedRemind", "getNickName", "getAreaCode", "getPhone", "getSecretPhone", "getUnreadMsgCount", "()I", "getOpUserInfo", "()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;", "getAdInfo", "()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$AdInfo;", "isAppealAndConsultSame", "isP2PExpress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$AdInfo;)Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "equals", "other", "hashCode", "toString", "OpUserInfo", "AdInfo", "Companion", "ExpressInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderDetailInfo {

    @NotNull
    public static final String APPEAL_BY_BUYER = "BUYER";

    @NotNull
    public static final String APPEAL_BY_SELLER = "SELLER";

    @NotNull
    public static final String APPEAL_CONSENT_BUYER = "BUYER";

    @NotNull
    public static final String APPEAL_CONSENT_SELLER = "SELLER";

    @NotNull
    public static final String APPEAL_STATUS_APPEALING = "APPEALING";

    @NotNull
    public static final String APPEAL_STATUS_CONSENT = "APPEALING_CONSENT";

    @NotNull
    public static final String APPEAL_STATUS_CS_PENDING = "APPEALING_CS_PENDING";

    @NotNull
    public static final String APPEAL_STATUS_CS_PROCESSING = "APPEALING_CS_PROCESSING";

    @NotNull
    public static final String ORDER_STATUS_CANCELED = "CANCELED";

    @NotNull
    public static final String ORDER_STATUS_CHARGED = "CHARGED";

    @NotNull
    public static final String ORDER_STATUS_CREATED = "CREATED";

    @NotNull
    public static final String ORDER_STATUS_PAYED_COIN = "PAYED_COIN";

    @NotNull
    public static final String ORDER_STATUS_PAYED_MONEY = "PAYED_MONEY";

    @Nullable
    private final String adId;

    @SerializedName("adInfo")
    @Nullable
    private final AdInfo adInfo;

    @Nullable
    private final String adRemarks;

    @Nullable
    private final String appealBy;

    @Nullable
    private final String appealConsent;

    @Nullable
    private final String appealReason;

    @SerializedName("userAppealStatus")
    @Nullable
    private final String appealStatus;

    @Nullable
    private final Boolean appealSwitch;

    @SerializedName("areaCode")
    @Nullable
    private final String areaCode;

    @Nullable
    private final String autoAppealHours;

    @Nullable
    private final Long autoCancelOrderExpire;

    @Nullable
    private final Long autoPayCoinExpire;

    @Nullable
    private final Long avgPayCoinLeftTime;

    @SerializedName("blackStatus")
    @Nullable
    private final String blockStatus;

    @Nullable
    private final String buyerKycName;

    @Nullable
    private final Boolean buyerRole;

    @SerializedName("canChat")
    @Nullable
    private final Boolean canChat;

    @Nullable
    private final String cancelRemark;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String csTimeLimit;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyAmount;

    @Nullable
    private final Boolean displayOpTradeInfo;

    @Nullable
    private final Boolean enableNotifyPayCoin;

    @SerializedName("expressInfo")
    @Nullable
    private final ExpressInfo expressInfo;

    @SerializedName("feeMessage")
    @Nullable
    private final String feeMessage;

    @Nullable
    private final Boolean hasRecord;

    @Nullable
    private final String id;

    @Nullable
    private final String legalCurrency;

    @Nullable
    private final String legalCurrencyAmount;

    @SerializedName("needPriceReminder")
    @Nullable
    private final Boolean needPriceReminder;

    @SerializedName("needRemind")
    @Nullable
    private final Boolean needRemind;

    @SerializedName("nickName")
    @Nullable
    private final String nickName;

    @Nullable
    private final String opTraderName;

    @Nullable
    private final String opTraderNickName;

    @SerializedName("opUserInfo")
    @Nullable
    private final OpUserInfo opUserInfo;

    @Nullable
    private final Long payCoinAt;

    @Nullable
    private final Long payMoneyAt;

    @Nullable
    private final String payTypeCode;

    @Nullable
    private List<AdPayType> payTypes;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    @Nullable
    private final String phone;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final Boolean requirePayVoucher;

    @SerializedName("secretPhone")
    @Nullable
    private final String secretPhone;

    @Nullable
    private final String status;

    @Nullable
    private final Boolean unread;

    @SerializedName("unreadMsgCount")
    private final int unreadMsgCount;

    @Nullable
    private final String userAppealConsentResult;

    /* JADX INFO: compiled from: P2POrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$AdInfo;", "", "side", "", "<init>", "(Ljava/lang/String;)V", "getSide", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AdInfo {

        @Nullable
        private final String side;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdInfo) && Intrinsics.areEqual(this.side, ((AdInfo) other).side);
        }

        public static /* synthetic */ AdInfo copy$default(AdInfo adInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = adInfo.side;
            }
            return adInfo.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @NotNull
        public final AdInfo copy(@Nullable String side) {
            return new AdInfo(side);
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        public int hashCode() {
            String str = this.side;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdInfo(side=" + this.side + ')';
        }

        public AdInfo(@Nullable String str) {
            this.side = str;
        }
    }

    /* JADX INFO: compiled from: P2POrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;", "", "fromAmount", "", "fromCurrency", "depositAmount", "depositCurrency", "referencePrice", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromAmount", "()Ljava/lang/String;", "getFromCurrency", "getDepositAmount", "getDepositCurrency", "getReferencePrice", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ExpressInfo {

        @Nullable
        private final String depositAmount;

        @Nullable
        private final String depositCurrency;

        @Nullable
        private final String fromAmount;

        @Nullable
        private final String fromCurrency;

        @Nullable
        private final String referencePrice;

        @Nullable
        private final String status;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpressInfo)) {
                return false;
            }
            ExpressInfo expressInfo = (ExpressInfo) other;
            return Intrinsics.areEqual(this.fromAmount, expressInfo.fromAmount) && Intrinsics.areEqual(this.fromCurrency, expressInfo.fromCurrency) && Intrinsics.areEqual(this.depositAmount, expressInfo.depositAmount) && Intrinsics.areEqual(this.depositCurrency, expressInfo.depositCurrency) && Intrinsics.areEqual(this.referencePrice, expressInfo.referencePrice) && Intrinsics.areEqual(this.status, expressInfo.status);
        }

        public static /* synthetic */ ExpressInfo copy$default(ExpressInfo expressInfo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = expressInfo.fromAmount;
            }
            if ((i11 & 2) != 0) {
                str2 = expressInfo.fromCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = expressInfo.depositAmount;
            }
            if ((i11 & 8) != 0) {
                str4 = expressInfo.depositCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = expressInfo.referencePrice;
            }
            if ((i11 & 32) != 0) {
                str6 = expressInfo.status;
            }
            String str7 = str5;
            String str8 = str6;
            return expressInfo.copy(str, str2, str3, str4, str7, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFromAmount() {
            return this.fromAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFromCurrency() {
            return this.fromCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDepositAmount() {
            return this.depositAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDepositCurrency() {
            return this.depositCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getReferencePrice() {
            return this.referencePrice;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @NotNull
        public final ExpressInfo copy(@Nullable String fromAmount, @Nullable String fromCurrency, @Nullable String depositAmount, @Nullable String depositCurrency, @Nullable String referencePrice, @Nullable String status) {
            return new ExpressInfo(fromAmount, fromCurrency, depositAmount, depositCurrency, referencePrice, status);
        }

        @Nullable
        public final String getDepositAmount() {
            return this.depositAmount;
        }

        @Nullable
        public final String getDepositCurrency() {
            return this.depositCurrency;
        }

        @Nullable
        public final String getFromAmount() {
            return this.fromAmount;
        }

        @Nullable
        public final String getFromCurrency() {
            return this.fromCurrency;
        }

        @Nullable
        public final String getReferencePrice() {
            return this.referencePrice;
        }

        @Nullable
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            String str = this.fromAmount;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fromCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.depositAmount;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.depositCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.referencePrice;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.status;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ExpressInfo(fromAmount=" + this.fromAmount + ", fromCurrency=" + this.fromCurrency + ", depositAmount=" + this.depositAmount + ", depositCurrency=" + this.depositCurrency + ", referencePrice=" + this.referencePrice + ", status=" + this.status + ')';
        }

        public ExpressInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.fromAmount = str;
            this.fromCurrency = str2;
            this.depositAmount = str3;
            this.depositCurrency = str4;
            this.referencePrice = str5;
            this.status = str6;
        }
    }

    /* JADX INFO: compiled from: P2POrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;", "", "isMerchant", "", "nickName", "", "goldMerchant", "", "foxKingMerchant", "letter", CustomTabsCallback.ONLINE_EXTRAS_KEY, "onlineStatus", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickName", "()Ljava/lang/String;", "getGoldMerchant", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFoxKingMerchant", "getLetter", "getOnline", "getOnlineStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$OpUserInfo;", "equals", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OpUserInfo {

        @Nullable
        private final Integer foxKingMerchant;

        @Nullable
        private final Integer goldMerchant;

        @SerializedName("merchant")
        @Nullable
        private final Boolean isMerchant;

        @SerializedName("showLetter")
        @Nullable
        private final String letter;

        @SerializedName("nickName")
        @Nullable
        private final String nickName;

        @SerializedName(CustomTabsCallback.ONLINE_EXTRAS_KEY)
        @Nullable
        private final Boolean online;

        @SerializedName("onlineStatus")
        @Nullable
        private final String onlineStatus;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpUserInfo)) {
                return false;
            }
            OpUserInfo opUserInfo = (OpUserInfo) other;
            return Intrinsics.areEqual(this.isMerchant, opUserInfo.isMerchant) && Intrinsics.areEqual(this.nickName, opUserInfo.nickName) && Intrinsics.areEqual(this.goldMerchant, opUserInfo.goldMerchant) && Intrinsics.areEqual(this.foxKingMerchant, opUserInfo.foxKingMerchant) && Intrinsics.areEqual(this.letter, opUserInfo.letter) && Intrinsics.areEqual(this.online, opUserInfo.online) && Intrinsics.areEqual(this.onlineStatus, opUserInfo.onlineStatus);
        }

        public static /* synthetic */ OpUserInfo copy$default(OpUserInfo opUserInfo, Boolean bool, String str, Integer num, Integer num2, String str2, Boolean bool2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = opUserInfo.isMerchant;
            }
            if ((i11 & 2) != 0) {
                str = opUserInfo.nickName;
            }
            if ((i11 & 4) != 0) {
                num = opUserInfo.goldMerchant;
            }
            if ((i11 & 8) != 0) {
                num2 = opUserInfo.foxKingMerchant;
            }
            if ((i11 & 16) != 0) {
                str2 = opUserInfo.letter;
            }
            if ((i11 & 32) != 0) {
                bool2 = opUserInfo.online;
            }
            if ((i11 & 64) != 0) {
                str3 = opUserInfo.onlineStatus;
            }
            Boolean bool3 = bool2;
            String str4 = str3;
            String str5 = str2;
            Integer num3 = num;
            return opUserInfo.copy(bool, str, num3, num2, str5, bool3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsMerchant() {
            return this.isMerchant;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getGoldMerchant() {
            return this.goldMerchant;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getFoxKingMerchant() {
            return this.foxKingMerchant;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLetter() {
            return this.letter;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getOnline() {
            return this.online;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOnlineStatus() {
            return this.onlineStatus;
        }

        @NotNull
        public final OpUserInfo copy(@Nullable Boolean isMerchant, @Nullable String nickName, @Nullable Integer goldMerchant, @Nullable Integer foxKingMerchant, @Nullable String letter, @Nullable Boolean online, @Nullable String onlineStatus) {
            return new OpUserInfo(isMerchant, nickName, goldMerchant, foxKingMerchant, letter, online, onlineStatus);
        }

        @Nullable
        public final Integer getFoxKingMerchant() {
            return this.foxKingMerchant;
        }

        @Nullable
        public final Integer getGoldMerchant() {
            return this.goldMerchant;
        }

        @Nullable
        public final String getLetter() {
            return this.letter;
        }

        @Nullable
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        public final Boolean getOnline() {
            return this.online;
        }

        @Nullable
        public final String getOnlineStatus() {
            return this.onlineStatus;
        }

        public int hashCode() {
            Boolean bool = this.isMerchant;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.nickName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.goldMerchant;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.foxKingMerchant;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.letter;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool2 = this.online;
            int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.onlineStatus;
            return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        @Nullable
        public final Boolean isMerchant() {
            return this.isMerchant;
        }

        @NotNull
        public String toString() {
            return "OpUserInfo(isMerchant=" + this.isMerchant + ", nickName=" + this.nickName + ", goldMerchant=" + this.goldMerchant + ", foxKingMerchant=" + this.foxKingMerchant + ", letter=" + this.letter + ", online=" + this.online + ", onlineStatus=" + this.onlineStatus + ')';
        }

        public OpUserInfo(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable Boolean bool2, @Nullable String str3) {
            this.isMerchant = bool;
            this.nickName = str;
            this.goldMerchant = num;
            this.foxKingMerchant = num2;
            this.letter = str2;
            this.online = bool2;
            this.onlineStatus = str3;
        }
    }

    public OrderDetailInfo(@Nullable String str, @Nullable Boolean bool, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l12, @Nullable Long l13, @Nullable String str10, @Nullable List<AdPayType> list, @Nullable BigDecimal bigDecimal, @Nullable String str11, @Nullable String str12, @Nullable Long l14, @Nullable Long l15, @Nullable String str13, @Nullable Boolean bool2, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool3, @Nullable String str17, @Nullable String str18, @Nullable Long l16, @Nullable String str19, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable String str20, @Nullable ExpressInfo expressInfo, @Nullable Boolean bool8, @Nullable String str21, @Nullable Boolean bool9, @Nullable String str22, @Nullable Boolean bool10, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, int i11, @Nullable OpUserInfo opUserInfo, @Nullable AdInfo adInfo) {
        this.appealStatus = str;
        this.buyerRole = bool;
        this.createdAt = l11;
        this.currency = str2;
        this.currencyAmount = str3;
        this.id = str4;
        this.adId = str5;
        this.legalCurrency = str6;
        this.legalCurrencyAmount = str7;
        this.opTraderName = str8;
        this.opTraderNickName = str9;
        this.payCoinAt = l12;
        this.payMoneyAt = l13;
        this.payTypeCode = str10;
        this.payTypes = list;
        this.price = bigDecimal;
        this.status = str11;
        this.adRemarks = str12;
        this.autoCancelOrderExpire = l14;
        this.autoPayCoinExpire = l15;
        this.buyerKycName = str13;
        this.displayOpTradeInfo = bool2;
        this.appealConsent = str14;
        this.appealBy = str15;
        this.appealReason = str16;
        this.hasRecord = bool3;
        this.csTimeLimit = str17;
        this.autoAppealHours = str18;
        this.avgPayCoinLeftTime = l16;
        this.cancelRemark = str19;
        this.unread = bool4;
        this.appealSwitch = bool5;
        this.requirePayVoucher = bool6;
        this.enableNotifyPayCoin = bool7;
        this.userAppealConsentResult = str20;
        this.expressInfo = expressInfo;
        this.needPriceReminder = bool8;
        this.feeMessage = str21;
        this.canChat = bool9;
        this.blockStatus = str22;
        this.needRemind = bool10;
        this.nickName = str23;
        this.areaCode = str24;
        this.phone = str25;
        this.secretPhone = str26;
        this.unreadMsgCount = i11;
        this.opUserInfo = opUserInfo;
        this.adInfo = adInfo;
    }

    @NotNull
    public final OrderDetailInfo copy(@Nullable String appealStatus, @Nullable Boolean buyerRole, @Nullable Long createdAt, @Nullable String currency, @Nullable String currencyAmount, @Nullable String id2, @Nullable String adId, @Nullable String legalCurrency, @Nullable String legalCurrencyAmount, @Nullable String opTraderName, @Nullable String opTraderNickName, @Nullable Long payCoinAt, @Nullable Long payMoneyAt, @Nullable String payTypeCode, @Nullable List<AdPayType> payTypes, @Nullable BigDecimal price, @Nullable String status, @Nullable String adRemarks, @Nullable Long autoCancelOrderExpire, @Nullable Long autoPayCoinExpire, @Nullable String buyerKycName, @Nullable Boolean displayOpTradeInfo, @Nullable String appealConsent, @Nullable String appealBy, @Nullable String appealReason, @Nullable Boolean hasRecord, @Nullable String csTimeLimit, @Nullable String autoAppealHours, @Nullable Long avgPayCoinLeftTime, @Nullable String cancelRemark, @Nullable Boolean unread, @Nullable Boolean appealSwitch, @Nullable Boolean requirePayVoucher, @Nullable Boolean enableNotifyPayCoin, @Nullable String userAppealConsentResult, @Nullable ExpressInfo expressInfo, @Nullable Boolean needPriceReminder, @Nullable String feeMessage, @Nullable Boolean canChat, @Nullable String blockStatus, @Nullable Boolean needRemind, @Nullable String nickName, @Nullable String areaCode, @Nullable String phone, @Nullable String secretPhone, int unreadMsgCount, @Nullable OpUserInfo opUserInfo, @Nullable AdInfo adInfo) {
        return new OrderDetailInfo(appealStatus, buyerRole, createdAt, currency, currencyAmount, id2, adId, legalCurrency, legalCurrencyAmount, opTraderName, opTraderNickName, payCoinAt, payMoneyAt, payTypeCode, payTypes, price, status, adRemarks, autoCancelOrderExpire, autoPayCoinExpire, buyerKycName, displayOpTradeInfo, appealConsent, appealBy, appealReason, hasRecord, csTimeLimit, autoAppealHours, avgPayCoinLeftTime, cancelRemark, unread, appealSwitch, requirePayVoucher, enableNotifyPayCoin, userAppealConsentResult, expressInfo, needPriceReminder, feeMessage, canChat, blockStatus, needRemind, nickName, areaCode, phone, secretPhone, unreadMsgCount, opUserInfo, adInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailInfo)) {
            return false;
        }
        OrderDetailInfo orderDetailInfo = (OrderDetailInfo) other;
        return Intrinsics.areEqual(this.appealStatus, orderDetailInfo.appealStatus) && Intrinsics.areEqual(this.buyerRole, orderDetailInfo.buyerRole) && Intrinsics.areEqual(this.createdAt, orderDetailInfo.createdAt) && Intrinsics.areEqual(this.currency, orderDetailInfo.currency) && Intrinsics.areEqual(this.currencyAmount, orderDetailInfo.currencyAmount) && Intrinsics.areEqual(this.id, orderDetailInfo.id) && Intrinsics.areEqual(this.adId, orderDetailInfo.adId) && Intrinsics.areEqual(this.legalCurrency, orderDetailInfo.legalCurrency) && Intrinsics.areEqual(this.legalCurrencyAmount, orderDetailInfo.legalCurrencyAmount) && Intrinsics.areEqual(this.opTraderName, orderDetailInfo.opTraderName) && Intrinsics.areEqual(this.opTraderNickName, orderDetailInfo.opTraderNickName) && Intrinsics.areEqual(this.payCoinAt, orderDetailInfo.payCoinAt) && Intrinsics.areEqual(this.payMoneyAt, orderDetailInfo.payMoneyAt) && Intrinsics.areEqual(this.payTypeCode, orderDetailInfo.payTypeCode) && Intrinsics.areEqual(this.payTypes, orderDetailInfo.payTypes) && Intrinsics.areEqual(this.price, orderDetailInfo.price) && Intrinsics.areEqual(this.status, orderDetailInfo.status) && Intrinsics.areEqual(this.adRemarks, orderDetailInfo.adRemarks) && Intrinsics.areEqual(this.autoCancelOrderExpire, orderDetailInfo.autoCancelOrderExpire) && Intrinsics.areEqual(this.autoPayCoinExpire, orderDetailInfo.autoPayCoinExpire) && Intrinsics.areEqual(this.buyerKycName, orderDetailInfo.buyerKycName) && Intrinsics.areEqual(this.displayOpTradeInfo, orderDetailInfo.displayOpTradeInfo) && Intrinsics.areEqual(this.appealConsent, orderDetailInfo.appealConsent) && Intrinsics.areEqual(this.appealBy, orderDetailInfo.appealBy) && Intrinsics.areEqual(this.appealReason, orderDetailInfo.appealReason) && Intrinsics.areEqual(this.hasRecord, orderDetailInfo.hasRecord) && Intrinsics.areEqual(this.csTimeLimit, orderDetailInfo.csTimeLimit) && Intrinsics.areEqual(this.autoAppealHours, orderDetailInfo.autoAppealHours) && Intrinsics.areEqual(this.avgPayCoinLeftTime, orderDetailInfo.avgPayCoinLeftTime) && Intrinsics.areEqual(this.cancelRemark, orderDetailInfo.cancelRemark) && Intrinsics.areEqual(this.unread, orderDetailInfo.unread) && Intrinsics.areEqual(this.appealSwitch, orderDetailInfo.appealSwitch) && Intrinsics.areEqual(this.requirePayVoucher, orderDetailInfo.requirePayVoucher) && Intrinsics.areEqual(this.enableNotifyPayCoin, orderDetailInfo.enableNotifyPayCoin) && Intrinsics.areEqual(this.userAppealConsentResult, orderDetailInfo.userAppealConsentResult) && Intrinsics.areEqual(this.expressInfo, orderDetailInfo.expressInfo) && Intrinsics.areEqual(this.needPriceReminder, orderDetailInfo.needPriceReminder) && Intrinsics.areEqual(this.feeMessage, orderDetailInfo.feeMessage) && Intrinsics.areEqual(this.canChat, orderDetailInfo.canChat) && Intrinsics.areEqual(this.blockStatus, orderDetailInfo.blockStatus) && Intrinsics.areEqual(this.needRemind, orderDetailInfo.needRemind) && Intrinsics.areEqual(this.nickName, orderDetailInfo.nickName) && Intrinsics.areEqual(this.areaCode, orderDetailInfo.areaCode) && Intrinsics.areEqual(this.phone, orderDetailInfo.phone) && Intrinsics.areEqual(this.secretPhone, orderDetailInfo.secretPhone) && this.unreadMsgCount == orderDetailInfo.unreadMsgCount && Intrinsics.areEqual(this.opUserInfo, orderDetailInfo.opUserInfo) && Intrinsics.areEqual(this.adInfo, orderDetailInfo.adInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppealStatus() {
        return this.appealStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOpTraderName() {
        return this.opTraderName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOpTraderNickName() {
        return this.opTraderNickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getPayCoinAt() {
        return this.payCoinAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getPayMoneyAt() {
        return this.payMoneyAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @Nullable
    public final List<AdPayType> component15() {
        return this.payTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getAdRemarks() {
        return this.adRemarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getAutoCancelOrderExpire() {
        return this.autoCancelOrderExpire;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getBuyerRole() {
        return this.buyerRole;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Long getAutoPayCoinExpire() {
        return this.autoPayCoinExpire;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBuyerKycName() {
        return this.buyerKycName;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getDisplayOpTradeInfo() {
        return this.displayOpTradeInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAppealConsent() {
        return this.appealConsent;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getAppealBy() {
        return this.appealBy;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getAppealReason() {
        return this.appealReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getHasRecord() {
        return this.hasRecord;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getCsTimeLimit() {
        return this.csTimeLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getAutoAppealHours() {
        return this.autoAppealHours;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getAvgPayCoinLeftTime() {
        return this.avgPayCoinLeftTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getCancelRemark() {
        return this.cancelRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getUnread() {
        return this.unread;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Boolean getAppealSwitch() {
        return this.appealSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Boolean getRequirePayVoucher() {
        return this.requirePayVoucher;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Boolean getEnableNotifyPayCoin() {
        return this.enableNotifyPayCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getUserAppealConsentResult() {
        return this.userAppealConsentResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final ExpressInfo getExpressInfo() {
        return this.expressInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Boolean getNeedPriceReminder() {
        return this.needPriceReminder;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getFeeMessage() {
        return this.feeMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Boolean getCanChat() {
        return this.canChat;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getBlockStatus() {
        return this.blockStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Boolean getNeedRemind() {
        return this.needRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getAreaCode() {
        return this.areaCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getSecretPhone() {
        return this.secretPhone;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final int getUnreadMsgCount() {
        return this.unreadMsgCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final OpUserInfo getOpUserInfo() {
        return this.opUserInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final AdInfo getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLegalCurrencyAmount() {
        return this.legalCurrencyAmount;
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final AdInfo getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    public final String getAdRemarks() {
        return this.adRemarks;
    }

    @Nullable
    public final String getAppealBy() {
        return this.appealBy;
    }

    @Nullable
    public final String getAppealConsent() {
        return this.appealConsent;
    }

    @Nullable
    public final String getAppealReason() {
        return this.appealReason;
    }

    @Nullable
    public final String getAppealStatus() {
        return this.appealStatus;
    }

    @Nullable
    public final Boolean getAppealSwitch() {
        return this.appealSwitch;
    }

    @Nullable
    public final String getAreaCode() {
        return this.areaCode;
    }

    @Nullable
    public final String getAutoAppealHours() {
        return this.autoAppealHours;
    }

    @Nullable
    public final Long getAutoCancelOrderExpire() {
        return this.autoCancelOrderExpire;
    }

    @Nullable
    public final Long getAutoPayCoinExpire() {
        return this.autoPayCoinExpire;
    }

    @Nullable
    public final Long getAvgPayCoinLeftTime() {
        return this.avgPayCoinLeftTime;
    }

    @Nullable
    public final String getBlockStatus() {
        return this.blockStatus;
    }

    @Nullable
    public final String getBuyerKycName() {
        return this.buyerKycName;
    }

    @Nullable
    public final Boolean getBuyerRole() {
        return this.buyerRole;
    }

    @Nullable
    public final Boolean getCanChat() {
        return this.canChat;
    }

    @Nullable
    public final String getCancelRemark() {
        return this.cancelRemark;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCsTimeLimit() {
        return this.csTimeLimit;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Nullable
    public final Boolean getDisplayOpTradeInfo() {
        return this.displayOpTradeInfo;
    }

    @Nullable
    public final Boolean getEnableNotifyPayCoin() {
        return this.enableNotifyPayCoin;
    }

    @Nullable
    public final ExpressInfo getExpressInfo() {
        return this.expressInfo;
    }

    @Nullable
    public final String getFeeMessage() {
        return this.feeMessage;
    }

    @Nullable
    public final Boolean getHasRecord() {
        return this.hasRecord;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    public final String getLegalCurrencyAmount() {
        return this.legalCurrencyAmount;
    }

    @Nullable
    public final Boolean getNeedPriceReminder() {
        return this.needPriceReminder;
    }

    @Nullable
    public final Boolean getNeedRemind() {
        return this.needRemind;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getOpTraderName() {
        return this.opTraderName;
    }

    @Nullable
    public final String getOpTraderNickName() {
        return this.opTraderNickName;
    }

    @Nullable
    public final OpUserInfo getOpUserInfo() {
        return this.opUserInfo;
    }

    @Nullable
    public final Long getPayCoinAt() {
        return this.payCoinAt;
    }

    @Nullable
    public final Long getPayMoneyAt() {
        return this.payMoneyAt;
    }

    @Nullable
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @Nullable
    public final List<AdPayType> getPayTypes() {
        return this.payTypes;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final Boolean getRequirePayVoucher() {
        return this.requirePayVoucher;
    }

    @Nullable
    public final String getSecretPhone() {
        return this.secretPhone;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Boolean getUnread() {
        return this.unread;
    }

    public final int getUnreadMsgCount() {
        return this.unreadMsgCount;
    }

    @Nullable
    public final String getUserAppealConsentResult() {
        return this.userAppealConsentResult;
    }

    public int hashCode() {
        String str = this.appealStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.buyerRole;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyAmount;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.adId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.legalCurrency;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.legalCurrencyAmount;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.opTraderName;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.opTraderNickName;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l12 = this.payCoinAt;
        int iHashCode12 = (iHashCode11 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.payMoneyAt;
        int iHashCode13 = (iHashCode12 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str10 = this.payTypeCode;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<AdPayType> list = this.payTypes;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode16 = (iHashCode15 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str11 = this.status;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.adRemarks;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l14 = this.autoCancelOrderExpire;
        int iHashCode19 = (iHashCode18 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.autoPayCoinExpire;
        int iHashCode20 = (iHashCode19 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str13 = this.buyerKycName;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.displayOpTradeInfo;
        int iHashCode22 = (iHashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.appealConsent;
        int iHashCode23 = (iHashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.appealBy;
        int iHashCode24 = (iHashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.appealReason;
        int iHashCode25 = (iHashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool3 = this.hasRecord;
        int iHashCode26 = (iHashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str17 = this.csTimeLimit;
        int iHashCode27 = (iHashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.autoAppealHours;
        int iHashCode28 = (iHashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Long l16 = this.avgPayCoinLeftTime;
        int iHashCode29 = (iHashCode28 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str19 = this.cancelRemark;
        int iHashCode30 = (iHashCode29 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool4 = this.unread;
        int iHashCode31 = (iHashCode30 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.appealSwitch;
        int iHashCode32 = (iHashCode31 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.requirePayVoucher;
        int iHashCode33 = (iHashCode32 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.enableNotifyPayCoin;
        int iHashCode34 = (iHashCode33 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str20 = this.userAppealConsentResult;
        int iHashCode35 = (iHashCode34 + (str20 == null ? 0 : str20.hashCode())) * 31;
        ExpressInfo expressInfo = this.expressInfo;
        int iHashCode36 = (iHashCode35 + (expressInfo == null ? 0 : expressInfo.hashCode())) * 31;
        Boolean bool8 = this.needPriceReminder;
        int iHashCode37 = (iHashCode36 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str21 = this.feeMessage;
        int iHashCode38 = (iHashCode37 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Boolean bool9 = this.canChat;
        int iHashCode39 = (iHashCode38 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str22 = this.blockStatus;
        int iHashCode40 = (iHashCode39 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Boolean bool10 = this.needRemind;
        int iHashCode41 = (iHashCode40 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str23 = this.nickName;
        int iHashCode42 = (iHashCode41 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.areaCode;
        int iHashCode43 = (iHashCode42 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.phone;
        int iHashCode44 = (iHashCode43 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.secretPhone;
        int iHashCode45 = (((iHashCode44 + (str26 == null ? 0 : str26.hashCode())) * 31) + Integer.hashCode(this.unreadMsgCount)) * 31;
        OpUserInfo opUserInfo = this.opUserInfo;
        int iHashCode46 = (iHashCode45 + (opUserInfo == null ? 0 : opUserInfo.hashCode())) * 31;
        AdInfo adInfo = this.adInfo;
        return iHashCode46 + (adInfo != null ? adInfo.hashCode() : 0);
    }

    public final boolean isAppealAndConsultSame() {
        if (Intrinsics.areEqual(this.appealBy, "BUYER") && Intrinsics.areEqual(this.appealConsent, "BUYER")) {
            return true;
        }
        return Intrinsics.areEqual(this.appealBy, "SELLER") && Intrinsics.areEqual(this.appealConsent, "SELLER");
    }

    public final boolean isP2PExpress() {
        return this.expressInfo != null;
    }

    public final void setPayTypes(@Nullable List<AdPayType> list) {
        this.payTypes = list;
    }

    @NotNull
    public String toString() {
        return "OrderDetailInfo(appealStatus=" + this.appealStatus + ", buyerRole=" + this.buyerRole + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", currencyAmount=" + this.currencyAmount + ", id=" + this.id + ", adId=" + this.adId + ", legalCurrency=" + this.legalCurrency + ", legalCurrencyAmount=" + this.legalCurrencyAmount + ", opTraderName=" + this.opTraderName + ", opTraderNickName=" + this.opTraderNickName + ", payCoinAt=" + this.payCoinAt + ", payMoneyAt=" + this.payMoneyAt + ", payTypeCode=" + this.payTypeCode + ", payTypes=" + this.payTypes + ", price=" + this.price + ", status=" + this.status + ", adRemarks=" + this.adRemarks + ", autoCancelOrderExpire=" + this.autoCancelOrderExpire + ", autoPayCoinExpire=" + this.autoPayCoinExpire + ", buyerKycName=" + this.buyerKycName + ", displayOpTradeInfo=" + this.displayOpTradeInfo + ", appealConsent=" + this.appealConsent + ", appealBy=" + this.appealBy + ", appealReason=" + this.appealReason + ", hasRecord=" + this.hasRecord + ", csTimeLimit=" + this.csTimeLimit + ", autoAppealHours=" + this.autoAppealHours + ", avgPayCoinLeftTime=" + this.avgPayCoinLeftTime + ", cancelRemark=" + this.cancelRemark + ", unread=" + this.unread + ", appealSwitch=" + this.appealSwitch + ", requirePayVoucher=" + this.requirePayVoucher + ", enableNotifyPayCoin=" + this.enableNotifyPayCoin + ", userAppealConsentResult=" + this.userAppealConsentResult + ", expressInfo=" + this.expressInfo + ", needPriceReminder=" + this.needPriceReminder + ", feeMessage=" + this.feeMessage + ", canChat=" + this.canChat + ", blockStatus=" + this.blockStatus + ", needRemind=" + this.needRemind + ", nickName=" + this.nickName + ", areaCode=" + this.areaCode + ", phone=" + this.phone + ", secretPhone=" + this.secretPhone + ", unreadMsgCount=" + this.unreadMsgCount + ", opUserInfo=" + this.opUserInfo + ", adInfo=" + this.adInfo + ')';
    }
}
