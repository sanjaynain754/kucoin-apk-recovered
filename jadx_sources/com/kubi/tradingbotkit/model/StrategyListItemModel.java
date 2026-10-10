package com.kubi.tradingbotkit.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrategyListItemModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0003\b±\u0001\n\u0002\u0010\u0002\n\u0002\bK\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0004Å\u0002Æ\u0002B¿\u0006\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010,\u001a\u00020\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u00108\u001a\u00020\u000b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010M\u001a\u00020\u000b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bP\u0010QJ\u0011\u0010ñ\u0001\u001a\u00030ò\u00012\u0007\u0010ó\u0001\u001a\u00020\u0000J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010÷\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010û\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010ü\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010hJ\u0011\u0010ý\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010hJ\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0084\u0002\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020\u000bHÆ\u0003J\u0011\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u008e\u0002\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0095\u0001J\u0012\u0010\u008f\u0002\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0095\u0001J\u0012\u0010\u0090\u0002\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0095\u0001J\u0012\u0010\u0091\u0002\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0095\u0001J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\n\u0010£\u0002\u001a\u00020\u000bHÆ\u0003J\u0011\u0010¤\u0002\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010¥\u0002\u001a\u0004\u0018\u00010;HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010©\u0002\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0003\u0010Ï\u0001J\u0011\u0010ª\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010hJ\u0011\u0010«\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010hJ\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010µ\u0002\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010cJ\n\u0010¶\u0002\u001a\u00020\u000bHÆ\u0003J\f\u0010·\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÈ\u0006\u0010¹\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010,\u001a\u00020\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u00108\u001a\u00020\u000b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010M\u001a\u00020\u000b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010º\u0002J\u0007\u0010»\u0002\u001a\u00020\u000bJ\u0016\u0010¼\u0002\u001a\u00020@2\n\u0010½\u0002\u001a\u0005\u0018\u00010¾\u0002HÖ\u0003J\n\u0010¿\u0002\u001a\u00020\u000bHÖ\u0001J\n\u0010À\u0002\u001a\u00020\u0003HÖ\u0001J\u001b\u0010Á\u0002\u001a\u00030ò\u00012\b\u0010Â\u0002\u001a\u00030Ã\u00022\u0007\u0010Ä\u0002\u001a\u00020\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010S\"\u0004\bW\u0010UR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010UR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010S\"\u0004\b]\u0010UR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010S\"\u0004\b_\u0010UR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010S\"\u0004\ba\u0010UR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010k\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010k\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010S\"\u0004\bo\u0010UR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\bp\u0010c\"\u0004\bq\u0010eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\br\u0010c\"\u0004\bs\u0010eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010S\"\u0004\bu\u0010UR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010S\"\u0004\bw\u0010UR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010S\"\u0004\by\u0010UR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010S\"\u0005\b\u0083\u0001\u0010UR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010S\"\u0005\b\u0085\u0001\u0010UR\u001e\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u0010\u001d\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u0087\u0001\"\u0006\b\u008b\u0001\u0010\u0089\u0001R \u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010f\u001a\u0005\b\u008c\u0001\u0010c\"\u0005\b\u008d\u0001\u0010eR \u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010f\u001a\u0005\b\u008e\u0001\u0010c\"\u0005\b\u008f\u0001\u0010eR\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010S\"\u0005\b\u0091\u0001\u0010UR\u001e\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010S\"\u0005\b\u0093\u0001\u0010UR#\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0098\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R#\u0010$\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001\"\u0006\b\u009a\u0001\u0010\u0097\u0001R#\u0010%\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0098\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001\"\u0006\b\u009c\u0001\u0010\u0097\u0001R#\u0010&\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0098\u0001\u001a\u0006\b\u009d\u0001\u0010\u0095\u0001\"\u0006\b\u009e\u0001\u0010\u0097\u0001R\u001e\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010S\"\u0005\b \u0001\u0010UR\u001f\u0010(\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b¡\u0001\u0010\u007f\"\u0006\b¢\u0001\u0010\u0081\u0001R\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010S\"\u0005\b¤\u0001\u0010UR\u001e\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010S\"\u0005\b¦\u0001\u0010UR\u001f\u0010+\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b§\u0001\u0010\u007f\"\u0006\b¨\u0001\u0010\u0081\u0001R\u001e\u0010,\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b©\u0001\u0010\u0087\u0001\"\u0006\bª\u0001\u0010\u0089\u0001R\u001e\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010S\"\u0005\b¬\u0001\u0010UR\u001e\u0010.\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010S\"\u0005\b®\u0001\u0010UR\u001f\u0010/\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b¯\u0001\u0010\u007f\"\u0006\b°\u0001\u0010\u0081\u0001R \u00100\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010f\u001a\u0005\b±\u0001\u0010c\"\u0005\b²\u0001\u0010eR\u001e\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010S\"\u0005\b´\u0001\u0010UR\u001f\u00102\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bµ\u0001\u0010\u007f\"\u0006\b¶\u0001\u0010\u0081\u0001R\u001e\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010S\"\u0005\b¸\u0001\u0010UR\u001e\u00104\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010S\"\u0005\bº\u0001\u0010UR\u001f\u00105\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b»\u0001\u0010\u007f\"\u0006\b¼\u0001\u0010\u0081\u0001R\u001f\u00106\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b½\u0001\u0010\u007f\"\u0006\b¾\u0001\u0010\u0081\u0001R\u001f\u00107\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b¿\u0001\u0010\u007f\"\u0006\bÀ\u0001\u0010\u0081\u0001R\u001e\u00108\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÁ\u0001\u0010\u0087\u0001\"\u0006\bÂ\u0001\u0010\u0089\u0001R \u00109\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010f\u001a\u0005\bÃ\u0001\u0010c\"\u0005\bÄ\u0001\u0010eR \u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R\u001e\u0010<\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0001\u0010S\"\u0005\bÊ\u0001\u0010UR\u001f\u0010=\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bË\u0001\u0010\u007f\"\u0006\bÌ\u0001\u0010\u0081\u0001R\u001e\u0010>\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010S\"\u0005\bÎ\u0001\u0010UR\"\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0014\n\u0003\u0010Ò\u0001\u001a\u0005\b?\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010A\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\bÓ\u0001\u0010h\"\u0005\bÔ\u0001\u0010jR \u0010B\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\bÕ\u0001\u0010h\"\u0005\bÖ\u0001\u0010jR\u001f\u0010C\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b×\u0001\u0010\u007f\"\u0006\bØ\u0001\u0010\u0081\u0001R\u001e\u0010D\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u0010S\"\u0005\bÚ\u0001\u0010UR\u001f\u0010E\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bÛ\u0001\u0010\u007f\"\u0006\bÜ\u0001\u0010\u0081\u0001R\u001e\u0010F\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0001\u0010S\"\u0005\bÞ\u0001\u0010UR\u001e\u0010G\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0001\u0010S\"\u0005\bà\u0001\u0010UR\u001e\u0010H\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0001\u0010S\"\u0005\bâ\u0001\u0010UR\u001e\u0010I\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0001\u0010S\"\u0005\bä\u0001\u0010UR\u001e\u0010J\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0001\u0010S\"\u0005\bæ\u0001\u0010UR\u001e\u0010K\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u0010S\"\u0005\bè\u0001\u0010UR \u0010L\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010f\u001a\u0005\bé\u0001\u0010c\"\u0005\bê\u0001\u0010eR\u001e\u0010M\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bë\u0001\u0010\u0087\u0001\"\u0006\bì\u0001\u0010\u0089\u0001R\u001e\u0010N\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bí\u0001\u0010S\"\u0005\bî\u0001\u0010UR\u001e\u0010O\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bï\u0001\u0010S\"\u0005\bð\u0001\u0010U¨\u0006Ç\u0002"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/StrategyListItemModel;", "Landroid/os/Parcelable;", "symbolName", "", "symbolCode", "quoteName", "quoteCode", "baseName", "baseCode", "runningStatus", "viewType", "", "taskId", "", "runningTimeValue", "runningTime", "dayArbitrageNum", "totalArbitrageNum", "arbitrage", "yearProfitRate", "yearProfitRateValue", "transfers", "", "Lcom/kubi/tradingbotkit/model/StrategyListItemModel$Transfer;", "strategyProfitValue", "Ljava/math/BigDecimal;", "strategyProfit", "orderPriceRange", "pendingOrderNumberSellColor", "pendingOrderNumberBuyColor", "buyNumberBg", "sellNumberBg", "sellNum", "buyNum", "buyNumberWidget", "", "sellNumberWidget", "splitWidget", "weightSum", "floatingAmount", "entryPriceNumberValue", "entryPriceNumber", "lastPrice", "lastPriceValue", "lastPriceVisible", "totalProfitString", "totalProfit", "totalProfitValue", "totalProfitColor", "totalProfitRate", "totalProfitRateValue", "totalInvestString", "totalInvestNumber", "totalInvestNumberValue", "upValue", "downValue", "outPriceRangeVisible", "priceRangeTextColor", "couponReward", "Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;", "loadingString", "openUnitPriceValue", "notTradingOrderPrice", "isOpenUnit", "", "endTime", "startTime", "stopLossPriceValue", "stopLossPrice", "stopProfitPriceValue", "stopProfitPrice", "stopReason", "stopPriceText", "stopPriceNumber", "stopReasonDetail", "iconUrl", "centerContentBgColor", "totalInvestVisible", "breakEvenPriceShow", "breakEvenPriceValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Integer;Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "getSymbolName", "()Ljava/lang/String;", "setSymbolName", "(Ljava/lang/String;)V", "getSymbolCode", "setSymbolCode", "getQuoteName", "setQuoteName", "getQuoteCode", "setQuoteCode", "getBaseName", "setBaseName", "getBaseCode", "setBaseCode", "getRunningStatus", "setRunningStatus", "getViewType", "()Ljava/lang/Integer;", "setViewType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTaskId", "()Ljava/lang/Long;", "setTaskId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getRunningTimeValue", "setRunningTimeValue", "getRunningTime", "setRunningTime", "getDayArbitrageNum", "setDayArbitrageNum", "getTotalArbitrageNum", "setTotalArbitrageNum", "getArbitrage", "setArbitrage", "getYearProfitRate", "setYearProfitRate", "getYearProfitRateValue", "setYearProfitRateValue", "getTransfers", "()Ljava/util/List;", "setTransfers", "(Ljava/util/List;)V", "getStrategyProfitValue", "()Ljava/math/BigDecimal;", "setStrategyProfitValue", "(Ljava/math/BigDecimal;)V", "getStrategyProfit", "setStrategyProfit", "getOrderPriceRange", "setOrderPriceRange", "getPendingOrderNumberSellColor", "()I", "setPendingOrderNumberSellColor", "(I)V", "getPendingOrderNumberBuyColor", "setPendingOrderNumberBuyColor", "getBuyNumberBg", "setBuyNumberBg", "getSellNumberBg", "setSellNumberBg", "getSellNum", "setSellNum", "getBuyNum", "setBuyNum", "getBuyNumberWidget", "()Ljava/lang/Float;", "setBuyNumberWidget", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getSellNumberWidget", "setSellNumberWidget", "getSplitWidget", "setSplitWidget", "getWeightSum", "setWeightSum", "getFloatingAmount", "setFloatingAmount", "getEntryPriceNumberValue", "setEntryPriceNumberValue", "getEntryPriceNumber", "setEntryPriceNumber", "getLastPrice", "setLastPrice", "getLastPriceValue", "setLastPriceValue", "getLastPriceVisible", "setLastPriceVisible", "getTotalProfitString", "setTotalProfitString", "getTotalProfit", "setTotalProfit", "getTotalProfitValue", "setTotalProfitValue", "getTotalProfitColor", "setTotalProfitColor", "getTotalProfitRate", "setTotalProfitRate", "getTotalProfitRateValue", "setTotalProfitRateValue", "getTotalInvestString", "setTotalInvestString", "getTotalInvestNumber", "setTotalInvestNumber", "getTotalInvestNumberValue", "setTotalInvestNumberValue", "getUpValue", "setUpValue", "getDownValue", "setDownValue", "getOutPriceRangeVisible", "setOutPriceRangeVisible", "getPriceRangeTextColor", "setPriceRangeTextColor", "getCouponReward", "()Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;", "setCouponReward", "(Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;)V", "getLoadingString", "setLoadingString", "getOpenUnitPriceValue", "setOpenUnitPriceValue", "getNotTradingOrderPrice", "setNotTradingOrderPrice", "()Ljava/lang/Boolean;", "setOpenUnit", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEndTime", "setEndTime", "getStartTime", "setStartTime", "getStopLossPriceValue", "setStopLossPriceValue", "getStopLossPrice", "setStopLossPrice", "getStopProfitPriceValue", "setStopProfitPriceValue", "getStopProfitPrice", "setStopProfitPrice", "getStopReason", "setStopReason", "getStopPriceText", "setStopPriceText", "getStopPriceNumber", "setStopPriceNumber", "getStopReasonDetail", "setStopReasonDetail", "getIconUrl", "setIconUrl", "getCenterContentBgColor", "setCenterContentBgColor", "getTotalInvestVisible", "setTotalInvestVisible", "getBreakEvenPriceShow", "setBreakEvenPriceShow", "getBreakEvenPriceValue", "setBreakEvenPriceValue", "bind", "", "model", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Integer;Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)Lcom/kubi/tradingbotkit/model/StrategyListItemModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "Transfer", "CouponReward", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class StrategyListItemModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StrategyListItemModel> CREATOR = new C26236a();

    @Nullable
    private String arbitrage;

    @Nullable
    private String baseCode;

    @Nullable
    private String baseName;

    @Nullable
    private String breakEvenPriceShow;

    @Nullable
    private String breakEvenPriceValue;

    @Nullable
    private String buyNum;

    @Nullable
    private Integer buyNumberBg;

    @Nullable
    private Float buyNumberWidget;

    @Nullable
    private Integer centerContentBgColor;

    @Nullable
    private CouponReward couponReward;

    @Nullable
    private Integer dayArbitrageNum;

    @Nullable
    private BigDecimal downValue;

    @Nullable
    private Long endTime;

    @Nullable
    private String entryPriceNumber;

    @Nullable
    private BigDecimal entryPriceNumberValue;

    @Nullable
    private String floatingAmount;

    @Nullable
    private String iconUrl;

    @Nullable
    private Boolean isOpenUnit;

    @Nullable
    private String lastPrice;

    @Nullable
    private BigDecimal lastPriceValue;
    private int lastPriceVisible;

    @Nullable
    private String loadingString;

    @Nullable
    private String notTradingOrderPrice;

    @Nullable
    private BigDecimal openUnitPriceValue;

    @Nullable
    private String orderPriceRange;
    private int outPriceRangeVisible;
    private int pendingOrderNumberBuyColor;
    private int pendingOrderNumberSellColor;

    @Nullable
    private Integer priceRangeTextColor;

    @Nullable
    private String quoteCode;

    @Nullable
    private String quoteName;

    @Nullable
    private String runningStatus;

    @Nullable
    private String runningTime;

    @Nullable
    private Long runningTimeValue;

    @Nullable
    private String sellNum;

    @Nullable
    private Integer sellNumberBg;

    @Nullable
    private Float sellNumberWidget;

    @Nullable
    private Float splitWidget;

    @Nullable
    private Long startTime;

    @Nullable
    private String stopLossPrice;

    @Nullable
    private BigDecimal stopLossPriceValue;

    @Nullable
    private String stopPriceNumber;

    @Nullable
    private String stopPriceText;

    @Nullable
    private String stopProfitPrice;

    @Nullable
    private BigDecimal stopProfitPriceValue;

    @Nullable
    private String stopReason;

    @Nullable
    private String stopReasonDetail;

    @Nullable
    private String strategyProfit;

    @Nullable
    private BigDecimal strategyProfitValue;

    @Nullable
    private String symbolCode;

    @Nullable
    private String symbolName;

    @Nullable
    private Long taskId;

    @Nullable
    private Integer totalArbitrageNum;

    @Nullable
    private String totalInvestNumber;

    @Nullable
    private BigDecimal totalInvestNumberValue;

    @Nullable
    private String totalInvestString;
    private int totalInvestVisible;

    @Nullable
    private String totalProfit;

    @Nullable
    private Integer totalProfitColor;

    @Nullable
    private String totalProfitRate;

    @Nullable
    private BigDecimal totalProfitRateValue;

    @Nullable
    private String totalProfitString;

    @Nullable
    private BigDecimal totalProfitValue;

    @Nullable
    private List<Transfer> transfers;

    @Nullable
    private BigDecimal upValue;

    @Nullable
    private Integer viewType;

    @Nullable
    private Float weightSum;

    @Nullable
    private String yearProfitRate;

    @Nullable
    private String yearProfitRateValue;

    /* JADX INFO: compiled from: StrategyListItemModel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015Jb\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017¨\u00069"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;", "Landroid/os/Parcelable;", "couponsId", "", FirebaseAnalytics.Param.CURRENCY, "expiredTime", "", "maxReward", "Ljava/math/BigDecimal;", "name", "rewardSize", "taskId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "getCouponsId", "()Ljava/lang/String;", "setCouponsId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getExpiredTime", "()Ljava/lang/Long;", "setExpiredTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMaxReward", "()Ljava/math/BigDecimal;", "setMaxReward", "(Ljava/math/BigDecimal;)V", "getName", "setName", "getRewardSize", "setRewardSize", "getTaskId", "setTaskId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CouponReward implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CouponReward> CREATOR = new C26234a();

        @Nullable
        private String couponsId;

        @Nullable
        private String currency;

        @Nullable
        private Long expiredTime;

        @Nullable
        private BigDecimal maxReward;

        @Nullable
        private String name;

        @Nullable
        private BigDecimal rewardSize;

        @Nullable
        private Long taskId;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.StrategyListItemModel$CouponReward$a */
        /* JADX INFO: compiled from: StrategyListItemModel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C26234a implements Parcelable.Creator<CouponReward> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CouponReward createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CouponReward(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CouponReward[] newArray(int i11) {
                return new CouponReward[i11];
            }
        }

        public CouponReward() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponReward)) {
                return false;
            }
            CouponReward couponReward = (CouponReward) other;
            return Intrinsics.areEqual(this.couponsId, couponReward.couponsId) && Intrinsics.areEqual(this.currency, couponReward.currency) && Intrinsics.areEqual(this.expiredTime, couponReward.expiredTime) && Intrinsics.areEqual(this.maxReward, couponReward.maxReward) && Intrinsics.areEqual(this.name, couponReward.name) && Intrinsics.areEqual(this.rewardSize, couponReward.rewardSize) && Intrinsics.areEqual(this.taskId, couponReward.taskId);
        }

        public CouponReward(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable Long l12) {
            this.couponsId = str;
            this.currency = str2;
            this.expiredTime = l11;
            this.maxReward = bigDecimal;
            this.name = str3;
            this.rewardSize = bigDecimal2;
            this.taskId = l12;
        }

        public static /* synthetic */ CouponReward copy$default(CouponReward couponReward, String str, String str2, Long l11, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, Long l12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = couponReward.couponsId;
            }
            if ((i11 & 2) != 0) {
                str2 = couponReward.currency;
            }
            if ((i11 & 4) != 0) {
                l11 = couponReward.expiredTime;
            }
            if ((i11 & 8) != 0) {
                bigDecimal = couponReward.maxReward;
            }
            if ((i11 & 16) != 0) {
                str3 = couponReward.name;
            }
            if ((i11 & 32) != 0) {
                bigDecimal2 = couponReward.rewardSize;
            }
            if ((i11 & 64) != 0) {
                l12 = couponReward.taskId;
            }
            BigDecimal bigDecimal3 = bigDecimal2;
            Long l13 = l12;
            String str4 = str3;
            Long l14 = l11;
            return couponReward.copy(str, str2, l14, bigDecimal, str4, bigDecimal3, l13);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCouponsId() {
            return this.couponsId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getExpiredTime() {
            return this.expiredTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BigDecimal getMaxReward() {
            return this.maxReward;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final BigDecimal getRewardSize() {
            return this.rewardSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getTaskId() {
            return this.taskId;
        }

        @NotNull
        public final CouponReward copy(@Nullable String couponsId, @Nullable String currency, @Nullable Long expiredTime, @Nullable BigDecimal maxReward, @Nullable String name, @Nullable BigDecimal rewardSize, @Nullable Long taskId) {
            return new CouponReward(couponsId, currency, expiredTime, maxReward, name, rewardSize, taskId);
        }

        @Nullable
        public final String getCouponsId() {
            return this.couponsId;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final Long getExpiredTime() {
            return this.expiredTime;
        }

        @Nullable
        public final BigDecimal getMaxReward() {
            return this.maxReward;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final BigDecimal getRewardSize() {
            return this.rewardSize;
        }

        @Nullable
        public final Long getTaskId() {
            return this.taskId;
        }

        public int hashCode() {
            String str = this.couponsId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.currency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l11 = this.expiredTime;
            int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            BigDecimal bigDecimal = this.maxReward;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str3 = this.name;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.rewardSize;
            int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            Long l12 = this.taskId;
            return iHashCode6 + (l12 != null ? l12.hashCode() : 0);
        }

        public final void setCouponsId(@Nullable String str) {
            this.couponsId = str;
        }

        public final void setCurrency(@Nullable String str) {
            this.currency = str;
        }

        public final void setExpiredTime(@Nullable Long l11) {
            this.expiredTime = l11;
        }

        public final void setMaxReward(@Nullable BigDecimal bigDecimal) {
            this.maxReward = bigDecimal;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setRewardSize(@Nullable BigDecimal bigDecimal) {
            this.rewardSize = bigDecimal;
        }

        public final void setTaskId(@Nullable Long l11) {
            this.taskId = l11;
        }

        @NotNull
        public String toString() {
            return "CouponReward(couponsId=" + this.couponsId + ", currency=" + this.currency + ", expiredTime=" + this.expiredTime + ", maxReward=" + this.maxReward + ", name=" + this.name + ", rewardSize=" + this.rewardSize + ", taskId=" + this.taskId + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.couponsId);
            dest.writeString(this.currency);
            Long l11 = this.expiredTime;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeSerializable(this.maxReward);
            dest.writeString(this.name);
            dest.writeSerializable(this.rewardSize);
            Long l12 = this.taskId;
            if (l12 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l12.longValue());
            }
        }

        public /* synthetic */ CouponReward(String str, String str2, Long l11, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0L : l11, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? 0L : l12);
        }
    }

    /* JADX INFO: compiled from: StrategyListItemModel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006$"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/StrategyListItemModel$Transfer;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "size", "Ljava/math/BigDecimal;", "type", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getSize", "()Ljava/math/BigDecimal;", "setSize", "(Ljava/math/BigDecimal;)V", "getType", "setType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Transfer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new C26235a();

        @Nullable
        private String currency;

        @Nullable
        private BigDecimal size;

        @Nullable
        private String type;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.StrategyListItemModel$Transfer$a */
        /* JADX INFO: compiled from: StrategyListItemModel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C26235a implements Parcelable.Creator<Transfer> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Transfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Transfer[] newArray(int i11) {
                return new Transfer[i11];
            }
        }

        public Transfer() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) other;
            return Intrinsics.areEqual(this.currency, transfer.currency) && Intrinsics.areEqual(this.size, transfer.size) && Intrinsics.areEqual(this.type, transfer.type);
        }

        public Transfer(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2) {
            this.currency = str;
            this.size = bigDecimal;
            this.type = str2;
        }

        public static /* synthetic */ Transfer copy$default(Transfer transfer, String str, BigDecimal bigDecimal, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = transfer.currency;
            }
            if ((i11 & 2) != 0) {
                bigDecimal = transfer.size;
            }
            if ((i11 & 4) != 0) {
                str2 = transfer.type;
            }
            return transfer.copy(str, bigDecimal, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final BigDecimal getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Transfer copy(@Nullable String currency, @Nullable BigDecimal size, @Nullable String type) {
            return new Transfer(currency, size, type);
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final BigDecimal getSize() {
            return this.size;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            BigDecimal bigDecimal = this.size;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str2 = this.type;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setCurrency(@Nullable String str) {
            this.currency = str;
        }

        public final void setSize(@Nullable BigDecimal bigDecimal) {
            this.size = bigDecimal;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        @NotNull
        public String toString() {
            return "Transfer(currency=" + this.currency + ", size=" + this.size + ", type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.currency);
            dest.writeSerializable(this.size);
            dest.writeString(this.type);
        }

        public /* synthetic */ Transfer(String str, BigDecimal bigDecimal, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.StrategyListItemModel$a */
    /* JADX INFO: compiled from: StrategyListItemModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26236a implements Parcelable.Creator<StrategyListItemModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StrategyListItemModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string8 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int i12 = 0;
                while (i12 != i11) {
                    arrayList.add(Transfer.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
            }
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string16 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            int i15 = parcel.readInt();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string21 = parcel.readString();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            int i16 = parcel.readInt();
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            CouponReward couponRewardCreateFromParcel = parcel.readInt() == 0 ? null : CouponReward.CREATOR.createFromParcel(parcel);
            String string24 = parcel.readString();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            String string25 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrategyListItemModel(string, string2, string3, string4, string5, string6, string7, numValueOf, lValueOf, lValueOf2, string8, numValueOf2, numValueOf3, string9, string10, string11, arrayList, bigDecimal, string12, string13, i13, i14, numValueOf4, numValueOf5, string14, string15, fValueOf, fValueOf2, fValueOf3, fValueOf4, string16, bigDecimal2, string17, string18, bigDecimal3, i15, string19, string20, bigDecimal4, numValueOf6, string21, bigDecimal5, string22, string23, bigDecimal6, bigDecimal7, bigDecimal8, i16, numValueOf7, couponRewardCreateFromParcel, string24, bigDecimal9, string25, boolValueOf, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StrategyListItemModel[] newArray(int i11) {
            return new StrategyListItemModel[i11];
        }
    }

    public StrategyListItemModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, -1, -1, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrategyListItemModel copy$default(StrategyListItemModel strategyListItemModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l11, Long l12, String str8, Integer num2, Integer num3, String str9, String str10, String str11, List list, BigDecimal bigDecimal, String str12, String str13, int i11, int i12, Integer num4, Integer num5, String str14, String str15, Float f11, Float f12, Float f13, Float f14, String str16, BigDecimal bigDecimal2, String str17, String str18, BigDecimal bigDecimal3, int i13, String str19, String str20, BigDecimal bigDecimal4, Integer num6, String str21, BigDecimal bigDecimal5, String str22, String str23, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, int i14, Integer num7, CouponReward couponReward, String str24, BigDecimal bigDecimal9, String str25, Boolean bool, Long l13, Long l14, BigDecimal bigDecimal10, String str26, BigDecimal bigDecimal11, String str27, String str28, String str29, String str30, String str31, String str32, Integer num8, int i15, String str33, String str34, int i16, int i17, int i18, Object obj) {
        String str35;
        String str36;
        String str37 = (i16 & 1) != 0 ? strategyListItemModel.symbolName : str;
        String str38 = (i16 & 2) != 0 ? strategyListItemModel.symbolCode : str2;
        String str39 = (i16 & 4) != 0 ? strategyListItemModel.quoteName : str3;
        String str40 = (i16 & 8) != 0 ? strategyListItemModel.quoteCode : str4;
        String str41 = (i16 & 16) != 0 ? strategyListItemModel.baseName : str5;
        String str42 = (i16 & 32) != 0 ? strategyListItemModel.baseCode : str6;
        String str43 = (i16 & 64) != 0 ? strategyListItemModel.runningStatus : str7;
        Integer num9 = (i16 & 128) != 0 ? strategyListItemModel.viewType : num;
        Long l15 = (i16 & 256) != 0 ? strategyListItemModel.taskId : l11;
        Long l16 = (i16 & 512) != 0 ? strategyListItemModel.runningTimeValue : l12;
        String str44 = (i16 & 1024) != 0 ? strategyListItemModel.runningTime : str8;
        Integer num10 = (i16 & 2048) != 0 ? strategyListItemModel.dayArbitrageNum : num2;
        Integer num11 = (i16 & 4096) != 0 ? strategyListItemModel.totalArbitrageNum : num3;
        String str45 = str37;
        String str46 = (i16 & 8192) != 0 ? strategyListItemModel.arbitrage : str9;
        String str47 = (i16 & 16384) != 0 ? strategyListItemModel.yearProfitRate : str10;
        String str48 = (i16 & 32768) != 0 ? strategyListItemModel.yearProfitRateValue : str11;
        List list2 = (i16 & 65536) != 0 ? strategyListItemModel.transfers : list;
        BigDecimal bigDecimal12 = (i16 & 131072) != 0 ? strategyListItemModel.strategyProfitValue : bigDecimal;
        String str49 = (i16 & 262144) != 0 ? strategyListItemModel.strategyProfit : str12;
        String str50 = (i16 & 524288) != 0 ? strategyListItemModel.orderPriceRange : str13;
        int i19 = (i16 & 1048576) != 0 ? strategyListItemModel.pendingOrderNumberSellColor : i11;
        int i21 = (i16 & 2097152) != 0 ? strategyListItemModel.pendingOrderNumberBuyColor : i12;
        Integer num12 = (i16 & 4194304) != 0 ? strategyListItemModel.buyNumberBg : num4;
        Integer num13 = (i16 & 8388608) != 0 ? strategyListItemModel.sellNumberBg : num5;
        String str51 = (i16 & 16777216) != 0 ? strategyListItemModel.sellNum : str14;
        String str52 = (i16 & 33554432) != 0 ? strategyListItemModel.buyNum : str15;
        Float f15 = (i16 & 67108864) != 0 ? strategyListItemModel.buyNumberWidget : f11;
        Float f16 = (i16 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? strategyListItemModel.sellNumberWidget : f12;
        Float f17 = (i16 & 268435456) != 0 ? strategyListItemModel.splitWidget : f13;
        Float f18 = (i16 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? strategyListItemModel.weightSum : f14;
        String str53 = (i16 & 1073741824) != 0 ? strategyListItemModel.floatingAmount : str16;
        BigDecimal bigDecimal13 = (i16 & Integer.MIN_VALUE) != 0 ? strategyListItemModel.entryPriceNumberValue : bigDecimal2;
        String str54 = (i17 & 1) != 0 ? strategyListItemModel.entryPriceNumber : str17;
        String str55 = (i17 & 2) != 0 ? strategyListItemModel.lastPrice : str18;
        BigDecimal bigDecimal14 = (i17 & 4) != 0 ? strategyListItemModel.lastPriceValue : bigDecimal3;
        int i22 = (i17 & 8) != 0 ? strategyListItemModel.lastPriceVisible : i13;
        String str56 = (i17 & 16) != 0 ? strategyListItemModel.totalProfitString : str19;
        String str57 = (i17 & 32) != 0 ? strategyListItemModel.totalProfit : str20;
        BigDecimal bigDecimal15 = (i17 & 64) != 0 ? strategyListItemModel.totalProfitValue : bigDecimal4;
        Integer num14 = (i17 & 128) != 0 ? strategyListItemModel.totalProfitColor : num6;
        String str58 = (i17 & 256) != 0 ? strategyListItemModel.totalProfitRate : str21;
        BigDecimal bigDecimal16 = (i17 & 512) != 0 ? strategyListItemModel.totalProfitRateValue : bigDecimal5;
        String str59 = (i17 & 1024) != 0 ? strategyListItemModel.totalInvestString : str22;
        String str60 = (i17 & 2048) != 0 ? strategyListItemModel.totalInvestNumber : str23;
        BigDecimal bigDecimal17 = (i17 & 4096) != 0 ? strategyListItemModel.totalInvestNumberValue : bigDecimal6;
        BigDecimal bigDecimal18 = (i17 & 8192) != 0 ? strategyListItemModel.upValue : bigDecimal7;
        BigDecimal bigDecimal19 = (i17 & 16384) != 0 ? strategyListItemModel.downValue : bigDecimal8;
        int i23 = (i17 & 32768) != 0 ? strategyListItemModel.outPriceRangeVisible : i14;
        Integer num15 = (i17 & 65536) != 0 ? strategyListItemModel.priceRangeTextColor : num7;
        CouponReward couponReward2 = (i17 & 131072) != 0 ? strategyListItemModel.couponReward : couponReward;
        String str61 = (i17 & 262144) != 0 ? strategyListItemModel.loadingString : str24;
        BigDecimal bigDecimal20 = (i17 & 524288) != 0 ? strategyListItemModel.openUnitPriceValue : bigDecimal9;
        String str62 = (i17 & 1048576) != 0 ? strategyListItemModel.notTradingOrderPrice : str25;
        Boolean bool2 = (i17 & 2097152) != 0 ? strategyListItemModel.isOpenUnit : bool;
        Long l17 = (i17 & 4194304) != 0 ? strategyListItemModel.endTime : l13;
        Long l18 = (i17 & 8388608) != 0 ? strategyListItemModel.startTime : l14;
        BigDecimal bigDecimal21 = (i17 & 16777216) != 0 ? strategyListItemModel.stopLossPriceValue : bigDecimal10;
        String str63 = (i17 & 33554432) != 0 ? strategyListItemModel.stopLossPrice : str26;
        BigDecimal bigDecimal22 = (i17 & 67108864) != 0 ? strategyListItemModel.stopProfitPriceValue : bigDecimal11;
        String str64 = (i17 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? strategyListItemModel.stopProfitPrice : str27;
        String str65 = (i17 & 268435456) != 0 ? strategyListItemModel.stopReason : str28;
        String str66 = (i17 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? strategyListItemModel.stopPriceText : str29;
        String str67 = (i17 & 1073741824) != 0 ? strategyListItemModel.stopPriceNumber : str30;
        String str68 = (i17 & Integer.MIN_VALUE) != 0 ? strategyListItemModel.stopReasonDetail : str31;
        String str69 = str67;
        String str70 = (i18 & 1) != 0 ? strategyListItemModel.iconUrl : str32;
        Integer num16 = (i18 & 2) != 0 ? strategyListItemModel.centerContentBgColor : num8;
        int i24 = (i18 & 4) != 0 ? strategyListItemModel.totalInvestVisible : i15;
        String str71 = (i18 & 8) != 0 ? strategyListItemModel.breakEvenPriceShow : str33;
        if ((i18 & 16) != 0) {
            str36 = str71;
            str35 = strategyListItemModel.breakEvenPriceValue;
        } else {
            str35 = str34;
            str36 = str71;
        }
        return strategyListItemModel.copy(str45, str38, str39, str40, str41, str42, str43, num9, l15, l16, str44, num10, num11, str46, str47, str48, list2, bigDecimal12, str49, str50, i19, i21, num12, num13, str51, str52, f15, f16, f17, f18, str53, bigDecimal13, str54, str55, bigDecimal14, i22, str56, str57, bigDecimal15, num14, str58, bigDecimal16, str59, str60, bigDecimal17, bigDecimal18, bigDecimal19, i23, num15, couponReward2, str61, bigDecimal20, str62, bool2, l17, l18, bigDecimal21, str63, bigDecimal22, str64, str65, str66, str69, str68, str70, num16, i24, str36, str35);
    }

    @NotNull
    public final StrategyListItemModel copy(@Nullable String symbolName, @Nullable String symbolCode, @Nullable String quoteName, @Nullable String quoteCode, @Nullable String baseName, @Nullable String baseCode, @Nullable String runningStatus, @Nullable Integer viewType, @Nullable Long taskId, @Nullable Long runningTimeValue, @Nullable String runningTime, @Nullable Integer dayArbitrageNum, @Nullable Integer totalArbitrageNum, @Nullable String arbitrage, @Nullable String yearProfitRate, @Nullable String yearProfitRateValue, @Nullable List<Transfer> transfers, @Nullable BigDecimal strategyProfitValue, @Nullable String strategyProfit, @Nullable String orderPriceRange, int pendingOrderNumberSellColor, int pendingOrderNumberBuyColor, @Nullable Integer buyNumberBg, @Nullable Integer sellNumberBg, @Nullable String sellNum, @Nullable String buyNum, @Nullable Float buyNumberWidget, @Nullable Float sellNumberWidget, @Nullable Float splitWidget, @Nullable Float weightSum, @Nullable String floatingAmount, @Nullable BigDecimal entryPriceNumberValue, @Nullable String entryPriceNumber, @Nullable String lastPrice, @Nullable BigDecimal lastPriceValue, int lastPriceVisible, @Nullable String totalProfitString, @Nullable String totalProfit, @Nullable BigDecimal totalProfitValue, @Nullable Integer totalProfitColor, @Nullable String totalProfitRate, @Nullable BigDecimal totalProfitRateValue, @Nullable String totalInvestString, @Nullable String totalInvestNumber, @Nullable BigDecimal totalInvestNumberValue, @Nullable BigDecimal upValue, @Nullable BigDecimal downValue, int outPriceRangeVisible, @Nullable Integer priceRangeTextColor, @Nullable CouponReward couponReward, @Nullable String loadingString, @Nullable BigDecimal openUnitPriceValue, @Nullable String notTradingOrderPrice, @Nullable Boolean isOpenUnit, @Nullable Long endTime, @Nullable Long startTime, @Nullable BigDecimal stopLossPriceValue, @Nullable String stopLossPrice, @Nullable BigDecimal stopProfitPriceValue, @Nullable String stopProfitPrice, @Nullable String stopReason, @Nullable String stopPriceText, @Nullable String stopPriceNumber, @Nullable String stopReasonDetail, @Nullable String iconUrl, @Nullable Integer centerContentBgColor, int totalInvestVisible, @Nullable String breakEvenPriceShow, @Nullable String breakEvenPriceValue) {
        return new StrategyListItemModel(symbolName, symbolCode, quoteName, quoteCode, baseName, baseCode, runningStatus, viewType, taskId, runningTimeValue, runningTime, dayArbitrageNum, totalArbitrageNum, arbitrage, yearProfitRate, yearProfitRateValue, transfers, strategyProfitValue, strategyProfit, orderPriceRange, pendingOrderNumberSellColor, pendingOrderNumberBuyColor, buyNumberBg, sellNumberBg, sellNum, buyNum, buyNumberWidget, sellNumberWidget, splitWidget, weightSum, floatingAmount, entryPriceNumberValue, entryPriceNumber, lastPrice, lastPriceValue, lastPriceVisible, totalProfitString, totalProfit, totalProfitValue, totalProfitColor, totalProfitRate, totalProfitRateValue, totalInvestString, totalInvestNumber, totalInvestNumberValue, upValue, downValue, outPriceRangeVisible, priceRangeTextColor, couponReward, loadingString, openUnitPriceValue, notTradingOrderPrice, isOpenUnit, endTime, startTime, stopLossPriceValue, stopLossPrice, stopProfitPriceValue, stopProfitPrice, stopReason, stopPriceText, stopPriceNumber, stopReasonDetail, iconUrl, centerContentBgColor, totalInvestVisible, breakEvenPriceShow, breakEvenPriceValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrategyListItemModel)) {
            return false;
        }
        StrategyListItemModel strategyListItemModel = (StrategyListItemModel) other;
        return Intrinsics.areEqual(this.symbolName, strategyListItemModel.symbolName) && Intrinsics.areEqual(this.symbolCode, strategyListItemModel.symbolCode) && Intrinsics.areEqual(this.quoteName, strategyListItemModel.quoteName) && Intrinsics.areEqual(this.quoteCode, strategyListItemModel.quoteCode) && Intrinsics.areEqual(this.baseName, strategyListItemModel.baseName) && Intrinsics.areEqual(this.baseCode, strategyListItemModel.baseCode) && Intrinsics.areEqual(this.runningStatus, strategyListItemModel.runningStatus) && Intrinsics.areEqual(this.viewType, strategyListItemModel.viewType) && Intrinsics.areEqual(this.taskId, strategyListItemModel.taskId) && Intrinsics.areEqual(this.runningTimeValue, strategyListItemModel.runningTimeValue) && Intrinsics.areEqual(this.runningTime, strategyListItemModel.runningTime) && Intrinsics.areEqual(this.dayArbitrageNum, strategyListItemModel.dayArbitrageNum) && Intrinsics.areEqual(this.totalArbitrageNum, strategyListItemModel.totalArbitrageNum) && Intrinsics.areEqual(this.arbitrage, strategyListItemModel.arbitrage) && Intrinsics.areEqual(this.yearProfitRate, strategyListItemModel.yearProfitRate) && Intrinsics.areEqual(this.yearProfitRateValue, strategyListItemModel.yearProfitRateValue) && Intrinsics.areEqual(this.transfers, strategyListItemModel.transfers) && Intrinsics.areEqual(this.strategyProfitValue, strategyListItemModel.strategyProfitValue) && Intrinsics.areEqual(this.strategyProfit, strategyListItemModel.strategyProfit) && Intrinsics.areEqual(this.orderPriceRange, strategyListItemModel.orderPriceRange) && this.pendingOrderNumberSellColor == strategyListItemModel.pendingOrderNumberSellColor && this.pendingOrderNumberBuyColor == strategyListItemModel.pendingOrderNumberBuyColor && Intrinsics.areEqual(this.buyNumberBg, strategyListItemModel.buyNumberBg) && Intrinsics.areEqual(this.sellNumberBg, strategyListItemModel.sellNumberBg) && Intrinsics.areEqual(this.sellNum, strategyListItemModel.sellNum) && Intrinsics.areEqual(this.buyNum, strategyListItemModel.buyNum) && Intrinsics.areEqual((Object) this.buyNumberWidget, (Object) strategyListItemModel.buyNumberWidget) && Intrinsics.areEqual((Object) this.sellNumberWidget, (Object) strategyListItemModel.sellNumberWidget) && Intrinsics.areEqual((Object) this.splitWidget, (Object) strategyListItemModel.splitWidget) && Intrinsics.areEqual((Object) this.weightSum, (Object) strategyListItemModel.weightSum) && Intrinsics.areEqual(this.floatingAmount, strategyListItemModel.floatingAmount) && Intrinsics.areEqual(this.entryPriceNumberValue, strategyListItemModel.entryPriceNumberValue) && Intrinsics.areEqual(this.entryPriceNumber, strategyListItemModel.entryPriceNumber) && Intrinsics.areEqual(this.lastPrice, strategyListItemModel.lastPrice) && Intrinsics.areEqual(this.lastPriceValue, strategyListItemModel.lastPriceValue) && this.lastPriceVisible == strategyListItemModel.lastPriceVisible && Intrinsics.areEqual(this.totalProfitString, strategyListItemModel.totalProfitString) && Intrinsics.areEqual(this.totalProfit, strategyListItemModel.totalProfit) && Intrinsics.areEqual(this.totalProfitValue, strategyListItemModel.totalProfitValue) && Intrinsics.areEqual(this.totalProfitColor, strategyListItemModel.totalProfitColor) && Intrinsics.areEqual(this.totalProfitRate, strategyListItemModel.totalProfitRate) && Intrinsics.areEqual(this.totalProfitRateValue, strategyListItemModel.totalProfitRateValue) && Intrinsics.areEqual(this.totalInvestString, strategyListItemModel.totalInvestString) && Intrinsics.areEqual(this.totalInvestNumber, strategyListItemModel.totalInvestNumber) && Intrinsics.areEqual(this.totalInvestNumberValue, strategyListItemModel.totalInvestNumberValue) && Intrinsics.areEqual(this.upValue, strategyListItemModel.upValue) && Intrinsics.areEqual(this.downValue, strategyListItemModel.downValue) && this.outPriceRangeVisible == strategyListItemModel.outPriceRangeVisible && Intrinsics.areEqual(this.priceRangeTextColor, strategyListItemModel.priceRangeTextColor) && Intrinsics.areEqual(this.couponReward, strategyListItemModel.couponReward) && Intrinsics.areEqual(this.loadingString, strategyListItemModel.loadingString) && Intrinsics.areEqual(this.openUnitPriceValue, strategyListItemModel.openUnitPriceValue) && Intrinsics.areEqual(this.notTradingOrderPrice, strategyListItemModel.notTradingOrderPrice) && Intrinsics.areEqual(this.isOpenUnit, strategyListItemModel.isOpenUnit) && Intrinsics.areEqual(this.endTime, strategyListItemModel.endTime) && Intrinsics.areEqual(this.startTime, strategyListItemModel.startTime) && Intrinsics.areEqual(this.stopLossPriceValue, strategyListItemModel.stopLossPriceValue) && Intrinsics.areEqual(this.stopLossPrice, strategyListItemModel.stopLossPrice) && Intrinsics.areEqual(this.stopProfitPriceValue, strategyListItemModel.stopProfitPriceValue) && Intrinsics.areEqual(this.stopProfitPrice, strategyListItemModel.stopProfitPrice) && Intrinsics.areEqual(this.stopReason, strategyListItemModel.stopReason) && Intrinsics.areEqual(this.stopPriceText, strategyListItemModel.stopPriceText) && Intrinsics.areEqual(this.stopPriceNumber, strategyListItemModel.stopPriceNumber) && Intrinsics.areEqual(this.stopReasonDetail, strategyListItemModel.stopReasonDetail) && Intrinsics.areEqual(this.iconUrl, strategyListItemModel.iconUrl) && Intrinsics.areEqual(this.centerContentBgColor, strategyListItemModel.centerContentBgColor) && this.totalInvestVisible == strategyListItemModel.totalInvestVisible && Intrinsics.areEqual(this.breakEvenPriceShow, strategyListItemModel.breakEvenPriceShow) && Intrinsics.areEqual(this.breakEvenPriceValue, strategyListItemModel.breakEvenPriceValue);
    }

    public StrategyListItemModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable Long l11, @Nullable Long l12, @Nullable String str8, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable List<Transfer> list, @Nullable BigDecimal bigDecimal, @Nullable String str12, @Nullable String str13, int i11, int i12, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str14, @Nullable String str15, @Nullable Float f11, @Nullable Float f12, @Nullable Float f13, @Nullable Float f14, @Nullable String str16, @Nullable BigDecimal bigDecimal2, @Nullable String str17, @Nullable String str18, @Nullable BigDecimal bigDecimal3, int i13, @Nullable String str19, @Nullable String str20, @Nullable BigDecimal bigDecimal4, @Nullable Integer num6, @Nullable String str21, @Nullable BigDecimal bigDecimal5, @Nullable String str22, @Nullable String str23, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, int i14, @Nullable Integer num7, @Nullable CouponReward couponReward, @Nullable String str24, @Nullable BigDecimal bigDecimal9, @Nullable String str25, @Nullable Boolean bool, @Nullable Long l13, @Nullable Long l14, @Nullable BigDecimal bigDecimal10, @Nullable String str26, @Nullable BigDecimal bigDecimal11, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable Integer num8, int i15, @Nullable String str33, @Nullable String str34) {
        this.symbolName = str;
        this.symbolCode = str2;
        this.quoteName = str3;
        this.quoteCode = str4;
        this.baseName = str5;
        this.baseCode = str6;
        this.runningStatus = str7;
        this.viewType = num;
        this.taskId = l11;
        this.runningTimeValue = l12;
        this.runningTime = str8;
        this.dayArbitrageNum = num2;
        this.totalArbitrageNum = num3;
        this.arbitrage = str9;
        this.yearProfitRate = str10;
        this.yearProfitRateValue = str11;
        this.transfers = list;
        this.strategyProfitValue = bigDecimal;
        this.strategyProfit = str12;
        this.orderPriceRange = str13;
        this.pendingOrderNumberSellColor = i11;
        this.pendingOrderNumberBuyColor = i12;
        this.buyNumberBg = num4;
        this.sellNumberBg = num5;
        this.sellNum = str14;
        this.buyNum = str15;
        this.buyNumberWidget = f11;
        this.sellNumberWidget = f12;
        this.splitWidget = f13;
        this.weightSum = f14;
        this.floatingAmount = str16;
        this.entryPriceNumberValue = bigDecimal2;
        this.entryPriceNumber = str17;
        this.lastPrice = str18;
        this.lastPriceValue = bigDecimal3;
        this.lastPriceVisible = i13;
        this.totalProfitString = str19;
        this.totalProfit = str20;
        this.totalProfitValue = bigDecimal4;
        this.totalProfitColor = num6;
        this.totalProfitRate = str21;
        this.totalProfitRateValue = bigDecimal5;
        this.totalInvestString = str22;
        this.totalInvestNumber = str23;
        this.totalInvestNumberValue = bigDecimal6;
        this.upValue = bigDecimal7;
        this.downValue = bigDecimal8;
        this.outPriceRangeVisible = i14;
        this.priceRangeTextColor = num7;
        this.couponReward = couponReward;
        this.loadingString = str24;
        this.openUnitPriceValue = bigDecimal9;
        this.notTradingOrderPrice = str25;
        this.isOpenUnit = bool;
        this.endTime = l13;
        this.startTime = l14;
        this.stopLossPriceValue = bigDecimal10;
        this.stopLossPrice = str26;
        this.stopProfitPriceValue = bigDecimal11;
        this.stopProfitPrice = str27;
        this.stopReason = str28;
        this.stopPriceText = str29;
        this.stopPriceNumber = str30;
        this.stopReasonDetail = str31;
        this.iconUrl = str32;
        this.centerContentBgColor = num8;
        this.totalInvestVisible = i15;
        this.breakEvenPriceShow = str33;
        this.breakEvenPriceValue = str34;
    }

    public final void bind(@NotNull StrategyListItemModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.symbolName = model.symbolName;
        this.symbolCode = model.symbolCode;
        this.quoteName = model.quoteName;
        this.quoteCode = model.quoteCode;
        this.baseCode = model.baseCode;
        this.baseName = model.baseName;
        this.runningStatus = model.runningStatus;
        this.viewType = model.viewType;
        this.taskId = model.taskId;
        this.runningTimeValue = model.runningTimeValue;
        this.runningTime = model.runningTime;
        this.dayArbitrageNum = model.dayArbitrageNum;
        this.totalArbitrageNum = model.totalArbitrageNum;
        this.arbitrage = model.arbitrage;
        this.yearProfitRate = model.yearProfitRate;
        this.yearProfitRateValue = model.yearProfitRateValue;
        this.transfers = model.transfers;
        this.strategyProfitValue = model.strategyProfitValue;
        this.strategyProfit = model.strategyProfit;
        this.orderPriceRange = model.orderPriceRange;
        this.pendingOrderNumberSellColor = model.pendingOrderNumberSellColor;
        this.pendingOrderNumberBuyColor = model.pendingOrderNumberBuyColor;
        this.buyNumberBg = model.buyNumberBg;
        this.sellNumberBg = model.sellNumberBg;
        this.sellNum = model.sellNum;
        this.buyNum = model.buyNum;
        this.buyNumberWidget = model.buyNumberWidget;
        this.sellNumberWidget = model.sellNumberWidget;
        this.splitWidget = model.splitWidget;
        this.weightSum = model.weightSum;
        this.floatingAmount = model.floatingAmount;
        this.entryPriceNumberValue = model.entryPriceNumberValue;
        this.entryPriceNumber = model.entryPriceNumber;
        this.lastPrice = model.lastPrice;
        this.lastPriceValue = model.lastPriceValue;
        this.lastPriceVisible = model.lastPriceVisible;
        this.totalProfitString = model.totalProfitString;
        this.totalProfit = model.totalProfit;
        this.totalProfitValue = model.totalProfitValue;
        this.totalProfitColor = model.totalProfitColor;
        this.totalProfitRate = model.totalProfitRate;
        this.totalProfitRateValue = model.totalProfitRateValue;
        this.totalInvestString = model.totalInvestString;
        this.totalInvestNumber = model.totalInvestNumber;
        this.totalInvestNumberValue = model.totalInvestNumberValue;
        this.upValue = model.upValue;
        this.downValue = model.downValue;
        this.outPriceRangeVisible = model.outPriceRangeVisible;
        this.priceRangeTextColor = model.priceRangeTextColor;
        this.couponReward = model.couponReward;
        this.loadingString = model.loadingString;
        this.openUnitPriceValue = model.openUnitPriceValue;
        this.notTradingOrderPrice = model.notTradingOrderPrice;
        this.isOpenUnit = model.isOpenUnit;
        this.endTime = model.endTime;
        this.startTime = model.startTime;
        this.stopLossPriceValue = model.stopLossPriceValue;
        this.stopLossPrice = model.stopLossPrice;
        this.stopProfitPriceValue = model.stopProfitPriceValue;
        this.stopProfitPrice = model.stopProfitPrice;
        this.stopReason = model.stopReason;
        this.stopPriceText = model.stopPriceText;
        this.stopPriceNumber = model.stopPriceNumber;
        this.stopReasonDetail = model.stopReasonDetail;
        this.iconUrl = model.iconUrl;
        this.centerContentBgColor = model.centerContentBgColor;
        this.totalInvestVisible = model.totalInvestVisible;
        this.breakEvenPriceValue = model.breakEvenPriceValue;
        this.breakEvenPriceShow = model.breakEvenPriceShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getRunningTimeValue() {
        return this.runningTimeValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRunningTime() {
        return this.runningTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getDayArbitrageNum() {
        return this.dayArbitrageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getTotalArbitrageNum() {
        return this.totalArbitrageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getArbitrage() {
        return this.arbitrage;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getYearProfitRate() {
        return this.yearProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getYearProfitRateValue() {
        return this.yearProfitRateValue;
    }

    @Nullable
    public final List<Transfer> component17() {
        return this.transfers;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getStrategyProfitValue() {
        return this.strategyProfitValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getStrategyProfit() {
        return this.strategyProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOrderPriceRange() {
        return this.orderPriceRange;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getPendingOrderNumberSellColor() {
        return this.pendingOrderNumberSellColor;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getPendingOrderNumberBuyColor() {
        return this.pendingOrderNumberBuyColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getBuyNumberBg() {
        return this.buyNumberBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getSellNumberBg() {
        return this.sellNumberBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getSellNum() {
        return this.sellNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getBuyNum() {
        return this.buyNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Float getBuyNumberWidget() {
        return this.buyNumberWidget;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Float getSellNumberWidget() {
        return this.sellNumberWidget;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Float getSplitWidget() {
        return this.splitWidget;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuoteName() {
        return this.quoteName;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Float getWeightSum() {
        return this.weightSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getFloatingAmount() {
        return this.floatingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final BigDecimal getEntryPriceNumberValue() {
        return this.entryPriceNumberValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getEntryPriceNumber() {
        return this.entryPriceNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getLastPriceValue() {
        return this.lastPriceValue;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getLastPriceVisible() {
        return this.lastPriceVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getTotalProfitString() {
        return this.totalProfitString;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final BigDecimal getTotalProfitValue() {
        return this.totalProfitValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuoteCode() {
        return this.quoteCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Integer getTotalProfitColor() {
        return this.totalProfitColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getTotalProfitRate() {
        return this.totalProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final BigDecimal getTotalProfitRateValue() {
        return this.totalProfitRateValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getTotalInvestString() {
        return this.totalInvestString;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getTotalInvestNumber() {
        return this.totalInvestNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final BigDecimal getTotalInvestNumberValue() {
        return this.totalInvestNumberValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final BigDecimal getUpValue() {
        return this.upValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final BigDecimal getDownValue() {
        return this.downValue;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final int getOutPriceRangeVisible() {
        return this.outPriceRangeVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Integer getPriceRangeTextColor() {
        return this.priceRangeTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseName() {
        return this.baseName;
    }

    @Nullable
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final CouponReward getCouponReward() {
        return this.couponReward;
    }

    @Nullable
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getLoadingString() {
        return this.loadingString;
    }

    @Nullable
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final BigDecimal getOpenUnitPriceValue() {
        return this.openUnitPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getNotTradingOrderPrice() {
        return this.notTradingOrderPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component54, reason: from getter */
    public final Boolean getIsOpenUnit() {
        return this.isOpenUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component55, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component56, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component57, reason: from getter */
    public final BigDecimal getStopLossPriceValue() {
        return this.stopLossPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getStopLossPrice() {
        return this.stopLossPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component59, reason: from getter */
    public final BigDecimal getStopProfitPriceValue() {
        return this.stopProfitPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBaseCode() {
        return this.baseCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getStopProfitPrice() {
        return this.stopProfitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getStopReason() {
        return this.stopReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getStopPriceText() {
        return this.stopPriceText;
    }

    @Nullable
    /* JADX INFO: renamed from: component63, reason: from getter */
    public final String getStopPriceNumber() {
        return this.stopPriceNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getStopReasonDetail() {
        return this.stopReasonDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component65, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component66, reason: from getter */
    public final Integer getCenterContentBgColor() {
        return this.centerContentBgColor;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final int getTotalInvestVisible() {
        return this.totalInvestVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getBreakEvenPriceShow() {
        return this.breakEvenPriceShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component69, reason: from getter */
    public final String getBreakEvenPriceValue() {
        return this.breakEvenPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRunningStatus() {
        return this.runningStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getViewType() {
        return this.viewType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getArbitrage() {
        return this.arbitrage;
    }

    @Nullable
    public final String getBaseCode() {
        return this.baseCode;
    }

    @Nullable
    public final String getBaseName() {
        return this.baseName;
    }

    @Nullable
    public final String getBreakEvenPriceShow() {
        return this.breakEvenPriceShow;
    }

    @Nullable
    public final String getBreakEvenPriceValue() {
        return this.breakEvenPriceValue;
    }

    @Nullable
    public final String getBuyNum() {
        return this.buyNum;
    }

    @Nullable
    public final Integer getBuyNumberBg() {
        return this.buyNumberBg;
    }

    @Nullable
    public final Float getBuyNumberWidget() {
        return this.buyNumberWidget;
    }

    @Nullable
    public final Integer getCenterContentBgColor() {
        return this.centerContentBgColor;
    }

    @Nullable
    public final CouponReward getCouponReward() {
        return this.couponReward;
    }

    @Nullable
    public final Integer getDayArbitrageNum() {
        return this.dayArbitrageNum;
    }

    @Nullable
    public final BigDecimal getDownValue() {
        return this.downValue;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getEntryPriceNumber() {
        return this.entryPriceNumber;
    }

    @Nullable
    public final BigDecimal getEntryPriceNumberValue() {
        return this.entryPriceNumberValue;
    }

    @Nullable
    public final String getFloatingAmount() {
        return this.floatingAmount;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final BigDecimal getLastPriceValue() {
        return this.lastPriceValue;
    }

    public final int getLastPriceVisible() {
        return this.lastPriceVisible;
    }

    @Nullable
    public final String getLoadingString() {
        return this.loadingString;
    }

    @Nullable
    public final String getNotTradingOrderPrice() {
        return this.notTradingOrderPrice;
    }

    @Nullable
    public final BigDecimal getOpenUnitPriceValue() {
        return this.openUnitPriceValue;
    }

    @Nullable
    public final String getOrderPriceRange() {
        return this.orderPriceRange;
    }

    public final int getOutPriceRangeVisible() {
        return this.outPriceRangeVisible;
    }

    public final int getPendingOrderNumberBuyColor() {
        return this.pendingOrderNumberBuyColor;
    }

    public final int getPendingOrderNumberSellColor() {
        return this.pendingOrderNumberSellColor;
    }

    @Nullable
    public final Integer getPriceRangeTextColor() {
        return this.priceRangeTextColor;
    }

    @Nullable
    public final String getQuoteCode() {
        return this.quoteCode;
    }

    @Nullable
    public final String getQuoteName() {
        return this.quoteName;
    }

    @Nullable
    public final String getRunningStatus() {
        return this.runningStatus;
    }

    @Nullable
    public final String getRunningTime() {
        return this.runningTime;
    }

    @Nullable
    public final Long getRunningTimeValue() {
        return this.runningTimeValue;
    }

    @Nullable
    public final String getSellNum() {
        return this.sellNum;
    }

    @Nullable
    public final Integer getSellNumberBg() {
        return this.sellNumberBg;
    }

    @Nullable
    public final Float getSellNumberWidget() {
        return this.sellNumberWidget;
    }

    @Nullable
    public final Float getSplitWidget() {
        return this.splitWidget;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getStopLossPrice() {
        return this.stopLossPrice;
    }

    @Nullable
    public final BigDecimal getStopLossPriceValue() {
        return this.stopLossPriceValue;
    }

    @Nullable
    public final String getStopPriceNumber() {
        return this.stopPriceNumber;
    }

    @Nullable
    public final String getStopPriceText() {
        return this.stopPriceText;
    }

    @Nullable
    public final String getStopProfitPrice() {
        return this.stopProfitPrice;
    }

    @Nullable
    public final BigDecimal getStopProfitPriceValue() {
        return this.stopProfitPriceValue;
    }

    @Nullable
    public final String getStopReason() {
        return this.stopReason;
    }

    @Nullable
    public final String getStopReasonDetail() {
        return this.stopReasonDetail;
    }

    @Nullable
    public final String getStrategyProfit() {
        return this.strategyProfit;
    }

    @Nullable
    public final BigDecimal getStrategyProfitValue() {
        return this.strategyProfitValue;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final Integer getTotalArbitrageNum() {
        return this.totalArbitrageNum;
    }

    @Nullable
    public final String getTotalInvestNumber() {
        return this.totalInvestNumber;
    }

    @Nullable
    public final BigDecimal getTotalInvestNumberValue() {
        return this.totalInvestNumberValue;
    }

    @Nullable
    public final String getTotalInvestString() {
        return this.totalInvestString;
    }

    public final int getTotalInvestVisible() {
        return this.totalInvestVisible;
    }

    @Nullable
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    public final Integer getTotalProfitColor() {
        return this.totalProfitColor;
    }

    @Nullable
    public final String getTotalProfitRate() {
        return this.totalProfitRate;
    }

    @Nullable
    public final BigDecimal getTotalProfitRateValue() {
        return this.totalProfitRateValue;
    }

    @Nullable
    public final String getTotalProfitString() {
        return this.totalProfitString;
    }

    @Nullable
    public final BigDecimal getTotalProfitValue() {
        return this.totalProfitValue;
    }

    @Nullable
    public final List<Transfer> getTransfers() {
        return this.transfers;
    }

    @Nullable
    public final BigDecimal getUpValue() {
        return this.upValue;
    }

    @Nullable
    public final Integer getViewType() {
        return this.viewType;
    }

    @Nullable
    public final Float getWeightSum() {
        return this.weightSum;
    }

    @Nullable
    public final String getYearProfitRate() {
        return this.yearProfitRate;
    }

    @Nullable
    public final String getYearProfitRateValue() {
        return this.yearProfitRateValue;
    }

    public int hashCode() {
        String str = this.symbolName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbolCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quoteCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.baseName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.baseCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.runningStatus;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.viewType;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.taskId;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.runningTimeValue;
        int iHashCode10 = (iHashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str8 = this.runningTime;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.dayArbitrageNum;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalArbitrageNum;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.arbitrage;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.yearProfitRate;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.yearProfitRateValue;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<Transfer> list = this.transfers;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.strategyProfitValue;
        int iHashCode18 = (iHashCode17 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str12 = this.strategyProfit;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.orderPriceRange;
        int iHashCode20 = (((((iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.pendingOrderNumberSellColor)) * 31) + Integer.hashCode(this.pendingOrderNumberBuyColor)) * 31;
        Integer num4 = this.buyNumberBg;
        int iHashCode21 = (iHashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.sellNumberBg;
        int iHashCode22 = (iHashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str14 = this.sellNum;
        int iHashCode23 = (iHashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.buyNum;
        int iHashCode24 = (iHashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Float f11 = this.buyNumberWidget;
        int iHashCode25 = (iHashCode24 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.sellNumberWidget;
        int iHashCode26 = (iHashCode25 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.splitWidget;
        int iHashCode27 = (iHashCode26 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.weightSum;
        int iHashCode28 = (iHashCode27 + (f14 == null ? 0 : f14.hashCode())) * 31;
        String str16 = this.floatingAmount;
        int iHashCode29 = (iHashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.entryPriceNumberValue;
        int iHashCode30 = (iHashCode29 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str17 = this.entryPriceNumber;
        int iHashCode31 = (iHashCode30 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.lastPrice;
        int iHashCode32 = (iHashCode31 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.lastPriceValue;
        int iHashCode33 = (((iHashCode32 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31) + Integer.hashCode(this.lastPriceVisible)) * 31;
        String str19 = this.totalProfitString;
        int iHashCode34 = (iHashCode33 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.totalProfit;
        int iHashCode35 = (iHashCode34 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalProfitValue;
        int iHashCode36 = (iHashCode35 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Integer num6 = this.totalProfitColor;
        int iHashCode37 = (iHashCode36 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str21 = this.totalProfitRate;
        int iHashCode38 = (iHashCode37 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalProfitRateValue;
        int iHashCode39 = (iHashCode38 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str22 = this.totalInvestString;
        int iHashCode40 = (iHashCode39 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.totalInvestNumber;
        int iHashCode41 = (iHashCode40 + (str23 == null ? 0 : str23.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalInvestNumberValue;
        int iHashCode42 = (iHashCode41 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.upValue;
        int iHashCode43 = (iHashCode42 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.downValue;
        int iHashCode44 = (((iHashCode43 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31) + Integer.hashCode(this.outPriceRangeVisible)) * 31;
        Integer num7 = this.priceRangeTextColor;
        int iHashCode45 = (iHashCode44 + (num7 == null ? 0 : num7.hashCode())) * 31;
        CouponReward couponReward = this.couponReward;
        int iHashCode46 = (iHashCode45 + (couponReward == null ? 0 : couponReward.hashCode())) * 31;
        String str24 = this.loadingString;
        int iHashCode47 = (iHashCode46 + (str24 == null ? 0 : str24.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.openUnitPriceValue;
        int iHashCode48 = (iHashCode47 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str25 = this.notTradingOrderPrice;
        int iHashCode49 = (iHashCode48 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Boolean bool = this.isOpenUnit;
        int iHashCode50 = (iHashCode49 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l13 = this.endTime;
        int iHashCode51 = (iHashCode50 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.startTime;
        int iHashCode52 = (iHashCode51 + (l14 == null ? 0 : l14.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.stopLossPriceValue;
        int iHashCode53 = (iHashCode52 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str26 = this.stopLossPrice;
        int iHashCode54 = (iHashCode53 + (str26 == null ? 0 : str26.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.stopProfitPriceValue;
        int iHashCode55 = (iHashCode54 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        String str27 = this.stopProfitPrice;
        int iHashCode56 = (iHashCode55 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.stopReason;
        int iHashCode57 = (iHashCode56 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.stopPriceText;
        int iHashCode58 = (iHashCode57 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.stopPriceNumber;
        int iHashCode59 = (iHashCode58 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.stopReasonDetail;
        int iHashCode60 = (iHashCode59 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.iconUrl;
        int iHashCode61 = (iHashCode60 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Integer num8 = this.centerContentBgColor;
        int iHashCode62 = (((iHashCode61 + (num8 == null ? 0 : num8.hashCode())) * 31) + Integer.hashCode(this.totalInvestVisible)) * 31;
        String str33 = this.breakEvenPriceShow;
        int iHashCode63 = (iHashCode62 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.breakEvenPriceValue;
        return iHashCode63 + (str34 != null ? str34.hashCode() : 0);
    }

    @Nullable
    public final Boolean isOpenUnit() {
        return this.isOpenUnit;
    }

    public final void setArbitrage(@Nullable String str) {
        this.arbitrage = str;
    }

    public final void setBaseCode(@Nullable String str) {
        this.baseCode = str;
    }

    public final void setBaseName(@Nullable String str) {
        this.baseName = str;
    }

    public final void setBreakEvenPriceShow(@Nullable String str) {
        this.breakEvenPriceShow = str;
    }

    public final void setBreakEvenPriceValue(@Nullable String str) {
        this.breakEvenPriceValue = str;
    }

    public final void setBuyNum(@Nullable String str) {
        this.buyNum = str;
    }

    public final void setBuyNumberBg(@Nullable Integer num) {
        this.buyNumberBg = num;
    }

    public final void setBuyNumberWidget(@Nullable Float f11) {
        this.buyNumberWidget = f11;
    }

    public final void setCenterContentBgColor(@Nullable Integer num) {
        this.centerContentBgColor = num;
    }

    public final void setCouponReward(@Nullable CouponReward couponReward) {
        this.couponReward = couponReward;
    }

    public final void setDayArbitrageNum(@Nullable Integer num) {
        this.dayArbitrageNum = num;
    }

    public final void setDownValue(@Nullable BigDecimal bigDecimal) {
        this.downValue = bigDecimal;
    }

    public final void setEndTime(@Nullable Long l11) {
        this.endTime = l11;
    }

    public final void setEntryPriceNumber(@Nullable String str) {
        this.entryPriceNumber = str;
    }

    public final void setEntryPriceNumberValue(@Nullable BigDecimal bigDecimal) {
        this.entryPriceNumberValue = bigDecimal;
    }

    public final void setFloatingAmount(@Nullable String str) {
        this.floatingAmount = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setLastPrice(@Nullable String str) {
        this.lastPrice = str;
    }

    public final void setLastPriceValue(@Nullable BigDecimal bigDecimal) {
        this.lastPriceValue = bigDecimal;
    }

    public final void setLastPriceVisible(int i11) {
        this.lastPriceVisible = i11;
    }

    public final void setLoadingString(@Nullable String str) {
        this.loadingString = str;
    }

    public final void setNotTradingOrderPrice(@Nullable String str) {
        this.notTradingOrderPrice = str;
    }

    public final void setOpenUnit(@Nullable Boolean bool) {
        this.isOpenUnit = bool;
    }

    public final void setOpenUnitPriceValue(@Nullable BigDecimal bigDecimal) {
        this.openUnitPriceValue = bigDecimal;
    }

    public final void setOrderPriceRange(@Nullable String str) {
        this.orderPriceRange = str;
    }

    public final void setOutPriceRangeVisible(int i11) {
        this.outPriceRangeVisible = i11;
    }

    public final void setPendingOrderNumberBuyColor(int i11) {
        this.pendingOrderNumberBuyColor = i11;
    }

    public final void setPendingOrderNumberSellColor(int i11) {
        this.pendingOrderNumberSellColor = i11;
    }

    public final void setPriceRangeTextColor(@Nullable Integer num) {
        this.priceRangeTextColor = num;
    }

    public final void setQuoteCode(@Nullable String str) {
        this.quoteCode = str;
    }

    public final void setQuoteName(@Nullable String str) {
        this.quoteName = str;
    }

    public final void setRunningStatus(@Nullable String str) {
        this.runningStatus = str;
    }

    public final void setRunningTime(@Nullable String str) {
        this.runningTime = str;
    }

    public final void setRunningTimeValue(@Nullable Long l11) {
        this.runningTimeValue = l11;
    }

    public final void setSellNum(@Nullable String str) {
        this.sellNum = str;
    }

    public final void setSellNumberBg(@Nullable Integer num) {
        this.sellNumberBg = num;
    }

    public final void setSellNumberWidget(@Nullable Float f11) {
        this.sellNumberWidget = f11;
    }

    public final void setSplitWidget(@Nullable Float f11) {
        this.splitWidget = f11;
    }

    public final void setStartTime(@Nullable Long l11) {
        this.startTime = l11;
    }

    public final void setStopLossPrice(@Nullable String str) {
        this.stopLossPrice = str;
    }

    public final void setStopLossPriceValue(@Nullable BigDecimal bigDecimal) {
        this.stopLossPriceValue = bigDecimal;
    }

    public final void setStopPriceNumber(@Nullable String str) {
        this.stopPriceNumber = str;
    }

    public final void setStopPriceText(@Nullable String str) {
        this.stopPriceText = str;
    }

    public final void setStopProfitPrice(@Nullable String str) {
        this.stopProfitPrice = str;
    }

    public final void setStopProfitPriceValue(@Nullable BigDecimal bigDecimal) {
        this.stopProfitPriceValue = bigDecimal;
    }

    public final void setStopReason(@Nullable String str) {
        this.stopReason = str;
    }

    public final void setStopReasonDetail(@Nullable String str) {
        this.stopReasonDetail = str;
    }

    public final void setStrategyProfit(@Nullable String str) {
        this.strategyProfit = str;
    }

    public final void setStrategyProfitValue(@Nullable BigDecimal bigDecimal) {
        this.strategyProfitValue = bigDecimal;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setSymbolName(@Nullable String str) {
        this.symbolName = str;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }

    public final void setTotalArbitrageNum(@Nullable Integer num) {
        this.totalArbitrageNum = num;
    }

    public final void setTotalInvestNumber(@Nullable String str) {
        this.totalInvestNumber = str;
    }

    public final void setTotalInvestNumberValue(@Nullable BigDecimal bigDecimal) {
        this.totalInvestNumberValue = bigDecimal;
    }

    public final void setTotalInvestString(@Nullable String str) {
        this.totalInvestString = str;
    }

    public final void setTotalInvestVisible(int i11) {
        this.totalInvestVisible = i11;
    }

    public final void setTotalProfit(@Nullable String str) {
        this.totalProfit = str;
    }

    public final void setTotalProfitColor(@Nullable Integer num) {
        this.totalProfitColor = num;
    }

    public final void setTotalProfitRate(@Nullable String str) {
        this.totalProfitRate = str;
    }

    public final void setTotalProfitRateValue(@Nullable BigDecimal bigDecimal) {
        this.totalProfitRateValue = bigDecimal;
    }

    public final void setTotalProfitString(@Nullable String str) {
        this.totalProfitString = str;
    }

    public final void setTotalProfitValue(@Nullable BigDecimal bigDecimal) {
        this.totalProfitValue = bigDecimal;
    }

    public final void setTransfers(@Nullable List<Transfer> list) {
        this.transfers = list;
    }

    public final void setUpValue(@Nullable BigDecimal bigDecimal) {
        this.upValue = bigDecimal;
    }

    public final void setViewType(@Nullable Integer num) {
        this.viewType = num;
    }

    public final void setWeightSum(@Nullable Float f11) {
        this.weightSum = f11;
    }

    public final void setYearProfitRate(@Nullable String str) {
        this.yearProfitRate = str;
    }

    public final void setYearProfitRateValue(@Nullable String str) {
        this.yearProfitRateValue = str;
    }

    @NotNull
    public String toString() {
        return "StrategyListItemModel(symbolName=" + this.symbolName + ", symbolCode=" + this.symbolCode + ", quoteName=" + this.quoteName + ", quoteCode=" + this.quoteCode + ", baseName=" + this.baseName + ", baseCode=" + this.baseCode + ", runningStatus=" + this.runningStatus + ", viewType=" + this.viewType + ", taskId=" + this.taskId + ", runningTimeValue=" + this.runningTimeValue + ", runningTime=" + this.runningTime + ", dayArbitrageNum=" + this.dayArbitrageNum + ", totalArbitrageNum=" + this.totalArbitrageNum + ", arbitrage=" + this.arbitrage + ", yearProfitRate=" + this.yearProfitRate + ", yearProfitRateValue=" + this.yearProfitRateValue + ", transfers=" + this.transfers + ", strategyProfitValue=" + this.strategyProfitValue + ", strategyProfit=" + this.strategyProfit + ", orderPriceRange=" + this.orderPriceRange + ", pendingOrderNumberSellColor=" + this.pendingOrderNumberSellColor + ", pendingOrderNumberBuyColor=" + this.pendingOrderNumberBuyColor + ", buyNumberBg=" + this.buyNumberBg + ", sellNumberBg=" + this.sellNumberBg + ", sellNum=" + this.sellNum + ", buyNum=" + this.buyNum + ", buyNumberWidget=" + this.buyNumberWidget + ", sellNumberWidget=" + this.sellNumberWidget + ", splitWidget=" + this.splitWidget + ", weightSum=" + this.weightSum + ", floatingAmount=" + this.floatingAmount + ", entryPriceNumberValue=" + this.entryPriceNumberValue + ", entryPriceNumber=" + this.entryPriceNumber + ", lastPrice=" + this.lastPrice + ", lastPriceValue=" + this.lastPriceValue + ", lastPriceVisible=" + this.lastPriceVisible + ", totalProfitString=" + this.totalProfitString + ", totalProfit=" + this.totalProfit + ", totalProfitValue=" + this.totalProfitValue + ", totalProfitColor=" + this.totalProfitColor + ", totalProfitRate=" + this.totalProfitRate + ", totalProfitRateValue=" + this.totalProfitRateValue + ", totalInvestString=" + this.totalInvestString + ", totalInvestNumber=" + this.totalInvestNumber + ", totalInvestNumberValue=" + this.totalInvestNumberValue + ", upValue=" + this.upValue + ", downValue=" + this.downValue + ", outPriceRangeVisible=" + this.outPriceRangeVisible + ", priceRangeTextColor=" + this.priceRangeTextColor + ", couponReward=" + this.couponReward + ", loadingString=" + this.loadingString + ", openUnitPriceValue=" + this.openUnitPriceValue + ", notTradingOrderPrice=" + this.notTradingOrderPrice + ", isOpenUnit=" + this.isOpenUnit + ", endTime=" + this.endTime + ", startTime=" + this.startTime + ", stopLossPriceValue=" + this.stopLossPriceValue + ", stopLossPrice=" + this.stopLossPrice + ", stopProfitPriceValue=" + this.stopProfitPriceValue + ", stopProfitPrice=" + this.stopProfitPrice + ", stopReason=" + this.stopReason + ", stopPriceText=" + this.stopPriceText + ", stopPriceNumber=" + this.stopPriceNumber + ", stopReasonDetail=" + this.stopReasonDetail + ", iconUrl=" + this.iconUrl + ", centerContentBgColor=" + this.centerContentBgColor + ", totalInvestVisible=" + this.totalInvestVisible + ", breakEvenPriceShow=" + this.breakEvenPriceShow + ", breakEvenPriceValue=" + this.breakEvenPriceValue + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbolName);
        dest.writeString(this.symbolCode);
        dest.writeString(this.quoteName);
        dest.writeString(this.quoteCode);
        dest.writeString(this.baseName);
        dest.writeString(this.baseCode);
        dest.writeString(this.runningStatus);
        Integer num = this.viewType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Long l11 = this.taskId;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.runningTimeValue;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.runningTime);
        Integer num2 = this.dayArbitrageNum;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.totalArbitrageNum;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.arbitrage);
        dest.writeString(this.yearProfitRate);
        dest.writeString(this.yearProfitRateValue);
        List<Transfer> list = this.transfers;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Transfer> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeSerializable(this.strategyProfitValue);
        dest.writeString(this.strategyProfit);
        dest.writeString(this.orderPriceRange);
        dest.writeInt(this.pendingOrderNumberSellColor);
        dest.writeInt(this.pendingOrderNumberBuyColor);
        Integer num4 = this.buyNumberBg;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.sellNumberBg;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        dest.writeString(this.sellNum);
        dest.writeString(this.buyNum);
        Float f11 = this.buyNumberWidget;
        if (f11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f11.floatValue());
        }
        Float f12 = this.sellNumberWidget;
        if (f12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f12.floatValue());
        }
        Float f13 = this.splitWidget;
        if (f13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f13.floatValue());
        }
        Float f14 = this.weightSum;
        if (f14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f14.floatValue());
        }
        dest.writeString(this.floatingAmount);
        dest.writeSerializable(this.entryPriceNumberValue);
        dest.writeString(this.entryPriceNumber);
        dest.writeString(this.lastPrice);
        dest.writeSerializable(this.lastPriceValue);
        dest.writeInt(this.lastPriceVisible);
        dest.writeString(this.totalProfitString);
        dest.writeString(this.totalProfit);
        dest.writeSerializable(this.totalProfitValue);
        Integer num6 = this.totalProfitColor;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        dest.writeString(this.totalProfitRate);
        dest.writeSerializable(this.totalProfitRateValue);
        dest.writeString(this.totalInvestString);
        dest.writeString(this.totalInvestNumber);
        dest.writeSerializable(this.totalInvestNumberValue);
        dest.writeSerializable(this.upValue);
        dest.writeSerializable(this.downValue);
        dest.writeInt(this.outPriceRangeVisible);
        Integer num7 = this.priceRangeTextColor;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num7.intValue());
        }
        CouponReward couponReward = this.couponReward;
        if (couponReward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            couponReward.writeToParcel(dest, flags);
        }
        dest.writeString(this.loadingString);
        dest.writeSerializable(this.openUnitPriceValue);
        dest.writeString(this.notTradingOrderPrice);
        Boolean bool = this.isOpenUnit;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l13 = this.endTime;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        Long l14 = this.startTime;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        dest.writeSerializable(this.stopLossPriceValue);
        dest.writeString(this.stopLossPrice);
        dest.writeSerializable(this.stopProfitPriceValue);
        dest.writeString(this.stopProfitPrice);
        dest.writeString(this.stopReason);
        dest.writeString(this.stopPriceText);
        dest.writeString(this.stopPriceNumber);
        dest.writeString(this.stopReasonDetail);
        dest.writeString(this.iconUrl);
        Integer num8 = this.centerContentBgColor;
        if (num8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num8.intValue());
        }
        dest.writeInt(this.totalInvestVisible);
        dest.writeString(this.breakEvenPriceShow);
        dest.writeString(this.breakEvenPriceValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrategyListItemModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l11, Long l12, String str8, Integer num2, Integer num3, String str9, String str10, String str11, List list, BigDecimal bigDecimal, String str12, String str13, int i11, int i12, Integer num4, Integer num5, String str14, String str15, Float f11, Float f12, Float f13, Float f14, String str16, BigDecimal bigDecimal2, String str17, String str18, BigDecimal bigDecimal3, int i13, String str19, String str20, BigDecimal bigDecimal4, Integer num6, String str21, BigDecimal bigDecimal5, String str22, String str23, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, int i14, Integer num7, CouponReward couponReward, String str24, BigDecimal bigDecimal9, String str25, Boolean bool, Long l13, Long l14, BigDecimal bigDecimal10, String str26, BigDecimal bigDecimal11, String str27, String str28, String str29, String str30, String str31, String str32, Integer num8, int i15, String str33, String str34, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        String str35 = (i16 & 1) != 0 ? null : str;
        this(str35, (i16 & 2) != 0 ? null : str2, (i16 & 4) != 0 ? null : str3, (i16 & 8) != 0 ? null : str4, (i16 & 16) != 0 ? null : str5, (i16 & 32) != 0 ? null : str6, (i16 & 64) != 0 ? null : str7, (i16 & 128) != 0 ? null : num, (i16 & 256) != 0 ? null : l11, (i16 & 512) != 0 ? null : l12, (i16 & 1024) != 0 ? null : str8, (i16 & 2048) != 0 ? null : num2, (i16 & 4096) != 0 ? null : num3, (i16 & 8192) != 0 ? null : str9, (i16 & 16384) != 0 ? null : str10, (i16 & 32768) != 0 ? null : str11, (i16 & 65536) != 0 ? null : list, (i16 & 131072) != 0 ? null : bigDecimal, (i16 & 262144) != 0 ? null : str12, (i16 & 524288) != 0 ? null : str13, (i16 & 1048576) != 0 ? C22890g.m54289n(C27017c.f54310a.m66513b()) : i11, (i16 & 2097152) != 0 ? C22890g.m54291p(C27017c.f54310a.m66513b()) : i12, (i16 & 4194304) != 0 ? null : num4, (i16 & 8388608) != 0 ? null : num5, (i16 & 16777216) != 0 ? null : str14, (i16 & 33554432) != 0 ? null : str15, (i16 & 67108864) != 0 ? null : f11, (i16 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : f12, (i16 & 268435456) != 0 ? null : f13, (i16 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : f14, (i16 & 1073741824) != 0 ? null : str16, (i16 & Integer.MIN_VALUE) != 0 ? null : bigDecimal2, (i17 & 1) != 0 ? null : str17, (i17 & 2) != 0 ? null : str18, (i17 & 4) != 0 ? null : bigDecimal3, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? null : str19, (i17 & 32) != 0 ? null : str20, (i17 & 64) != 0 ? null : bigDecimal4, (i17 & 128) != 0 ? null : num6, (i17 & 256) != 0 ? null : str21, (i17 & 512) != 0 ? null : bigDecimal5, (i17 & 1024) != 0 ? null : str22, (i17 & 2048) != 0 ? null : str23, (i17 & 4096) != 0 ? null : bigDecimal6, (i17 & 8192) != 0 ? BigDecimal.ZERO : bigDecimal7, (i17 & 16384) != 0 ? BigDecimal.ZERO : bigDecimal8, (i17 & 32768) != 0 ? 4 : i14, (i17 & 65536) != 0 ? null : num7, (i17 & 131072) != 0 ? null : couponReward, (i17 & 262144) != 0 ? null : str24, (i17 & 524288) != 0 ? null : bigDecimal9, (i17 & 1048576) != 0 ? null : str25, (i17 & 2097152) != 0 ? null : bool, (i17 & 4194304) != 0 ? null : l13, (i17 & 8388608) != 0 ? null : l14, (i17 & 16777216) != 0 ? null : bigDecimal10, (i17 & 33554432) != 0 ? null : str26, (i17 & 67108864) != 0 ? null : bigDecimal11, (i17 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str27, (i17 & 268435456) != 0 ? null : str28, (i17 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str29, (i17 & 1073741824) != 0 ? null : str30, (i17 & Integer.MIN_VALUE) != 0 ? null : str31, (i18 & 1) != 0 ? null : str32, (i18 & 2) != 0 ? null : num8, (i18 & 4) != 0 ? 0 : i15, (i18 & 8) != 0 ? null : str33, (i18 & 16) != 0 ? null : str34);
    }
}
