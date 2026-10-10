package com.kubi.kumex.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContractEntityOpenData.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0003\b¥\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\b\b\u0002\u0010/\u001a\u00020\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b6\u00107J\u0007\u0010\u009f\u0001\u001a\u00020\u0005J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\fHÆ\u0003J\n\u0010¨\u0001\u001a\u00020\fHÆ\u0003J\n\u0010©\u0001\u001a\u00020\fHÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\fHÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¿\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010|J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020.HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J°\u0004\u0010Ï\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0003\u0010Ð\u0001J\u0007\u0010Ñ\u0001\u001a\u00020.J\u0016\u0010Ò\u0001\u001a\u00020\u00052\n\u0010Ó\u0001\u001a\u0005\u0018\u00010Ô\u0001HÖ\u0003J\n\u0010Õ\u0001\u001a\u00020.HÖ\u0001J\n\u0010Ö\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010×\u0001\u001a\u00030Ø\u00012\b\u0010Ù\u0001\u001a\u00030Ú\u00012\u0007\u0010Û\u0001\u001a\u00020.R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00109\"\u0004\b@\u0010;R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00109\"\u0004\bB\u0010;R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00109\"\u0004\bD\u0010;R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00109\"\u0004\bF\u0010;R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00109\"\u0004\bH\u0010;R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010J\"\u0004\bN\u0010LR\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00109\"\u0004\bR\u0010;R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010J\"\u0004\bT\u0010LR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00109\"\u0004\bV\u0010;R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00109\"\u0004\bX\u0010;R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00109\"\u0004\bZ\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00109\"\u0004\b\\\u0010;R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010<\"\u0004\ba\u0010>R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010<\"\u0004\bb\u0010>R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010^\"\u0004\bf\u0010`R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010^\"\u0004\bj\u0010`R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00109\"\u0004\bl\u0010;R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010^\"\u0004\bn\u0010`R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010^\"\u0004\bp\u0010`R\u001c\u0010 \u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010^\"\u0004\br\u0010`R\u001c\u0010!\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010^\"\u0004\bt\u0010`R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010^\"\u0004\bv\u0010`R\u001c\u0010#\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010^\"\u0004\bx\u0010`R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u00109\"\u0004\bz\u0010;R\u001e\u0010%\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u007f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001e\u0010&\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010^\"\u0005\b\u0081\u0001\u0010`R\u001e\u0010'\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010^\"\u0005\b\u0083\u0001\u0010`R\u001e\u0010(\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010^\"\u0005\b\u0085\u0001\u0010`R\u001e\u0010)\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010^\"\u0005\b\u0087\u0001\u0010`R\u001e\u0010*\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010^\"\u0005\b\u0089\u0001\u0010`R\u001e\u0010+\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010^\"\u0005\b\u008b\u0001\u0010`R\u001c\u0010,\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010<\"\u0005\b\u008d\u0001\u0010>R\u001e\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010/\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b/\u0010<\"\u0005\b\u0092\u0001\u0010>R\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u00109\"\u0005\b\u0094\u0001\u0010;R\u001e\u00101\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010^\"\u0005\b\u0096\u0001\u0010`R\u001e\u00102\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010^\"\u0005\b\u0098\u0001\u0010`R\u001e\u00103\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010^\"\u0005\b\u009a\u0001\u0010`R\u001e\u00104\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010^\"\u0005\b\u009c\u0001\u0010`R\u001e\u00105\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010^\"\u0005\b\u009e\u0001\u0010`¨\u0006Ü\u0001"}, m90084d2 = {"Lcom/kubi/kumex/entity/ContractEntityOpenData;", "Landroid/os/Parcelable;", "type", "", "isInverse", "", "symbol", "rootSymbol", "baseCurrency", "quoteCurrency", "status", "createdAt", "", "expireDate", "updatedAt", "fairMethod", "firstOpenDate", "fundingBaseSymbol", "fundingQuoteSymbol", "fundingRateSymbol", "indexSymbol", "initialMargin", "Ljava/math/BigDecimal;", "isDeleverage", "isQuanto", "lotSize", "maintainMargin", "makerFeeRate", "makerFixFee", "markMethod", "maxOrderQty", "indexPriceTickSize", "maxPrice", "maxRiskLimit", "minRiskLimit", "riskStep", "settleCurrency", "settleDate", "settlementFee", "takerFeeRate", "takerFixFee", "tickSize", "multiplier", "maxLeverage", "supportGridTrading", "stepRiskLimitStatus", "", "isTrialFunds", "spotCurrency", "k", "m", "f", "mmrLimit", "mmrLevConstant", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "()Z", "setInverse", "(Z)V", "getSymbol", "setSymbol", "getRootSymbol", "setRootSymbol", "getBaseCurrency", "setBaseCurrency", "getQuoteCurrency", "setQuoteCurrency", "getStatus", "setStatus", "getCreatedAt", "()J", "setCreatedAt", "(J)V", "getExpireDate", "setExpireDate", "getUpdatedAt", "setUpdatedAt", "getFairMethod", "setFairMethod", "getFirstOpenDate", "setFirstOpenDate", "getFundingBaseSymbol", "setFundingBaseSymbol", "getFundingQuoteSymbol", "setFundingQuoteSymbol", "getFundingRateSymbol", "setFundingRateSymbol", "getIndexSymbol", "setIndexSymbol", "getInitialMargin", "()Ljava/math/BigDecimal;", "setInitialMargin", "(Ljava/math/BigDecimal;)V", "setDeleverage", "setQuanto", "getLotSize", "setLotSize", "getMaintainMargin", "setMaintainMargin", "getMakerFeeRate", "setMakerFeeRate", "getMakerFixFee", "setMakerFixFee", "getMarkMethod", "setMarkMethod", "getMaxOrderQty", "setMaxOrderQty", "getIndexPriceTickSize", "setIndexPriceTickSize", "getMaxPrice", "setMaxPrice", "getMaxRiskLimit", "setMaxRiskLimit", "getMinRiskLimit", "setMinRiskLimit", "getRiskStep", "setRiskStep", "getSettleCurrency", "setSettleCurrency", "getSettleDate", "()Ljava/lang/Long;", "setSettleDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSettlementFee", "setSettlementFee", "getTakerFeeRate", "setTakerFeeRate", "getTakerFixFee", "setTakerFixFee", "getTickSize", "setTickSize", "getMultiplier", "setMultiplier", "getMaxLeverage", "setMaxLeverage", "getSupportGridTrading", "setSupportGridTrading", "getStepRiskLimitStatus", "()I", "setStepRiskLimitStatus", "(I)V", "setTrialFunds", "getSpotCurrency", "setSpotCurrency", "getK", "setK", "getM", "setM", "getF", "setF", "getMmrLimit", "setMmrLimit", "getMmrLevConstant", "setMmrLevConstant", "isForeverContract", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/kumex/entity/ContractEntityOpenData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContractEntityOpenData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContractEntityOpenData> CREATOR = new Creator();

    @Nullable
    private String baseCurrency;
    private long createdAt;
    private long expireDate;

    @Nullable
    private BigDecimal f;

    @Nullable
    private String fairMethod;
    private long firstOpenDate;

    @Nullable
    private String fundingBaseSymbol;

    @Nullable
    private String fundingQuoteSymbol;

    @Nullable
    private String fundingRateSymbol;

    @Nullable
    private BigDecimal indexPriceTickSize;

    @Nullable
    private String indexSymbol;

    @Nullable
    private BigDecimal initialMargin;
    private boolean isDeleverage;
    private boolean isInverse;
    private boolean isQuanto;
    private boolean isTrialFunds;

    @Nullable
    private BigDecimal k;

    @Nullable
    private BigDecimal lotSize;

    @Nullable
    private BigDecimal m;

    @Nullable
    private BigDecimal maintainMargin;

    @Nullable
    private BigDecimal makerFeeRate;

    @Nullable
    private BigDecimal makerFixFee;

    @Nullable
    private String markMethod;

    @Nullable
    private BigDecimal maxLeverage;

    @Nullable
    private BigDecimal maxOrderQty;

    @Nullable
    private BigDecimal maxPrice;

    @Nullable
    private BigDecimal maxRiskLimit;

    @Nullable
    private BigDecimal minRiskLimit;

    @Nullable
    private BigDecimal mmrLevConstant;

    @Nullable
    private BigDecimal mmrLimit;

    @Nullable
    private BigDecimal multiplier;

    @Nullable
    private String quoteCurrency;

    @Nullable
    private BigDecimal riskStep;

    @Nullable
    private String rootSymbol;

    @Nullable
    private String settleCurrency;

    @Nullable
    private Long settleDate;

    @Nullable
    private BigDecimal settlementFee;

    @Nullable
    private String spotCurrency;

    @Nullable
    private String status;
    private int stepRiskLimitStatus;
    private boolean supportGridTrading;

    @Nullable
    private String symbol;

    @Nullable
    private BigDecimal takerFeeRate;

    @Nullable
    private BigDecimal takerFixFee;

    @Nullable
    private BigDecimal tickSize;

    @Nullable
    private String type;
    private long updatedAt;

    /* JADX INFO: compiled from: ContractEntityOpenData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContractEntityOpenData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractEntityOpenData createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z16 = false;
            if (parcel.readInt() != 0) {
                z16 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string2 = parcel.readString();
            boolean z17 = z11;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j11 = parcel.readLong();
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            String string7 = parcel.readString();
            long j14 = parcel.readLong();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z12 = z17;
                z13 = z12;
            } else {
                z12 = z17;
                z13 = z16;
            }
            if (parcel.readInt() == 0) {
                z12 = z16;
            }
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            boolean z18 = z12;
            String string12 = parcel.readString();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            String string13 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal14 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal15 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal16 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal17 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z14 = z18;
                z15 = z14;
            } else {
                z14 = z18;
                z15 = z16;
            }
            return new ContractEntityOpenData(string, z16, string2, string3, string4, string5, string6, j11, j12, j13, string7, j14, string8, string9, string10, string11, bigDecimal, z13, z12, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, string12, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, string13, lValueOf, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, z15, parcel.readInt(), parcel.readInt() != 0 ? z14 : false, parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractEntityOpenData[] newArray(int i11) {
            return new ContractEntityOpenData[i11];
        }
    }

    public ContractEntityOpenData() {
        this(null, false, null, null, null, null, null, 0L, 0L, 0L, null, 0L, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, null, null, null, null, null, null, -1, 32767, null);
    }

    public static /* synthetic */ ContractEntityOpenData copy$default(ContractEntityOpenData contractEntityOpenData, String str, boolean z11, String str2, String str3, String str4, String str5, String str6, long j11, long j12, long j13, String str7, long j14, String str8, String str9, String str10, String str11, BigDecimal bigDecimal, boolean z12, boolean z13, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str12, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, String str13, Long l11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, boolean z14, int i11, boolean z15, String str14, BigDecimal bigDecimal18, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, BigDecimal bigDecimal22, int i12, int i13, Object obj) {
        String str15 = (i12 & 1) != 0 ? contractEntityOpenData.type : str;
        boolean z16 = (i12 & 2) != 0 ? contractEntityOpenData.isInverse : z11;
        return contractEntityOpenData.copy(str15, z16, (i12 & 4) != 0 ? contractEntityOpenData.symbol : str2, (i12 & 8) != 0 ? contractEntityOpenData.rootSymbol : str3, (i12 & 16) != 0 ? contractEntityOpenData.baseCurrency : str4, (i12 & 32) != 0 ? contractEntityOpenData.quoteCurrency : str5, (i12 & 64) != 0 ? contractEntityOpenData.status : str6, (i12 & 128) != 0 ? contractEntityOpenData.createdAt : j11, (i12 & 256) != 0 ? contractEntityOpenData.expireDate : j12, (i12 & 512) != 0 ? contractEntityOpenData.updatedAt : j13, (i12 & 1024) != 0 ? contractEntityOpenData.fairMethod : str7, (i12 & 2048) != 0 ? contractEntityOpenData.firstOpenDate : j14, (i12 & 4096) != 0 ? contractEntityOpenData.fundingBaseSymbol : str8, (i12 & 8192) != 0 ? contractEntityOpenData.fundingQuoteSymbol : str9, (i12 & 16384) != 0 ? contractEntityOpenData.fundingRateSymbol : str10, (i12 & 32768) != 0 ? contractEntityOpenData.indexSymbol : str11, (i12 & 65536) != 0 ? contractEntityOpenData.initialMargin : bigDecimal, (i12 & 131072) != 0 ? contractEntityOpenData.isDeleverage : z12, (i12 & 262144) != 0 ? contractEntityOpenData.isQuanto : z13, (i12 & 524288) != 0 ? contractEntityOpenData.lotSize : bigDecimal2, (i12 & 1048576) != 0 ? contractEntityOpenData.maintainMargin : bigDecimal3, (i12 & 2097152) != 0 ? contractEntityOpenData.makerFeeRate : bigDecimal4, (i12 & 4194304) != 0 ? contractEntityOpenData.makerFixFee : bigDecimal5, (i12 & 8388608) != 0 ? contractEntityOpenData.markMethod : str12, (i12 & 16777216) != 0 ? contractEntityOpenData.maxOrderQty : bigDecimal6, (i12 & 33554432) != 0 ? contractEntityOpenData.indexPriceTickSize : bigDecimal7, (i12 & 67108864) != 0 ? contractEntityOpenData.maxPrice : bigDecimal8, (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? contractEntityOpenData.maxRiskLimit : bigDecimal9, (i12 & 268435456) != 0 ? contractEntityOpenData.minRiskLimit : bigDecimal10, (i12 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? contractEntityOpenData.riskStep : bigDecimal11, (i12 & 1073741824) != 0 ? contractEntityOpenData.settleCurrency : str13, (i12 & Integer.MIN_VALUE) != 0 ? contractEntityOpenData.settleDate : l11, (i13 & 1) != 0 ? contractEntityOpenData.settlementFee : bigDecimal12, (i13 & 2) != 0 ? contractEntityOpenData.takerFeeRate : bigDecimal13, (i13 & 4) != 0 ? contractEntityOpenData.takerFixFee : bigDecimal14, (i13 & 8) != 0 ? contractEntityOpenData.tickSize : bigDecimal15, (i13 & 16) != 0 ? contractEntityOpenData.multiplier : bigDecimal16, (i13 & 32) != 0 ? contractEntityOpenData.maxLeverage : bigDecimal17, (i13 & 64) != 0 ? contractEntityOpenData.supportGridTrading : z14, (i13 & 128) != 0 ? contractEntityOpenData.stepRiskLimitStatus : i11, (i13 & 256) != 0 ? contractEntityOpenData.isTrialFunds : z15, (i13 & 512) != 0 ? contractEntityOpenData.spotCurrency : str14, (i13 & 1024) != 0 ? contractEntityOpenData.k : bigDecimal18, (i13 & 2048) != 0 ? contractEntityOpenData.m : bigDecimal19, (i13 & 4096) != 0 ? contractEntityOpenData.f : bigDecimal20, (i13 & 8192) != 0 ? contractEntityOpenData.mmrLimit : bigDecimal21, (i13 & 16384) != 0 ? contractEntityOpenData.mmrLevConstant : bigDecimal22);
    }

    @NotNull
    public final ContractEntityOpenData copy(@Nullable String type, boolean isInverse, @Nullable String symbol, @Nullable String rootSymbol, @Nullable String baseCurrency, @Nullable String quoteCurrency, @Nullable String status, long createdAt, long expireDate, long updatedAt, @Nullable String fairMethod, long firstOpenDate, @Nullable String fundingBaseSymbol, @Nullable String fundingQuoteSymbol, @Nullable String fundingRateSymbol, @Nullable String indexSymbol, @Nullable BigDecimal initialMargin, boolean isDeleverage, boolean isQuanto, @Nullable BigDecimal lotSize, @Nullable BigDecimal maintainMargin, @Nullable BigDecimal makerFeeRate, @Nullable BigDecimal makerFixFee, @Nullable String markMethod, @Nullable BigDecimal maxOrderQty, @Nullable BigDecimal indexPriceTickSize, @Nullable BigDecimal maxPrice, @Nullable BigDecimal maxRiskLimit, @Nullable BigDecimal minRiskLimit, @Nullable BigDecimal riskStep, @Nullable String settleCurrency, @Nullable Long settleDate, @Nullable BigDecimal settlementFee, @Nullable BigDecimal takerFeeRate, @Nullable BigDecimal takerFixFee, @Nullable BigDecimal tickSize, @Nullable BigDecimal multiplier, @Nullable BigDecimal maxLeverage, boolean supportGridTrading, int stepRiskLimitStatus, boolean isTrialFunds, @Nullable String spotCurrency, @Nullable BigDecimal k11, @Nullable BigDecimal m11, @Nullable BigDecimal f11, @Nullable BigDecimal mmrLimit, @Nullable BigDecimal mmrLevConstant) {
        return new ContractEntityOpenData(type, isInverse, symbol, rootSymbol, baseCurrency, quoteCurrency, status, createdAt, expireDate, updatedAt, fairMethod, firstOpenDate, fundingBaseSymbol, fundingQuoteSymbol, fundingRateSymbol, indexSymbol, initialMargin, isDeleverage, isQuanto, lotSize, maintainMargin, makerFeeRate, makerFixFee, markMethod, maxOrderQty, indexPriceTickSize, maxPrice, maxRiskLimit, minRiskLimit, riskStep, settleCurrency, settleDate, settlementFee, takerFeeRate, takerFixFee, tickSize, multiplier, maxLeverage, supportGridTrading, stepRiskLimitStatus, isTrialFunds, spotCurrency, k11, m11, f11, mmrLimit, mmrLevConstant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractEntityOpenData)) {
            return false;
        }
        ContractEntityOpenData contractEntityOpenData = (ContractEntityOpenData) other;
        return Intrinsics.areEqual(this.type, contractEntityOpenData.type) && this.isInverse == contractEntityOpenData.isInverse && Intrinsics.areEqual(this.symbol, contractEntityOpenData.symbol) && Intrinsics.areEqual(this.rootSymbol, contractEntityOpenData.rootSymbol) && Intrinsics.areEqual(this.baseCurrency, contractEntityOpenData.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, contractEntityOpenData.quoteCurrency) && Intrinsics.areEqual(this.status, contractEntityOpenData.status) && this.createdAt == contractEntityOpenData.createdAt && this.expireDate == contractEntityOpenData.expireDate && this.updatedAt == contractEntityOpenData.updatedAt && Intrinsics.areEqual(this.fairMethod, contractEntityOpenData.fairMethod) && this.firstOpenDate == contractEntityOpenData.firstOpenDate && Intrinsics.areEqual(this.fundingBaseSymbol, contractEntityOpenData.fundingBaseSymbol) && Intrinsics.areEqual(this.fundingQuoteSymbol, contractEntityOpenData.fundingQuoteSymbol) && Intrinsics.areEqual(this.fundingRateSymbol, contractEntityOpenData.fundingRateSymbol) && Intrinsics.areEqual(this.indexSymbol, contractEntityOpenData.indexSymbol) && Intrinsics.areEqual(this.initialMargin, contractEntityOpenData.initialMargin) && this.isDeleverage == contractEntityOpenData.isDeleverage && this.isQuanto == contractEntityOpenData.isQuanto && Intrinsics.areEqual(this.lotSize, contractEntityOpenData.lotSize) && Intrinsics.areEqual(this.maintainMargin, contractEntityOpenData.maintainMargin) && Intrinsics.areEqual(this.makerFeeRate, contractEntityOpenData.makerFeeRate) && Intrinsics.areEqual(this.makerFixFee, contractEntityOpenData.makerFixFee) && Intrinsics.areEqual(this.markMethod, contractEntityOpenData.markMethod) && Intrinsics.areEqual(this.maxOrderQty, contractEntityOpenData.maxOrderQty) && Intrinsics.areEqual(this.indexPriceTickSize, contractEntityOpenData.indexPriceTickSize) && Intrinsics.areEqual(this.maxPrice, contractEntityOpenData.maxPrice) && Intrinsics.areEqual(this.maxRiskLimit, contractEntityOpenData.maxRiskLimit) && Intrinsics.areEqual(this.minRiskLimit, contractEntityOpenData.minRiskLimit) && Intrinsics.areEqual(this.riskStep, contractEntityOpenData.riskStep) && Intrinsics.areEqual(this.settleCurrency, contractEntityOpenData.settleCurrency) && Intrinsics.areEqual(this.settleDate, contractEntityOpenData.settleDate) && Intrinsics.areEqual(this.settlementFee, contractEntityOpenData.settlementFee) && Intrinsics.areEqual(this.takerFeeRate, contractEntityOpenData.takerFeeRate) && Intrinsics.areEqual(this.takerFixFee, contractEntityOpenData.takerFixFee) && Intrinsics.areEqual(this.tickSize, contractEntityOpenData.tickSize) && Intrinsics.areEqual(this.multiplier, contractEntityOpenData.multiplier) && Intrinsics.areEqual(this.maxLeverage, contractEntityOpenData.maxLeverage) && this.supportGridTrading == contractEntityOpenData.supportGridTrading && this.stepRiskLimitStatus == contractEntityOpenData.stepRiskLimitStatus && this.isTrialFunds == contractEntityOpenData.isTrialFunds && Intrinsics.areEqual(this.spotCurrency, contractEntityOpenData.spotCurrency) && Intrinsics.areEqual(this.k, contractEntityOpenData.k) && Intrinsics.areEqual(this.m, contractEntityOpenData.m) && Intrinsics.areEqual(this.f, contractEntityOpenData.f) && Intrinsics.areEqual(this.mmrLimit, contractEntityOpenData.mmrLimit) && Intrinsics.areEqual(this.mmrLevConstant, contractEntityOpenData.mmrLevConstant);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isInverse)) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rootSymbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.baseCurrency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quoteCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int iHashCode6 = (((((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.expireDate)) * 31) + Long.hashCode(this.updatedAt)) * 31;
        String str7 = this.fairMethod;
        int iHashCode7 = (((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.firstOpenDate)) * 31;
        String str8 = this.fundingBaseSymbol;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fundingQuoteSymbol;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fundingRateSymbol;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.indexSymbol;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BigDecimal bigDecimal = this.initialMargin;
        int iHashCode12 = (((((iHashCode11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.isDeleverage)) * 31) + Boolean.hashCode(this.isQuanto)) * 31;
        BigDecimal bigDecimal2 = this.lotSize;
        int iHashCode13 = (iHashCode12 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maintainMargin;
        int iHashCode14 = (iHashCode13 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.makerFeeRate;
        int iHashCode15 = (iHashCode14 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.makerFixFee;
        int iHashCode16 = (iHashCode15 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str12 = this.markMethod;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.maxOrderQty;
        int iHashCode18 = (iHashCode17 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.indexPriceTickSize;
        int iHashCode19 = (iHashCode18 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.maxPrice;
        int iHashCode20 = (iHashCode19 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.maxRiskLimit;
        int iHashCode21 = (iHashCode20 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.minRiskLimit;
        int iHashCode22 = (iHashCode21 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.riskStep;
        int iHashCode23 = (iHashCode22 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        String str13 = this.settleCurrency;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l11 = this.settleDate;
        int iHashCode25 = (iHashCode24 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.settlementFee;
        int iHashCode26 = (iHashCode25 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.takerFeeRate;
        int iHashCode27 = (iHashCode26 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.takerFixFee;
        int iHashCode28 = (iHashCode27 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.tickSize;
        int iHashCode29 = (iHashCode28 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.multiplier;
        int iHashCode30 = (iHashCode29 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.maxLeverage;
        int iHashCode31 = (((((((iHashCode30 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31) + Boolean.hashCode(this.supportGridTrading)) * 31) + Integer.hashCode(this.stepRiskLimitStatus)) * 31) + Boolean.hashCode(this.isTrialFunds)) * 31;
        String str14 = this.spotCurrency;
        int iHashCode32 = (iHashCode31 + (str14 == null ? 0 : str14.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.k;
        int iHashCode33 = (iHashCode32 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.m;
        int iHashCode34 = (iHashCode33 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.f;
        int iHashCode35 = (iHashCode34 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        BigDecimal bigDecimal21 = this.mmrLimit;
        int iHashCode36 = (iHashCode35 + (bigDecimal21 == null ? 0 : bigDecimal21.hashCode())) * 31;
        BigDecimal bigDecimal22 = this.mmrLevConstant;
        return iHashCode36 + (bigDecimal22 != null ? bigDecimal22.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ContractEntityOpenData(type=" + this.type + ", isInverse=" + this.isInverse + ", symbol=" + this.symbol + ", rootSymbol=" + this.rootSymbol + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", status=" + this.status + ", createdAt=" + this.createdAt + ", expireDate=" + this.expireDate + ", updatedAt=" + this.updatedAt + ", fairMethod=" + this.fairMethod + ", firstOpenDate=" + this.firstOpenDate + ", fundingBaseSymbol=" + this.fundingBaseSymbol + ", fundingQuoteSymbol=" + this.fundingQuoteSymbol + ", fundingRateSymbol=" + this.fundingRateSymbol + ", indexSymbol=" + this.indexSymbol + ", initialMargin=" + this.initialMargin + ", isDeleverage=" + this.isDeleverage + ", isQuanto=" + this.isQuanto + ", lotSize=" + this.lotSize + ", maintainMargin=" + this.maintainMargin + ", makerFeeRate=" + this.makerFeeRate + ", makerFixFee=" + this.makerFixFee + ", markMethod=" + this.markMethod + ", maxOrderQty=" + this.maxOrderQty + ", indexPriceTickSize=" + this.indexPriceTickSize + ", maxPrice=" + this.maxPrice + ", maxRiskLimit=" + this.maxRiskLimit + ", minRiskLimit=" + this.minRiskLimit + ", riskStep=" + this.riskStep + ", settleCurrency=" + this.settleCurrency + ", settleDate=" + this.settleDate + ", settlementFee=" + this.settlementFee + ", takerFeeRate=" + this.takerFeeRate + ", takerFixFee=" + this.takerFixFee + ", tickSize=" + this.tickSize + ", multiplier=" + this.multiplier + ", maxLeverage=" + this.maxLeverage + ", supportGridTrading=" + this.supportGridTrading + ", stepRiskLimitStatus=" + this.stepRiskLimitStatus + ", isTrialFunds=" + this.isTrialFunds + ", spotCurrency=" + this.spotCurrency + ", k=" + this.k + ", m=" + this.m + ", f=" + this.f + ", mmrLimit=" + this.mmrLimit + ", mmrLevConstant=" + this.mmrLevConstant + ')';
    }

    public ContractEntityOpenData(@Nullable String str, boolean z11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j11, long j12, long j13, @Nullable String str7, long j14, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable BigDecimal bigDecimal, boolean z12, boolean z13, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str12, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable String str13, @Nullable Long l11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17, boolean z14, int i11, boolean z15, @Nullable String str14, @Nullable BigDecimal bigDecimal18, @Nullable BigDecimal bigDecimal19, @Nullable BigDecimal bigDecimal20, @Nullable BigDecimal bigDecimal21, @Nullable BigDecimal bigDecimal22) {
        this.type = str;
        this.isInverse = z11;
        this.symbol = str2;
        this.rootSymbol = str3;
        this.baseCurrency = str4;
        this.quoteCurrency = str5;
        this.status = str6;
        this.createdAt = j11;
        this.expireDate = j12;
        this.updatedAt = j13;
        this.fairMethod = str7;
        this.firstOpenDate = j14;
        this.fundingBaseSymbol = str8;
        this.fundingQuoteSymbol = str9;
        this.fundingRateSymbol = str10;
        this.indexSymbol = str11;
        this.initialMargin = bigDecimal;
        this.isDeleverage = z12;
        this.isQuanto = z13;
        this.lotSize = bigDecimal2;
        this.maintainMargin = bigDecimal3;
        this.makerFeeRate = bigDecimal4;
        this.makerFixFee = bigDecimal5;
        this.markMethod = str12;
        this.maxOrderQty = bigDecimal6;
        this.indexPriceTickSize = bigDecimal7;
        this.maxPrice = bigDecimal8;
        this.maxRiskLimit = bigDecimal9;
        this.minRiskLimit = bigDecimal10;
        this.riskStep = bigDecimal11;
        this.settleCurrency = str13;
        this.settleDate = l11;
        this.settlementFee = bigDecimal12;
        this.takerFeeRate = bigDecimal13;
        this.takerFixFee = bigDecimal14;
        this.tickSize = bigDecimal15;
        this.multiplier = bigDecimal16;
        this.maxLeverage = bigDecimal17;
        this.supportGridTrading = z14;
        this.stepRiskLimitStatus = i11;
        this.isTrialFunds = z15;
        this.spotCurrency = str14;
        this.k = bigDecimal18;
        this.m = bigDecimal19;
        this.f = bigDecimal20;
        this.mmrLimit = bigDecimal21;
        this.mmrLevConstant = bigDecimal22;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFairMethod() {
        return this.fairMethod;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getFirstOpenDate() {
        return this.firstOpenDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFundingBaseSymbol() {
        return this.fundingBaseSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFundingQuoteSymbol() {
        return this.fundingQuoteSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFundingRateSymbol() {
        return this.fundingRateSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getInitialMargin() {
        return this.initialMargin;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsDeleverage() {
        return this.isDeleverage;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsQuanto() {
        return this.isQuanto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsInverse() {
        return this.isInverse;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getLotSize() {
        return this.lotSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getMaintainMargin() {
        return this.maintainMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getMakerFixFee() {
        return this.makerFixFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMarkMethod() {
        return this.markMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getMaxOrderQty() {
        return this.maxOrderQty;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final BigDecimal getIndexPriceTickSize() {
        return this.indexPriceTickSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BigDecimal getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final BigDecimal getMinRiskLimit() {
        return this.minRiskLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BigDecimal getRiskStep() {
        return this.riskStep;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Long getSettleDate() {
        return this.settleDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final BigDecimal getSettlementFee() {
        return this.settlementFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getTakerFixFee() {
        return this.takerFixFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final BigDecimal getTickSize() {
        return this.tickSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getSupportGridTrading() {
        return this.supportGridTrading;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRootSymbol() {
        return this.rootSymbol;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final int getStepRiskLimitStatus() {
        return this.stepRiskLimitStatus;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getSpotCurrency() {
        return this.spotCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final BigDecimal getK() {
        return this.k;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final BigDecimal getM() {
        return this.m;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final BigDecimal getF() {
        return this.f;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final BigDecimal getMmrLimit() {
        return this.mmrLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final BigDecimal getMmrLevConstant() {
        return this.mmrLevConstant;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getExpireDate() {
        return this.expireDate;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getExpireDate() {
        return this.expireDate;
    }

    @Nullable
    public final BigDecimal getF() {
        return this.f;
    }

    @Nullable
    public final String getFairMethod() {
        return this.fairMethod;
    }

    public final long getFirstOpenDate() {
        return this.firstOpenDate;
    }

    @Nullable
    public final String getFundingBaseSymbol() {
        return this.fundingBaseSymbol;
    }

    @Nullable
    public final String getFundingQuoteSymbol() {
        return this.fundingQuoteSymbol;
    }

    @Nullable
    public final String getFundingRateSymbol() {
        return this.fundingRateSymbol;
    }

    @Nullable
    public final BigDecimal getIndexPriceTickSize() {
        return this.indexPriceTickSize;
    }

    @Nullable
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    public final BigDecimal getInitialMargin() {
        return this.initialMargin;
    }

    @Nullable
    public final BigDecimal getK() {
        return this.k;
    }

    @Nullable
    public final BigDecimal getLotSize() {
        return this.lotSize;
    }

    @Nullable
    public final BigDecimal getM() {
        return this.m;
    }

    @Nullable
    public final BigDecimal getMaintainMargin() {
        return this.maintainMargin;
    }

    @Nullable
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    public final BigDecimal getMakerFixFee() {
        return this.makerFixFee;
    }

    @Nullable
    public final String getMarkMethod() {
        return this.markMethod;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getMaxOrderQty() {
        return this.maxOrderQty;
    }

    @Nullable
    public final BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    public final BigDecimal getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @Nullable
    public final BigDecimal getMinRiskLimit() {
        return this.minRiskLimit;
    }

    @Nullable
    public final BigDecimal getMmrLevConstant() {
        return this.mmrLevConstant;
    }

    @Nullable
    public final BigDecimal getMmrLimit() {
        return this.mmrLimit;
    }

    @Nullable
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final BigDecimal getRiskStep() {
        return this.riskStep;
    }

    @Nullable
    public final String getRootSymbol() {
        return this.rootSymbol;
    }

    @Nullable
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    public final Long getSettleDate() {
        return this.settleDate;
    }

    @Nullable
    public final BigDecimal getSettlementFee() {
        return this.settlementFee;
    }

    @Nullable
    public final String getSpotCurrency() {
        return this.spotCurrency;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final int getStepRiskLimitStatus() {
        return this.stepRiskLimitStatus;
    }

    public final boolean getSupportGridTrading() {
        return this.supportGridTrading;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    public final BigDecimal getTakerFixFee() {
        return this.takerFixFee;
    }

    @Nullable
    public final BigDecimal getTickSize() {
        return this.tickSize;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean isDeleverage() {
        return this.isDeleverage;
    }

    public final boolean isForeverContract() {
        return Intrinsics.areEqual(this.type, "FFWCSX");
    }

    public final boolean isInverse() {
        return this.isInverse;
    }

    public final boolean isQuanto() {
        return this.isQuanto;
    }

    public final boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.baseCurrency = str;
    }

    public final void setCreatedAt(long j11) {
        this.createdAt = j11;
    }

    public final void setDeleverage(boolean z11) {
        this.isDeleverage = z11;
    }

    public final void setExpireDate(long j11) {
        this.expireDate = j11;
    }

    public final void setF(@Nullable BigDecimal bigDecimal) {
        this.f = bigDecimal;
    }

    public final void setFairMethod(@Nullable String str) {
        this.fairMethod = str;
    }

    public final void setFirstOpenDate(long j11) {
        this.firstOpenDate = j11;
    }

    public final void setFundingBaseSymbol(@Nullable String str) {
        this.fundingBaseSymbol = str;
    }

    public final void setFundingQuoteSymbol(@Nullable String str) {
        this.fundingQuoteSymbol = str;
    }

    public final void setFundingRateSymbol(@Nullable String str) {
        this.fundingRateSymbol = str;
    }

    public final void setIndexPriceTickSize(@Nullable BigDecimal bigDecimal) {
        this.indexPriceTickSize = bigDecimal;
    }

    public final void setIndexSymbol(@Nullable String str) {
        this.indexSymbol = str;
    }

    public final void setInitialMargin(@Nullable BigDecimal bigDecimal) {
        this.initialMargin = bigDecimal;
    }

    public final void setInverse(boolean z11) {
        this.isInverse = z11;
    }

    public final void setK(@Nullable BigDecimal bigDecimal) {
        this.k = bigDecimal;
    }

    public final void setLotSize(@Nullable BigDecimal bigDecimal) {
        this.lotSize = bigDecimal;
    }

    public final void setM(@Nullable BigDecimal bigDecimal) {
        this.m = bigDecimal;
    }

    public final void setMaintainMargin(@Nullable BigDecimal bigDecimal) {
        this.maintainMargin = bigDecimal;
    }

    public final void setMakerFeeRate(@Nullable BigDecimal bigDecimal) {
        this.makerFeeRate = bigDecimal;
    }

    public final void setMakerFixFee(@Nullable BigDecimal bigDecimal) {
        this.makerFixFee = bigDecimal;
    }

    public final void setMarkMethod(@Nullable String str) {
        this.markMethod = str;
    }

    public final void setMaxLeverage(@Nullable BigDecimal bigDecimal) {
        this.maxLeverage = bigDecimal;
    }

    public final void setMaxOrderQty(@Nullable BigDecimal bigDecimal) {
        this.maxOrderQty = bigDecimal;
    }

    public final void setMaxPrice(@Nullable BigDecimal bigDecimal) {
        this.maxPrice = bigDecimal;
    }

    public final void setMaxRiskLimit(@Nullable BigDecimal bigDecimal) {
        this.maxRiskLimit = bigDecimal;
    }

    public final void setMinRiskLimit(@Nullable BigDecimal bigDecimal) {
        this.minRiskLimit = bigDecimal;
    }

    public final void setMmrLevConstant(@Nullable BigDecimal bigDecimal) {
        this.mmrLevConstant = bigDecimal;
    }

    public final void setMmrLimit(@Nullable BigDecimal bigDecimal) {
        this.mmrLimit = bigDecimal;
    }

    public final void setMultiplier(@Nullable BigDecimal bigDecimal) {
        this.multiplier = bigDecimal;
    }

    public final void setQuanto(boolean z11) {
        this.isQuanto = z11;
    }

    public final void setQuoteCurrency(@Nullable String str) {
        this.quoteCurrency = str;
    }

    public final void setRiskStep(@Nullable BigDecimal bigDecimal) {
        this.riskStep = bigDecimal;
    }

    public final void setRootSymbol(@Nullable String str) {
        this.rootSymbol = str;
    }

    public final void setSettleCurrency(@Nullable String str) {
        this.settleCurrency = str;
    }

    public final void setSettleDate(@Nullable Long l11) {
        this.settleDate = l11;
    }

    public final void setSettlementFee(@Nullable BigDecimal bigDecimal) {
        this.settlementFee = bigDecimal;
    }

    public final void setSpotCurrency(@Nullable String str) {
        this.spotCurrency = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setStepRiskLimitStatus(int i11) {
        this.stepRiskLimitStatus = i11;
    }

    public final void setSupportGridTrading(boolean z11) {
        this.supportGridTrading = z11;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTakerFeeRate(@Nullable BigDecimal bigDecimal) {
        this.takerFeeRate = bigDecimal;
    }

    public final void setTakerFixFee(@Nullable BigDecimal bigDecimal) {
        this.takerFixFee = bigDecimal;
    }

    public final void setTickSize(@Nullable BigDecimal bigDecimal) {
        this.tickSize = bigDecimal;
    }

    public final void setTrialFunds(boolean z11) {
        this.isTrialFunds = z11;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUpdatedAt(long j11) {
        this.updatedAt = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeInt(this.isInverse ? 1 : 0);
        dest.writeString(this.symbol);
        dest.writeString(this.rootSymbol);
        dest.writeString(this.baseCurrency);
        dest.writeString(this.quoteCurrency);
        dest.writeString(this.status);
        dest.writeLong(this.createdAt);
        dest.writeLong(this.expireDate);
        dest.writeLong(this.updatedAt);
        dest.writeString(this.fairMethod);
        dest.writeLong(this.firstOpenDate);
        dest.writeString(this.fundingBaseSymbol);
        dest.writeString(this.fundingQuoteSymbol);
        dest.writeString(this.fundingRateSymbol);
        dest.writeString(this.indexSymbol);
        dest.writeSerializable(this.initialMargin);
        dest.writeInt(this.isDeleverage ? 1 : 0);
        dest.writeInt(this.isQuanto ? 1 : 0);
        dest.writeSerializable(this.lotSize);
        dest.writeSerializable(this.maintainMargin);
        dest.writeSerializable(this.makerFeeRate);
        dest.writeSerializable(this.makerFixFee);
        dest.writeString(this.markMethod);
        dest.writeSerializable(this.maxOrderQty);
        dest.writeSerializable(this.indexPriceTickSize);
        dest.writeSerializable(this.maxPrice);
        dest.writeSerializable(this.maxRiskLimit);
        dest.writeSerializable(this.minRiskLimit);
        dest.writeSerializable(this.riskStep);
        dest.writeString(this.settleCurrency);
        Long l11 = this.settleDate;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.settlementFee);
        dest.writeSerializable(this.takerFeeRate);
        dest.writeSerializable(this.takerFixFee);
        dest.writeSerializable(this.tickSize);
        dest.writeSerializable(this.multiplier);
        dest.writeSerializable(this.maxLeverage);
        dest.writeInt(this.supportGridTrading ? 1 : 0);
        dest.writeInt(this.stepRiskLimitStatus);
        dest.writeInt(this.isTrialFunds ? 1 : 0);
        dest.writeString(this.spotCurrency);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.m);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.mmrLimit);
        dest.writeSerializable(this.mmrLevConstant);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ContractEntityOpenData(String str, boolean z11, String str2, String str3, String str4, String str5, String str6, long j11, long j12, long j13, String str7, long j14, String str8, String str9, String str10, String str11, BigDecimal bigDecimal, boolean z12, boolean z13, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str12, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, String str13, Long l11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, boolean z14, int i11, boolean z15, String str14, BigDecimal bigDecimal18, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, BigDecimal bigDecimal22, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String str15 = (i12 & 1) != 0 ? "FFWCSX" : str;
        this(str15, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? 0L : j11, (i12 & 256) != 0 ? 0L : j12, (i12 & 512) != 0 ? 0L : j13, (i12 & 1024) != 0 ? null : str7, (i12 & 2048) == 0 ? j14 : 0L, (i12 & 4096) != 0 ? null : str8, (i12 & 8192) != 0 ? null : str9, (i12 & 16384) != 0 ? null : str10, (i12 & 32768) != 0 ? null : str11, (i12 & 65536) != 0 ? null : bigDecimal, (i12 & 131072) != 0 ? false : z12, (i12 & 262144) != 0 ? false : z13, (i12 & 524288) != 0 ? null : bigDecimal2, (i12 & 1048576) != 0 ? null : bigDecimal3, (i12 & 2097152) != 0 ? null : bigDecimal4, (i12 & 4194304) != 0 ? null : bigDecimal5, (i12 & 8388608) != 0 ? null : str12, (i12 & 16777216) != 0 ? null : bigDecimal6, (i12 & 33554432) != 0 ? new BigDecimal("0.01") : bigDecimal7, (i12 & 67108864) != 0 ? null : bigDecimal8, (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal9, (i12 & 268435456) != 0 ? null : bigDecimal10, (i12 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bigDecimal11, (i12 & 1073741824) != 0 ? null : str13, (i12 & Integer.MIN_VALUE) != 0 ? null : l11, (i13 & 1) != 0 ? null : bigDecimal12, (i13 & 2) != 0 ? null : bigDecimal13, (i13 & 4) != 0 ? null : bigDecimal14, (i13 & 8) != 0 ? null : bigDecimal15, (i13 & 16) != 0 ? null : bigDecimal16, (i13 & 32) != 0 ? null : bigDecimal17, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? 0 : i11, (i13 & 256) != 0 ? false : z15, (i13 & 512) != 0 ? null : str14, (i13 & 1024) != 0 ? null : bigDecimal18, (i13 & 2048) != 0 ? null : bigDecimal19, (i13 & 4096) != 0 ? null : bigDecimal20, (i13 & 8192) != 0 ? null : bigDecimal21, (i13 & 16384) != 0 ? null : bigDecimal22);
    }
}
