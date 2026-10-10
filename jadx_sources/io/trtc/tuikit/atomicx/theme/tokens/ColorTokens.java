package io.trtc.tuikit.atomicx.theme.tokens;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C2711C;
import com.facebook.react.uimanager.ViewProps;
import io.trtc.tuikit.atomicx.R$color;
import io.trtc.tuikit.atomicx.theme.tokens.ColorTokens;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ColorTokens.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0003\b¢\u0001\n\u0002\u0010\u000e\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ü\u00012\u00020\u0001:\u0002ü\u0001B\u009d\u0006\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0001\u0010 \u001a\u00020\u0003\u0012\b\b\u0001\u0010!\u001a\u00020\u0003\u0012\b\b\u0001\u0010\"\u001a\u00020\u0003\u0012\b\b\u0001\u0010#\u001a\u00020\u0003\u0012\b\b\u0001\u0010$\u001a\u00020\u0003\u0012\b\b\u0001\u0010%\u001a\u00020\u0003\u0012\b\b\u0001\u0010&\u001a\u00020\u0003\u0012\b\b\u0001\u0010'\u001a\u00020\u0003\u0012\b\b\u0001\u0010(\u001a\u00020\u0003\u0012\b\b\u0001\u0010)\u001a\u00020\u0003\u0012\b\b\u0001\u0010*\u001a\u00020\u0003\u0012\b\b\u0001\u0010+\u001a\u00020\u0003\u0012\b\b\u0001\u0010,\u001a\u00020\u0003\u0012\b\b\u0001\u0010-\u001a\u00020\u0003\u0012\b\b\u0001\u0010.\u001a\u00020\u0003\u0012\b\b\u0001\u0010/\u001a\u00020\u0003\u0012\b\b\u0001\u00100\u001a\u00020\u0003\u0012\b\b\u0001\u00101\u001a\u00020\u0003\u0012\b\b\u0001\u00102\u001a\u00020\u0003\u0012\b\b\u0001\u00103\u001a\u00020\u0003\u0012\b\b\u0001\u00104\u001a\u00020\u0003\u0012\b\b\u0001\u00105\u001a\u00020\u0003\u0012\b\b\u0001\u00106\u001a\u00020\u0003\u0012\b\b\u0001\u00107\u001a\u00020\u0003\u0012\b\b\u0001\u00108\u001a\u00020\u0003\u0012\b\b\u0001\u00109\u001a\u00020\u0003\u0012\b\b\u0001\u0010:\u001a\u00020\u0003\u0012\b\b\u0001\u0010;\u001a\u00020\u0003\u0012\b\b\u0001\u0010<\u001a\u00020\u0003\u0012\b\b\u0001\u0010=\u001a\u00020\u0003\u0012\b\b\u0001\u0010>\u001a\u00020\u0003\u0012\b\b\u0001\u0010?\u001a\u00020\u0003\u0012\b\b\u0001\u0010@\u001a\u00020\u0003\u0012\b\b\u0001\u0010A\u001a\u00020\u0003\u0012\b\b\u0001\u0010B\u001a\u00020\u0003\u0012\b\b\u0001\u0010C\u001a\u00020\u0003\u0012\b\b\u0001\u0010D\u001a\u00020\u0003\u0012\b\b\u0001\u0010E\u001a\u00020\u0003\u0012\b\b\u0001\u0010F\u001a\u00020\u0003\u0012\b\b\u0001\u0010G\u001a\u00020\u0003\u0012\b\b\u0001\u0010H\u001a\u00020\u0003\u0012\b\b\u0001\u0010I\u001a\u00020\u0003\u0012\b\b\u0001\u0010J\u001a\u00020\u0003\u0012\b\b\u0001\u0010K\u001a\u00020\u0003\u0012\b\b\u0001\u0010L\u001a\u00020\u0003\u0012\b\b\u0001\u0010M\u001a\u00020\u0003\u0012\b\b\u0001\u0010N\u001a\u00020\u0003\u0012\b\b\u0001\u0010O\u001a\u00020\u0003\u0012\b\b\u0001\u0010P\u001a\u00020\u0003\u0012\b\b\u0001\u0010Q\u001a\u00020\u0003¢\u0006\u0004\bR\u0010SJ\u0014\u0010¤\u0001\u001a\u00020\u00032\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0086\u0002J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0003HÆ\u0003J \u0006\u0010ö\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00032\b\b\u0003\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u001e\u001a\u00020\u00032\b\b\u0003\u0010\u001f\u001a\u00020\u00032\b\b\u0003\u0010 \u001a\u00020\u00032\b\b\u0003\u0010!\u001a\u00020\u00032\b\b\u0003\u0010\"\u001a\u00020\u00032\b\b\u0003\u0010#\u001a\u00020\u00032\b\b\u0003\u0010$\u001a\u00020\u00032\b\b\u0003\u0010%\u001a\u00020\u00032\b\b\u0003\u0010&\u001a\u00020\u00032\b\b\u0003\u0010'\u001a\u00020\u00032\b\b\u0003\u0010(\u001a\u00020\u00032\b\b\u0003\u0010)\u001a\u00020\u00032\b\b\u0003\u0010*\u001a\u00020\u00032\b\b\u0003\u0010+\u001a\u00020\u00032\b\b\u0003\u0010,\u001a\u00020\u00032\b\b\u0003\u0010-\u001a\u00020\u00032\b\b\u0003\u0010.\u001a\u00020\u00032\b\b\u0003\u0010/\u001a\u00020\u00032\b\b\u0003\u00100\u001a\u00020\u00032\b\b\u0003\u00101\u001a\u00020\u00032\b\b\u0003\u00102\u001a\u00020\u00032\b\b\u0003\u00103\u001a\u00020\u00032\b\b\u0003\u00104\u001a\u00020\u00032\b\b\u0003\u00105\u001a\u00020\u00032\b\b\u0003\u00106\u001a\u00020\u00032\b\b\u0003\u00107\u001a\u00020\u00032\b\b\u0003\u00108\u001a\u00020\u00032\b\b\u0003\u00109\u001a\u00020\u00032\b\b\u0003\u0010:\u001a\u00020\u00032\b\b\u0003\u0010;\u001a\u00020\u00032\b\b\u0003\u0010<\u001a\u00020\u00032\b\b\u0003\u0010=\u001a\u00020\u00032\b\b\u0003\u0010>\u001a\u00020\u00032\b\b\u0003\u0010?\u001a\u00020\u00032\b\b\u0003\u0010@\u001a\u00020\u00032\b\b\u0003\u0010A\u001a\u00020\u00032\b\b\u0003\u0010B\u001a\u00020\u00032\b\b\u0003\u0010C\u001a\u00020\u00032\b\b\u0003\u0010D\u001a\u00020\u00032\b\b\u0003\u0010E\u001a\u00020\u00032\b\b\u0003\u0010F\u001a\u00020\u00032\b\b\u0003\u0010G\u001a\u00020\u00032\b\b\u0003\u0010H\u001a\u00020\u00032\b\b\u0003\u0010I\u001a\u00020\u00032\b\b\u0003\u0010J\u001a\u00020\u00032\b\b\u0003\u0010K\u001a\u00020\u00032\b\b\u0003\u0010L\u001a\u00020\u00032\b\b\u0003\u0010M\u001a\u00020\u00032\b\b\u0003\u0010N\u001a\u00020\u00032\b\b\u0003\u0010O\u001a\u00020\u00032\b\b\u0003\u0010P\u001a\u00020\u00032\b\b\u0003\u0010Q\u001a\u00020\u0003HÆ\u0001J\u0016\u0010÷\u0001\u001a\u00030ø\u00012\t\u0010ù\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ú\u0001\u001a\u00020\u0003HÖ\u0001J\u000b\u0010û\u0001\u001a\u00030¦\u0001HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010UR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010UR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010UR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010UR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010UR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010UR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010UR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010UR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010UR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010UR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010UR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010UR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010UR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010UR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010UR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010UR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010UR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010UR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010UR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010UR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010UR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010UR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010UR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010UR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010UR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010UR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010UR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010UR\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010UR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010UR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010UR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010UR\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010UR\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010UR\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010UR\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010UR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010UR\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010UR\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010UR\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010UR\u0011\u0010,\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010UR\u0011\u0010-\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010UR\u0012\u0010.\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010UR\u0012\u0010/\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010UR\u0012\u00100\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010UR\u0012\u00101\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010UR\u0012\u00102\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010UR\u0012\u00103\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010UR\u0012\u00104\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010UR\u0012\u00105\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010UR\u0012\u00106\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010UR\u0012\u00107\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010UR\u0012\u00108\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010UR\u0012\u00109\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010UR\u0012\u0010:\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010UR\u0012\u0010;\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010UR\u0012\u0010<\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010UR\u0012\u0010=\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010UR\u0012\u0010>\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010UR\u0012\u0010?\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010UR\u0012\u0010@\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010UR\u0012\u0010A\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010UR\u0012\u0010B\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010UR\u0012\u0010C\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010UR\u0012\u0010D\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010UR\u0012\u0010E\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010UR\u0012\u0010F\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010UR\u0012\u0010G\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010UR\u0012\u0010H\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010UR\u0012\u0010I\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010UR\u0012\u0010J\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010UR\u0012\u0010K\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010UR\u0012\u0010L\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010UR\u0012\u0010M\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010UR\u0012\u0010N\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010UR\u0012\u0010O\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010UR\u0012\u0010P\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010UR\u0012\u0010Q\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010U¨\u0006ý\u0001"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;", "", "textColorPrimary", "", "textColorSecondary", "textColorTertiary", "textColorDisable", "textColorButton", "textColorButtonDisabled", "textColorLink", "textColorLinkHover", "textColorLinkActive", "textColorLinkDisabled", "textColorAntiPrimary", "textColorAntiSecondary", "textColorWarning", "textColorSuccess", "textColorError", "bgColorTopBar", "bgColorOperate", "bgColorDialog", "bgColorDialogModule", "bgColorEntryCard", "bgColorFunction", "bgColorBottomBar", "bgColorInput", "bgColorBubbleReciprocal", "bgColorBubbleOwn", "bgColorDefault", "bgColorTagMask", "bgColorElementMask", "bgColorMask", "bgColorMaskDisappeared", "bgColorMaskBegin", "bgColorAvatar", "strokeColorPrimary", "strokeColorSecondary", "strokeColorModule", ViewProps.SHADOW_COLOR, "listColorDefault", "listColorHover", "listColorFocused", "buttonColorPrimaryDefault", "buttonColorPrimaryHover", "buttonColorPrimaryActive", "buttonColorPrimaryDisabled", "buttonColorSecondaryDefault", "buttonColorSecondaryHover", "buttonColorSecondaryActive", "buttonColorSecondaryDisabled", "buttonColorAccept", "buttonColorHangupDefault", "buttonColorHangupDisabled", "buttonColorHangupHover", "buttonColorHangupActive", "buttonColorOn", "buttonColorOff", "dropdownColorDefault", "dropdownColorHover", "dropdownColorActive", "scrollbarColorDefault", "scrollbarColorHover", "floatingColorDefault", "floatingColorOperate", "checkboxColorSelected", "toastColorWarning", "toastColorSuccess", "toastColorError", "toastColorDefault", "tagColorLevel1", "tagColorLevel2", "tagColorLevel3", "tagColorLevel4", "switchColorOff", "switchColorOn", "switchColorButton", "sliderColorFilled", "sliderColorEmpty", "sliderColorButton", "tabColorSelected", "tabColorUnselected", "tabColorOption", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)V", "getTextColorPrimary", "()I", "getTextColorSecondary", "getTextColorTertiary", "getTextColorDisable", "getTextColorButton", "getTextColorButtonDisabled", "getTextColorLink", "getTextColorLinkHover", "getTextColorLinkActive", "getTextColorLinkDisabled", "getTextColorAntiPrimary", "getTextColorAntiSecondary", "getTextColorWarning", "getTextColorSuccess", "getTextColorError", "getBgColorTopBar", "getBgColorOperate", "getBgColorDialog", "getBgColorDialogModule", "getBgColorEntryCard", "getBgColorFunction", "getBgColorBottomBar", "getBgColorInput", "getBgColorBubbleReciprocal", "getBgColorBubbleOwn", "getBgColorDefault", "getBgColorTagMask", "getBgColorElementMask", "getBgColorMask", "getBgColorMaskDisappeared", "getBgColorMaskBegin", "getBgColorAvatar", "getStrokeColorPrimary", "getStrokeColorSecondary", "getStrokeColorModule", "getShadowColor", "getListColorDefault", "getListColorHover", "getListColorFocused", "getButtonColorPrimaryDefault", "getButtonColorPrimaryHover", "getButtonColorPrimaryActive", "getButtonColorPrimaryDisabled", "getButtonColorSecondaryDefault", "getButtonColorSecondaryHover", "getButtonColorSecondaryActive", "getButtonColorSecondaryDisabled", "getButtonColorAccept", "getButtonColorHangupDefault", "getButtonColorHangupDisabled", "getButtonColorHangupHover", "getButtonColorHangupActive", "getButtonColorOn", "getButtonColorOff", "getDropdownColorDefault", "getDropdownColorHover", "getDropdownColorActive", "getScrollbarColorDefault", "getScrollbarColorHover", "getFloatingColorDefault", "getFloatingColorOperate", "getCheckboxColorSelected", "getToastColorWarning", "getToastColorSuccess", "getToastColorError", "getToastColorDefault", "getTagColorLevel1", "getTagColorLevel2", "getTagColorLevel3", "getTagColorLevel4", "getSwitchColorOff", "getSwitchColorOn", "getSwitchColorButton", "getSliderColorFilled", "getSliderColorEmpty", "getSliderColorButton", "getTabColorSelected", "getTabColorUnselected", "getTabColorOption", "get", "key", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nColorTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorTokens.kt\nio/trtc/tuikit/atomicx/theme/tokens/ColorTokens\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,678:1\n1193#2,2:679\n1267#2,4:681\n*S KotlinDebug\n*F\n+ 1 ColorTokens.kt\nio/trtc/tuikit/atomicx/theme/tokens/ColorTokens\n*L\n647#1:679,2\n647#1:681,4\n*E\n"})
public final /* data */ class ColorTokens {

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final Companion f87322B0 = new Companion(null);

    /* JADX INFO: renamed from: C0 */
    @NotNull
    public static final Map<String, Integer> f87323C0 = MapsKt.mapOf(TuplesKt.m90091to("textColorPrimary", Integer.valueOf(R$color.text_color_primary)), TuplesKt.m90091to("textColorSecondary", Integer.valueOf(R$color.text_color_secondary)), TuplesKt.m90091to("textColorTertiary", Integer.valueOf(R$color.text_color_tertiary)), TuplesKt.m90091to("textColorDisable", Integer.valueOf(R$color.text_color_disable)), TuplesKt.m90091to("textColorButton", Integer.valueOf(R$color.text_color_button)), TuplesKt.m90091to("textColorButtonDisabled", Integer.valueOf(R$color.text_color_button_disabled)), TuplesKt.m90091to("textColorLink", Integer.valueOf(R$color.text_color_link)), TuplesKt.m90091to("textColorLinkHover", Integer.valueOf(R$color.text_color_link_hover)), TuplesKt.m90091to("textColorLinkActive", Integer.valueOf(R$color.text_color_link_active)), TuplesKt.m90091to("textColorLinkDisabled", Integer.valueOf(R$color.text_color_link_disabled)), TuplesKt.m90091to("textColorAntiPrimary", Integer.valueOf(R$color.text_color_anti_primary)), TuplesKt.m90091to("textColorAntiSecondary", Integer.valueOf(R$color.text_color_anti_secondary)), TuplesKt.m90091to("textColorWarning", Integer.valueOf(R$color.text_color_warning)), TuplesKt.m90091to("textColorSuccess", Integer.valueOf(R$color.text_color_success)), TuplesKt.m90091to("textColorError", Integer.valueOf(R$color.text_color_error)), TuplesKt.m90091to("bgColorTopBar", Integer.valueOf(R$color.bg_color_top_bar)), TuplesKt.m90091to("bgColorOperate", Integer.valueOf(R$color.bg_color_operate)), TuplesKt.m90091to("bgColorDialog", Integer.valueOf(R$color.bg_color_dialog)), TuplesKt.m90091to("bgColorDialogModule", Integer.valueOf(R$color.bg_color_dialog_module)), TuplesKt.m90091to("bgColorEntryCard", Integer.valueOf(R$color.bg_color_entry_card)), TuplesKt.m90091to("bgColorFunction", Integer.valueOf(R$color.bg_color_function)), TuplesKt.m90091to("bgColorBottomBar", Integer.valueOf(R$color.bg_color_bottom_bar)), TuplesKt.m90091to("bgColorInput", Integer.valueOf(R$color.bg_color_input)), TuplesKt.m90091to("bgColorBubbleReciprocal", Integer.valueOf(R$color.bg_color_bubble_reciprocal)), TuplesKt.m90091to("bgColorBubbleOwn", Integer.valueOf(R$color.bg_color_bubble_own)), TuplesKt.m90091to("bgColorDefault", Integer.valueOf(R$color.bg_color_default)), TuplesKt.m90091to("bgColorTagMask", Integer.valueOf(R$color.bg_color_tag_mask)), TuplesKt.m90091to("bgColorElementMask", Integer.valueOf(R$color.bg_color_element_mask)), TuplesKt.m90091to("bgColorMask", Integer.valueOf(R$color.bg_color_mask)), TuplesKt.m90091to("bgColorMaskDisappeared", Integer.valueOf(R$color.bg_color_mask_disappeared)), TuplesKt.m90091to("bgColorMaskBegin", Integer.valueOf(R$color.bg_color_mask_begin)), TuplesKt.m90091to("bgColorAvatar", Integer.valueOf(R$color.bg_color_avatar)), TuplesKt.m90091to("strokeColorPrimary", Integer.valueOf(R$color.stroke_color_primary)), TuplesKt.m90091to("strokeColorSecondary", Integer.valueOf(R$color.stroke_color_secondary)), TuplesKt.m90091to("strokeColorModule", Integer.valueOf(R$color.stroke_color_module)), TuplesKt.m90091to(ViewProps.SHADOW_COLOR, Integer.valueOf(R$color.shadow_color)), TuplesKt.m90091to("listColorDefault", Integer.valueOf(R$color.list_color_default)), TuplesKt.m90091to("listColorHover", Integer.valueOf(R$color.list_color_hover)), TuplesKt.m90091to("listColorFocused", Integer.valueOf(R$color.list_color_focused)), TuplesKt.m90091to("buttonColorPrimaryDefault", Integer.valueOf(R$color.button_color_primary_default)), TuplesKt.m90091to("buttonColorPrimaryHover", Integer.valueOf(R$color.button_color_primary_hover)), TuplesKt.m90091to("buttonColorPrimaryActive", Integer.valueOf(R$color.button_color_primary_active)), TuplesKt.m90091to("buttonColorPrimaryDisabled", Integer.valueOf(R$color.button_color_primary_disabled)), TuplesKt.m90091to("buttonColorSecondaryDefault", Integer.valueOf(R$color.button_color_secondary_default)), TuplesKt.m90091to("buttonColorSecondaryHover", Integer.valueOf(R$color.button_color_secondary_hover)), TuplesKt.m90091to("buttonColorSecondaryActive", Integer.valueOf(R$color.button_color_secondary_active)), TuplesKt.m90091to("buttonColorSecondaryDisabled", Integer.valueOf(R$color.button_color_secondary_disabled)), TuplesKt.m90091to("buttonColorAccept", Integer.valueOf(R$color.button_color_accept)), TuplesKt.m90091to("buttonColorHangupDefault", Integer.valueOf(R$color.button_color_hangup_default)), TuplesKt.m90091to("buttonColorHangupDisabled", Integer.valueOf(R$color.button_color_hangup_disabled)), TuplesKt.m90091to("buttonColorHangupHover", Integer.valueOf(R$color.button_color_hangup_hover)), TuplesKt.m90091to("buttonColorHangupActive", Integer.valueOf(R$color.button_color_hangup_active)), TuplesKt.m90091to("buttonColorOn", Integer.valueOf(R$color.button_color_on)), TuplesKt.m90091to("buttonColorOff", Integer.valueOf(R$color.button_color_off)), TuplesKt.m90091to("dropdownColorDefault", Integer.valueOf(R$color.dropdown_color_default)), TuplesKt.m90091to("dropdownColorHover", Integer.valueOf(R$color.dropdown_color_hover)), TuplesKt.m90091to("dropdownColorActive", Integer.valueOf(R$color.dropdown_color_active)), TuplesKt.m90091to("scrollbarColorDefault", Integer.valueOf(R$color.scrollbar_color_default)), TuplesKt.m90091to("scrollbarColorHover", Integer.valueOf(R$color.scrollbar_color_hover)), TuplesKt.m90091to("floatingColorDefault", Integer.valueOf(R$color.floating_color_default)), TuplesKt.m90091to("floatingColorOperate", Integer.valueOf(R$color.floating_color_operate)), TuplesKt.m90091to("checkboxColorSelected", Integer.valueOf(R$color.checkbox_color_selected)), TuplesKt.m90091to("toastColorWarning", Integer.valueOf(R$color.toast_color_warning)), TuplesKt.m90091to("toastColorSuccess", Integer.valueOf(R$color.toast_color_success)), TuplesKt.m90091to("toastColorError", Integer.valueOf(R$color.toast_color_error)), TuplesKt.m90091to("toastColorDefault", Integer.valueOf(R$color.toast_color_default)), TuplesKt.m90091to("tagColorLevel1", Integer.valueOf(R$color.tag_color_level1)), TuplesKt.m90091to("tagColorLevel2", Integer.valueOf(R$color.tag_color_level2)), TuplesKt.m90091to("tagColorLevel3", Integer.valueOf(R$color.tag_color_level3)), TuplesKt.m90091to("tagColorLevel4", Integer.valueOf(R$color.tag_color_level4)), TuplesKt.m90091to("switchColorOff", Integer.valueOf(R$color.switch_color_off)), TuplesKt.m90091to("switchColorOn", Integer.valueOf(R$color.switch_color_on)), TuplesKt.m90091to("switchColorButton", Integer.valueOf(R$color.switch_color_button)), TuplesKt.m90091to("sliderColorFilled", Integer.valueOf(R$color.slider_color_filled)), TuplesKt.m90091to("sliderColorEmpty", Integer.valueOf(R$color.slider_color_empty)), TuplesKt.m90091to("sliderColorButton", Integer.valueOf(R$color.slider_color_button)), TuplesKt.m90091to("tabColorSelected", Integer.valueOf(R$color.tab_color_selected)), TuplesKt.m90091to("tabColorUnselected", Integer.valueOf(R$color.tab_color_unselected)), TuplesKt.m90091to("tabColorOption", Integer.valueOf(R$color.tab_color_option)));

    /* JADX INFO: renamed from: D0 */
    @NotNull
    public static final Lazy<Map<Integer, String>> f87324D0 = LazyKt.lazy(new Function0() { // from class: bg0.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ColorTokens.m87985B();
        }
    });

    /* JADX INFO: renamed from: A, reason: from toString */
    public final int bgColorTagMask;

    /* JADX INFO: renamed from: A0, reason: from toString */
    public final int tabColorOption;

    /* JADX INFO: renamed from: B, reason: from toString */
    public final int bgColorElementMask;

    /* JADX INFO: renamed from: C, reason: from toString */
    public final int bgColorMask;

    /* JADX INFO: renamed from: D, reason: from toString */
    public final int bgColorMaskDisappeared;

    /* JADX INFO: renamed from: E, reason: from toString */
    public final int bgColorMaskBegin;

    /* JADX INFO: renamed from: F, reason: from toString */
    public final int bgColorAvatar;

    /* JADX INFO: renamed from: G, reason: from toString */
    public final int strokeColorPrimary;

    /* JADX INFO: renamed from: H, reason: from toString */
    public final int strokeColorSecondary;

    /* JADX INFO: renamed from: I, reason: from toString */
    public final int strokeColorModule;

    /* JADX INFO: renamed from: J, reason: from toString */
    public final int shadowColor;

    /* JADX INFO: renamed from: K, reason: from toString */
    public final int listColorDefault;

    /* JADX INFO: renamed from: L, reason: from toString */
    public final int listColorHover;

    /* JADX INFO: renamed from: M, reason: from toString */
    public final int listColorFocused;

    /* JADX INFO: renamed from: N, reason: from toString */
    public final int buttonColorPrimaryDefault;

    /* JADX INFO: renamed from: O, reason: from toString */
    public final int buttonColorPrimaryHover;

    /* JADX INFO: renamed from: P, reason: from toString */
    public final int buttonColorPrimaryActive;

    /* JADX INFO: renamed from: Q, reason: from toString */
    public final int buttonColorPrimaryDisabled;

    /* JADX INFO: renamed from: R, reason: from toString */
    public final int buttonColorSecondaryDefault;

    /* JADX INFO: renamed from: S, reason: from toString */
    public final int buttonColorSecondaryHover;

    /* JADX INFO: renamed from: T, reason: from toString */
    public final int buttonColorSecondaryActive;

    /* JADX INFO: renamed from: U, reason: from toString */
    public final int buttonColorSecondaryDisabled;

    /* JADX INFO: renamed from: V, reason: from toString */
    public final int buttonColorAccept;

    /* JADX INFO: renamed from: W, reason: from toString */
    public final int buttonColorHangupDefault;

    /* JADX INFO: renamed from: X, reason: from toString */
    public final int buttonColorHangupDisabled;

    /* JADX INFO: renamed from: Y, reason: from toString */
    public final int buttonColorHangupHover;

    /* JADX INFO: renamed from: Z, reason: from toString */
    public final int buttonColorHangupActive;

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int textColorPrimary;

    /* JADX INFO: renamed from: a0, reason: from toString */
    public final int buttonColorOn;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int textColorSecondary;

    /* JADX INFO: renamed from: b0, reason: from toString */
    public final int buttonColorOff;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int textColorTertiary;

    /* JADX INFO: renamed from: c0, reason: from toString */
    public final int dropdownColorDefault;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int textColorDisable;

    /* JADX INFO: renamed from: d0, reason: from toString */
    public final int dropdownColorHover;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int textColorButton;

    /* JADX INFO: renamed from: e0, reason: from toString */
    public final int dropdownColorActive;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int textColorButtonDisabled;

    /* JADX INFO: renamed from: f0, reason: from toString */
    public final int scrollbarColorDefault;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final int textColorLink;

    /* JADX INFO: renamed from: g0, reason: from toString */
    public final int scrollbarColorHover;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final int textColorLinkHover;

    /* JADX INFO: renamed from: h0, reason: from toString */
    public final int floatingColorDefault;

    /* JADX INFO: renamed from: i, reason: from toString */
    public final int textColorLinkActive;

    /* JADX INFO: renamed from: i0, reason: from toString */
    public final int floatingColorOperate;

    /* JADX INFO: renamed from: j, reason: from toString */
    public final int textColorLinkDisabled;

    /* JADX INFO: renamed from: j0, reason: from toString */
    public final int checkboxColorSelected;

    /* JADX INFO: renamed from: k, reason: from toString */
    public final int textColorAntiPrimary;

    /* JADX INFO: renamed from: k0, reason: from toString */
    public final int toastColorWarning;

    /* JADX INFO: renamed from: l, reason: from toString */
    public final int textColorAntiSecondary;

    /* JADX INFO: renamed from: l0, reason: from toString */
    public final int toastColorSuccess;

    /* JADX INFO: renamed from: m, reason: from toString */
    public final int textColorWarning;

    /* JADX INFO: renamed from: m0, reason: from toString */
    public final int toastColorError;

    /* JADX INFO: renamed from: n, reason: from toString */
    public final int textColorSuccess;

    /* JADX INFO: renamed from: n0, reason: from toString */
    public final int toastColorDefault;

    /* JADX INFO: renamed from: o, reason: from toString */
    public final int textColorError;

    /* JADX INFO: renamed from: o0, reason: from toString */
    public final int tagColorLevel1;

    /* JADX INFO: renamed from: p, reason: from toString */
    public final int bgColorTopBar;

    /* JADX INFO: renamed from: p0, reason: from toString */
    public final int tagColorLevel2;

    /* JADX INFO: renamed from: q, reason: from toString */
    public final int bgColorOperate;

    /* JADX INFO: renamed from: q0, reason: from toString */
    public final int tagColorLevel3;

    /* JADX INFO: renamed from: r, reason: from toString */
    public final int bgColorDialog;

    /* JADX INFO: renamed from: r0, reason: from toString */
    public final int tagColorLevel4;

    /* JADX INFO: renamed from: s, reason: from toString */
    public final int bgColorDialogModule;

    /* JADX INFO: renamed from: s0, reason: from toString */
    public final int switchColorOff;

    /* JADX INFO: renamed from: t, reason: from toString */
    public final int bgColorEntryCard;

    /* JADX INFO: renamed from: t0, reason: from toString */
    public final int switchColorOn;

    /* JADX INFO: renamed from: u, reason: from toString */
    public final int bgColorFunction;

    /* JADX INFO: renamed from: u0, reason: from toString */
    public final int switchColorButton;

    /* JADX INFO: renamed from: v, reason: from toString */
    public final int bgColorBottomBar;

    /* JADX INFO: renamed from: v0, reason: from toString */
    public final int sliderColorFilled;

    /* JADX INFO: renamed from: w, reason: from toString */
    public final int bgColorInput;

    /* JADX INFO: renamed from: w0, reason: from toString */
    public final int sliderColorEmpty;

    /* JADX INFO: renamed from: x, reason: from toString */
    public final int bgColorBubbleReciprocal;

    /* JADX INFO: renamed from: x0, reason: from toString */
    public final int sliderColorButton;

    /* JADX INFO: renamed from: y, reason: from toString */
    public final int bgColorBubbleOwn;

    /* JADX INFO: renamed from: y0, reason: from toString */
    public final int tabColorSelected;

    /* JADX INFO: renamed from: z, reason: from toString */
    public final int bgColorDefault;

    /* JADX INFO: renamed from: z0, reason: from toString */
    public final int tabColorUnselected;

    /* JADX INFO: compiled from: ColorTokens.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001c\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\fJ\"\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0010R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;", "", "<init>", "()V", "defaultLight", "Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;", "context", "Landroid/content/Context;", "defaultDark", "generateLightTokens", "palette", "", "", "generateDarkTokens", "tokenNameToResIdMap", "", "", "resIdToTokenNameMap", "getResIdToTokenNameMap", "()Ljava/util/Map;", "resIdToTokenNameMap$delegate", "Lkotlin/Lazy;", "getTokenKeyFromColorResId", "colorResId", "parseColorAttribute", "attrs", "Landroid/util/AttributeSet;", "attrId", "attrName", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ColorTokens defaultDark(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ColorTokens(ContextCompat.getColor(context, R$color.text_color_primary), ContextCompat.getColor(context, R$color.text_color_secondary), ContextCompat.getColor(context, R$color.text_color_tertiary), ContextCompat.getColor(context, R$color.text_color_disable), ContextCompat.getColor(context, R$color.text_color_button), ContextCompat.getColor(context, R$color.text_color_button_disabled), ContextCompat.getColor(context, R$color.text_color_link), ContextCompat.getColor(context, R$color.text_color_link_hover), ContextCompat.getColor(context, R$color.text_color_link_active), ContextCompat.getColor(context, R$color.text_color_link_disabled), ContextCompat.getColor(context, R$color.text_color_anti_primary), ContextCompat.getColor(context, R$color.text_color_anti_secondary), ContextCompat.getColor(context, R$color.text_color_warning), ContextCompat.getColor(context, R$color.text_color_success), ContextCompat.getColor(context, R$color.text_color_error), ContextCompat.getColor(context, R$color.bg_color_top_bar), ContextCompat.getColor(context, R$color.bg_color_operate), ContextCompat.getColor(context, R$color.bg_color_dialog), ContextCompat.getColor(context, R$color.bg_color_dialog_module), ContextCompat.getColor(context, R$color.bg_color_entry_card), ContextCompat.getColor(context, R$color.bg_color_function), ContextCompat.getColor(context, R$color.bg_color_bottom_bar), ContextCompat.getColor(context, R$color.bg_color_input), ContextCompat.getColor(context, R$color.bg_color_bubble_reciprocal), ContextCompat.getColor(context, R$color.bg_color_bubble_own), ContextCompat.getColor(context, R$color.bg_color_default), ContextCompat.getColor(context, R$color.bg_color_tag_mask), ContextCompat.getColor(context, R$color.bg_color_element_mask), ContextCompat.getColor(context, R$color.bg_color_mask), ContextCompat.getColor(context, R$color.bg_color_mask_disappeared), ContextCompat.getColor(context, R$color.bg_color_mask_begin), ContextCompat.getColor(context, R$color.bg_color_avatar), ContextCompat.getColor(context, R$color.stroke_color_primary), ContextCompat.getColor(context, R$color.stroke_color_secondary), ContextCompat.getColor(context, R$color.stroke_color_module), ContextCompat.getColor(context, R$color.shadow_color), ContextCompat.getColor(context, R$color.list_color_default), ContextCompat.getColor(context, R$color.list_color_hover), ContextCompat.getColor(context, R$color.list_color_focused), ContextCompat.getColor(context, R$color.button_color_primary_default), ContextCompat.getColor(context, R$color.button_color_primary_hover), ContextCompat.getColor(context, R$color.button_color_primary_active), ContextCompat.getColor(context, R$color.button_color_primary_disabled), ContextCompat.getColor(context, R$color.button_color_secondary_default), ContextCompat.getColor(context, R$color.button_color_secondary_hover), ContextCompat.getColor(context, R$color.button_color_secondary_active), ContextCompat.getColor(context, R$color.button_color_secondary_disabled), ContextCompat.getColor(context, R$color.button_color_accept), ContextCompat.getColor(context, R$color.button_color_hangup_default), ContextCompat.getColor(context, R$color.button_color_hangup_disabled), ContextCompat.getColor(context, R$color.button_color_hangup_hover), ContextCompat.getColor(context, R$color.button_color_hangup_active), ContextCompat.getColor(context, R$color.button_color_on), ContextCompat.getColor(context, R$color.button_color_off), ContextCompat.getColor(context, R$color.dropdown_color_default), ContextCompat.getColor(context, R$color.dropdown_color_hover), ContextCompat.getColor(context, R$color.dropdown_color_active), ContextCompat.getColor(context, R$color.scrollbar_color_default), ContextCompat.getColor(context, R$color.scrollbar_color_hover), ContextCompat.getColor(context, R$color.floating_color_default), ContextCompat.getColor(context, R$color.floating_color_operate), ContextCompat.getColor(context, R$color.checkbox_color_selected), ContextCompat.getColor(context, R$color.toast_color_warning), ContextCompat.getColor(context, R$color.toast_color_success), ContextCompat.getColor(context, R$color.toast_color_error), ContextCompat.getColor(context, R$color.toast_color_default), ContextCompat.getColor(context, R$color.tag_color_level1), ContextCompat.getColor(context, R$color.tag_color_level2), ContextCompat.getColor(context, R$color.tag_color_level3), ContextCompat.getColor(context, R$color.tag_color_level4), ContextCompat.getColor(context, R$color.switch_color_off), ContextCompat.getColor(context, R$color.switch_color_on), ContextCompat.getColor(context, R$color.switch_color_button), ContextCompat.getColor(context, R$color.slider_color_filled), ContextCompat.getColor(context, R$color.slider_color_empty), ContextCompat.getColor(context, R$color.slider_color_button), ContextCompat.getColor(context, R$color.tab_color_selected), ContextCompat.getColor(context, R$color.tab_color_unselected), ContextCompat.getColor(context, R$color.tab_color_option));
        }

        @NotNull
        public final ColorTokens defaultLight(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i11 = R$color.black_2;
            int color = ContextCompat.getColor(context, i11);
            int i12 = R$color.black_4;
            int color2 = ContextCompat.getColor(context, i12);
            int i13 = R$color.black_5;
            int color3 = ContextCompat.getColor(context, i13);
            int i14 = R$color.black_6;
            int color4 = ContextCompat.getColor(context, i14);
            int i15 = R$color.white_1;
            int color5 = ContextCompat.getColor(context, i15);
            int color6 = ContextCompat.getColor(context, i15);
            int i16 = R$color.theme_light_6;
            int color7 = ContextCompat.getColor(context, i16);
            int i17 = R$color.theme_light_5;
            int color8 = ContextCompat.getColor(context, i17);
            int i18 = R$color.theme_light_7;
            int color9 = ContextCompat.getColor(context, i18);
            int i19 = R$color.theme_light_2;
            int color10 = ContextCompat.getColor(context, i19);
            int color11 = ContextCompat.getColor(context, i11);
            int color12 = ContextCompat.getColor(context, i12);
            int color13 = ContextCompat.getColor(context, R$color.orange_light_6);
            int i21 = R$color.green_light_6;
            int color14 = ContextCompat.getColor(context, i21);
            int i22 = R$color.red_light_6;
            int color15 = ContextCompat.getColor(context, i22);
            int i23 = R$color.gray_light_1;
            int color16 = ContextCompat.getColor(context, i23);
            int color17 = ContextCompat.getColor(context, i15);
            int color18 = ContextCompat.getColor(context, i15);
            int i24 = R$color.gray_light_2;
            int color19 = ContextCompat.getColor(context, i24);
            int color20 = ContextCompat.getColor(context, i24);
            int color21 = ContextCompat.getColor(context, i24);
            int color22 = ContextCompat.getColor(context, i15);
            int color23 = ContextCompat.getColor(context, i24);
            int color24 = ContextCompat.getColor(context, i24);
            int color25 = ContextCompat.getColor(context, i19);
            int color26 = ContextCompat.getColor(context, i24);
            int color27 = ContextCompat.getColor(context, R$color.white_4);
            int color28 = ContextCompat.getColor(context, i14);
            int color29 = ContextCompat.getColor(context, i12);
            int color30 = ContextCompat.getColor(context, R$color.white_7);
            int color31 = ContextCompat.getColor(context, i15);
            int color32 = ContextCompat.getColor(context, i19);
            int i25 = R$color.gray_light_3;
            int color33 = ContextCompat.getColor(context, i25);
            int color34 = ContextCompat.getColor(context, i24);
            int color35 = ContextCompat.getColor(context, i25);
            int color36 = ContextCompat.getColor(context, R$color.black_8);
            int color37 = ContextCompat.getColor(context, i15);
            int color38 = ContextCompat.getColor(context, i23);
            int i26 = R$color.theme_light_1;
            return new ColorTokens(color, color2, color3, color4, color5, color6, color7, color8, color9, color10, color11, color12, color13, color14, color15, color16, color17, color18, color19, color20, color21, color22, color23, color24, color25, color26, color27, color28, color29, color30, color31, color32, color33, color34, color35, color36, color37, color38, ContextCompat.getColor(context, i26), ContextCompat.getColor(context, i16), ContextCompat.getColor(context, i17), ContextCompat.getColor(context, i18), ContextCompat.getColor(context, i19), ContextCompat.getColor(context, i24), ContextCompat.getColor(context, i23), ContextCompat.getColor(context, i25), ContextCompat.getColor(context, i23), ContextCompat.getColor(context, i21), ContextCompat.getColor(context, i22), ContextCompat.getColor(context, R$color.red_light_2), ContextCompat.getColor(context, R$color.red_light_5), ContextCompat.getColor(context, R$color.red_light_7), ContextCompat.getColor(context, i15), ContextCompat.getColor(context, i13), ContextCompat.getColor(context, i15), ContextCompat.getColor(context, i23), ContextCompat.getColor(context, i26), ContextCompat.getColor(context, R$color.black_7), ContextCompat.getColor(context, i14), ContextCompat.getColor(context, i15), ContextCompat.getColor(context, i24), ContextCompat.getColor(context, i16), ContextCompat.getColor(context, R$color.orange_light_1), ContextCompat.getColor(context, R$color.green_light_1), ContextCompat.getColor(context, R$color.red_light_1), ContextCompat.getColor(context, i26), ContextCompat.getColor(context, R$color.accent_turquoise_light), ContextCompat.getColor(context, i17), ContextCompat.getColor(context, R$color.accent_purple_light), ContextCompat.getColor(context, R$color.accent_magenta_light), ContextCompat.getColor(context, R$color.gray_light_4), ContextCompat.getColor(context, i16), ContextCompat.getColor(context, i15), ContextCompat.getColor(context, i16), ContextCompat.getColor(context, i25), ContextCompat.getColor(context, i15), ContextCompat.getColor(context, i19), ContextCompat.getColor(context, i24), ContextCompat.getColor(context, i25));
        }

        @NotNull
        public final ColorTokens generateDarkTokens(@NotNull Context context, @NotNull List<Integer> palette) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(palette, "palette");
            int iIntValue = palette.get(1).intValue();
            int iIntValue2 = palette.get(4).intValue();
            int iIntValue3 = palette.get(5).intValue();
            int iIntValue4 = palette.get(6).intValue();
            return ColorTokens.m87988d(defaultDark(context), 0, 0, 0, 0, 0, 0, iIntValue3, iIntValue2, iIntValue4, iIntValue, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, iIntValue4, 0, 0, 0, 0, 0, 0, iIntValue, 0, 0, 0, 0, 0, 0, iIntValue, iIntValue3, iIntValue2, iIntValue4, iIntValue, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, iIntValue, 0, 0, 0, 0, iIntValue2, 0, 0, 0, iIntValue, 0, iIntValue2, 0, 0, 0, iIntValue2, 0, iIntValue2, 0, 0, iIntValue2, 0, 0, 2130705471, -553650113, 28021, null);
        }

        @NotNull
        public final ColorTokens generateLightTokens(@NotNull Context context, @NotNull List<Integer> palette) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(palette, "palette");
            int iIntValue = palette.get(0).intValue();
            int iIntValue2 = palette.get(1).intValue();
            int iIntValue3 = palette.get(4).intValue();
            int iIntValue4 = palette.get(5).intValue();
            int iIntValue5 = palette.get(6).intValue();
            return ColorTokens.m87988d(defaultLight(context), 0, 0, 0, 0, 0, 0, iIntValue4, iIntValue3, iIntValue5, iIntValue2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, iIntValue2, 0, 0, 0, 0, 0, 0, iIntValue2, 0, 0, 0, 0, 0, 0, iIntValue, iIntValue4, iIntValue3, iIntValue5, iIntValue2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, iIntValue, 0, 0, 0, 0, iIntValue4, 0, 0, 0, iIntValue, 0, iIntValue3, 0, 0, 0, iIntValue4, 0, iIntValue4, 0, 0, iIntValue2, 0, 0, 2130705471, -553650113, 28021, null);
        }

        @Nullable
        public final String parseColorAttribute(@Nullable AttributeSet attrs, int attrId, @NotNull String attrName) {
            Intrinsics.checkNotNullParameter(attrName, "attrName");
            if (attrs == null) {
                return null;
            }
            int attributeCount = attrs.getAttributeCount();
            for (int i11 = 0; i11 < attributeCount; i11++) {
                if (attrs.getAttributeNameResource(i11) == attrId) {
                    int attributeResourceValue = attrs.getAttributeResourceValue(i11, -1);
                    if (attributeResourceValue == -1) {
                        break;
                    }
                    try {
                        return getTokenKeyFromColorResId(attributeResourceValue);
                    } catch (Exception e11) {
                        Log.e("ColorTokens", "Error parsing " + attrName, e11);
                        return null;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public final Map<Integer, String> m88013a() {
            return (Map) ColorTokens.f87324D0.getValue();
        }

        @Nullable
        public final String getTokenKeyFromColorResId(int colorResId) {
            return m88013a().get(Integer.valueOf(colorResId));
        }
    }

    public ColorTokens(@ColorInt int i11, @ColorInt int i12, @ColorInt int i13, @ColorInt int i14, @ColorInt int i15, @ColorInt int i16, @ColorInt int i17, @ColorInt int i18, @ColorInt int i19, @ColorInt int i21, @ColorInt int i22, @ColorInt int i23, @ColorInt int i24, @ColorInt int i25, @ColorInt int i26, @ColorInt int i27, @ColorInt int i28, @ColorInt int i29, @ColorInt int i31, @ColorInt int i32, @ColorInt int i33, @ColorInt int i34, @ColorInt int i35, @ColorInt int i36, @ColorInt int i37, @ColorInt int i38, @ColorInt int i39, @ColorInt int i41, @ColorInt int i42, @ColorInt int i43, @ColorInt int i44, @ColorInt int i45, @ColorInt int i46, @ColorInt int i47, @ColorInt int i48, @ColorInt int i49, @ColorInt int i51, @ColorInt int i52, @ColorInt int i53, @ColorInt int i54, @ColorInt int i55, @ColorInt int i56, @ColorInt int i57, @ColorInt int i58, @ColorInt int i59, @ColorInt int i61, @ColorInt int i62, @ColorInt int i63, @ColorInt int i64, @ColorInt int i65, @ColorInt int i66, @ColorInt int i67, @ColorInt int i68, @ColorInt int i69, @ColorInt int i71, @ColorInt int i72, @ColorInt int i73, @ColorInt int i74, @ColorInt int i75, @ColorInt int i76, @ColorInt int i77, @ColorInt int i78, @ColorInt int i79, @ColorInt int i81, @ColorInt int i82, @ColorInt int i83, @ColorInt int i84, @ColorInt int i85, @ColorInt int i86, @ColorInt int i87, @ColorInt int i88, @ColorInt int i89, @ColorInt int i91, @ColorInt int i92, @ColorInt int i93, @ColorInt int i94, @ColorInt int i95, @ColorInt int i96, @ColorInt int i97) {
        this.textColorPrimary = i11;
        this.textColorSecondary = i12;
        this.textColorTertiary = i13;
        this.textColorDisable = i14;
        this.textColorButton = i15;
        this.textColorButtonDisabled = i16;
        this.textColorLink = i17;
        this.textColorLinkHover = i18;
        this.textColorLinkActive = i19;
        this.textColorLinkDisabled = i21;
        this.textColorAntiPrimary = i22;
        this.textColorAntiSecondary = i23;
        this.textColorWarning = i24;
        this.textColorSuccess = i25;
        this.textColorError = i26;
        this.bgColorTopBar = i27;
        this.bgColorOperate = i28;
        this.bgColorDialog = i29;
        this.bgColorDialogModule = i31;
        this.bgColorEntryCard = i32;
        this.bgColorFunction = i33;
        this.bgColorBottomBar = i34;
        this.bgColorInput = i35;
        this.bgColorBubbleReciprocal = i36;
        this.bgColorBubbleOwn = i37;
        this.bgColorDefault = i38;
        this.bgColorTagMask = i39;
        this.bgColorElementMask = i41;
        this.bgColorMask = i42;
        this.bgColorMaskDisappeared = i43;
        this.bgColorMaskBegin = i44;
        this.bgColorAvatar = i45;
        this.strokeColorPrimary = i46;
        this.strokeColorSecondary = i47;
        this.strokeColorModule = i48;
        this.shadowColor = i49;
        this.listColorDefault = i51;
        this.listColorHover = i52;
        this.listColorFocused = i53;
        this.buttonColorPrimaryDefault = i54;
        this.buttonColorPrimaryHover = i55;
        this.buttonColorPrimaryActive = i56;
        this.buttonColorPrimaryDisabled = i57;
        this.buttonColorSecondaryDefault = i58;
        this.buttonColorSecondaryHover = i59;
        this.buttonColorSecondaryActive = i61;
        this.buttonColorSecondaryDisabled = i62;
        this.buttonColorAccept = i63;
        this.buttonColorHangupDefault = i64;
        this.buttonColorHangupDisabled = i65;
        this.buttonColorHangupHover = i66;
        this.buttonColorHangupActive = i67;
        this.buttonColorOn = i68;
        this.buttonColorOff = i69;
        this.dropdownColorDefault = i71;
        this.dropdownColorHover = i72;
        this.dropdownColorActive = i73;
        this.scrollbarColorDefault = i74;
        this.scrollbarColorHover = i75;
        this.floatingColorDefault = i76;
        this.floatingColorOperate = i77;
        this.checkboxColorSelected = i78;
        this.toastColorWarning = i79;
        this.toastColorSuccess = i81;
        this.toastColorError = i82;
        this.toastColorDefault = i83;
        this.tagColorLevel1 = i84;
        this.tagColorLevel2 = i85;
        this.tagColorLevel3 = i86;
        this.tagColorLevel4 = i87;
        this.switchColorOff = i88;
        this.switchColorOn = i89;
        this.switchColorButton = i91;
        this.sliderColorFilled = i92;
        this.sliderColorEmpty = i93;
        this.sliderColorButton = i94;
        this.tabColorSelected = i95;
        this.tabColorUnselected = i96;
        this.tabColorOption = i97;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ColorTokens m87988d(ColorTokens colorTokens, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i41, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i71, int i72, int i73, int i74, int i75, int i76, int i77, int i78, int i79, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, Object obj) {
        int i101 = (i98 & 1) != 0 ? colorTokens.textColorPrimary : i11;
        return colorTokens.m87990c(i101, (i98 & 2) != 0 ? colorTokens.textColorSecondary : i12, (i98 & 4) != 0 ? colorTokens.textColorTertiary : i13, (i98 & 8) != 0 ? colorTokens.textColorDisable : i14, (i98 & 16) != 0 ? colorTokens.textColorButton : i15, (i98 & 32) != 0 ? colorTokens.textColorButtonDisabled : i16, (i98 & 64) != 0 ? colorTokens.textColorLink : i17, (i98 & 128) != 0 ? colorTokens.textColorLinkHover : i18, (i98 & 256) != 0 ? colorTokens.textColorLinkActive : i19, (i98 & 512) != 0 ? colorTokens.textColorLinkDisabled : i21, (i98 & 1024) != 0 ? colorTokens.textColorAntiPrimary : i22, (i98 & 2048) != 0 ? colorTokens.textColorAntiSecondary : i23, (i98 & 4096) != 0 ? colorTokens.textColorWarning : i24, (i98 & 8192) != 0 ? colorTokens.textColorSuccess : i25, (i98 & 16384) != 0 ? colorTokens.textColorError : i26, (i98 & 32768) != 0 ? colorTokens.bgColorTopBar : i27, (i98 & 65536) != 0 ? colorTokens.bgColorOperate : i28, (i98 & 131072) != 0 ? colorTokens.bgColorDialog : i29, (i98 & 262144) != 0 ? colorTokens.bgColorDialogModule : i31, (i98 & 524288) != 0 ? colorTokens.bgColorEntryCard : i32, (i98 & 1048576) != 0 ? colorTokens.bgColorFunction : i33, (i98 & 2097152) != 0 ? colorTokens.bgColorBottomBar : i34, (i98 & 4194304) != 0 ? colorTokens.bgColorInput : i35, (i98 & 8388608) != 0 ? colorTokens.bgColorBubbleReciprocal : i36, (i98 & 16777216) != 0 ? colorTokens.bgColorBubbleOwn : i37, (i98 & 33554432) != 0 ? colorTokens.bgColorDefault : i38, (i98 & 67108864) != 0 ? colorTokens.bgColorTagMask : i39, (i98 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? colorTokens.bgColorElementMask : i41, (i98 & 268435456) != 0 ? colorTokens.bgColorMask : i42, (i98 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? colorTokens.bgColorMaskDisappeared : i43, (i98 & 1073741824) != 0 ? colorTokens.bgColorMaskBegin : i44, (i98 & Integer.MIN_VALUE) != 0 ? colorTokens.bgColorAvatar : i45, (i99 & 1) != 0 ? colorTokens.strokeColorPrimary : i46, (i99 & 2) != 0 ? colorTokens.strokeColorSecondary : i47, (i99 & 4) != 0 ? colorTokens.strokeColorModule : i48, (i99 & 8) != 0 ? colorTokens.shadowColor : i49, (i99 & 16) != 0 ? colorTokens.listColorDefault : i51, (i99 & 32) != 0 ? colorTokens.listColorHover : i52, (i99 & 64) != 0 ? colorTokens.listColorFocused : i53, (i99 & 128) != 0 ? colorTokens.buttonColorPrimaryDefault : i54, (i99 & 256) != 0 ? colorTokens.buttonColorPrimaryHover : i55, (i99 & 512) != 0 ? colorTokens.buttonColorPrimaryActive : i56, (i99 & 1024) != 0 ? colorTokens.buttonColorPrimaryDisabled : i57, (i99 & 2048) != 0 ? colorTokens.buttonColorSecondaryDefault : i58, (i99 & 4096) != 0 ? colorTokens.buttonColorSecondaryHover : i59, (i99 & 8192) != 0 ? colorTokens.buttonColorSecondaryActive : i61, (i99 & 16384) != 0 ? colorTokens.buttonColorSecondaryDisabled : i62, (i99 & 32768) != 0 ? colorTokens.buttonColorAccept : i63, (i99 & 65536) != 0 ? colorTokens.buttonColorHangupDefault : i64, (i99 & 131072) != 0 ? colorTokens.buttonColorHangupDisabled : i65, (i99 & 262144) != 0 ? colorTokens.buttonColorHangupHover : i66, (i99 & 524288) != 0 ? colorTokens.buttonColorHangupActive : i67, (i99 & 1048576) != 0 ? colorTokens.buttonColorOn : i68, (i99 & 2097152) != 0 ? colorTokens.buttonColorOff : i69, (i99 & 4194304) != 0 ? colorTokens.dropdownColorDefault : i71, (i99 & 8388608) != 0 ? colorTokens.dropdownColorHover : i72, (i99 & 16777216) != 0 ? colorTokens.dropdownColorActive : i73, (i99 & 33554432) != 0 ? colorTokens.scrollbarColorDefault : i74, (i99 & 67108864) != 0 ? colorTokens.scrollbarColorHover : i75, (i99 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? colorTokens.floatingColorDefault : i76, (i99 & 268435456) != 0 ? colorTokens.floatingColorOperate : i77, (i99 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? colorTokens.checkboxColorSelected : i78, (i99 & 1073741824) != 0 ? colorTokens.toastColorWarning : i79, (i99 & Integer.MIN_VALUE) != 0 ? colorTokens.toastColorSuccess : i81, (i100 & 1) != 0 ? colorTokens.toastColorError : i82, (i100 & 2) != 0 ? colorTokens.toastColorDefault : i83, (i100 & 4) != 0 ? colorTokens.tagColorLevel1 : i84, (i100 & 8) != 0 ? colorTokens.tagColorLevel2 : i85, (i100 & 16) != 0 ? colorTokens.tagColorLevel3 : i86, (i100 & 32) != 0 ? colorTokens.tagColorLevel4 : i87, (i100 & 64) != 0 ? colorTokens.switchColorOff : i88, (i100 & 128) != 0 ? colorTokens.switchColorOn : i89, (i100 & 256) != 0 ? colorTokens.switchColorButton : i91, (i100 & 512) != 0 ? colorTokens.sliderColorFilled : i92, (i100 & 1024) != 0 ? colorTokens.sliderColorEmpty : i93, (i100 & 2048) != 0 ? colorTokens.sliderColorButton : i94, (i100 & 4096) != 0 ? colorTokens.tabColorSelected : i95, (i100 & 8192) != 0 ? colorTokens.tabColorUnselected : i96, (i100 & 16384) != 0 ? colorTokens.tabColorOption : i97);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ColorTokens m87990c(@ColorInt int i11, @ColorInt int i12, @ColorInt int i13, @ColorInt int i14, @ColorInt int i15, @ColorInt int i16, @ColorInt int i17, @ColorInt int i18, @ColorInt int i19, @ColorInt int i21, @ColorInt int i22, @ColorInt int i23, @ColorInt int i24, @ColorInt int i25, @ColorInt int i26, @ColorInt int i27, @ColorInt int i28, @ColorInt int i29, @ColorInt int i31, @ColorInt int i32, @ColorInt int i33, @ColorInt int i34, @ColorInt int i35, @ColorInt int i36, @ColorInt int i37, @ColorInt int i38, @ColorInt int i39, @ColorInt int i41, @ColorInt int i42, @ColorInt int i43, @ColorInt int i44, @ColorInt int i45, @ColorInt int i46, @ColorInt int i47, @ColorInt int i48, @ColorInt int i49, @ColorInt int i51, @ColorInt int i52, @ColorInt int i53, @ColorInt int i54, @ColorInt int i55, @ColorInt int i56, @ColorInt int i57, @ColorInt int i58, @ColorInt int i59, @ColorInt int i61, @ColorInt int i62, @ColorInt int i63, @ColorInt int i64, @ColorInt int i65, @ColorInt int i66, @ColorInt int i67, @ColorInt int i68, @ColorInt int i69, @ColorInt int i71, @ColorInt int i72, @ColorInt int i73, @ColorInt int i74, @ColorInt int i75, @ColorInt int i76, @ColorInt int i77, @ColorInt int i78, @ColorInt int i79, @ColorInt int i81, @ColorInt int i82, @ColorInt int i83, @ColorInt int i84, @ColorInt int i85, @ColorInt int i86, @ColorInt int i87, @ColorInt int i88, @ColorInt int i89, @ColorInt int i91, @ColorInt int i92, @ColorInt int i93, @ColorInt int i94, @ColorInt int i95, @ColorInt int i96, @ColorInt int i97) {
        return new ColorTokens(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, i28, i29, i31, i32, i33, i34, i35, i36, i37, i38, i39, i41, i42, i43, i44, i45, i46, i47, i48, i49, i51, i52, i53, i54, i55, i56, i57, i58, i59, i61, i62, i63, i64, i65, i66, i67, i68, i69, i71, i72, i73, i74, i75, i76, i77, i78, i79, i81, i82, i83, i84, i85, i86, i87, i88, i89, i91, i92, i93, i94, i95, i96, i97);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorTokens)) {
            return false;
        }
        ColorTokens colorTokens = (ColorTokens) other;
        return this.textColorPrimary == colorTokens.textColorPrimary && this.textColorSecondary == colorTokens.textColorSecondary && this.textColorTertiary == colorTokens.textColorTertiary && this.textColorDisable == colorTokens.textColorDisable && this.textColorButton == colorTokens.textColorButton && this.textColorButtonDisabled == colorTokens.textColorButtonDisabled && this.textColorLink == colorTokens.textColorLink && this.textColorLinkHover == colorTokens.textColorLinkHover && this.textColorLinkActive == colorTokens.textColorLinkActive && this.textColorLinkDisabled == colorTokens.textColorLinkDisabled && this.textColorAntiPrimary == colorTokens.textColorAntiPrimary && this.textColorAntiSecondary == colorTokens.textColorAntiSecondary && this.textColorWarning == colorTokens.textColorWarning && this.textColorSuccess == colorTokens.textColorSuccess && this.textColorError == colorTokens.textColorError && this.bgColorTopBar == colorTokens.bgColorTopBar && this.bgColorOperate == colorTokens.bgColorOperate && this.bgColorDialog == colorTokens.bgColorDialog && this.bgColorDialogModule == colorTokens.bgColorDialogModule && this.bgColorEntryCard == colorTokens.bgColorEntryCard && this.bgColorFunction == colorTokens.bgColorFunction && this.bgColorBottomBar == colorTokens.bgColorBottomBar && this.bgColorInput == colorTokens.bgColorInput && this.bgColorBubbleReciprocal == colorTokens.bgColorBubbleReciprocal && this.bgColorBubbleOwn == colorTokens.bgColorBubbleOwn && this.bgColorDefault == colorTokens.bgColorDefault && this.bgColorTagMask == colorTokens.bgColorTagMask && this.bgColorElementMask == colorTokens.bgColorElementMask && this.bgColorMask == colorTokens.bgColorMask && this.bgColorMaskDisappeared == colorTokens.bgColorMaskDisappeared && this.bgColorMaskBegin == colorTokens.bgColorMaskBegin && this.bgColorAvatar == colorTokens.bgColorAvatar && this.strokeColorPrimary == colorTokens.strokeColorPrimary && this.strokeColorSecondary == colorTokens.strokeColorSecondary && this.strokeColorModule == colorTokens.strokeColorModule && this.shadowColor == colorTokens.shadowColor && this.listColorDefault == colorTokens.listColorDefault && this.listColorHover == colorTokens.listColorHover && this.listColorFocused == colorTokens.listColorFocused && this.buttonColorPrimaryDefault == colorTokens.buttonColorPrimaryDefault && this.buttonColorPrimaryHover == colorTokens.buttonColorPrimaryHover && this.buttonColorPrimaryActive == colorTokens.buttonColorPrimaryActive && this.buttonColorPrimaryDisabled == colorTokens.buttonColorPrimaryDisabled && this.buttonColorSecondaryDefault == colorTokens.buttonColorSecondaryDefault && this.buttonColorSecondaryHover == colorTokens.buttonColorSecondaryHover && this.buttonColorSecondaryActive == colorTokens.buttonColorSecondaryActive && this.buttonColorSecondaryDisabled == colorTokens.buttonColorSecondaryDisabled && this.buttonColorAccept == colorTokens.buttonColorAccept && this.buttonColorHangupDefault == colorTokens.buttonColorHangupDefault && this.buttonColorHangupDisabled == colorTokens.buttonColorHangupDisabled && this.buttonColorHangupHover == colorTokens.buttonColorHangupHover && this.buttonColorHangupActive == colorTokens.buttonColorHangupActive && this.buttonColorOn == colorTokens.buttonColorOn && this.buttonColorOff == colorTokens.buttonColorOff && this.dropdownColorDefault == colorTokens.dropdownColorDefault && this.dropdownColorHover == colorTokens.dropdownColorHover && this.dropdownColorActive == colorTokens.dropdownColorActive && this.scrollbarColorDefault == colorTokens.scrollbarColorDefault && this.scrollbarColorHover == colorTokens.scrollbarColorHover && this.floatingColorDefault == colorTokens.floatingColorDefault && this.floatingColorOperate == colorTokens.floatingColorOperate && this.checkboxColorSelected == colorTokens.checkboxColorSelected && this.toastColorWarning == colorTokens.toastColorWarning && this.toastColorSuccess == colorTokens.toastColorSuccess && this.toastColorError == colorTokens.toastColorError && this.toastColorDefault == colorTokens.toastColorDefault && this.tagColorLevel1 == colorTokens.tagColorLevel1 && this.tagColorLevel2 == colorTokens.tagColorLevel2 && this.tagColorLevel3 == colorTokens.tagColorLevel3 && this.tagColorLevel4 == colorTokens.tagColorLevel4 && this.switchColorOff == colorTokens.switchColorOff && this.switchColorOn == colorTokens.switchColorOn && this.switchColorButton == colorTokens.switchColorButton && this.sliderColorFilled == colorTokens.sliderColorFilled && this.sliderColorEmpty == colorTokens.sliderColorEmpty && this.sliderColorButton == colorTokens.sliderColorButton && this.tabColorSelected == colorTokens.tabColorSelected && this.tabColorUnselected == colorTokens.tabColorUnselected && this.tabColorOption == colorTokens.tabColorOption;
    }

    @NotNull
    public String toString() {
        return "ColorTokens(textColorPrimary=" + this.textColorPrimary + ", textColorSecondary=" + this.textColorSecondary + ", textColorTertiary=" + this.textColorTertiary + ", textColorDisable=" + this.textColorDisable + ", textColorButton=" + this.textColorButton + ", textColorButtonDisabled=" + this.textColorButtonDisabled + ", textColorLink=" + this.textColorLink + ", textColorLinkHover=" + this.textColorLinkHover + ", textColorLinkActive=" + this.textColorLinkActive + ", textColorLinkDisabled=" + this.textColorLinkDisabled + ", textColorAntiPrimary=" + this.textColorAntiPrimary + ", textColorAntiSecondary=" + this.textColorAntiSecondary + ", textColorWarning=" + this.textColorWarning + ", textColorSuccess=" + this.textColorSuccess + ", textColorError=" + this.textColorError + ", bgColorTopBar=" + this.bgColorTopBar + ", bgColorOperate=" + this.bgColorOperate + ", bgColorDialog=" + this.bgColorDialog + ", bgColorDialogModule=" + this.bgColorDialogModule + ", bgColorEntryCard=" + this.bgColorEntryCard + ", bgColorFunction=" + this.bgColorFunction + ", bgColorBottomBar=" + this.bgColorBottomBar + ", bgColorInput=" + this.bgColorInput + ", bgColorBubbleReciprocal=" + this.bgColorBubbleReciprocal + ", bgColorBubbleOwn=" + this.bgColorBubbleOwn + ", bgColorDefault=" + this.bgColorDefault + ", bgColorTagMask=" + this.bgColorTagMask + ", bgColorElementMask=" + this.bgColorElementMask + ", bgColorMask=" + this.bgColorMask + ", bgColorMaskDisappeared=" + this.bgColorMaskDisappeared + ", bgColorMaskBegin=" + this.bgColorMaskBegin + ", bgColorAvatar=" + this.bgColorAvatar + ", strokeColorPrimary=" + this.strokeColorPrimary + ", strokeColorSecondary=" + this.strokeColorSecondary + ", strokeColorModule=" + this.strokeColorModule + ", shadowColor=" + this.shadowColor + ", listColorDefault=" + this.listColorDefault + ", listColorHover=" + this.listColorHover + ", listColorFocused=" + this.listColorFocused + ", buttonColorPrimaryDefault=" + this.buttonColorPrimaryDefault + ", buttonColorPrimaryHover=" + this.buttonColorPrimaryHover + ", buttonColorPrimaryActive=" + this.buttonColorPrimaryActive + ", buttonColorPrimaryDisabled=" + this.buttonColorPrimaryDisabled + ", buttonColorSecondaryDefault=" + this.buttonColorSecondaryDefault + ", buttonColorSecondaryHover=" + this.buttonColorSecondaryHover + ", buttonColorSecondaryActive=" + this.buttonColorSecondaryActive + ", buttonColorSecondaryDisabled=" + this.buttonColorSecondaryDisabled + ", buttonColorAccept=" + this.buttonColorAccept + ", buttonColorHangupDefault=" + this.buttonColorHangupDefault + ", buttonColorHangupDisabled=" + this.buttonColorHangupDisabled + ", buttonColorHangupHover=" + this.buttonColorHangupHover + ", buttonColorHangupActive=" + this.buttonColorHangupActive + ", buttonColorOn=" + this.buttonColorOn + ", buttonColorOff=" + this.buttonColorOff + ", dropdownColorDefault=" + this.dropdownColorDefault + ", dropdownColorHover=" + this.dropdownColorHover + ", dropdownColorActive=" + this.dropdownColorActive + ", scrollbarColorDefault=" + this.scrollbarColorDefault + ", scrollbarColorHover=" + this.scrollbarColorHover + ", floatingColorDefault=" + this.floatingColorDefault + ", floatingColorOperate=" + this.floatingColorOperate + ", checkboxColorSelected=" + this.checkboxColorSelected + ", toastColorWarning=" + this.toastColorWarning + ", toastColorSuccess=" + this.toastColorSuccess + ", toastColorError=" + this.toastColorError + ", toastColorDefault=" + this.toastColorDefault + ", tagColorLevel1=" + this.tagColorLevel1 + ", tagColorLevel2=" + this.tagColorLevel2 + ", tagColorLevel3=" + this.tagColorLevel3 + ", tagColorLevel4=" + this.tagColorLevel4 + ", switchColorOff=" + this.switchColorOff + ", switchColorOn=" + this.switchColorOn + ", switchColorButton=" + this.switchColorButton + ", sliderColorFilled=" + this.sliderColorFilled + ", sliderColorEmpty=" + this.sliderColorEmpty + ", sliderColorButton=" + this.sliderColorButton + ", tabColorSelected=" + this.tabColorSelected + ", tabColorUnselected=" + this.tabColorUnselected + ", tabColorOption=" + this.tabColorOption + ')';
    }

    /* JADX INFO: renamed from: B */
    public static final Map m87985B() {
        Set<Map.Entry<String, Integer>> setEntrySet = f87323C0.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM90091to = TuplesKt.m90091to(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getTextColorSecondary() {
        return this.textColorSecondary;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public final int m87991e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (key.hashCode()) {
            case -2092403500:
                if (key.equals("sliderColorButton")) {
                    return this.sliderColorButton;
                }
                return 0;
            case -2088746736:
                if (key.equals("buttonColorOn")) {
                    return this.buttonColorOn;
                }
                return 0;
            case -2039396528:
                if (key.equals("textColorLink")) {
                    return this.textColorLink;
                }
                return 0;
            case -2019930528:
                if (key.equals("switchColorOff")) {
                    return this.switchColorOff;
                }
                return 0;
            case -1994285687:
                if (key.equals("tabColorSelected")) {
                    return this.tabColorSelected;
                }
                return 0;
            case -1989215484:
                if (key.equals("sliderColorFilled")) {
                    return this.sliderColorFilled;
                }
                return 0;
            case -1970883324:
                if (key.equals("bgColorBubbleReciprocal")) {
                    return this.bgColorBubbleReciprocal;
                }
                return 0;
            case -1930320948:
                if (key.equals("textColorLinkHover")) {
                    return this.textColorLinkHover;
                }
                return 0;
            case -1855241262:
                if (key.equals("textColorDisable")) {
                    return this.textColorDisable;
                }
                return 0;
            case -1669499828:
                if (key.equals("bgColorInput")) {
                    return this.bgColorInput;
                }
                return 0;
            case -1665877409:
                if (key.equals("scrollbarColorHover")) {
                    return this.scrollbarColorHover;
                }
                return 0;
            case -1629994744:
                if (key.equals("textColorButton")) {
                    return this.textColorButton;
                }
                return 0;
            case -1604794980:
                if (key.equals("textColorAntiSecondary")) {
                    return this.textColorAntiSecondary;
                }
                return 0;
            case -1589741021:
                if (key.equals(ViewProps.SHADOW_COLOR)) {
                    return this.shadowColor;
                }
                return 0;
            case -1589179698:
                if (key.equals("switchColorOn")) {
                    return this.switchColorOn;
                }
                return 0;
            case -1575624280:
                if (key.equals("bgColorTagMask")) {
                    return this.bgColorTagMask;
                }
                return 0;
            case -1465597590:
                if (key.equals("bgColorBottomBar")) {
                    return this.bgColorBottomBar;
                }
                return 0;
            case -1299445161:
                if (key.equals("strokeColorModule")) {
                    return this.strokeColorModule;
                }
                return 0;
            case -1289482874:
                if (key.equals("bgColorOperate")) {
                    return this.bgColorOperate;
                }
                return 0;
            case -1259600404:
                if (key.equals("toastColorError")) {
                    return this.toastColorError;
                }
                return 0;
            case -1109974567:
                if (key.equals("buttonColorSecondaryHover")) {
                    return this.buttonColorSecondaryHover;
                }
                return 0;
            case -1102250018:
                if (key.equals("textColorSecondary")) {
                    return this.textColorSecondary;
                }
                return 0;
            case -1098751763:
                if (key.equals("textColorSuccess")) {
                    return this.textColorSuccess;
                }
                return 0;
            case -1089897570:
                if (key.equals("buttonColorSecondaryDefault")) {
                    return this.buttonColorSecondaryDefault;
                }
                return 0;
            case -986744192:
                if (key.equals("toastColorWarning")) {
                    return this.toastColorWarning;
                }
                return 0;
            case -929771894:
                if (key.equals("dropdownColorHover")) {
                    return this.dropdownColorHover;
                }
                return 0;
            case -874840158:
                if (key.equals("tabColorUnselected")) {
                    return this.tabColorUnselected;
                }
                return 0;
            case -869814569:
                if (key.equals("listColorHover")) {
                    return this.listColorHover;
                }
                return 0;
            case -869774294:
                if (key.equals("textColorAntiPrimary")) {
                    return this.textColorAntiPrimary;
                }
                return 0;
            case -663225317:
                if (key.equals("checkboxColorSelected")) {
                    return this.checkboxColorSelected;
                }
                return 0;
            case -604488572:
                if (key.equals("floatingColorDefault")) {
                    return this.floatingColorDefault;
                }
                return 0;
            case -566386395:
                if (key.equals("toastColorDefault")) {
                    return this.toastColorDefault;
                }
                return 0;
            case -514283758:
                if (key.equals("bgColorDialogModule")) {
                    return this.bgColorDialogModule;
                }
                return 0;
            case -495976023:
                if (key.equals("strokeColorSecondary")) {
                    return this.strokeColorSecondary;
                }
                return 0;
            case -436980457:
                if (key.equals("bgColorAvatar")) {
                    return this.bgColorAvatar;
                }
                return 0;
            case -375548436:
                if (key.equals("textColorLinkDisabled")) {
                    return this.textColorLinkDisabled;
                }
                return 0;
            case -363106042:
                if (key.equals("bgColorDialog")) {
                    return this.bgColorDialog;
                }
                return 0;
            case -359791657:
                if (key.equals("buttonColorPrimaryActive")) {
                    return this.buttonColorPrimaryActive;
                }
                return 0;
            case -326639522:
                if (key.equals("buttonColorOff")) {
                    return this.buttonColorOff;
                }
                return 0;
            case -281876917:
                if (key.equals("buttonColorPrimaryHover")) {
                    return this.buttonColorPrimaryHover;
                }
                return 0;
            case -261015031:
                if (key.equals("buttonColorSecondaryActive")) {
                    return this.buttonColorSecondaryActive;
                }
                return 0;
            case -235483379:
                if (key.equals("buttonColorPrimaryDisabled")) {
                    return this.buttonColorPrimaryDisabled;
                }
                return 0;
            case -193319462:
                if (key.equals("buttonColorHangupDisabled")) {
                    return this.buttonColorHangupDisabled;
                }
                return 0;
            case -165251502:
                if (key.equals("listColorFocused")) {
                    return this.listColorFocused;
                }
                return 0;
            case -90080732:
                if (key.equals("bgColorEntryCard")) {
                    return this.bgColorEntryCard;
                }
                return 0;
            case 78050934:
                if (key.equals("textColorLinkActive")) {
                    return this.textColorLinkActive;
                }
                return 0;
            case 100907580:
                if (key.equals("bgColorTopBar")) {
                    return this.bgColorTopBar;
                }
                return 0;
            case 142994320:
                if (key.equals("buttonColorPrimaryDefault")) {
                    return this.buttonColorPrimaryDefault;
                }
                return 0;
            case 199573695:
                if (key.equals("buttonColorSecondaryDisabled")) {
                    return this.buttonColorSecondaryDisabled;
                }
                return 0;
            case 286179343:
                if (key.equals("dropdownColorDefault")) {
                    return this.dropdownColorDefault;
                }
                return 0;
            case 310771871:
                if (key.equals("bgColorMaskBegin")) {
                    return this.bgColorMaskBegin;
                }
                return 0;
            case 316607207:
                if (key.equals("toastColorSuccess")) {
                    return this.toastColorSuccess;
                }
                return 0;
            case 453652204:
                if (key.equals("textColorPrimary")) {
                    return this.textColorPrimary;
                }
                return 0;
            case 562229270:
                if (key.equals("bgColorFunction")) {
                    return this.bgColorFunction;
                }
                return 0;
            case 627768171:
                if (key.equals("sliderColorEmpty")) {
                    return this.sliderColorEmpty;
                }
                return 0;
            case 678630561:
                if (key.equals("switchColorButton")) {
                    return this.switchColorButton;
                }
                return 0;
            case 837091107:
                if (key.equals("buttonColorHangupDefault")) {
                    return this.buttonColorHangupDefault;
                }
                return 0;
            case 882601927:
                if (key.equals("floatingColorOperate")) {
                    return this.floatingColorOperate;
                }
                return 0;
            case 916083242:
                if (key.equals("bgColorMask")) {
                    return this.bgColorMask;
                }
                return 0;
            case 1030300536:
                if (key.equals("dropdownColorActive")) {
                    return this.dropdownColorActive;
                }
                return 0;
            case 1074325433:
                if (key.equals("buttonColorAccept")) {
                    return this.buttonColorAccept;
                }
                return 0;
            case 1087812316:
                if (key.equals("bgColorBubbleOwn")) {
                    return this.bgColorBubbleOwn;
                }
                return 0;
            case 1091573475:
                if (key.equals("tabColorOption")) {
                    return this.tabColorOption;
                }
                return 0;
            case 1124673399:
                if (key.equals("strokeColorPrimary")) {
                    return this.strokeColorPrimary;
                }
                return 0;
            case 1171326120:
                if (key.equals("textColorTertiary")) {
                    return this.textColorTertiary;
                }
                return 0;
            case 1197024626:
                if (key.equals("textColorError")) {
                    return this.textColorError;
                }
                return 0;
            case 1314374302:
                if (key.equals("buttonColorHangupHover")) {
                    return this.buttonColorHangupHover;
                }
                return 0;
            case 1321735928:
                if (key.equals("bgColorMaskDisappeared")) {
                    return this.bgColorMaskDisappeared;
                }
                return 0;
            case 1518393923:
                if (key.equals("bgColorDefault")) {
                    return this.bgColorDefault;
                }
                return 0;
            case 1558383268:
                if (key.equals("scrollbarColorDefault")) {
                    return this.scrollbarColorDefault;
                }
                return 0;
            case 1563121572:
                if (key.equals("textColorButtonDisabled")) {
                    return this.textColorButtonDisabled;
                }
                return 0;
            case 1619980042:
                if (key.equals("bgColorElementMask")) {
                    return this.bgColorElementMask;
                }
                return 0;
            case 1640996470:
                if (key.equals("tagColorLevel1")) {
                    return this.tagColorLevel1;
                }
                return 0;
            case 1640996471:
                if (key.equals("tagColorLevel2")) {
                    return this.tagColorLevel2;
                }
                return 0;
            case 1640996472:
                if (key.equals("tagColorLevel3")) {
                    return this.tagColorLevel3;
                }
                return 0;
            case 1640996473:
                if (key.equals("tagColorLevel4")) {
                    return this.tagColorLevel4;
                }
                return 0;
            case 1879355876:
                if (key.equals("buttonColorHangupActive")) {
                    return this.buttonColorHangupActive;
                }
                return 0;
            case 1892864134:
                if (key.equals("textColorWarning")) {
                    return this.textColorWarning;
                }
                return 0;
            case 2070593820:
                if (key.equals("listColorDefault")) {
                    return this.listColorDefault;
                }
                return 0;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBgColorDialog() {
        return this.bgColorDialog;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getBgColorMask() {
        return this.bgColorMask;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getBgColorOperate() {
        return this.bgColorOperate;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.textColorPrimary) * 31) + Integer.hashCode(this.textColorSecondary)) * 31) + Integer.hashCode(this.textColorTertiary)) * 31) + Integer.hashCode(this.textColorDisable)) * 31) + Integer.hashCode(this.textColorButton)) * 31) + Integer.hashCode(this.textColorButtonDisabled)) * 31) + Integer.hashCode(this.textColorLink)) * 31) + Integer.hashCode(this.textColorLinkHover)) * 31) + Integer.hashCode(this.textColorLinkActive)) * 31) + Integer.hashCode(this.textColorLinkDisabled)) * 31) + Integer.hashCode(this.textColorAntiPrimary)) * 31) + Integer.hashCode(this.textColorAntiSecondary)) * 31) + Integer.hashCode(this.textColorWarning)) * 31) + Integer.hashCode(this.textColorSuccess)) * 31) + Integer.hashCode(this.textColorError)) * 31) + Integer.hashCode(this.bgColorTopBar)) * 31) + Integer.hashCode(this.bgColorOperate)) * 31) + Integer.hashCode(this.bgColorDialog)) * 31) + Integer.hashCode(this.bgColorDialogModule)) * 31) + Integer.hashCode(this.bgColorEntryCard)) * 31) + Integer.hashCode(this.bgColorFunction)) * 31) + Integer.hashCode(this.bgColorBottomBar)) * 31) + Integer.hashCode(this.bgColorInput)) * 31) + Integer.hashCode(this.bgColorBubbleReciprocal)) * 31) + Integer.hashCode(this.bgColorBubbleOwn)) * 31) + Integer.hashCode(this.bgColorDefault)) * 31) + Integer.hashCode(this.bgColorTagMask)) * 31) + Integer.hashCode(this.bgColorElementMask)) * 31) + Integer.hashCode(this.bgColorMask)) * 31) + Integer.hashCode(this.bgColorMaskDisappeared)) * 31) + Integer.hashCode(this.bgColorMaskBegin)) * 31) + Integer.hashCode(this.bgColorAvatar)) * 31) + Integer.hashCode(this.strokeColorPrimary)) * 31) + Integer.hashCode(this.strokeColorSecondary)) * 31) + Integer.hashCode(this.strokeColorModule)) * 31) + Integer.hashCode(this.shadowColor)) * 31) + Integer.hashCode(this.listColorDefault)) * 31) + Integer.hashCode(this.listColorHover)) * 31) + Integer.hashCode(this.listColorFocused)) * 31) + Integer.hashCode(this.buttonColorPrimaryDefault)) * 31) + Integer.hashCode(this.buttonColorPrimaryHover)) * 31) + Integer.hashCode(this.buttonColorPrimaryActive)) * 31) + Integer.hashCode(this.buttonColorPrimaryDisabled)) * 31) + Integer.hashCode(this.buttonColorSecondaryDefault)) * 31) + Integer.hashCode(this.buttonColorSecondaryHover)) * 31) + Integer.hashCode(this.buttonColorSecondaryActive)) * 31) + Integer.hashCode(this.buttonColorSecondaryDisabled)) * 31) + Integer.hashCode(this.buttonColorAccept)) * 31) + Integer.hashCode(this.buttonColorHangupDefault)) * 31) + Integer.hashCode(this.buttonColorHangupDisabled)) * 31) + Integer.hashCode(this.buttonColorHangupHover)) * 31) + Integer.hashCode(this.buttonColorHangupActive)) * 31) + Integer.hashCode(this.buttonColorOn)) * 31) + Integer.hashCode(this.buttonColorOff)) * 31) + Integer.hashCode(this.dropdownColorDefault)) * 31) + Integer.hashCode(this.dropdownColorHover)) * 31) + Integer.hashCode(this.dropdownColorActive)) * 31) + Integer.hashCode(this.scrollbarColorDefault)) * 31) + Integer.hashCode(this.scrollbarColorHover)) * 31) + Integer.hashCode(this.floatingColorDefault)) * 31) + Integer.hashCode(this.floatingColorOperate)) * 31) + Integer.hashCode(this.checkboxColorSelected)) * 31) + Integer.hashCode(this.toastColorWarning)) * 31) + Integer.hashCode(this.toastColorSuccess)) * 31) + Integer.hashCode(this.toastColorError)) * 31) + Integer.hashCode(this.toastColorDefault)) * 31) + Integer.hashCode(this.tagColorLevel1)) * 31) + Integer.hashCode(this.tagColorLevel2)) * 31) + Integer.hashCode(this.tagColorLevel3)) * 31) + Integer.hashCode(this.tagColorLevel4)) * 31) + Integer.hashCode(this.switchColorOff)) * 31) + Integer.hashCode(this.switchColorOn)) * 31) + Integer.hashCode(this.switchColorButton)) * 31) + Integer.hashCode(this.sliderColorFilled)) * 31) + Integer.hashCode(this.sliderColorEmpty)) * 31) + Integer.hashCode(this.sliderColorButton)) * 31) + Integer.hashCode(this.tabColorSelected)) * 31) + Integer.hashCode(this.tabColorUnselected)) * 31) + Integer.hashCode(this.tabColorOption);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getButtonColorHangupActive() {
        return this.buttonColorHangupActive;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getButtonColorHangupDefault() {
        return this.buttonColorHangupDefault;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getButtonColorHangupDisabled() {
        return this.buttonColorHangupDisabled;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getButtonColorPrimaryActive() {
        return this.buttonColorPrimaryActive;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getButtonColorPrimaryDefault() {
        return this.buttonColorPrimaryDefault;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getButtonColorPrimaryDisabled() {
        return this.buttonColorPrimaryDisabled;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getButtonColorSecondaryActive() {
        return this.buttonColorSecondaryActive;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getButtonColorSecondaryDefault() {
        return this.buttonColorSecondaryDefault;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getButtonColorSecondaryDisabled() {
        return this.buttonColorSecondaryDisabled;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getStrokeColorSecondary() {
        return this.strokeColorSecondary;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getTextColorButton() {
        return this.textColorButton;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTextColorButtonDisabled() {
        return this.textColorButtonDisabled;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getTextColorDisable() {
        return this.textColorDisable;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getTextColorError() {
        return this.textColorError;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getTextColorLink() {
        return this.textColorLink;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getTextColorLinkActive() {
        return this.textColorLinkActive;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getTextColorLinkDisabled() {
        return this.textColorLinkDisabled;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getTextColorPrimary() {
        return this.textColorPrimary;
    }
}
