package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33616e0;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.base.order.data.ActiveOrdersData$OrderItem, reason: from toString */
/* JADX INFO: compiled from: ActiveOrdersData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0003\b\u008a\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\n\u0012\b\u0010)\u001a\u0004\u0018\u00010\n\u0012\b\u0010*\u001a\u0004\u0018\u00010\n\u0012\b\u0010+\u001a\u0004\u0018\u00010\n\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\n\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\n\u0012\b\u00101\u001a\u0004\u0018\u00010\u0011\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b6\u00107J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010GJ\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010GJ\u0010\u0010~\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010MJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010MJ\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÐ\u0004\u0010\u009e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u009f\u0001J\b\u0010 \u0001\u001a\u00030¡\u0001J\u0016\u0010¢\u0001\u001a\u00020\u00162\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001HÖ\u0003J\u000b\u0010¥\u0001\u001a\u00030¡\u0001HÖ\u0001J\n\u0010¦\u0001\u001a\u00020\u0003HÖ\u0001J\u001c\u0010§\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030ª\u00012\b\u0010«\u0001\u001a\u00030¡\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00109R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00109R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00109R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010H\u001a\u0004\bK\u0010GR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010N\u001a\u0004\bO\u0010MR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010N\u001a\u0004\bP\u0010MR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00109R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00109R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010H\u001a\u0004\bS\u0010GR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010H\u001a\u0004\bT\u0010GR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00109R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00109R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00109R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00109R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00109R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u00109R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00109R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u00109R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u00109R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u00109R\u0013\u0010(\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b`\u0010@R\u0013\u0010)\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\ba\u0010@R\u0013\u0010*\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bb\u0010@R\u0013\u0010+\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bc\u0010@R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u00109R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u00109R\u0013\u0010.\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bf\u0010@R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u00109R\u0013\u00100\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bh\u0010@R\u0015\u00101\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010H\u001a\u0004\bi\u0010GR\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u00109R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u00109R\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u00109R\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u00109¨\u0006¬\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "Landroid/os/Parcelable;", "orderId", "", "clientOid", "symbol", "side", "orderType", "orderDisplayType", "size", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "funds", "timeInForce", AppsFlyerProperties.CHANNEL, C33616e0.f69644s, "orderTime", "", "tradeSource", "stp", "cancelAfter", "postOnly", "", ViewProps.HIDDEN, "iceberg", "visibleSize", "matchOrderId", "clientTimestamp", "allowMaxTimeWindow", "sizeUnit", "triggerDirection", "triggerPrice", "triggerPriceType", "tpTriggerPrice", "tpTriggerPriceType", "tpOrderPrice", "slTriggerPrice", "slTriggerPriceType", "slOrderPrice", "status", "filledFunds", "filledSize", "avgPrice", "fee", "feeCurrency", "feeRates", FirebaseAnalytics.Param.TAX, "taxCurrency", "taxRates", "updatedTime", "triggerOrderId", "dcSize", "cancelReason", "cancelSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getClientOid", "getSymbol", "getSide", "getOrderType", "getOrderDisplayType", "getSize", "()Ljava/math/BigDecimal;", "getPrice", "getFunds", "getTimeInForce", "getChannel", "getTags", "getOrderTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTradeSource", "getStp", "getCancelAfter", "getPostOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHidden", "getIceberg", "getVisibleSize", "getMatchOrderId", "getClientTimestamp", "getAllowMaxTimeWindow", "getSizeUnit", "getTriggerDirection", "getTriggerPrice", "getTriggerPriceType", "getTpTriggerPrice", "getTpTriggerPriceType", "getTpOrderPrice", "getSlTriggerPrice", "getSlTriggerPriceType", "getSlOrderPrice", "getStatus", "getFilledFunds", "getFilledSize", "getAvgPrice", "getFee", "getFeeCurrency", "getFeeRates", "getTax", "getTaxCurrency", "getTaxRates", "getUpdatedTime", "getTriggerOrderId", "getDcSize", "getCancelReason", "getCancelSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderItem> CREATOR = new C11598a();

    @Nullable
    private final Long allowMaxTimeWindow;

    @Nullable
    private final BigDecimal avgPrice;

    @Nullable
    private final Long cancelAfter;

    @Nullable
    private final String cancelReason;

    @Nullable
    private final String cancelSize;

    @Nullable
    private final String channel;

    @Nullable
    private final String clientOid;

    @Nullable
    private final Long clientTimestamp;

    @Nullable
    private final String dcSize;

    @Nullable
    private final BigDecimal fee;

    @Nullable
    private final String feeCurrency;

    @Nullable
    private final String feeRates;

    @Nullable
    private final BigDecimal filledFunds;

    @Nullable
    private final BigDecimal filledSize;

    @Nullable
    private final BigDecimal funds;

    @Nullable
    private final Boolean hidden;

    @Nullable
    private final Boolean iceberg;

    @Nullable
    private final String matchOrderId;

    @Nullable
    private final String orderDisplayType;

    @Nullable
    private final String orderId;

    @Nullable
    private final Long orderTime;

    @Nullable
    private final String orderType;

    @Nullable
    private final Boolean postOnly;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final String sizeUnit;

    @Nullable
    private final String slOrderPrice;

    @Nullable
    private final String slTriggerPrice;

    @Nullable
    private final String slTriggerPriceType;

    @Nullable
    private final String status;

    @Nullable
    private final String stp;

    @Nullable
    private final String symbol;

    @Nullable
    private final String tags;

    @Nullable
    private final BigDecimal tax;

    @Nullable
    private final String taxCurrency;

    @Nullable
    private final BigDecimal taxRates;

    @Nullable
    private final String timeInForce;

    @Nullable
    private final String tpOrderPrice;

    @Nullable
    private final String tpTriggerPrice;

    @Nullable
    private final String tpTriggerPriceType;

    @Nullable
    private final String tradeSource;

    @Nullable
    private final String triggerDirection;

    @Nullable
    private final String triggerOrderId;

    @Nullable
    private final BigDecimal triggerPrice;

    @Nullable
    private final String triggerPriceType;

    @Nullable
    private final Long updatedTime;

    @Nullable
    private final String visibleSize;

    /* JADX INFO: renamed from: com.kubi.core.base.order.data.ActiveOrdersData$OrderItem$a */
    /* JADX INFO: compiled from: ActiveOrdersData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11598a implements Parcelable.Creator<OrderItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
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
            return new OrderItem(string, string2, string3, string4, string5, string6, bigDecimal, bigDecimal2, bigDecimal3, string7, string8, string9, lValueOf, string10, string11, lValueOf2, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderItem[] newArray(int i11) {
            return new OrderItem[i11];
        }
    }

    public OrderItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l11, @Nullable String str10, @Nullable String str11, @Nullable Long l12, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str12, @Nullable String str13, @Nullable Long l13, @Nullable Long l14, @Nullable String str14, @Nullable String str15, @Nullable BigDecimal bigDecimal4, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable String str24, @Nullable String str25, @Nullable BigDecimal bigDecimal9, @Nullable String str26, @Nullable BigDecimal bigDecimal10, @Nullable Long l15, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30) {
        this.orderId = str;
        this.clientOid = str2;
        this.symbol = str3;
        this.side = str4;
        this.orderType = str5;
        this.orderDisplayType = str6;
        this.size = bigDecimal;
        this.price = bigDecimal2;
        this.funds = bigDecimal3;
        this.timeInForce = str7;
        this.channel = str8;
        this.tags = str9;
        this.orderTime = l11;
        this.tradeSource = str10;
        this.stp = str11;
        this.cancelAfter = l12;
        this.postOnly = bool;
        this.hidden = bool2;
        this.iceberg = bool3;
        this.visibleSize = str12;
        this.matchOrderId = str13;
        this.clientTimestamp = l13;
        this.allowMaxTimeWindow = l14;
        this.sizeUnit = str14;
        this.triggerDirection = str15;
        this.triggerPrice = bigDecimal4;
        this.triggerPriceType = str16;
        this.tpTriggerPrice = str17;
        this.tpTriggerPriceType = str18;
        this.tpOrderPrice = str19;
        this.slTriggerPrice = str20;
        this.slTriggerPriceType = str21;
        this.slOrderPrice = str22;
        this.status = str23;
        this.filledFunds = bigDecimal5;
        this.filledSize = bigDecimal6;
        this.avgPrice = bigDecimal7;
        this.fee = bigDecimal8;
        this.feeCurrency = str24;
        this.feeRates = str25;
        this.tax = bigDecimal9;
        this.taxCurrency = str26;
        this.taxRates = bigDecimal10;
        this.updatedTime = l15;
        this.triggerOrderId = str27;
        this.dcSize = str28;
        this.cancelReason = str29;
        this.cancelSize = str30;
    }

    @NotNull
    public final OrderItem copy(@Nullable String orderId, @Nullable String clientOid, @Nullable String symbol, @Nullable String side, @Nullable String orderType, @Nullable String orderDisplayType, @Nullable BigDecimal size, @Nullable BigDecimal price, @Nullable BigDecimal funds, @Nullable String timeInForce, @Nullable String channel, @Nullable String tags, @Nullable Long orderTime, @Nullable String tradeSource, @Nullable String stp, @Nullable Long cancelAfter, @Nullable Boolean postOnly, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String visibleSize, @Nullable String matchOrderId, @Nullable Long clientTimestamp, @Nullable Long allowMaxTimeWindow, @Nullable String sizeUnit, @Nullable String triggerDirection, @Nullable BigDecimal triggerPrice, @Nullable String triggerPriceType, @Nullable String tpTriggerPrice, @Nullable String tpTriggerPriceType, @Nullable String tpOrderPrice, @Nullable String slTriggerPrice, @Nullable String slTriggerPriceType, @Nullable String slOrderPrice, @Nullable String status, @Nullable BigDecimal filledFunds, @Nullable BigDecimal filledSize, @Nullable BigDecimal avgPrice, @Nullable BigDecimal fee, @Nullable String feeCurrency, @Nullable String feeRates, @Nullable BigDecimal tax, @Nullable String taxCurrency, @Nullable BigDecimal taxRates, @Nullable Long updatedTime, @Nullable String triggerOrderId, @Nullable String dcSize, @Nullable String cancelReason, @Nullable String cancelSize) {
        return new OrderItem(orderId, clientOid, symbol, side, orderType, orderDisplayType, size, price, funds, timeInForce, channel, tags, orderTime, tradeSource, stp, cancelAfter, postOnly, hidden, iceberg, visibleSize, matchOrderId, clientTimestamp, allowMaxTimeWindow, sizeUnit, triggerDirection, triggerPrice, triggerPriceType, tpTriggerPrice, tpTriggerPriceType, tpOrderPrice, slTriggerPrice, slTriggerPriceType, slOrderPrice, status, filledFunds, filledSize, avgPrice, fee, feeCurrency, feeRates, tax, taxCurrency, taxRates, updatedTime, triggerOrderId, dcSize, cancelReason, cancelSize);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderItem)) {
            return false;
        }
        OrderItem orderItem = (OrderItem) other;
        return Intrinsics.areEqual(this.orderId, orderItem.orderId) && Intrinsics.areEqual(this.clientOid, orderItem.clientOid) && Intrinsics.areEqual(this.symbol, orderItem.symbol) && Intrinsics.areEqual(this.side, orderItem.side) && Intrinsics.areEqual(this.orderType, orderItem.orderType) && Intrinsics.areEqual(this.orderDisplayType, orderItem.orderDisplayType) && Intrinsics.areEqual(this.size, orderItem.size) && Intrinsics.areEqual(this.price, orderItem.price) && Intrinsics.areEqual(this.funds, orderItem.funds) && Intrinsics.areEqual(this.timeInForce, orderItem.timeInForce) && Intrinsics.areEqual(this.channel, orderItem.channel) && Intrinsics.areEqual(this.tags, orderItem.tags) && Intrinsics.areEqual(this.orderTime, orderItem.orderTime) && Intrinsics.areEqual(this.tradeSource, orderItem.tradeSource) && Intrinsics.areEqual(this.stp, orderItem.stp) && Intrinsics.areEqual(this.cancelAfter, orderItem.cancelAfter) && Intrinsics.areEqual(this.postOnly, orderItem.postOnly) && Intrinsics.areEqual(this.hidden, orderItem.hidden) && Intrinsics.areEqual(this.iceberg, orderItem.iceberg) && Intrinsics.areEqual(this.visibleSize, orderItem.visibleSize) && Intrinsics.areEqual(this.matchOrderId, orderItem.matchOrderId) && Intrinsics.areEqual(this.clientTimestamp, orderItem.clientTimestamp) && Intrinsics.areEqual(this.allowMaxTimeWindow, orderItem.allowMaxTimeWindow) && Intrinsics.areEqual(this.sizeUnit, orderItem.sizeUnit) && Intrinsics.areEqual(this.triggerDirection, orderItem.triggerDirection) && Intrinsics.areEqual(this.triggerPrice, orderItem.triggerPrice) && Intrinsics.areEqual(this.triggerPriceType, orderItem.triggerPriceType) && Intrinsics.areEqual(this.tpTriggerPrice, orderItem.tpTriggerPrice) && Intrinsics.areEqual(this.tpTriggerPriceType, orderItem.tpTriggerPriceType) && Intrinsics.areEqual(this.tpOrderPrice, orderItem.tpOrderPrice) && Intrinsics.areEqual(this.slTriggerPrice, orderItem.slTriggerPrice) && Intrinsics.areEqual(this.slTriggerPriceType, orderItem.slTriggerPriceType) && Intrinsics.areEqual(this.slOrderPrice, orderItem.slOrderPrice) && Intrinsics.areEqual(this.status, orderItem.status) && Intrinsics.areEqual(this.filledFunds, orderItem.filledFunds) && Intrinsics.areEqual(this.filledSize, orderItem.filledSize) && Intrinsics.areEqual(this.avgPrice, orderItem.avgPrice) && Intrinsics.areEqual(this.fee, orderItem.fee) && Intrinsics.areEqual(this.feeCurrency, orderItem.feeCurrency) && Intrinsics.areEqual(this.feeRates, orderItem.feeRates) && Intrinsics.areEqual(this.tax, orderItem.tax) && Intrinsics.areEqual(this.taxCurrency, orderItem.taxCurrency) && Intrinsics.areEqual(this.taxRates, orderItem.taxRates) && Intrinsics.areEqual(this.updatedTime, orderItem.updatedTime) && Intrinsics.areEqual(this.triggerOrderId, orderItem.triggerOrderId) && Intrinsics.areEqual(this.dcSize, orderItem.dcSize) && Intrinsics.areEqual(this.cancelReason, orderItem.cancelReason) && Intrinsics.areEqual(this.cancelSize, orderItem.cancelSize);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTags() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTradeSource() {
        return this.tradeSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStp() {
        return this.stp;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getCancelAfter() {
        return this.cancelAfter;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientOid() {
        return this.clientOid;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getMatchOrderId() {
        return this.matchOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getClientTimestamp() {
        return this.clientTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getAllowMaxTimeWindow() {
        return this.allowMaxTimeWindow;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getTpOrderPrice() {
        return this.tpOrderPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getSlOrderPrice() {
        return this.slOrderPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getFilledFunds() {
        return this.filledFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final BigDecimal getFilledSize() {
        return this.filledSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getFeeRates() {
        return this.feeRates;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final BigDecimal getTaxRates() {
        return this.taxRates;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getTriggerOrderId() {
        return this.triggerOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getDcSize() {
        return this.dcSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getCancelSize() {
        return this.cancelSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getFunds() {
        return this.funds;
    }

    @Nullable
    public final Long getAllowMaxTimeWindow() {
        return this.allowMaxTimeWindow;
    }

    @Nullable
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    public final Long getCancelAfter() {
        return this.cancelAfter;
    }

    @Nullable
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    public final String getCancelSize() {
        return this.cancelSize;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getClientOid() {
        return this.clientOid;
    }

    @Nullable
    public final Long getClientTimestamp() {
        return this.clientTimestamp;
    }

    @Nullable
    public final String getDcSize() {
        return this.dcSize;
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
    public final String getFeeRates() {
        return this.feeRates;
    }

    @Nullable
    public final BigDecimal getFilledFunds() {
        return this.filledFunds;
    }

    @Nullable
    public final BigDecimal getFilledSize() {
        return this.filledSize;
    }

    @Nullable
    public final BigDecimal getFunds() {
        return this.funds;
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
    public final String getMatchOrderId() {
        return this.matchOrderId;
    }

    @Nullable
    public final String getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
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
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @Nullable
    public final String getSlOrderPrice() {
        return this.slOrderPrice;
    }

    @Nullable
    public final String getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStp() {
        return this.stp;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
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
    public final BigDecimal getTaxRates() {
        return this.taxRates;
    }

    @Nullable
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    public final String getTpOrderPrice() {
        return this.tpOrderPrice;
    }

    @Nullable
    public final String getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @Nullable
    public final String getTradeSource() {
        return this.tradeSource;
    }

    @Nullable
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    public final String getTriggerOrderId() {
        return this.triggerOrderId;
    }

    @Nullable
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    @Nullable
    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    @Nullable
    public final String getVisibleSize() {
        return this.visibleSize;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientOid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.side;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderDisplayType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal = this.size;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.funds;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str7 = this.timeInForce;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.channel;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tags;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l11 = this.orderTime;
        int iHashCode13 = (iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str10 = this.tradeSource;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.stp;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l12 = this.cancelAfter;
        int iHashCode16 = (iHashCode15 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool = this.postOnly;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hidden;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.iceberg;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str12 = this.visibleSize;
        int iHashCode20 = (iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.matchOrderId;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l13 = this.clientTimestamp;
        int iHashCode22 = (iHashCode21 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.allowMaxTimeWindow;
        int iHashCode23 = (iHashCode22 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str14 = this.sizeUnit;
        int iHashCode24 = (iHashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.triggerDirection;
        int iHashCode25 = (iHashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.triggerPrice;
        int iHashCode26 = (iHashCode25 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str16 = this.triggerPriceType;
        int iHashCode27 = (iHashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.tpTriggerPrice;
        int iHashCode28 = (iHashCode27 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tpTriggerPriceType;
        int iHashCode29 = (iHashCode28 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.tpOrderPrice;
        int iHashCode30 = (iHashCode29 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.slTriggerPrice;
        int iHashCode31 = (iHashCode30 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.slTriggerPriceType;
        int iHashCode32 = (iHashCode31 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.slOrderPrice;
        int iHashCode33 = (iHashCode32 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.status;
        int iHashCode34 = (iHashCode33 + (str23 == null ? 0 : str23.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.filledFunds;
        int iHashCode35 = (iHashCode34 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.filledSize;
        int iHashCode36 = (iHashCode35 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.avgPrice;
        int iHashCode37 = (iHashCode36 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.fee;
        int iHashCode38 = (iHashCode37 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str24 = this.feeCurrency;
        int iHashCode39 = (iHashCode38 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.feeRates;
        int iHashCode40 = (iHashCode39 + (str25 == null ? 0 : str25.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.tax;
        int iHashCode41 = (iHashCode40 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str26 = this.taxCurrency;
        int iHashCode42 = (iHashCode41 + (str26 == null ? 0 : str26.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.taxRates;
        int iHashCode43 = (iHashCode42 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        Long l15 = this.updatedTime;
        int iHashCode44 = (iHashCode43 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str27 = this.triggerOrderId;
        int iHashCode45 = (iHashCode44 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.dcSize;
        int iHashCode46 = (iHashCode45 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.cancelReason;
        int iHashCode47 = (iHashCode46 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.cancelSize;
        return iHashCode47 + (str30 != null ? str30.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderItem(orderId=" + this.orderId + ", clientOid=" + this.clientOid + ", symbol=" + this.symbol + ", side=" + this.side + ", orderType=" + this.orderType + ", orderDisplayType=" + this.orderDisplayType + ", size=" + this.size + ", price=" + this.price + ", funds=" + this.funds + ", timeInForce=" + this.timeInForce + ", channel=" + this.channel + ", tags=" + this.tags + ", orderTime=" + this.orderTime + ", tradeSource=" + this.tradeSource + ", stp=" + this.stp + ", cancelAfter=" + this.cancelAfter + ", postOnly=" + this.postOnly + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", visibleSize=" + this.visibleSize + ", matchOrderId=" + this.matchOrderId + ", clientTimestamp=" + this.clientTimestamp + ", allowMaxTimeWindow=" + this.allowMaxTimeWindow + ", sizeUnit=" + this.sizeUnit + ", triggerDirection=" + this.triggerDirection + ", triggerPrice=" + this.triggerPrice + ", triggerPriceType=" + this.triggerPriceType + ", tpTriggerPrice=" + this.tpTriggerPrice + ", tpTriggerPriceType=" + this.tpTriggerPriceType + ", tpOrderPrice=" + this.tpOrderPrice + ", slTriggerPrice=" + this.slTriggerPrice + ", slTriggerPriceType=" + this.slTriggerPriceType + ", slOrderPrice=" + this.slOrderPrice + ", status=" + this.status + ", filledFunds=" + this.filledFunds + ", filledSize=" + this.filledSize + ", avgPrice=" + this.avgPrice + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", feeRates=" + this.feeRates + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", taxRates=" + this.taxRates + ", updatedTime=" + this.updatedTime + ", triggerOrderId=" + this.triggerOrderId + ", dcSize=" + this.dcSize + ", cancelReason=" + this.cancelReason + ", cancelSize=" + this.cancelSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.clientOid);
        dest.writeString(this.symbol);
        dest.writeString(this.side);
        dest.writeString(this.orderType);
        dest.writeString(this.orderDisplayType);
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.funds);
        dest.writeString(this.timeInForce);
        dest.writeString(this.channel);
        dest.writeString(this.tags);
        Long l11 = this.orderTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.tradeSource);
        dest.writeString(this.stp);
        Long l12 = this.cancelAfter;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Boolean bool = this.postOnly;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hidden;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.iceberg;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.visibleSize);
        dest.writeString(this.matchOrderId);
        Long l13 = this.clientTimestamp;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        Long l14 = this.allowMaxTimeWindow;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        dest.writeString(this.sizeUnit);
        dest.writeString(this.triggerDirection);
        dest.writeSerializable(this.triggerPrice);
        dest.writeString(this.triggerPriceType);
        dest.writeString(this.tpTriggerPrice);
        dest.writeString(this.tpTriggerPriceType);
        dest.writeString(this.tpOrderPrice);
        dest.writeString(this.slTriggerPrice);
        dest.writeString(this.slTriggerPriceType);
        dest.writeString(this.slOrderPrice);
        dest.writeString(this.status);
        dest.writeSerializable(this.filledFunds);
        dest.writeSerializable(this.filledSize);
        dest.writeSerializable(this.avgPrice);
        dest.writeSerializable(this.fee);
        dest.writeString(this.feeCurrency);
        dest.writeString(this.feeRates);
        dest.writeSerializable(this.tax);
        dest.writeString(this.taxCurrency);
        dest.writeSerializable(this.taxRates);
        Long l15 = this.updatedTime;
        if (l15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l15.longValue());
        }
        dest.writeString(this.triggerOrderId);
        dest.writeString(this.dcSize);
        dest.writeString(this.cancelReason);
        dest.writeString(this.cancelSize);
    }

    public /* synthetic */ OrderItem(String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str7, String str8, String str9, Long l11, String str10, String str11, Long l12, Boolean bool, Boolean bool2, Boolean bool3, String str12, String str13, Long l13, Long l14, String str14, String str15, BigDecimal bigDecimal4, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str24, String str25, BigDecimal bigDecimal9, String str26, BigDecimal bigDecimal10, Long l15, String str27, String str28, String str29, String str30, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, bigDecimal, bigDecimal2, bigDecimal3, str7, str8, str9, l11, str10, str11, l12, bool, bool2, bool3, str12, str13, l13, l14, str14, str15, bigDecimal4, str16, str17, str18, str19, str20, str21, str22, str23, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, str24, str25, bigDecimal9, str26, bigDecimal10, l15, str27, str28, str29, str30);
    }
}
