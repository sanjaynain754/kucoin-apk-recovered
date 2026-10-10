package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$string;
import com.kubi.assets.finance.ProductType;
import com.kubi.assets.service.C10921d;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00105\u001a\u000206\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010;\u001a\u000206\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\b\b\u0002\u0010@\u001a\u000206\u0012\b\b\u0002\u0010A\u001a\u000206\u0012\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\t\u0010\u009a\u0001\u001a\u00020?H\u0016J\u0007\u0010\u009b\u0001\u001a\u00020\u0003J\u0007\u0010\u009c\u0001\u001a\u00020\u0003J\u0007\u0010\u009d\u0001\u001a\u00020\u0003J\u0007\u0010\u009e\u0001\u001a\u00020\u0003J\u0007\u0010\u009f\u0001\u001a\u00020\u0003J\u0007\u0010 \u0001\u001a\u00020\u0003J\u0007\u0010¡\u0001\u001a\u000206J\u0007\u0010¢\u0001\u001a\u00020\u0003J\u0007\u0010£\u0001\u001a\u00020\u0003J\u001a\u0010¤\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030¥\u00010CJ\u0007\u0010¦\u0001\u001a\u00020\u0003J\u0007\u0010§\u0001\u001a\u00020?J\u0007\u0010¨\u0001\u001a\u00020\u0003J\u0007\u0010©\u0001\u001a\u00020\u0003J\u0007\u0010ª\u0001\u001a\u00020\u0003J\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u000206HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010á\u0001\u001a\u000206HÆ\u0003J\f\u0010â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010ä\u0001\u001a\u0004\u0018\u00010?HÆ\u0003¢\u0006\u0003\u0010\u0090\u0001J\n\u0010å\u0001\u001a\u000206HÆ\u0003J\n\u0010æ\u0001\u001a\u000206HÆ\u0003J\u0012\u0010ç\u0001\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CHÆ\u0003JÞ\u0005\u0010è\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010;\u001a\u0002062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u0002062\b\b\u0002\u0010A\u001a\u0002062\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CHÆ\u0001¢\u0006\u0003\u0010é\u0001J\u0016\u0010ê\u0001\u001a\u0002062\n\u0010ë\u0001\u001a\u0005\u0018\u00010ì\u0001HÖ\u0003J\n\u0010í\u0001\u001a\u00020?HÖ\u0001J\n\u0010î\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010H\"\u0004\bM\u0010NR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010H\"\u0004\bP\u0010NR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010HR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010HR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010HR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010HR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010HR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010HR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010HR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010HR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010HR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010HR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010HR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010HR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\\R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\\R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010HR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010HR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010HR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010HR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010HR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010HR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010HR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010HR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010HR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010HR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010HR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010HR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010HR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010HR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010HR\u001c\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010H\"\u0004\bt\u0010NR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010HR\u001c\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010H\"\u0004\bw\u0010NR\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010HR\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010HR\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010HR\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010HR\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010HR\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010HR\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010HR\u001d\u00105\u001a\u000206X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R \u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0014\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010HR\u0014\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010HR\u001e\u0010;\u001a\u000206X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u0080\u0001\"\u0006\b\u008a\u0001\u0010\u0082\u0001R\u001e\u0010<\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010H\"\u0005\b\u008c\u0001\u0010NR\u001e\u0010=\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010H\"\u0005\b\u008e\u0001\u0010NR#\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010@\u001a\u0002068\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b@\u0010\u0080\u0001\"\u0006\b\u0094\u0001\u0010\u0082\u0001R!\u0010A\u001a\u0002068\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bA\u0010\u0080\u0001\"\u0006\b\u0095\u0001\u0010\u0082\u0001R*\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006ï\u0001"}, m90084d2 = {"Lcom/kubi/assets/entity/ProductChildEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "amount", "", "avg7Return", "baseStakingReturn", "bigCurrencyIcon", "category", "categoryText", FirebaseAnalytics.Param.CURRENCY, "direction", "dropAmount", "dropCurrency", "freezingAmount", "fundCurrency", TUIConstants.TUIChat.INPUT_MORE_ICON, "id", "incomeAmount", "incomeCurrency", "incomeReleaseAmount", "Ljava/math/BigDecimal;", "jumpType", "jumpUrl", "leverage", "lockAmount", "lockEndTime", "lockTime", "maxPrice", "maxReturn", "minPrice", "minReturn", "name", "personalLockEndTime", "personalLockPeriod", "polAmount", "polReleaseAmount", "polReturn", "polkaRewardAmount", "polkaRewardCurrency", "polkaStatus", "productId", "recentIncomeAmount", "recentPolAmount", "smallCurrencyIcon", "stakingReturn", "status", "strikeCurrency", "targetCurrency", "totalReturn", "type", "unlockPeriod", "unlockedAmount", "unlockingAmount", "manualRedeemLocked", "", "kcsRightsBonus", "Lcom/kubi/assets/entity/KcsRightsBonusEntity;", "targetPrice", "koPrice", "incomeSumForFiat", "incomeSum", "incomeSumCurrency", "incomeCurrencyCount", "", "isUserRelock", "isProductRelock", "estimateIncomes", "", "Lcom/kubi/assets/entity/EstimateIncome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/assets/entity/KcsRightsBonusEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/util/List;)V", "getAmount", "()Ljava/lang/String;", "getAvg7Return", "getBaseStakingReturn", "getBigCurrencyIcon", "getCategory", "setCategory", "(Ljava/lang/String;)V", "getCategoryText", "setCategoryText", "getCurrency", "getDirection", "getDropAmount", "getDropCurrency", "getFreezingAmount", "getFundCurrency", "getIcon", "getId", "getIncomeAmount", "getIncomeCurrency", "getIncomeReleaseAmount", "()Ljava/math/BigDecimal;", "getJumpType", "getJumpUrl", "getLeverage", "getLockAmount", "getLockEndTime", "getLockTime", "getMaxPrice", "getMaxReturn", "getMinPrice", "getMinReturn", "getName", "getPersonalLockEndTime", "getPersonalLockPeriod", "getPolAmount", "getPolReleaseAmount", "getPolReturn", "getPolkaRewardAmount", "getPolkaRewardCurrency", "getPolkaStatus", "getProductId", "getRecentIncomeAmount", "getRecentPolAmount", "getSmallCurrencyIcon", "setSmallCurrencyIcon", "getStakingReturn", "getStatus", "setStatus", "getStrikeCurrency", "getTargetCurrency", "getTotalReturn", "getType", "getUnlockPeriod", "getUnlockedAmount", "getUnlockingAmount", "getManualRedeemLocked", "()Z", "setManualRedeemLocked", "(Z)V", "getKcsRightsBonus", "()Lcom/kubi/assets/entity/KcsRightsBonusEntity;", "setKcsRightsBonus", "(Lcom/kubi/assets/entity/KcsRightsBonusEntity;)V", "getTargetPrice", "getKoPrice", "getIncomeSumForFiat", "setIncomeSumForFiat", "getIncomeSum", "setIncomeSum", "getIncomeSumCurrency", "setIncomeSumCurrency", "getIncomeCurrencyCount", "()Ljava/lang/Integer;", "setIncomeCurrencyCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "setUserRelock", "setProductRelock", "getEstimateIncomes", "()Ljava/util/List;", "setEstimateIncomes", "(Ljava/util/List;)V", "getItemType", "getLockAmountStr", "getLockAmountWithCurrencyStr", "getTotalReturnStr", "getTargetPriceStr", "getKoPriceStr", "getLockEndTimeStr", "isShowEndDate", "getIncomeAmountStr", "getIncomeSumStr", "getEstimateOrTotalItems", "Lkotlin/Pair;", "getRecentIncomeAmountStr", "getIncomeAmountColor", "getUnLockPeriodStr", "getMinReturnStr", "getMaxReturnStr", "getKcsBonusApr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/assets/entity/KcsRightsBonusEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/util/List;)Lcom/kubi/assets/entity/ProductChildEntity;", "equals", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceEntity.kt\ncom/kubi/assets/entity/ProductChildEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,395:1\n1573#2:396\n1604#2,4:397\n*S KotlinDebug\n*F\n+ 1 FinanceEntity.kt\ncom/kubi/assets/entity/ProductChildEntity\n*L\n194#1:396\n194#1:397,4\n*E\n"})
public final /* data */ class ProductChildEntity implements MultiItemEntity {

    @Nullable
    private final String amount;

    @Nullable
    private final String avg7Return;

    @Nullable
    private final String baseStakingReturn;

    @Nullable
    private final String bigCurrencyIcon;

    @Nullable
    private String category;

    @Nullable
    private String categoryText;

    @Nullable
    private final String currency;

    @Nullable
    private final String direction;

    @Nullable
    private final String dropAmount;

    @Nullable
    private final String dropCurrency;

    @SerializedName("estimateIncomes")
    @Nullable
    private List<EstimateIncome> estimateIncomes;

    @Nullable
    private final String freezingAmount;

    @Nullable
    private final String fundCurrency;

    @Nullable
    private final String icon;

    @Nullable
    private final String id;

    @Nullable
    private final String incomeAmount;

    @Nullable
    private final String incomeCurrency;

    @Nullable
    private Integer incomeCurrencyCount;

    @Nullable
    private final BigDecimal incomeReleaseAmount;

    @Nullable
    private String incomeSum;

    @Nullable
    private String incomeSumCurrency;
    private boolean incomeSumForFiat;

    @SerializedName("isProductRelock")
    private boolean isProductRelock;

    @SerializedName("isUserRelock")
    private boolean isUserRelock;

    @Nullable
    private final String jumpType;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private KcsRightsBonusEntity kcsRightsBonus;

    @Nullable
    private final String koPrice;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final BigDecimal lockAmount;

    @Nullable
    private final String lockEndTime;

    @Nullable
    private final String lockTime;
    private boolean manualRedeemLocked;

    @Nullable
    private final String maxPrice;

    @Nullable
    private final String maxReturn;

    @Nullable
    private final String minPrice;

    @Nullable
    private final String minReturn;

    @Nullable
    private final String name;

    @Nullable
    private final String personalLockEndTime;

    @Nullable
    private final String personalLockPeriod;

    @Nullable
    private final String polAmount;

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
    private String smallCurrencyIcon;

    @Nullable
    private final String stakingReturn;

    @Nullable
    private String status;

    @Nullable
    private final String strikeCurrency;

    @Nullable
    private final String targetCurrency;

    @Nullable
    private final String targetPrice;

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

    public ProductChildEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable BigDecimal bigDecimal, @Nullable String str17, @Nullable String str18, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, boolean z11, @Nullable KcsRightsBonusEntity kcsRightsBonusEntity, @Nullable String str47, @Nullable String str48, boolean z12, @Nullable String str49, @Nullable String str50, @Nullable Integer num, boolean z13, boolean z14, @Nullable List<EstimateIncome> list) {
        this.amount = str;
        this.avg7Return = str2;
        this.baseStakingReturn = str3;
        this.bigCurrencyIcon = str4;
        this.category = str5;
        this.categoryText = str6;
        this.currency = str7;
        this.direction = str8;
        this.dropAmount = str9;
        this.dropCurrency = str10;
        this.freezingAmount = str11;
        this.fundCurrency = str12;
        this.icon = str13;
        this.id = str14;
        this.incomeAmount = str15;
        this.incomeCurrency = str16;
        this.incomeReleaseAmount = bigDecimal;
        this.jumpType = str17;
        this.jumpUrl = str18;
        this.leverage = bigDecimal2;
        this.lockAmount = bigDecimal3;
        this.lockEndTime = str19;
        this.lockTime = str20;
        this.maxPrice = str21;
        this.maxReturn = str22;
        this.minPrice = str23;
        this.minReturn = str24;
        this.name = str25;
        this.personalLockEndTime = str26;
        this.personalLockPeriod = str27;
        this.polAmount = str28;
        this.polReleaseAmount = str29;
        this.polReturn = str30;
        this.polkaRewardAmount = str31;
        this.polkaRewardCurrency = str32;
        this.polkaStatus = str33;
        this.productId = str34;
        this.recentIncomeAmount = str35;
        this.recentPolAmount = str36;
        this.smallCurrencyIcon = str37;
        this.stakingReturn = str38;
        this.status = str39;
        this.strikeCurrency = str40;
        this.targetCurrency = str41;
        this.totalReturn = str42;
        this.type = str43;
        this.unlockPeriod = str44;
        this.unlockedAmount = str45;
        this.unlockingAmount = str46;
        this.manualRedeemLocked = z11;
        this.kcsRightsBonus = kcsRightsBonusEntity;
        this.targetPrice = str47;
        this.koPrice = str48;
        this.incomeSumForFiat = z12;
        this.incomeSum = str49;
        this.incomeSumCurrency = str50;
        this.incomeCurrencyCount = num;
        this.isUserRelock = z13;
        this.isProductRelock = z14;
        this.estimateIncomes = list;
    }

    @NotNull
    public final ProductChildEntity copy(@Nullable String amount, @Nullable String avg7Return, @Nullable String baseStakingReturn, @Nullable String bigCurrencyIcon, @Nullable String category, @Nullable String categoryText, @Nullable String currency, @Nullable String direction, @Nullable String dropAmount, @Nullable String dropCurrency, @Nullable String freezingAmount, @Nullable String fundCurrency, @Nullable String icon, @Nullable String id2, @Nullable String incomeAmount, @Nullable String incomeCurrency, @Nullable BigDecimal incomeReleaseAmount, @Nullable String jumpType, @Nullable String jumpUrl, @Nullable BigDecimal leverage, @Nullable BigDecimal lockAmount, @Nullable String lockEndTime, @Nullable String lockTime, @Nullable String maxPrice, @Nullable String maxReturn, @Nullable String minPrice, @Nullable String minReturn, @Nullable String name, @Nullable String personalLockEndTime, @Nullable String personalLockPeriod, @Nullable String polAmount, @Nullable String polReleaseAmount, @Nullable String polReturn, @Nullable String polkaRewardAmount, @Nullable String polkaRewardCurrency, @Nullable String polkaStatus, @Nullable String productId, @Nullable String recentIncomeAmount, @Nullable String recentPolAmount, @Nullable String smallCurrencyIcon, @Nullable String stakingReturn, @Nullable String status, @Nullable String strikeCurrency, @Nullable String targetCurrency, @Nullable String totalReturn, @Nullable String type, @Nullable String unlockPeriod, @Nullable String unlockedAmount, @Nullable String unlockingAmount, boolean manualRedeemLocked, @Nullable KcsRightsBonusEntity kcsRightsBonus, @Nullable String targetPrice, @Nullable String koPrice, boolean incomeSumForFiat, @Nullable String incomeSum, @Nullable String incomeSumCurrency, @Nullable Integer incomeCurrencyCount, boolean isUserRelock, boolean isProductRelock, @Nullable List<EstimateIncome> estimateIncomes) {
        return new ProductChildEntity(amount, avg7Return, baseStakingReturn, bigCurrencyIcon, category, categoryText, currency, direction, dropAmount, dropCurrency, freezingAmount, fundCurrency, icon, id2, incomeAmount, incomeCurrency, incomeReleaseAmount, jumpType, jumpUrl, leverage, lockAmount, lockEndTime, lockTime, maxPrice, maxReturn, minPrice, minReturn, name, personalLockEndTime, personalLockPeriod, polAmount, polReleaseAmount, polReturn, polkaRewardAmount, polkaRewardCurrency, polkaStatus, productId, recentIncomeAmount, recentPolAmount, smallCurrencyIcon, stakingReturn, status, strikeCurrency, targetCurrency, totalReturn, type, unlockPeriod, unlockedAmount, unlockingAmount, manualRedeemLocked, kcsRightsBonus, targetPrice, koPrice, incomeSumForFiat, incomeSum, incomeSumCurrency, incomeCurrencyCount, isUserRelock, isProductRelock, estimateIncomes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductChildEntity)) {
            return false;
        }
        ProductChildEntity productChildEntity = (ProductChildEntity) other;
        return Intrinsics.areEqual(this.amount, productChildEntity.amount) && Intrinsics.areEqual(this.avg7Return, productChildEntity.avg7Return) && Intrinsics.areEqual(this.baseStakingReturn, productChildEntity.baseStakingReturn) && Intrinsics.areEqual(this.bigCurrencyIcon, productChildEntity.bigCurrencyIcon) && Intrinsics.areEqual(this.category, productChildEntity.category) && Intrinsics.areEqual(this.categoryText, productChildEntity.categoryText) && Intrinsics.areEqual(this.currency, productChildEntity.currency) && Intrinsics.areEqual(this.direction, productChildEntity.direction) && Intrinsics.areEqual(this.dropAmount, productChildEntity.dropAmount) && Intrinsics.areEqual(this.dropCurrency, productChildEntity.dropCurrency) && Intrinsics.areEqual(this.freezingAmount, productChildEntity.freezingAmount) && Intrinsics.areEqual(this.fundCurrency, productChildEntity.fundCurrency) && Intrinsics.areEqual(this.icon, productChildEntity.icon) && Intrinsics.areEqual(this.id, productChildEntity.id) && Intrinsics.areEqual(this.incomeAmount, productChildEntity.incomeAmount) && Intrinsics.areEqual(this.incomeCurrency, productChildEntity.incomeCurrency) && Intrinsics.areEqual(this.incomeReleaseAmount, productChildEntity.incomeReleaseAmount) && Intrinsics.areEqual(this.jumpType, productChildEntity.jumpType) && Intrinsics.areEqual(this.jumpUrl, productChildEntity.jumpUrl) && Intrinsics.areEqual(this.leverage, productChildEntity.leverage) && Intrinsics.areEqual(this.lockAmount, productChildEntity.lockAmount) && Intrinsics.areEqual(this.lockEndTime, productChildEntity.lockEndTime) && Intrinsics.areEqual(this.lockTime, productChildEntity.lockTime) && Intrinsics.areEqual(this.maxPrice, productChildEntity.maxPrice) && Intrinsics.areEqual(this.maxReturn, productChildEntity.maxReturn) && Intrinsics.areEqual(this.minPrice, productChildEntity.minPrice) && Intrinsics.areEqual(this.minReturn, productChildEntity.minReturn) && Intrinsics.areEqual(this.name, productChildEntity.name) && Intrinsics.areEqual(this.personalLockEndTime, productChildEntity.personalLockEndTime) && Intrinsics.areEqual(this.personalLockPeriod, productChildEntity.personalLockPeriod) && Intrinsics.areEqual(this.polAmount, productChildEntity.polAmount) && Intrinsics.areEqual(this.polReleaseAmount, productChildEntity.polReleaseAmount) && Intrinsics.areEqual(this.polReturn, productChildEntity.polReturn) && Intrinsics.areEqual(this.polkaRewardAmount, productChildEntity.polkaRewardAmount) && Intrinsics.areEqual(this.polkaRewardCurrency, productChildEntity.polkaRewardCurrency) && Intrinsics.areEqual(this.polkaStatus, productChildEntity.polkaStatus) && Intrinsics.areEqual(this.productId, productChildEntity.productId) && Intrinsics.areEqual(this.recentIncomeAmount, productChildEntity.recentIncomeAmount) && Intrinsics.areEqual(this.recentPolAmount, productChildEntity.recentPolAmount) && Intrinsics.areEqual(this.smallCurrencyIcon, productChildEntity.smallCurrencyIcon) && Intrinsics.areEqual(this.stakingReturn, productChildEntity.stakingReturn) && Intrinsics.areEqual(this.status, productChildEntity.status) && Intrinsics.areEqual(this.strikeCurrency, productChildEntity.strikeCurrency) && Intrinsics.areEqual(this.targetCurrency, productChildEntity.targetCurrency) && Intrinsics.areEqual(this.totalReturn, productChildEntity.totalReturn) && Intrinsics.areEqual(this.type, productChildEntity.type) && Intrinsics.areEqual(this.unlockPeriod, productChildEntity.unlockPeriod) && Intrinsics.areEqual(this.unlockedAmount, productChildEntity.unlockedAmount) && Intrinsics.areEqual(this.unlockingAmount, productChildEntity.unlockingAmount) && this.manualRedeemLocked == productChildEntity.manualRedeemLocked && Intrinsics.areEqual(this.kcsRightsBonus, productChildEntity.kcsRightsBonus) && Intrinsics.areEqual(this.targetPrice, productChildEntity.targetPrice) && Intrinsics.areEqual(this.koPrice, productChildEntity.koPrice) && this.incomeSumForFiat == productChildEntity.incomeSumForFiat && Intrinsics.areEqual(this.incomeSum, productChildEntity.incomeSum) && Intrinsics.areEqual(this.incomeSumCurrency, productChildEntity.incomeSumCurrency) && Intrinsics.areEqual(this.incomeCurrencyCount, productChildEntity.incomeCurrencyCount) && this.isUserRelock == productChildEntity.isUserRelock && this.isProductRelock == productChildEntity.isProductRelock && Intrinsics.areEqual(this.estimateIncomes, productChildEntity.estimateIncomes);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDropCurrency() {
        return this.dropCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFreezingAmount() {
        return this.freezingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFundCurrency() {
        return this.fundCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIncomeAmount() {
        return this.incomeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIncomeCurrency() {
        return this.incomeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getIncomeReleaseAmount() {
        return this.incomeReleaseAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvg7Return() {
        return this.avg7Return;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getLockAmount() {
        return this.lockAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getLockEndTime() {
        return this.lockEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getLockTime() {
        return this.lockTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getMaxReturn() {
        return this.maxReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getMinPrice() {
        return this.minPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getMinReturn() {
        return this.minReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPersonalLockEndTime() {
        return this.personalLockEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseStakingReturn() {
        return this.baseStakingReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getPersonalLockPeriod() {
        return this.personalLockPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getPolAmount() {
        return this.polAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPolReleaseAmount() {
        return this.polReleaseAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getPolReturn() {
        return this.polReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getPolkaRewardAmount() {
        return this.polkaRewardAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getPolkaRewardCurrency() {
        return this.polkaRewardCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getPolkaStatus() {
        return this.polkaStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getRecentIncomeAmount() {
        return this.recentIncomeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getRecentPolAmount() {
        return this.recentPolAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBigCurrencyIcon() {
        return this.bigCurrencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getSmallCurrencyIcon() {
        return this.smallCurrencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getStakingReturn() {
        return this.stakingReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getStrikeCurrency() {
        return this.strikeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getTargetCurrency() {
        return this.targetCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getUnlockPeriod() {
        return this.unlockPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getUnlockedAmount() {
        return this.unlockedAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getUnlockingAmount() {
        return this.unlockingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final boolean getManualRedeemLocked() {
        return this.manualRedeemLocked;
    }

    @Nullable
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final KcsRightsBonusEntity getKcsRightsBonus() {
        return this.kcsRightsBonus;
    }

    @Nullable
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getTargetPrice() {
        return this.targetPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getKoPrice() {
        return this.koPrice;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final boolean getIncomeSumForFiat() {
        return this.incomeSumForFiat;
    }

    @Nullable
    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getIncomeSum() {
        return this.incomeSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getIncomeSumCurrency() {
        return this.incomeSumCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component57, reason: from getter */
    public final Integer getIncomeCurrencyCount() {
        return this.incomeCurrencyCount;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final boolean getIsUserRelock() {
        return this.isUserRelock;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final boolean getIsProductRelock() {
        return this.isProductRelock;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    public final List<EstimateIncome> component60() {
        return this.estimateIncomes;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDropAmount() {
        return this.dropAmount;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
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
    public final String getDirection() {
        return this.direction;
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
    public final List<EstimateIncome> getEstimateIncomes() {
        return this.estimateIncomes;
    }

    @NotNull
    public final List<Pair<String, String>> getEstimateOrTotalItems() {
        List<EstimateIncome> list = this.estimateIncomes;
        int i11 = 0;
        if (list == null || list.isEmpty()) {
            String strM66516f = C27017c.f54310a.m66516f(R$string.earn_total_profit, new Object[0]);
            if (C27039d.m66650j(this.incomeCurrencyCount) > 1) {
                strM66516f = strM66516f + '(' + this.incomeCurrencyCount + ')';
            }
            return CollectionsKt.listOf(TuplesKt.m90091to(strM66516f, getIncomeSumStr()));
        }
        String strM66516f2 = C27017c.f54310a.m66516f(R$string.kc_asset_estimated_earnings, new Object[0]);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EstimateIncome estimateIncome = (EstimateIncome) obj;
            String str = i11 == 0 ? strM66516f2 : "";
            arrayList.add(TuplesKt.m90091to(str, C27041f.m66669i(estimateIncome.getAmount(), "--") + ' ' + C10921d.m19190a(C27041f.m66668h(estimateIncome.getCurrency()))));
            i11 = i12;
        }
        return arrayList;
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
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIncomeAmount() {
        return this.incomeAmount;
    }

    public final int getIncomeAmountColor() {
        BigDecimal bigDecimal = this.incomeReleaseAmount;
        if (bigDecimal == null) {
            return C27017c.f54310a.m66512a(R$color.c_text);
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            return C27017c.f54310a.m66512a(R$color.c_text);
        }
        return this.incomeReleaseAmount.compareTo(bigDecimal2) < 0 ? C22890g.m54281f(C27017c.f54310a.m66513b(), false) : C27017c.f54310a.m66512a(R$color.c_text);
    }

    @NotNull
    public final String getIncomeAmountStr() {
        BigDecimal bigDecimal = this.incomeReleaseAmount;
        if (bigDecimal == null) {
            return "--";
        }
        String strM85563b = C37885i.m85563b(bigDecimal, this.currency, 0, 2, null);
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            strM85563b = '+' + strM85563b;
        }
        return strM85563b == null ? "--" : strM85563b;
    }

    @Nullable
    public final String getIncomeCurrency() {
        return this.incomeCurrency;
    }

    @Nullable
    public final Integer getIncomeCurrencyCount() {
        return this.incomeCurrencyCount;
    }

    @Nullable
    public final BigDecimal getIncomeReleaseAmount() {
        return this.incomeReleaseAmount;
    }

    @Nullable
    public final String getIncomeSum() {
        return this.incomeSum;
    }

    @Nullable
    public final String getIncomeSumCurrency() {
        return this.incomeSumCurrency;
    }

    public final boolean getIncomeSumForFiat() {
        return this.incomeSumForFiat;
    }

    @NotNull
    public final String getIncomeSumStr() {
        String str = this.incomeSum;
        if (str == null || str.length() == 0) {
            return "--";
        }
        if (this.incomeSumForFiat) {
            String str2 = this.incomeSum;
            return String.valueOf(str2 != null ? C10921d.m19193d(str2, this.incomeSumCurrency, false, 2, null) : null);
        }
        return this.incomeSum + ' ' + C10921d.m19190a(C27041f.m66668h(this.incomeSumCurrency));
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF38450c() {
        return ProductType.INSTANCE.fromCategory(this.category).getLayoutResId();
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
    public final String getKcsBonusApr() {
        String kcsBonusApr;
        BigDecimal bigDecimalM66535e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('+');
        KcsRightsBonusEntity kcsRightsBonusEntity = this.kcsRightsBonus;
        String strM85565d = null;
        if (kcsRightsBonusEntity != null && (kcsBonusApr = kcsRightsBonusEntity.getKcsBonusApr()) != null && (bigDecimalM66535e = DowngradeExKt.m66535e(kcsBonusApr, null, 1, null)) != null) {
            strM85565d = C37885i.m85565d(bigDecimalM66535e, 0, 0, 1, null);
        }
        sb2.append(strM85565d);
        sb2.append('%');
        return C42828b.m93903d(sb2.toString());
    }

    @Nullable
    public final KcsRightsBonusEntity getKcsRightsBonus() {
        return this.kcsRightsBonus;
    }

    @Nullable
    public final String getKoPrice() {
        return this.koPrice;
    }

    @NotNull
    public final String getKoPriceStr() {
        BigDecimal bigDecimalM66671k;
        String str = this.koPrice;
        String strM85563b = null;
        if (str != null && (bigDecimalM66671k = C27041f.m66671k(str)) != null) {
            strM85563b = C37885i.m85563b(bigDecimalM66671k, this.currency, 0, 2, null);
        }
        return C27041f.m66669i(strM85563b, "--");
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLockAmount() {
        return this.lockAmount;
    }

    @NotNull
    public final String getLockAmountStr() {
        BigDecimal bigDecimal = this.lockAmount;
        return C27041f.m66669i(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null, "--");
    }

    @NotNull
    public final String getLockAmountWithCurrencyStr() {
        BigDecimal bigDecimal = this.lockAmount;
        if (bigDecimal == null) {
            return "--";
        }
        String strM85563b = C37885i.m85563b(bigDecimal, this.currency, 0, 2, null);
        String str = this.currency;
        if (str == null || str.length() == 0) {
            return strM85563b;
        }
        return strM85563b + ' ' + C10921d.m19190a(this.currency);
    }

    @Nullable
    public final String getLockEndTime() {
        return this.lockEndTime;
    }

    @NotNull
    public final String getLockEndTimeStr() {
        return AssetExKt.m15121i(DowngradeExKt.m66547q(this.lockEndTime));
    }

    @Nullable
    public final String getLockTime() {
        return this.lockTime;
    }

    public final boolean getManualRedeemLocked() {
        return this.manualRedeemLocked;
    }

    @Nullable
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    public final String getMaxReturn() {
        return this.maxReturn;
    }

    @NotNull
    public final String getMaxReturnStr() {
        BigDecimal bigDecimalM66671k;
        String strM85565d;
        String str = this.maxReturn;
        String strM93903d = null;
        if (str != null && (bigDecimalM66671k = C27041f.m66671k(str)) != null && (strM85565d = C37885i.m85565d(bigDecimalM66671k, 0, 0, 3, null)) != null) {
            String str2 = strM85565d + '%';
            if (str2 != null) {
                strM93903d = C42828b.m93903d(str2);
            }
        }
        return C27041f.m66669i(strM93903d, "--");
    }

    @Nullable
    public final String getMinPrice() {
        return this.minPrice;
    }

    @Nullable
    public final String getMinReturn() {
        return this.minReturn;
    }

    @NotNull
    public final String getMinReturnStr() {
        BigDecimal bigDecimalM66671k;
        String strM85565d;
        String str = this.minReturn;
        String strM93903d = null;
        if (str != null && (bigDecimalM66671k = C27041f.m66671k(str)) != null && (strM85565d = C37885i.m85565d(bigDecimalM66671k, 0, 0, 3, null)) != null) {
            String str2 = strM85565d + '%';
            if (str2 != null) {
                strM93903d = C42828b.m93903d(str2);
            }
        }
        return C27041f.m66669i(strM93903d, "--");
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
    public final String getPersonalLockPeriod() {
        return this.personalLockPeriod;
    }

    @Nullable
    public final String getPolAmount() {
        return this.polAmount;
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

    @NotNull
    public final String getRecentIncomeAmountStr() {
        if (this.recentIncomeAmount == null) {
            return "--";
        }
        String strM85563b = C37885i.m85563b(new BigDecimal(this.recentIncomeAmount), this.currency, 0, 2, null);
        if (new BigDecimal(this.recentIncomeAmount).compareTo(BigDecimal.ZERO) > 0) {
            strM85563b = '+' + strM85563b;
        }
        return strM85563b == null ? "--" : strM85563b;
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
    public final String getTargetPrice() {
        return this.targetPrice;
    }

    @NotNull
    public final String getTargetPriceStr() {
        BigDecimal bigDecimalM66671k;
        String str = this.targetPrice;
        String strM85563b = null;
        if (str != null && (bigDecimalM66671k = C27041f.m66671k(str)) != null) {
            strM85563b = C37885i.m85563b(bigDecimalM66671k, this.currency, 0, 2, null);
        }
        return C27041f.m66669i(strM85563b, "--");
    }

    @Nullable
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    @NotNull
    public final String getTotalReturnStr() {
        BigDecimal bigDecimalM66671k;
        String strM85565d;
        String str = this.totalReturn;
        String strM93903d = null;
        if (str != null && (bigDecimalM66671k = C27041f.m66671k(str)) != null && (strM85565d = C37885i.m85565d(bigDecimalM66671k, 0, 0, 3, null)) != null) {
            String str2 = strM85565d + '%';
            if (str2 != null) {
                strM93903d = C42828b.m93903d(str2);
            }
        }
        return C27041f.m66669i(strM93903d, "--");
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUnLockPeriodStr() {
        return C27041f.m66669i(C27017c.f54310a.m66516f(R$string.margin_coupons_period_days, this.unlockPeriod), "--");
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
        String str2 = this.avg7Return;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.baseStakingReturn;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bigCurrencyIcon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.categoryText;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currency;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.direction;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dropAmount;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dropCurrency;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.freezingAmount;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fundCurrency;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.icon;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.id;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.incomeAmount;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.incomeCurrency;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        BigDecimal bigDecimal = this.incomeReleaseAmount;
        int iHashCode17 = (iHashCode16 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str17 = this.jumpType;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.jumpUrl;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.leverage;
        int iHashCode20 = (iHashCode19 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.lockAmount;
        int iHashCode21 = (iHashCode20 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str19 = this.lockEndTime;
        int iHashCode22 = (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.lockTime;
        int iHashCode23 = (iHashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.maxPrice;
        int iHashCode24 = (iHashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.maxReturn;
        int iHashCode25 = (iHashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.minPrice;
        int iHashCode26 = (iHashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.minReturn;
        int iHashCode27 = (iHashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.name;
        int iHashCode28 = (iHashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.personalLockEndTime;
        int iHashCode29 = (iHashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.personalLockPeriod;
        int iHashCode30 = (iHashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.polAmount;
        int iHashCode31 = (iHashCode30 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.polReleaseAmount;
        int iHashCode32 = (iHashCode31 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.polReturn;
        int iHashCode33 = (iHashCode32 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.polkaRewardAmount;
        int iHashCode34 = (iHashCode33 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.polkaRewardCurrency;
        int iHashCode35 = (iHashCode34 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.polkaStatus;
        int iHashCode36 = (iHashCode35 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.productId;
        int iHashCode37 = (iHashCode36 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.recentIncomeAmount;
        int iHashCode38 = (iHashCode37 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.recentPolAmount;
        int iHashCode39 = (iHashCode38 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.smallCurrencyIcon;
        int iHashCode40 = (iHashCode39 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.stakingReturn;
        int iHashCode41 = (iHashCode40 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.status;
        int iHashCode42 = (iHashCode41 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.strikeCurrency;
        int iHashCode43 = (iHashCode42 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.targetCurrency;
        int iHashCode44 = (iHashCode43 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.totalReturn;
        int iHashCode45 = (iHashCode44 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.type;
        int iHashCode46 = (iHashCode45 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.unlockPeriod;
        int iHashCode47 = (iHashCode46 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.unlockedAmount;
        int iHashCode48 = (iHashCode47 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.unlockingAmount;
        int iHashCode49 = (((iHashCode48 + (str46 == null ? 0 : str46.hashCode())) * 31) + Boolean.hashCode(this.manualRedeemLocked)) * 31;
        KcsRightsBonusEntity kcsRightsBonusEntity = this.kcsRightsBonus;
        int iHashCode50 = (iHashCode49 + (kcsRightsBonusEntity == null ? 0 : kcsRightsBonusEntity.hashCode())) * 31;
        String str47 = this.targetPrice;
        int iHashCode51 = (iHashCode50 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.koPrice;
        int iHashCode52 = (((iHashCode51 + (str48 == null ? 0 : str48.hashCode())) * 31) + Boolean.hashCode(this.incomeSumForFiat)) * 31;
        String str49 = this.incomeSum;
        int iHashCode53 = (iHashCode52 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.incomeSumCurrency;
        int iHashCode54 = (iHashCode53 + (str50 == null ? 0 : str50.hashCode())) * 31;
        Integer num = this.incomeCurrencyCount;
        int iHashCode55 = (((((iHashCode54 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isUserRelock)) * 31) + Boolean.hashCode(this.isProductRelock)) * 31;
        List<EstimateIncome> list = this.estimateIncomes;
        return iHashCode55 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isProductRelock() {
        return this.isProductRelock;
    }

    public final boolean isShowEndDate() {
        return Intrinsics.areEqual(this.type, "TIME") || Intrinsics.areEqual(this.type, "MULTI_TIME");
    }

    public final boolean isUserRelock() {
        return this.isUserRelock;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setCategoryText(@Nullable String str) {
        this.categoryText = str;
    }

    public final void setEstimateIncomes(@Nullable List<EstimateIncome> list) {
        this.estimateIncomes = list;
    }

    public final void setIncomeCurrencyCount(@Nullable Integer num) {
        this.incomeCurrencyCount = num;
    }

    public final void setIncomeSum(@Nullable String str) {
        this.incomeSum = str;
    }

    public final void setIncomeSumCurrency(@Nullable String str) {
        this.incomeSumCurrency = str;
    }

    public final void setIncomeSumForFiat(boolean z11) {
        this.incomeSumForFiat = z11;
    }

    public final void setKcsRightsBonus(@Nullable KcsRightsBonusEntity kcsRightsBonusEntity) {
        this.kcsRightsBonus = kcsRightsBonusEntity;
    }

    public final void setManualRedeemLocked(boolean z11) {
        this.manualRedeemLocked = z11;
    }

    public final void setProductRelock(boolean z11) {
        this.isProductRelock = z11;
    }

    public final void setSmallCurrencyIcon(@Nullable String str) {
        this.smallCurrencyIcon = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setUserRelock(boolean z11) {
        this.isUserRelock = z11;
    }

    @NotNull
    public String toString() {
        return "ProductChildEntity(amount=" + this.amount + ", avg7Return=" + this.avg7Return + ", baseStakingReturn=" + this.baseStakingReturn + ", bigCurrencyIcon=" + this.bigCurrencyIcon + ", category=" + this.category + ", categoryText=" + this.categoryText + ", currency=" + this.currency + ", direction=" + this.direction + ", dropAmount=" + this.dropAmount + ", dropCurrency=" + this.dropCurrency + ", freezingAmount=" + this.freezingAmount + ", fundCurrency=" + this.fundCurrency + ", icon=" + this.icon + ", id=" + this.id + ", incomeAmount=" + this.incomeAmount + ", incomeCurrency=" + this.incomeCurrency + ", incomeReleaseAmount=" + this.incomeReleaseAmount + ", jumpType=" + this.jumpType + ", jumpUrl=" + this.jumpUrl + ", leverage=" + this.leverage + ", lockAmount=" + this.lockAmount + ", lockEndTime=" + this.lockEndTime + ", lockTime=" + this.lockTime + ", maxPrice=" + this.maxPrice + ", maxReturn=" + this.maxReturn + ", minPrice=" + this.minPrice + ", minReturn=" + this.minReturn + ", name=" + this.name + ", personalLockEndTime=" + this.personalLockEndTime + ", personalLockPeriod=" + this.personalLockPeriod + ", polAmount=" + this.polAmount + ", polReleaseAmount=" + this.polReleaseAmount + ", polReturn=" + this.polReturn + ", polkaRewardAmount=" + this.polkaRewardAmount + ", polkaRewardCurrency=" + this.polkaRewardCurrency + ", polkaStatus=" + this.polkaStatus + ", productId=" + this.productId + ", recentIncomeAmount=" + this.recentIncomeAmount + ", recentPolAmount=" + this.recentPolAmount + ", smallCurrencyIcon=" + this.smallCurrencyIcon + ", stakingReturn=" + this.stakingReturn + ", status=" + this.status + ", strikeCurrency=" + this.strikeCurrency + ", targetCurrency=" + this.targetCurrency + ", totalReturn=" + this.totalReturn + ", type=" + this.type + ", unlockPeriod=" + this.unlockPeriod + ", unlockedAmount=" + this.unlockedAmount + ", unlockingAmount=" + this.unlockingAmount + ", manualRedeemLocked=" + this.manualRedeemLocked + ", kcsRightsBonus=" + this.kcsRightsBonus + ", targetPrice=" + this.targetPrice + ", koPrice=" + this.koPrice + ", incomeSumForFiat=" + this.incomeSumForFiat + ", incomeSum=" + this.incomeSum + ", incomeSumCurrency=" + this.incomeSumCurrency + ", incomeCurrencyCount=" + this.incomeCurrencyCount + ", isUserRelock=" + this.isUserRelock + ", isProductRelock=" + this.isProductRelock + ", estimateIncomes=" + this.estimateIncomes + ')';
    }

    public /* synthetic */ ProductChildEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, BigDecimal bigDecimal, String str17, String str18, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, boolean z11, KcsRightsBonusEntity kcsRightsBonusEntity, String str47, String str48, boolean z12, String str49, String str50, Integer num, boolean z13, boolean z14, List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, bigDecimal, str17, str18, bigDecimal2, bigDecimal3, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, z11, kcsRightsBonusEntity, str47, str48, (i12 & 2097152) != 0 ? false : z12, (i12 & 4194304) != 0 ? null : str49, (i12 & 8388608) != 0 ? null : str50, (i12 & 16777216) != 0 ? null : num, (i12 & 33554432) != 0 ? false : z13, (i12 & 67108864) != 0 ? false : z14, (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : list);
    }
}
