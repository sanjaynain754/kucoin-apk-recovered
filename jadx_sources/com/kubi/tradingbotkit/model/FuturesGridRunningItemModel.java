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

/* JADX INFO: compiled from: FuturesGridRunningItemModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0094\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0004ú\u0002û\u0002Bã\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u00101\u001a\u00020\b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010<\u001a\u00020\b\u0012\b\b\u0002\u0010=\u001a\u00020\b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010X\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010Y\u0012\b\b\u0002\u0010[\u001a\u00020\b\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]¢\u0006\u0004\b^\u0010_J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\bHÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¡\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\n\u0010¢\u0002\u001a\u00020\bHÆ\u0003J\u0011\u0010£\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\u0011\u0010¤\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\u0011\u0010¥\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\n\u0010¨\u0002\u001a\u00020\bHÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010ª\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010«\u0002\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0003\u0010\u008c\u0001J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u0010µ\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\f\u0010¶\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010·\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u0010¸\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\u0011\u0010¹\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\f\u0010º\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010¿\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010Á\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ä\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\n\u0010Å\u0002\u001a\u00020\bHÆ\u0003J\f\u0010Æ\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010Ç\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010È\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010Ë\u0002\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0003\u0010Ï\u0001J\u0012\u0010Ì\u0002\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0003\u0010Ï\u0001J\u0012\u0010Í\u0002\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0003\u0010Ï\u0001J\u0012\u0010Î\u0002\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0003\u0010Ï\u0001J\n\u0010Ï\u0002\u001a\u00020\bHÆ\u0003J\n\u0010Ð\u0002\u001a\u00020\bHÆ\u0003J\u0011\u0010Ñ\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\u0011\u0010Ò\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\u0012\u0010Ó\u0002\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0003\u0010\u008c\u0001J\f\u0010Ô\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Õ\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\u0011\u0010Ö\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\u0011\u0010×\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010sJ\f\u0010Ø\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010Ù\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010Ú\u0002\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0003\u0010\u008c\u0001J\f\u0010Û\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ü\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010Ý\u0002\u001a\u0004\u0018\u00010KHÆ\u0003¢\u0006\u0003\u0010õ\u0001J\u0012\u0010Þ\u0002\u001a\u0004\u0018\u00010KHÆ\u0003¢\u0006\u0003\u0010õ\u0001J\f\u0010ß\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010à\u0002\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0003\u0010\u008c\u0001J\f\u0010á\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010â\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010ã\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ä\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010å\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010æ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ç\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010è\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010é\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010ê\u0002\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010YHÆ\u0003J\n\u0010ë\u0002\u001a\u00020\bHÆ\u0003J\f\u0010ì\u0002\u001a\u0004\u0018\u00010]HÆ\u0003Jì\u0007\u0010í\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00101\u001a\u00020\b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010:\u001a\u0004\u0018\u0001082\n\b\u0002\u0010;\u001a\u0004\u0018\u0001082\b\b\u0002\u0010<\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010X\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010Y2\b\b\u0002\u0010[\u001a\u00020\b2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]HÆ\u0001¢\u0006\u0003\u0010î\u0002J\u0007\u0010ï\u0002\u001a\u00020\bJ\u0016\u0010ð\u0002\u001a\u00020K2\n\u0010ñ\u0002\u001a\u0005\u0018\u00010ò\u0002HÖ\u0003J\n\u0010ó\u0002\u001a\u00020\bHÖ\u0001J\n\u0010ô\u0002\u001a\u00020\u0003HÖ\u0001J\u001b\u0010õ\u0002\u001a\u00030ö\u00022\b\u0010÷\u0002\u001a\u00030ø\u00022\u0007\u0010ù\u0002\u001a\u00020\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010a\"\u0004\be\u0010cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010a\"\u0004\bi\u0010cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010a\"\u0004\bo\u0010cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010a\"\u0004\bq\u0010cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010v\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010k\"\u0004\bx\u0010mR\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010v\u001a\u0004\by\u0010s\"\u0004\bz\u0010uR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010v\u001a\u0004\b{\u0010s\"\u0004\b|\u0010uR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010v\u001a\u0004\b}\u0010s\"\u0004\b~\u0010uR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010a\"\u0005\b\u0080\u0001\u0010cR \u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010k\"\u0005\b\u0086\u0001\u0010mR \u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010a\"\u0005\b\u008a\u0001\u0010cR#\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010a\"\u0005\b\u0091\u0001\u0010cR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010a\"\u0005\b\u0093\u0001\u0010cR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010a\"\u0005\b\u0095\u0001\u0010cR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010a\"\u0005\b\u0097\u0001\u0010cR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010a\"\u0005\b\u0099\u0001\u0010cR \u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u0082\u0001\"\u0006\b\u009b\u0001\u0010\u0084\u0001R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010a\"\u0005\b\u009d\u0001\u0010cR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010a\"\u0005\b\u009f\u0001\u0010cR \u0010 \u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b \u0001\u0010\u0082\u0001\"\u0006\b¡\u0001\u0010\u0084\u0001R \u0010!\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\b¢\u0001\u0010s\"\u0005\b£\u0001\u0010uR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010a\"\u0005\b¥\u0001\u0010cR \u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¦\u0001\u0010\u0082\u0001\"\u0006\b§\u0001\u0010\u0084\u0001R \u0010$\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\b¨\u0001\u0010s\"\u0005\b©\u0001\u0010uR \u0010%\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\bª\u0001\u0010s\"\u0005\b«\u0001\u0010uR\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010a\"\u0005\b\u00ad\u0001\u0010cR\u001e\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010a\"\u0005\b¯\u0001\u0010cR \u0010(\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b°\u0001\u0010\u0082\u0001\"\u0006\b±\u0001\u0010\u0084\u0001R\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010a\"\u0005\b³\u0001\u0010cR \u0010*\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b´\u0001\u0010\u0082\u0001\"\u0006\bµ\u0001\u0010\u0084\u0001R\u001e\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010a\"\u0005\b·\u0001\u0010cR \u0010,\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¸\u0001\u0010\u0082\u0001\"\u0006\b¹\u0001\u0010\u0084\u0001R\u001e\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010a\"\u0005\b»\u0001\u0010cR \u0010.\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010\u0082\u0001\"\u0006\b½\u0001\u0010\u0084\u0001R\u001e\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010a\"\u0005\b¿\u0001\u0010cR \u00100\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\bÀ\u0001\u0010s\"\u0005\bÁ\u0001\u0010uR\u001c\u00101\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010k\"\u0005\bÃ\u0001\u0010mR \u00102\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÄ\u0001\u0010\u0082\u0001\"\u0006\bÅ\u0001\u0010\u0084\u0001R \u00103\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÆ\u0001\u0010\u0082\u0001\"\u0006\bÇ\u0001\u0010\u0084\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010a\"\u0005\bÉ\u0001\u0010cR\u001e\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010a\"\u0005\bË\u0001\u0010cR\u001e\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0001\u0010a\"\u0005\bÍ\u0001\u0010cR#\u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0015\n\u0003\u0010Ò\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R#\u00109\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0015\n\u0003\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ï\u0001\"\u0006\bÔ\u0001\u0010Ñ\u0001R#\u0010:\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0015\n\u0003\u0010Ò\u0001\u001a\u0006\bÕ\u0001\u0010Ï\u0001\"\u0006\bÖ\u0001\u0010Ñ\u0001R#\u0010;\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0015\n\u0003\u0010Ò\u0001\u001a\u0006\b×\u0001\u0010Ï\u0001\"\u0006\bØ\u0001\u0010Ñ\u0001R\u001c\u0010<\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u0010k\"\u0005\bÚ\u0001\u0010mR\u001c\u0010=\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0001\u0010k\"\u0005\bÜ\u0001\u0010mR \u0010>\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\bÝ\u0001\u0010s\"\u0005\bÞ\u0001\u0010uR \u0010?\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\bß\u0001\u0010s\"\u0005\bà\u0001\u0010uR#\u0010@\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\bá\u0001\u0010\u008c\u0001\"\u0006\bâ\u0001\u0010\u008e\u0001R\u001e\u0010A\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0001\u0010a\"\u0005\bä\u0001\u0010cR \u0010B\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\bå\u0001\u0010s\"\u0005\bæ\u0001\u0010uR \u0010C\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\bç\u0001\u0010s\"\u0005\bè\u0001\u0010uR \u0010D\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010v\u001a\u0005\bé\u0001\u0010s\"\u0005\bê\u0001\u0010uR \u0010E\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bë\u0001\u0010\u0082\u0001\"\u0006\bì\u0001\u0010\u0084\u0001R\u001e\u0010F\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bí\u0001\u0010a\"\u0005\bî\u0001\u0010cR#\u0010G\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\bï\u0001\u0010\u008c\u0001\"\u0006\bð\u0001\u0010\u008e\u0001R\u001e\u0010H\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bñ\u0001\u0010a\"\u0005\bò\u0001\u0010cR\u001e\u0010I\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bó\u0001\u0010a\"\u0005\bô\u0001\u0010cR\"\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u0014\n\u0003\u0010ø\u0001\u001a\u0005\bJ\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R\"\u0010L\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u0014\n\u0003\u0010ø\u0001\u001a\u0005\bL\u0010õ\u0001\"\u0006\bù\u0001\u0010÷\u0001R\u001e\u0010M\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0001\u0010a\"\u0005\bû\u0001\u0010cR#\u0010N\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\bü\u0001\u0010\u008c\u0001\"\u0006\bý\u0001\u0010\u008e\u0001R\u001e\u0010O\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0001\u0010a\"\u0005\bÿ\u0001\u0010cR \u0010P\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u0082\u0001\"\u0006\b\u0081\u0002\u0010\u0084\u0001R\u001e\u0010Q\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0002\u0010a\"\u0005\b\u0083\u0002\u0010cR \u0010R\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0002\u0010\u0082\u0001\"\u0006\b\u0085\u0002\u0010\u0084\u0001R\u001e\u0010S\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0002\u0010a\"\u0005\b\u0087\u0002\u0010cR\u001e\u0010T\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0002\u0010a\"\u0005\b\u0089\u0002\u0010cR\u001e\u0010U\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0002\u0010a\"\u0005\b\u008b\u0002\u0010cR\u001e\u0010V\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0002\u0010a\"\u0005\b\u008d\u0002\u0010cR\u001e\u0010W\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0002\u0010a\"\u0005\b\u008f\u0002\u0010cR&\u0010X\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010YX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002R\u001c\u0010[\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0002\u0010k\"\u0005\b\u0095\u0002\u0010mR \u0010\\\u001a\u0004\u0018\u00010]X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002\"\u0006\b\u0098\u0002\u0010\u0099\u0002¨\u0006ü\u0002"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;", "Landroid/os/Parcelable;", "symbolName", "", "symbolCode", "direction", "directionCode", "directionVisible", "", "leverageValue", "leverage", "leverageBgColor", "leverageVisible", "centerContentBgColor", "leverageTextColor", "directionBgColor", "lastPrice", "lastPriceValue", "Ljava/math/BigDecimal;", "lastPriceVisible", "liquidationPriceValue", "liquidationPrice", "runningTimeValue", "", "runningTime", "quoteCode", "quoteName", "totalInvestText", "totalInvest", "totalInvestValue", "totalProfitText", "totalProfit", "totalProfitValue", "totalProfitColor", "totalProfitRate", "totalProfitRateValue", "dayArbitrageNum", "totalArbitrageNum", "arbitrage", "gridProfit", "gridProfitValue", "floatAmount", "floatAmountValue", "fundingFee", "fundingFeeValue", "entryPrice", "entryPriceValue", "priceRange", "priceRangeColor", "outPriceRange", "priceStart", "priceEnd", "pendingOrder", "buyNumber", "sellNumber", "buyNumberWidget", "", "sellNumberWidget", "splitWidget", "weightSum", "pendingOrderNumberSellColor", "pendingOrderNumberBuyColor", "buyNumberBg", "sellNumberBg", "taskId", "runningStatus", "viewType", "pricePrecision", "profitPrecision", "openUnitPriceValue", "openUnitPrice", "endTime", "loadingString", "notTradingOrderPrice", "isOpenUnit", "", "isRisk", "futuresGridProtectionTip", "riskLimitTimeValue", "riskLimitTime", "stopLossPriceValue", "stopLossPrice", "stopProfitPriceValue", "stopProfitPrice", "stopReason", "stopPriceText", "stopPriceNumber", "stopReasonDetail", "transfers", "", "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;", "totalInvestVisible", "couponReward", "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V", "getSymbolName", "()Ljava/lang/String;", "setSymbolName", "(Ljava/lang/String;)V", "getSymbolCode", "setSymbolCode", "getDirection", "setDirection", "getDirectionCode", "setDirectionCode", "getDirectionVisible", "()I", "setDirectionVisible", "(I)V", "getLeverageValue", "setLeverageValue", "getLeverage", "setLeverage", "getLeverageBgColor", "()Ljava/lang/Integer;", "setLeverageBgColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLeverageVisible", "setLeverageVisible", "getCenterContentBgColor", "setCenterContentBgColor", "getLeverageTextColor", "setLeverageTextColor", "getDirectionBgColor", "setDirectionBgColor", "getLastPrice", "setLastPrice", "getLastPriceValue", "()Ljava/math/BigDecimal;", "setLastPriceValue", "(Ljava/math/BigDecimal;)V", "getLastPriceVisible", "setLastPriceVisible", "getLiquidationPriceValue", "setLiquidationPriceValue", "getLiquidationPrice", "setLiquidationPrice", "getRunningTimeValue", "()Ljava/lang/Long;", "setRunningTimeValue", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getRunningTime", "setRunningTime", "getQuoteCode", "setQuoteCode", "getQuoteName", "setQuoteName", "getTotalInvestText", "setTotalInvestText", "getTotalInvest", "setTotalInvest", "getTotalInvestValue", "setTotalInvestValue", "getTotalProfitText", "setTotalProfitText", "getTotalProfit", "setTotalProfit", "getTotalProfitValue", "setTotalProfitValue", "getTotalProfitColor", "setTotalProfitColor", "getTotalProfitRate", "setTotalProfitRate", "getTotalProfitRateValue", "setTotalProfitRateValue", "getDayArbitrageNum", "setDayArbitrageNum", "getTotalArbitrageNum", "setTotalArbitrageNum", "getArbitrage", "setArbitrage", "getGridProfit", "setGridProfit", "getGridProfitValue", "setGridProfitValue", "getFloatAmount", "setFloatAmount", "getFloatAmountValue", "setFloatAmountValue", "getFundingFee", "setFundingFee", "getFundingFeeValue", "setFundingFeeValue", "getEntryPrice", "setEntryPrice", "getEntryPriceValue", "setEntryPriceValue", "getPriceRange", "setPriceRange", "getPriceRangeColor", "setPriceRangeColor", "getOutPriceRange", "setOutPriceRange", "getPriceStart", "setPriceStart", "getPriceEnd", "setPriceEnd", "getPendingOrder", "setPendingOrder", "getBuyNumber", "setBuyNumber", "getSellNumber", "setSellNumber", "getBuyNumberWidget", "()Ljava/lang/Float;", "setBuyNumberWidget", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getSellNumberWidget", "setSellNumberWidget", "getSplitWidget", "setSplitWidget", "getWeightSum", "setWeightSum", "getPendingOrderNumberSellColor", "setPendingOrderNumberSellColor", "getPendingOrderNumberBuyColor", "setPendingOrderNumberBuyColor", "getBuyNumberBg", "setBuyNumberBg", "getSellNumberBg", "setSellNumberBg", "getTaskId", "setTaskId", "getRunningStatus", "setRunningStatus", "getViewType", "setViewType", "getPricePrecision", "setPricePrecision", "getProfitPrecision", "setProfitPrecision", "getOpenUnitPriceValue", "setOpenUnitPriceValue", "getOpenUnitPrice", "setOpenUnitPrice", "getEndTime", "setEndTime", "getLoadingString", "setLoadingString", "getNotTradingOrderPrice", "setNotTradingOrderPrice", "()Ljava/lang/Boolean;", "setOpenUnit", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setRisk", "getFuturesGridProtectionTip", "setFuturesGridProtectionTip", "getRiskLimitTimeValue", "setRiskLimitTimeValue", "getRiskLimitTime", "setRiskLimitTime", "getStopLossPriceValue", "setStopLossPriceValue", "getStopLossPrice", "setStopLossPrice", "getStopProfitPriceValue", "setStopProfitPriceValue", "getStopProfitPrice", "setStopProfitPrice", "getStopReason", "setStopReason", "getStopPriceText", "setStopPriceText", "getStopPriceNumber", "setStopPriceNumber", "getStopReasonDetail", "setStopReasonDetail", "getTransfers", "()Ljava/util/List;", "setTransfers", "(Ljava/util/List;)V", "getTotalInvestVisible", "setTotalInvestVisible", "getCouponReward", "()Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;", "setCouponReward", "(Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component80", "component81", "component82", "component83", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Transfer", "CouponReward", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesGridRunningItemModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesGridRunningItemModel> CREATOR = new C26232a();

    @Nullable
    private String arbitrage;

    @Nullable
    private String buyNumber;

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
    private String direction;

    @Nullable
    private Integer directionBgColor;

    @Nullable
    private String directionCode;
    private int directionVisible;

    @Nullable
    private Long endTime;

    @Nullable
    private String entryPrice;

    @Nullable
    private BigDecimal entryPriceValue;

    @Nullable
    private String floatAmount;

    @Nullable
    private BigDecimal floatAmountValue;

    @Nullable
    private String fundingFee;

    @Nullable
    private BigDecimal fundingFeeValue;

    @Nullable
    private String futuresGridProtectionTip;

    @Nullable
    private String gridProfit;

    @Nullable
    private BigDecimal gridProfitValue;

    @Nullable
    private Boolean isOpenUnit;

    @Nullable
    private Boolean isRisk;

    @Nullable
    private String lastPrice;

    @Nullable
    private BigDecimal lastPriceValue;
    private int lastPriceVisible;

    @Nullable
    private String leverage;

    @Nullable
    private Integer leverageBgColor;

    @Nullable
    private Integer leverageTextColor;

    @Nullable
    private String leverageValue;
    private int leverageVisible;

    @Nullable
    private String liquidationPrice;

    @Nullable
    private BigDecimal liquidationPriceValue;

    @Nullable
    private String loadingString;

    @Nullable
    private String notTradingOrderPrice;

    @Nullable
    private String openUnitPrice;

    @Nullable
    private BigDecimal openUnitPriceValue;
    private int outPriceRange;

    @Nullable
    private String pendingOrder;
    private int pendingOrderNumberBuyColor;
    private int pendingOrderNumberSellColor;

    @Nullable
    private BigDecimal priceEnd;

    @Nullable
    private Integer pricePrecision;

    @Nullable
    private String priceRange;

    @Nullable
    private Integer priceRangeColor;

    @Nullable
    private BigDecimal priceStart;

    @Nullable
    private Integer profitPrecision;

    @Nullable
    private String quoteCode;

    @Nullable
    private String quoteName;

    @Nullable
    private String riskLimitTime;

    @Nullable
    private Long riskLimitTimeValue;

    @Nullable
    private String runningStatus;

    @Nullable
    private String runningTime;

    @Nullable
    private Long runningTimeValue;

    @Nullable
    private String sellNumber;

    @Nullable
    private Integer sellNumberBg;

    @Nullable
    private Float sellNumberWidget;

    @Nullable
    private Float splitWidget;

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
    private String symbolCode;

    @Nullable
    private String symbolName;

    @Nullable
    private Long taskId;

    @Nullable
    private Integer totalArbitrageNum;

    @Nullable
    private String totalInvest;

    @Nullable
    private String totalInvestText;

    @Nullable
    private BigDecimal totalInvestValue;
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
    private String totalProfitText;

    @Nullable
    private BigDecimal totalProfitValue;

    @Nullable
    private List<Transfer> transfers;

    @Nullable
    private Integer viewType;

    @Nullable
    private Float weightSum;

    /* JADX INFO: compiled from: FuturesGridRunningItemModel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015Jb\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017¨\u00069"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;", "Landroid/os/Parcelable;", "couponsId", "", FirebaseAnalytics.Param.CURRENCY, "expiredTime", "", "maxReward", "Ljava/math/BigDecimal;", "name", "rewardSize", "taskId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "getCouponsId", "()Ljava/lang/String;", "setCouponsId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getExpiredTime", "()Ljava/lang/Long;", "setExpiredTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMaxReward", "()Ljava/math/BigDecimal;", "setMaxReward", "(Ljava/math/BigDecimal;)V", "getName", "setName", "getRewardSize", "setRewardSize", "getTaskId", "setTaskId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CouponReward implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CouponReward> CREATOR = new C26230a();

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

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.FuturesGridRunningItemModel$CouponReward$a */
        /* JADX INFO: compiled from: FuturesGridRunningItemModel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C26230a implements Parcelable.Creator<CouponReward> {
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

    /* JADX INFO: compiled from: FuturesGridRunningItemModel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006$"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "size", "Ljava/math/BigDecimal;", "type", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getSize", "()Ljava/math/BigDecimal;", "setSize", "(Ljava/math/BigDecimal;)V", "getType", "setType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Transfer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new C26231a();

        @Nullable
        private String currency;

        @Nullable
        private BigDecimal size;

        @Nullable
        private String type;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.FuturesGridRunningItemModel$Transfer$a */
        /* JADX INFO: compiled from: FuturesGridRunningItemModel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C26231a implements Parcelable.Creator<Transfer> {
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

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.FuturesGridRunningItemModel$a */
    /* JADX INFO: compiled from: FuturesGridRunningItemModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26232a implements Parcelable.Creator<FuturesGridRunningItemModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesGridRunningItemModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            Boolean bool;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i11 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i12 = parcel.readInt();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string7 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            int i13 = parcel.readInt();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string8 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string16 = parcel.readString();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            String string19 = parcel.readString();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            String string20 = parcel.readString();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            String string21 = parcel.readString();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            String string22 = parcel.readString();
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i14 = parcel.readInt();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            Integer numValueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string26 = parcel.readString();
            Integer numValueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            String string27 = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string28 = parcel.readString();
            String string29 = parcel.readString();
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
            String string30 = parcel.readString();
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string31 = parcel.readString();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            String string32 = parcel.readString();
            BigDecimal bigDecimal14 = (BigDecimal) parcel.readSerializable();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = boolValueOf;
                arrayList = null;
            } else {
                int i17 = parcel.readInt();
                Boolean bool2 = boolValueOf;
                arrayList = new ArrayList(i17);
                int i18 = 0;
                while (i18 != i17) {
                    arrayList.add(Transfer.CREATOR.createFromParcel(parcel));
                    i18++;
                    i17 = i17;
                }
                bool = bool2;
            }
            return new FuturesGridRunningItemModel(string, string2, string3, string4, i11, string5, string6, numValueOf, i12, numValueOf2, numValueOf3, numValueOf4, string7, bigDecimal, i13, bigDecimal2, string8, lValueOf, string9, string10, string11, string12, string13, bigDecimal3, string14, string15, bigDecimal4, numValueOf5, string16, bigDecimal5, numValueOf6, numValueOf7, string17, string18, bigDecimal6, string19, bigDecimal7, string20, bigDecimal8, string21, bigDecimal9, string22, numValueOf8, i14, bigDecimal10, bigDecimal11, string23, string24, string25, fValueOf, fValueOf2, fValueOf3, fValueOf4, i15, i16, numValueOf9, numValueOf10, lValueOf2, string26, numValueOf11, numValueOf12, numValueOf13, bigDecimal12, string27, lValueOf3, string28, string29, bool, boolValueOf2, string30, lValueOf4, string31, bigDecimal13, string32, bigDecimal14, string33, string34, string35, string36, string37, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : CouponReward.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesGridRunningItemModel[] newArray(int i11) {
            return new FuturesGridRunningItemModel[i11];
        }
    }

    public FuturesGridRunningItemModel() {
        this(null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, -1, -1, 524287, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesGridRunningItemModel copy$default(FuturesGridRunningItemModel futuresGridRunningItemModel, String str, String str2, String str3, String str4, int i11, String str5, String str6, Integer num, int i12, Integer num2, Integer num3, Integer num4, String str7, BigDecimal bigDecimal, int i13, BigDecimal bigDecimal2, String str8, Long l11, String str9, String str10, String str11, String str12, String str13, BigDecimal bigDecimal3, String str14, String str15, BigDecimal bigDecimal4, Integer num5, String str16, BigDecimal bigDecimal5, Integer num6, Integer num7, String str17, String str18, BigDecimal bigDecimal6, String str19, BigDecimal bigDecimal7, String str20, BigDecimal bigDecimal8, String str21, BigDecimal bigDecimal9, String str22, Integer num8, int i14, BigDecimal bigDecimal10, BigDecimal bigDecimal11, String str23, String str24, String str25, Float f11, Float f12, Float f13, Float f14, int i15, int i16, Integer num9, Integer num10, Long l12, String str26, Integer num11, Integer num12, Integer num13, BigDecimal bigDecimal12, String str27, Long l13, String str28, String str29, Boolean bool, Boolean bool2, String str30, Long l14, String str31, BigDecimal bigDecimal13, String str32, BigDecimal bigDecimal14, String str33, String str34, String str35, String str36, String str37, List list, int i17, CouponReward couponReward, int i18, int i19, int i21, Object obj) {
        String str38 = (i18 & 1) != 0 ? futuresGridRunningItemModel.symbolName : str;
        return futuresGridRunningItemModel.copy(str38, (i18 & 2) != 0 ? futuresGridRunningItemModel.symbolCode : str2, (i18 & 4) != 0 ? futuresGridRunningItemModel.direction : str3, (i18 & 8) != 0 ? futuresGridRunningItemModel.directionCode : str4, (i18 & 16) != 0 ? futuresGridRunningItemModel.directionVisible : i11, (i18 & 32) != 0 ? futuresGridRunningItemModel.leverageValue : str5, (i18 & 64) != 0 ? futuresGridRunningItemModel.leverage : str6, (i18 & 128) != 0 ? futuresGridRunningItemModel.leverageBgColor : num, (i18 & 256) != 0 ? futuresGridRunningItemModel.leverageVisible : i12, (i18 & 512) != 0 ? futuresGridRunningItemModel.centerContentBgColor : num2, (i18 & 1024) != 0 ? futuresGridRunningItemModel.leverageTextColor : num3, (i18 & 2048) != 0 ? futuresGridRunningItemModel.directionBgColor : num4, (i18 & 4096) != 0 ? futuresGridRunningItemModel.lastPrice : str7, (i18 & 8192) != 0 ? futuresGridRunningItemModel.lastPriceValue : bigDecimal, (i18 & 16384) != 0 ? futuresGridRunningItemModel.lastPriceVisible : i13, (i18 & 32768) != 0 ? futuresGridRunningItemModel.liquidationPriceValue : bigDecimal2, (i18 & 65536) != 0 ? futuresGridRunningItemModel.liquidationPrice : str8, (i18 & 131072) != 0 ? futuresGridRunningItemModel.runningTimeValue : l11, (i18 & 262144) != 0 ? futuresGridRunningItemModel.runningTime : str9, (i18 & 524288) != 0 ? futuresGridRunningItemModel.quoteCode : str10, (i18 & 1048576) != 0 ? futuresGridRunningItemModel.quoteName : str11, (i18 & 2097152) != 0 ? futuresGridRunningItemModel.totalInvestText : str12, (i18 & 4194304) != 0 ? futuresGridRunningItemModel.totalInvest : str13, (i18 & 8388608) != 0 ? futuresGridRunningItemModel.totalInvestValue : bigDecimal3, (i18 & 16777216) != 0 ? futuresGridRunningItemModel.totalProfitText : str14, (i18 & 33554432) != 0 ? futuresGridRunningItemModel.totalProfit : str15, (i18 & 67108864) != 0 ? futuresGridRunningItemModel.totalProfitValue : bigDecimal4, (i18 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? futuresGridRunningItemModel.totalProfitColor : num5, (i18 & 268435456) != 0 ? futuresGridRunningItemModel.totalProfitRate : str16, (i18 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? futuresGridRunningItemModel.totalProfitRateValue : bigDecimal5, (i18 & 1073741824) != 0 ? futuresGridRunningItemModel.dayArbitrageNum : num6, (i18 & Integer.MIN_VALUE) != 0 ? futuresGridRunningItemModel.totalArbitrageNum : num7, (i19 & 1) != 0 ? futuresGridRunningItemModel.arbitrage : str17, (i19 & 2) != 0 ? futuresGridRunningItemModel.gridProfit : str18, (i19 & 4) != 0 ? futuresGridRunningItemModel.gridProfitValue : bigDecimal6, (i19 & 8) != 0 ? futuresGridRunningItemModel.floatAmount : str19, (i19 & 16) != 0 ? futuresGridRunningItemModel.floatAmountValue : bigDecimal7, (i19 & 32) != 0 ? futuresGridRunningItemModel.fundingFee : str20, (i19 & 64) != 0 ? futuresGridRunningItemModel.fundingFeeValue : bigDecimal8, (i19 & 128) != 0 ? futuresGridRunningItemModel.entryPrice : str21, (i19 & 256) != 0 ? futuresGridRunningItemModel.entryPriceValue : bigDecimal9, (i19 & 512) != 0 ? futuresGridRunningItemModel.priceRange : str22, (i19 & 1024) != 0 ? futuresGridRunningItemModel.priceRangeColor : num8, (i19 & 2048) != 0 ? futuresGridRunningItemModel.outPriceRange : i14, (i19 & 4096) != 0 ? futuresGridRunningItemModel.priceStart : bigDecimal10, (i19 & 8192) != 0 ? futuresGridRunningItemModel.priceEnd : bigDecimal11, (i19 & 16384) != 0 ? futuresGridRunningItemModel.pendingOrder : str23, (i19 & 32768) != 0 ? futuresGridRunningItemModel.buyNumber : str24, (i19 & 65536) != 0 ? futuresGridRunningItemModel.sellNumber : str25, (i19 & 131072) != 0 ? futuresGridRunningItemModel.buyNumberWidget : f11, (i19 & 262144) != 0 ? futuresGridRunningItemModel.sellNumberWidget : f12, (i19 & 524288) != 0 ? futuresGridRunningItemModel.splitWidget : f13, (i19 & 1048576) != 0 ? futuresGridRunningItemModel.weightSum : f14, (i19 & 2097152) != 0 ? futuresGridRunningItemModel.pendingOrderNumberSellColor : i15, (i19 & 4194304) != 0 ? futuresGridRunningItemModel.pendingOrderNumberBuyColor : i16, (i19 & 8388608) != 0 ? futuresGridRunningItemModel.buyNumberBg : num9, (i19 & 16777216) != 0 ? futuresGridRunningItemModel.sellNumberBg : num10, (i19 & 33554432) != 0 ? futuresGridRunningItemModel.taskId : l12, (i19 & 67108864) != 0 ? futuresGridRunningItemModel.runningStatus : str26, (i19 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? futuresGridRunningItemModel.viewType : num11, (i19 & 268435456) != 0 ? futuresGridRunningItemModel.pricePrecision : num12, (i19 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? futuresGridRunningItemModel.profitPrecision : num13, (i19 & 1073741824) != 0 ? futuresGridRunningItemModel.openUnitPriceValue : bigDecimal12, (i19 & Integer.MIN_VALUE) != 0 ? futuresGridRunningItemModel.openUnitPrice : str27, (i21 & 1) != 0 ? futuresGridRunningItemModel.endTime : l13, (i21 & 2) != 0 ? futuresGridRunningItemModel.loadingString : str28, (i21 & 4) != 0 ? futuresGridRunningItemModel.notTradingOrderPrice : str29, (i21 & 8) != 0 ? futuresGridRunningItemModel.isOpenUnit : bool, (i21 & 16) != 0 ? futuresGridRunningItemModel.isRisk : bool2, (i21 & 32) != 0 ? futuresGridRunningItemModel.futuresGridProtectionTip : str30, (i21 & 64) != 0 ? futuresGridRunningItemModel.riskLimitTimeValue : l14, (i21 & 128) != 0 ? futuresGridRunningItemModel.riskLimitTime : str31, (i21 & 256) != 0 ? futuresGridRunningItemModel.stopLossPriceValue : bigDecimal13, (i21 & 512) != 0 ? futuresGridRunningItemModel.stopLossPrice : str32, (i21 & 1024) != 0 ? futuresGridRunningItemModel.stopProfitPriceValue : bigDecimal14, (i21 & 2048) != 0 ? futuresGridRunningItemModel.stopProfitPrice : str33, (i21 & 4096) != 0 ? futuresGridRunningItemModel.stopReason : str34, (i21 & 8192) != 0 ? futuresGridRunningItemModel.stopPriceText : str35, (i21 & 16384) != 0 ? futuresGridRunningItemModel.stopPriceNumber : str36, (i21 & 32768) != 0 ? futuresGridRunningItemModel.stopReasonDetail : str37, (i21 & 65536) != 0 ? futuresGridRunningItemModel.transfers : list, (i21 & 131072) != 0 ? futuresGridRunningItemModel.totalInvestVisible : i17, (i21 & 262144) != 0 ? futuresGridRunningItemModel.couponReward : couponReward);
    }

    @NotNull
    public final FuturesGridRunningItemModel copy(@Nullable String symbolName, @Nullable String symbolCode, @Nullable String direction, @Nullable String directionCode, int directionVisible, @Nullable String leverageValue, @Nullable String leverage, @Nullable Integer leverageBgColor, int leverageVisible, @Nullable Integer centerContentBgColor, @Nullable Integer leverageTextColor, @Nullable Integer directionBgColor, @Nullable String lastPrice, @Nullable BigDecimal lastPriceValue, int lastPriceVisible, @Nullable BigDecimal liquidationPriceValue, @Nullable String liquidationPrice, @Nullable Long runningTimeValue, @Nullable String runningTime, @Nullable String quoteCode, @Nullable String quoteName, @Nullable String totalInvestText, @Nullable String totalInvest, @Nullable BigDecimal totalInvestValue, @Nullable String totalProfitText, @Nullable String totalProfit, @Nullable BigDecimal totalProfitValue, @Nullable Integer totalProfitColor, @Nullable String totalProfitRate, @Nullable BigDecimal totalProfitRateValue, @Nullable Integer dayArbitrageNum, @Nullable Integer totalArbitrageNum, @Nullable String arbitrage, @Nullable String gridProfit, @Nullable BigDecimal gridProfitValue, @Nullable String floatAmount, @Nullable BigDecimal floatAmountValue, @Nullable String fundingFee, @Nullable BigDecimal fundingFeeValue, @Nullable String entryPrice, @Nullable BigDecimal entryPriceValue, @Nullable String priceRange, @Nullable Integer priceRangeColor, int outPriceRange, @Nullable BigDecimal priceStart, @Nullable BigDecimal priceEnd, @Nullable String pendingOrder, @Nullable String buyNumber, @Nullable String sellNumber, @Nullable Float buyNumberWidget, @Nullable Float sellNumberWidget, @Nullable Float splitWidget, @Nullable Float weightSum, int pendingOrderNumberSellColor, int pendingOrderNumberBuyColor, @Nullable Integer buyNumberBg, @Nullable Integer sellNumberBg, @Nullable Long taskId, @Nullable String runningStatus, @Nullable Integer viewType, @Nullable Integer pricePrecision, @Nullable Integer profitPrecision, @Nullable BigDecimal openUnitPriceValue, @Nullable String openUnitPrice, @Nullable Long endTime, @Nullable String loadingString, @Nullable String notTradingOrderPrice, @Nullable Boolean isOpenUnit, @Nullable Boolean isRisk, @Nullable String futuresGridProtectionTip, @Nullable Long riskLimitTimeValue, @Nullable String riskLimitTime, @Nullable BigDecimal stopLossPriceValue, @Nullable String stopLossPrice, @Nullable BigDecimal stopProfitPriceValue, @Nullable String stopProfitPrice, @Nullable String stopReason, @Nullable String stopPriceText, @Nullable String stopPriceNumber, @Nullable String stopReasonDetail, @Nullable List<Transfer> transfers, int totalInvestVisible, @Nullable CouponReward couponReward) {
        return new FuturesGridRunningItemModel(symbolName, symbolCode, direction, directionCode, directionVisible, leverageValue, leverage, leverageBgColor, leverageVisible, centerContentBgColor, leverageTextColor, directionBgColor, lastPrice, lastPriceValue, lastPriceVisible, liquidationPriceValue, liquidationPrice, runningTimeValue, runningTime, quoteCode, quoteName, totalInvestText, totalInvest, totalInvestValue, totalProfitText, totalProfit, totalProfitValue, totalProfitColor, totalProfitRate, totalProfitRateValue, dayArbitrageNum, totalArbitrageNum, arbitrage, gridProfit, gridProfitValue, floatAmount, floatAmountValue, fundingFee, fundingFeeValue, entryPrice, entryPriceValue, priceRange, priceRangeColor, outPriceRange, priceStart, priceEnd, pendingOrder, buyNumber, sellNumber, buyNumberWidget, sellNumberWidget, splitWidget, weightSum, pendingOrderNumberSellColor, pendingOrderNumberBuyColor, buyNumberBg, sellNumberBg, taskId, runningStatus, viewType, pricePrecision, profitPrecision, openUnitPriceValue, openUnitPrice, endTime, loadingString, notTradingOrderPrice, isOpenUnit, isRisk, futuresGridProtectionTip, riskLimitTimeValue, riskLimitTime, stopLossPriceValue, stopLossPrice, stopProfitPriceValue, stopProfitPrice, stopReason, stopPriceText, stopPriceNumber, stopReasonDetail, transfers, totalInvestVisible, couponReward);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesGridRunningItemModel)) {
            return false;
        }
        FuturesGridRunningItemModel futuresGridRunningItemModel = (FuturesGridRunningItemModel) other;
        return Intrinsics.areEqual(this.symbolName, futuresGridRunningItemModel.symbolName) && Intrinsics.areEqual(this.symbolCode, futuresGridRunningItemModel.symbolCode) && Intrinsics.areEqual(this.direction, futuresGridRunningItemModel.direction) && Intrinsics.areEqual(this.directionCode, futuresGridRunningItemModel.directionCode) && this.directionVisible == futuresGridRunningItemModel.directionVisible && Intrinsics.areEqual(this.leverageValue, futuresGridRunningItemModel.leverageValue) && Intrinsics.areEqual(this.leverage, futuresGridRunningItemModel.leverage) && Intrinsics.areEqual(this.leverageBgColor, futuresGridRunningItemModel.leverageBgColor) && this.leverageVisible == futuresGridRunningItemModel.leverageVisible && Intrinsics.areEqual(this.centerContentBgColor, futuresGridRunningItemModel.centerContentBgColor) && Intrinsics.areEqual(this.leverageTextColor, futuresGridRunningItemModel.leverageTextColor) && Intrinsics.areEqual(this.directionBgColor, futuresGridRunningItemModel.directionBgColor) && Intrinsics.areEqual(this.lastPrice, futuresGridRunningItemModel.lastPrice) && Intrinsics.areEqual(this.lastPriceValue, futuresGridRunningItemModel.lastPriceValue) && this.lastPriceVisible == futuresGridRunningItemModel.lastPriceVisible && Intrinsics.areEqual(this.liquidationPriceValue, futuresGridRunningItemModel.liquidationPriceValue) && Intrinsics.areEqual(this.liquidationPrice, futuresGridRunningItemModel.liquidationPrice) && Intrinsics.areEqual(this.runningTimeValue, futuresGridRunningItemModel.runningTimeValue) && Intrinsics.areEqual(this.runningTime, futuresGridRunningItemModel.runningTime) && Intrinsics.areEqual(this.quoteCode, futuresGridRunningItemModel.quoteCode) && Intrinsics.areEqual(this.quoteName, futuresGridRunningItemModel.quoteName) && Intrinsics.areEqual(this.totalInvestText, futuresGridRunningItemModel.totalInvestText) && Intrinsics.areEqual(this.totalInvest, futuresGridRunningItemModel.totalInvest) && Intrinsics.areEqual(this.totalInvestValue, futuresGridRunningItemModel.totalInvestValue) && Intrinsics.areEqual(this.totalProfitText, futuresGridRunningItemModel.totalProfitText) && Intrinsics.areEqual(this.totalProfit, futuresGridRunningItemModel.totalProfit) && Intrinsics.areEqual(this.totalProfitValue, futuresGridRunningItemModel.totalProfitValue) && Intrinsics.areEqual(this.totalProfitColor, futuresGridRunningItemModel.totalProfitColor) && Intrinsics.areEqual(this.totalProfitRate, futuresGridRunningItemModel.totalProfitRate) && Intrinsics.areEqual(this.totalProfitRateValue, futuresGridRunningItemModel.totalProfitRateValue) && Intrinsics.areEqual(this.dayArbitrageNum, futuresGridRunningItemModel.dayArbitrageNum) && Intrinsics.areEqual(this.totalArbitrageNum, futuresGridRunningItemModel.totalArbitrageNum) && Intrinsics.areEqual(this.arbitrage, futuresGridRunningItemModel.arbitrage) && Intrinsics.areEqual(this.gridProfit, futuresGridRunningItemModel.gridProfit) && Intrinsics.areEqual(this.gridProfitValue, futuresGridRunningItemModel.gridProfitValue) && Intrinsics.areEqual(this.floatAmount, futuresGridRunningItemModel.floatAmount) && Intrinsics.areEqual(this.floatAmountValue, futuresGridRunningItemModel.floatAmountValue) && Intrinsics.areEqual(this.fundingFee, futuresGridRunningItemModel.fundingFee) && Intrinsics.areEqual(this.fundingFeeValue, futuresGridRunningItemModel.fundingFeeValue) && Intrinsics.areEqual(this.entryPrice, futuresGridRunningItemModel.entryPrice) && Intrinsics.areEqual(this.entryPriceValue, futuresGridRunningItemModel.entryPriceValue) && Intrinsics.areEqual(this.priceRange, futuresGridRunningItemModel.priceRange) && Intrinsics.areEqual(this.priceRangeColor, futuresGridRunningItemModel.priceRangeColor) && this.outPriceRange == futuresGridRunningItemModel.outPriceRange && Intrinsics.areEqual(this.priceStart, futuresGridRunningItemModel.priceStart) && Intrinsics.areEqual(this.priceEnd, futuresGridRunningItemModel.priceEnd) && Intrinsics.areEqual(this.pendingOrder, futuresGridRunningItemModel.pendingOrder) && Intrinsics.areEqual(this.buyNumber, futuresGridRunningItemModel.buyNumber) && Intrinsics.areEqual(this.sellNumber, futuresGridRunningItemModel.sellNumber) && Intrinsics.areEqual((Object) this.buyNumberWidget, (Object) futuresGridRunningItemModel.buyNumberWidget) && Intrinsics.areEqual((Object) this.sellNumberWidget, (Object) futuresGridRunningItemModel.sellNumberWidget) && Intrinsics.areEqual((Object) this.splitWidget, (Object) futuresGridRunningItemModel.splitWidget) && Intrinsics.areEqual((Object) this.weightSum, (Object) futuresGridRunningItemModel.weightSum) && this.pendingOrderNumberSellColor == futuresGridRunningItemModel.pendingOrderNumberSellColor && this.pendingOrderNumberBuyColor == futuresGridRunningItemModel.pendingOrderNumberBuyColor && Intrinsics.areEqual(this.buyNumberBg, futuresGridRunningItemModel.buyNumberBg) && Intrinsics.areEqual(this.sellNumberBg, futuresGridRunningItemModel.sellNumberBg) && Intrinsics.areEqual(this.taskId, futuresGridRunningItemModel.taskId) && Intrinsics.areEqual(this.runningStatus, futuresGridRunningItemModel.runningStatus) && Intrinsics.areEqual(this.viewType, futuresGridRunningItemModel.viewType) && Intrinsics.areEqual(this.pricePrecision, futuresGridRunningItemModel.pricePrecision) && Intrinsics.areEqual(this.profitPrecision, futuresGridRunningItemModel.profitPrecision) && Intrinsics.areEqual(this.openUnitPriceValue, futuresGridRunningItemModel.openUnitPriceValue) && Intrinsics.areEqual(this.openUnitPrice, futuresGridRunningItemModel.openUnitPrice) && Intrinsics.areEqual(this.endTime, futuresGridRunningItemModel.endTime) && Intrinsics.areEqual(this.loadingString, futuresGridRunningItemModel.loadingString) && Intrinsics.areEqual(this.notTradingOrderPrice, futuresGridRunningItemModel.notTradingOrderPrice) && Intrinsics.areEqual(this.isOpenUnit, futuresGridRunningItemModel.isOpenUnit) && Intrinsics.areEqual(this.isRisk, futuresGridRunningItemModel.isRisk) && Intrinsics.areEqual(this.futuresGridProtectionTip, futuresGridRunningItemModel.futuresGridProtectionTip) && Intrinsics.areEqual(this.riskLimitTimeValue, futuresGridRunningItemModel.riskLimitTimeValue) && Intrinsics.areEqual(this.riskLimitTime, futuresGridRunningItemModel.riskLimitTime) && Intrinsics.areEqual(this.stopLossPriceValue, futuresGridRunningItemModel.stopLossPriceValue) && Intrinsics.areEqual(this.stopLossPrice, futuresGridRunningItemModel.stopLossPrice) && Intrinsics.areEqual(this.stopProfitPriceValue, futuresGridRunningItemModel.stopProfitPriceValue) && Intrinsics.areEqual(this.stopProfitPrice, futuresGridRunningItemModel.stopProfitPrice) && Intrinsics.areEqual(this.stopReason, futuresGridRunningItemModel.stopReason) && Intrinsics.areEqual(this.stopPriceText, futuresGridRunningItemModel.stopPriceText) && Intrinsics.areEqual(this.stopPriceNumber, futuresGridRunningItemModel.stopPriceNumber) && Intrinsics.areEqual(this.stopReasonDetail, futuresGridRunningItemModel.stopReasonDetail) && Intrinsics.areEqual(this.transfers, futuresGridRunningItemModel.transfers) && this.totalInvestVisible == futuresGridRunningItemModel.totalInvestVisible && Intrinsics.areEqual(this.couponReward, futuresGridRunningItemModel.couponReward);
    }

    public FuturesGridRunningItemModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i11, @Nullable String str5, @Nullable String str6, @Nullable Integer num, int i12, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str7, @Nullable BigDecimal bigDecimal, int i13, @Nullable BigDecimal bigDecimal2, @Nullable String str8, @Nullable Long l11, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable BigDecimal bigDecimal3, @Nullable String str14, @Nullable String str15, @Nullable BigDecimal bigDecimal4, @Nullable Integer num5, @Nullable String str16, @Nullable BigDecimal bigDecimal5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str17, @Nullable String str18, @Nullable BigDecimal bigDecimal6, @Nullable String str19, @Nullable BigDecimal bigDecimal7, @Nullable String str20, @Nullable BigDecimal bigDecimal8, @Nullable String str21, @Nullable BigDecimal bigDecimal9, @Nullable String str22, @Nullable Integer num8, int i14, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable Float f11, @Nullable Float f12, @Nullable Float f13, @Nullable Float f14, int i15, int i16, @Nullable Integer num9, @Nullable Integer num10, @Nullable Long l12, @Nullable String str26, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable BigDecimal bigDecimal12, @Nullable String str27, @Nullable Long l13, @Nullable String str28, @Nullable String str29, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str30, @Nullable Long l14, @Nullable String str31, @Nullable BigDecimal bigDecimal13, @Nullable String str32, @Nullable BigDecimal bigDecimal14, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable List<Transfer> list, int i17, @Nullable CouponReward couponReward) {
        this.symbolName = str;
        this.symbolCode = str2;
        this.direction = str3;
        this.directionCode = str4;
        this.directionVisible = i11;
        this.leverageValue = str5;
        this.leverage = str6;
        this.leverageBgColor = num;
        this.leverageVisible = i12;
        this.centerContentBgColor = num2;
        this.leverageTextColor = num3;
        this.directionBgColor = num4;
        this.lastPrice = str7;
        this.lastPriceValue = bigDecimal;
        this.lastPriceVisible = i13;
        this.liquidationPriceValue = bigDecimal2;
        this.liquidationPrice = str8;
        this.runningTimeValue = l11;
        this.runningTime = str9;
        this.quoteCode = str10;
        this.quoteName = str11;
        this.totalInvestText = str12;
        this.totalInvest = str13;
        this.totalInvestValue = bigDecimal3;
        this.totalProfitText = str14;
        this.totalProfit = str15;
        this.totalProfitValue = bigDecimal4;
        this.totalProfitColor = num5;
        this.totalProfitRate = str16;
        this.totalProfitRateValue = bigDecimal5;
        this.dayArbitrageNum = num6;
        this.totalArbitrageNum = num7;
        this.arbitrage = str17;
        this.gridProfit = str18;
        this.gridProfitValue = bigDecimal6;
        this.floatAmount = str19;
        this.floatAmountValue = bigDecimal7;
        this.fundingFee = str20;
        this.fundingFeeValue = bigDecimal8;
        this.entryPrice = str21;
        this.entryPriceValue = bigDecimal9;
        this.priceRange = str22;
        this.priceRangeColor = num8;
        this.outPriceRange = i14;
        this.priceStart = bigDecimal10;
        this.priceEnd = bigDecimal11;
        this.pendingOrder = str23;
        this.buyNumber = str24;
        this.sellNumber = str25;
        this.buyNumberWidget = f11;
        this.sellNumberWidget = f12;
        this.splitWidget = f13;
        this.weightSum = f14;
        this.pendingOrderNumberSellColor = i15;
        this.pendingOrderNumberBuyColor = i16;
        this.buyNumberBg = num9;
        this.sellNumberBg = num10;
        this.taskId = l12;
        this.runningStatus = str26;
        this.viewType = num11;
        this.pricePrecision = num12;
        this.profitPrecision = num13;
        this.openUnitPriceValue = bigDecimal12;
        this.openUnitPrice = str27;
        this.endTime = l13;
        this.loadingString = str28;
        this.notTradingOrderPrice = str29;
        this.isOpenUnit = bool;
        this.isRisk = bool2;
        this.futuresGridProtectionTip = str30;
        this.riskLimitTimeValue = l14;
        this.riskLimitTime = str31;
        this.stopLossPriceValue = bigDecimal13;
        this.stopLossPrice = str32;
        this.stopProfitPriceValue = bigDecimal14;
        this.stopProfitPrice = str33;
        this.stopReason = str34;
        this.stopPriceText = str35;
        this.stopPriceNumber = str36;
        this.stopReasonDetail = str37;
        this.transfers = list;
        this.totalInvestVisible = i17;
        this.couponReward = couponReward;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCenterContentBgColor() {
        return this.centerContentBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getLeverageTextColor() {
        return this.leverageTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getDirectionBgColor() {
        return this.directionBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getLastPriceValue() {
        return this.lastPriceValue;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getLastPriceVisible() {
        return this.lastPriceVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getLiquidationPriceValue() {
        return this.liquidationPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getRunningTimeValue() {
        return this.runningTimeValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRunningTime() {
        return this.runningTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getQuoteCode() {
        return this.quoteCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getQuoteName() {
        return this.quoteName;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getTotalInvestText() {
        return this.totalInvestText;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTotalInvest() {
        return this.totalInvest;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getTotalInvestValue() {
        return this.totalInvestValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTotalProfitText() {
        return this.totalProfitText;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getTotalProfitValue() {
        return this.totalProfitValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getTotalProfitColor() {
        return this.totalProfitColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTotalProfitRate() {
        return this.totalProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BigDecimal getTotalProfitRateValue() {
        return this.totalProfitRateValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Integer getDayArbitrageNum() {
        return this.dayArbitrageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Integer getTotalArbitrageNum() {
        return this.totalArbitrageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getArbitrage() {
        return this.arbitrage;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getGridProfit() {
        return this.gridProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getGridProfitValue() {
        return this.gridProfitValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getFloatAmount() {
        return this.floatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BigDecimal getFloatAmountValue() {
        return this.floatAmountValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final BigDecimal getFundingFeeValue() {
        return this.fundingFeeValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDirectionCode() {
        return this.directionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getEntryPrice() {
        return this.entryPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final BigDecimal getEntryPriceValue() {
        return this.entryPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getPriceRange() {
        return this.priceRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Integer getPriceRangeColor() {
        return this.priceRangeColor;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getOutPriceRange() {
        return this.outPriceRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final BigDecimal getPriceStart() {
        return this.priceStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final BigDecimal getPriceEnd() {
        return this.priceEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getPendingOrder() {
        return this.pendingOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getBuyNumber() {
        return this.buyNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getSellNumber() {
        return this.sellNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDirectionVisible() {
        return this.directionVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Float getBuyNumberWidget() {
        return this.buyNumberWidget;
    }

    @Nullable
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Float getSellNumberWidget() {
        return this.sellNumberWidget;
    }

    @Nullable
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final Float getSplitWidget() {
        return this.splitWidget;
    }

    @Nullable
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Float getWeightSum() {
        return this.weightSum;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final int getPendingOrderNumberSellColor() {
        return this.pendingOrderNumberSellColor;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final int getPendingOrderNumberBuyColor() {
        return this.pendingOrderNumberBuyColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component56, reason: from getter */
    public final Integer getBuyNumberBg() {
        return this.buyNumberBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component57, reason: from getter */
    public final Integer getSellNumberBg() {
        return this.sellNumberBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component58, reason: from getter */
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getRunningStatus() {
        return this.runningStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLeverageValue() {
        return this.leverageValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component60, reason: from getter */
    public final Integer getViewType() {
        return this.viewType;
    }

    @Nullable
    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Integer getPricePrecision() {
        return this.pricePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component62, reason: from getter */
    public final Integer getProfitPrecision() {
        return this.profitPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component63, reason: from getter */
    public final BigDecimal getOpenUnitPriceValue() {
        return this.openUnitPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getOpenUnitPrice() {
        return this.openUnitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component65, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getLoadingString() {
        return this.loadingString;
    }

    @Nullable
    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getNotTradingOrderPrice() {
        return this.notTradingOrderPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component68, reason: from getter */
    public final Boolean getIsOpenUnit() {
        return this.isOpenUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component69, reason: from getter */
    public final Boolean getIsRisk() {
        return this.isRisk;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component70, reason: from getter */
    public final String getFuturesGridProtectionTip() {
        return this.futuresGridProtectionTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component71, reason: from getter */
    public final Long getRiskLimitTimeValue() {
        return this.riskLimitTimeValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component72, reason: from getter */
    public final String getRiskLimitTime() {
        return this.riskLimitTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component73, reason: from getter */
    public final BigDecimal getStopLossPriceValue() {
        return this.stopLossPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component74, reason: from getter */
    public final String getStopLossPrice() {
        return this.stopLossPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component75, reason: from getter */
    public final BigDecimal getStopProfitPriceValue() {
        return this.stopProfitPriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component76, reason: from getter */
    public final String getStopProfitPrice() {
        return this.stopProfitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component77, reason: from getter */
    public final String getStopReason() {
        return this.stopReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component78, reason: from getter */
    public final String getStopPriceText() {
        return this.stopPriceText;
    }

    @Nullable
    /* JADX INFO: renamed from: component79, reason: from getter */
    public final String getStopPriceNumber() {
        return this.stopPriceNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getLeverageBgColor() {
        return this.leverageBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component80, reason: from getter */
    public final String getStopReasonDetail() {
        return this.stopReasonDetail;
    }

    @Nullable
    public final List<Transfer> component81() {
        return this.transfers;
    }

    /* JADX INFO: renamed from: component82, reason: from getter */
    public final int getTotalInvestVisible() {
        return this.totalInvestVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component83, reason: from getter */
    public final CouponReward getCouponReward() {
        return this.couponReward;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLeverageVisible() {
        return this.leverageVisible;
    }

    @Nullable
    public final String getArbitrage() {
        return this.arbitrage;
    }

    @Nullable
    public final String getBuyNumber() {
        return this.buyNumber;
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
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final Integer getDirectionBgColor() {
        return this.directionBgColor;
    }

    @Nullable
    public final String getDirectionCode() {
        return this.directionCode;
    }

    public final int getDirectionVisible() {
        return this.directionVisible;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getEntryPrice() {
        return this.entryPrice;
    }

    @Nullable
    public final BigDecimal getEntryPriceValue() {
        return this.entryPriceValue;
    }

    @Nullable
    public final String getFloatAmount() {
        return this.floatAmount;
    }

    @Nullable
    public final BigDecimal getFloatAmountValue() {
        return this.floatAmountValue;
    }

    @Nullable
    public final String getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    public final BigDecimal getFundingFeeValue() {
        return this.fundingFeeValue;
    }

    @Nullable
    public final String getFuturesGridProtectionTip() {
        return this.futuresGridProtectionTip;
    }

    @Nullable
    public final String getGridProfit() {
        return this.gridProfit;
    }

    @Nullable
    public final BigDecimal getGridProfitValue() {
        return this.gridProfitValue;
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
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final Integer getLeverageBgColor() {
        return this.leverageBgColor;
    }

    @Nullable
    public final Integer getLeverageTextColor() {
        return this.leverageTextColor;
    }

    @Nullable
    public final String getLeverageValue() {
        return this.leverageValue;
    }

    public final int getLeverageVisible() {
        return this.leverageVisible;
    }

    @Nullable
    public final String getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    public final BigDecimal getLiquidationPriceValue() {
        return this.liquidationPriceValue;
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
    public final String getOpenUnitPrice() {
        return this.openUnitPrice;
    }

    @Nullable
    public final BigDecimal getOpenUnitPriceValue() {
        return this.openUnitPriceValue;
    }

    public final int getOutPriceRange() {
        return this.outPriceRange;
    }

    @Nullable
    public final String getPendingOrder() {
        return this.pendingOrder;
    }

    public final int getPendingOrderNumberBuyColor() {
        return this.pendingOrderNumberBuyColor;
    }

    public final int getPendingOrderNumberSellColor() {
        return this.pendingOrderNumberSellColor;
    }

    @Nullable
    public final BigDecimal getPriceEnd() {
        return this.priceEnd;
    }

    @Nullable
    public final Integer getPricePrecision() {
        return this.pricePrecision;
    }

    @Nullable
    public final String getPriceRange() {
        return this.priceRange;
    }

    @Nullable
    public final Integer getPriceRangeColor() {
        return this.priceRangeColor;
    }

    @Nullable
    public final BigDecimal getPriceStart() {
        return this.priceStart;
    }

    @Nullable
    public final Integer getProfitPrecision() {
        return this.profitPrecision;
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
    public final String getRiskLimitTime() {
        return this.riskLimitTime;
    }

    @Nullable
    public final Long getRiskLimitTimeValue() {
        return this.riskLimitTimeValue;
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
    public final String getSellNumber() {
        return this.sellNumber;
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
    public final String getTotalInvest() {
        return this.totalInvest;
    }

    @Nullable
    public final String getTotalInvestText() {
        return this.totalInvestText;
    }

    @Nullable
    public final BigDecimal getTotalInvestValue() {
        return this.totalInvestValue;
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
    public final String getTotalProfitText() {
        return this.totalProfitText;
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
    public final Integer getViewType() {
        return this.viewType;
    }

    @Nullable
    public final Float getWeightSum() {
        return this.weightSum;
    }

    public int hashCode() {
        String str = this.symbolName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbolCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.direction;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.directionCode;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.directionVisible)) * 31;
        String str5 = this.leverageValue;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.leverage;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.leverageBgColor;
        int iHashCode7 = (((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.leverageVisible)) * 31;
        Integer num2 = this.centerContentBgColor;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.leverageTextColor;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.directionBgColor;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.lastPrice;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal = this.lastPriceValue;
        int iHashCode12 = (((iHashCode11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Integer.hashCode(this.lastPriceVisible)) * 31;
        BigDecimal bigDecimal2 = this.liquidationPriceValue;
        int iHashCode13 = (iHashCode12 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str8 = this.liquidationPrice;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.runningTimeValue;
        int iHashCode15 = (iHashCode14 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.runningTime;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.quoteCode;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.quoteName;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.totalInvestText;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.totalInvest;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalInvestValue;
        int iHashCode21 = (iHashCode20 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str14 = this.totalProfitText;
        int iHashCode22 = (iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.totalProfit;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalProfitValue;
        int iHashCode24 = (iHashCode23 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Integer num5 = this.totalProfitColor;
        int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str16 = this.totalProfitRate;
        int iHashCode26 = (iHashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalProfitRateValue;
        int iHashCode27 = (iHashCode26 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Integer num6 = this.dayArbitrageNum;
        int iHashCode28 = (iHashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.totalArbitrageNum;
        int iHashCode29 = (iHashCode28 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str17 = this.arbitrage;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.gridProfit;
        int iHashCode31 = (iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.gridProfitValue;
        int iHashCode32 = (iHashCode31 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str19 = this.floatAmount;
        int iHashCode33 = (iHashCode32 + (str19 == null ? 0 : str19.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.floatAmountValue;
        int iHashCode34 = (iHashCode33 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str20 = this.fundingFee;
        int iHashCode35 = (iHashCode34 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.fundingFeeValue;
        int iHashCode36 = (iHashCode35 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str21 = this.entryPrice;
        int iHashCode37 = (iHashCode36 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.entryPriceValue;
        int iHashCode38 = (iHashCode37 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str22 = this.priceRange;
        int iHashCode39 = (iHashCode38 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Integer num8 = this.priceRangeColor;
        int iHashCode40 = (((iHashCode39 + (num8 == null ? 0 : num8.hashCode())) * 31) + Integer.hashCode(this.outPriceRange)) * 31;
        BigDecimal bigDecimal10 = this.priceStart;
        int iHashCode41 = (iHashCode40 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.priceEnd;
        int iHashCode42 = (iHashCode41 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        String str23 = this.pendingOrder;
        int iHashCode43 = (iHashCode42 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.buyNumber;
        int iHashCode44 = (iHashCode43 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.sellNumber;
        int iHashCode45 = (iHashCode44 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Float f11 = this.buyNumberWidget;
        int iHashCode46 = (iHashCode45 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.sellNumberWidget;
        int iHashCode47 = (iHashCode46 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.splitWidget;
        int iHashCode48 = (iHashCode47 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.weightSum;
        int iHashCode49 = (((((iHashCode48 + (f14 == null ? 0 : f14.hashCode())) * 31) + Integer.hashCode(this.pendingOrderNumberSellColor)) * 31) + Integer.hashCode(this.pendingOrderNumberBuyColor)) * 31;
        Integer num9 = this.buyNumberBg;
        int iHashCode50 = (iHashCode49 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.sellNumberBg;
        int iHashCode51 = (iHashCode50 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Long l12 = this.taskId;
        int iHashCode52 = (iHashCode51 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str26 = this.runningStatus;
        int iHashCode53 = (iHashCode52 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num11 = this.viewType;
        int iHashCode54 = (iHashCode53 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.pricePrecision;
        int iHashCode55 = (iHashCode54 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.profitPrecision;
        int iHashCode56 = (iHashCode55 + (num13 == null ? 0 : num13.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.openUnitPriceValue;
        int iHashCode57 = (iHashCode56 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        String str27 = this.openUnitPrice;
        int iHashCode58 = (iHashCode57 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Long l13 = this.endTime;
        int iHashCode59 = (iHashCode58 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str28 = this.loadingString;
        int iHashCode60 = (iHashCode59 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.notTradingOrderPrice;
        int iHashCode61 = (iHashCode60 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Boolean bool = this.isOpenUnit;
        int iHashCode62 = (iHashCode61 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRisk;
        int iHashCode63 = (iHashCode62 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str30 = this.futuresGridProtectionTip;
        int iHashCode64 = (iHashCode63 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Long l14 = this.riskLimitTimeValue;
        int iHashCode65 = (iHashCode64 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str31 = this.riskLimitTime;
        int iHashCode66 = (iHashCode65 + (str31 == null ? 0 : str31.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.stopLossPriceValue;
        int iHashCode67 = (iHashCode66 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        String str32 = this.stopLossPrice;
        int iHashCode68 = (iHashCode67 + (str32 == null ? 0 : str32.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.stopProfitPriceValue;
        int iHashCode69 = (iHashCode68 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        String str33 = this.stopProfitPrice;
        int iHashCode70 = (iHashCode69 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.stopReason;
        int iHashCode71 = (iHashCode70 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.stopPriceText;
        int iHashCode72 = (iHashCode71 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.stopPriceNumber;
        int iHashCode73 = (iHashCode72 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.stopReasonDetail;
        int iHashCode74 = (iHashCode73 + (str37 == null ? 0 : str37.hashCode())) * 31;
        List<Transfer> list = this.transfers;
        int iHashCode75 = (((iHashCode74 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.totalInvestVisible)) * 31;
        CouponReward couponReward = this.couponReward;
        return iHashCode75 + (couponReward != null ? couponReward.hashCode() : 0);
    }

    @Nullable
    public final Boolean isOpenUnit() {
        return this.isOpenUnit;
    }

    @Nullable
    public final Boolean isRisk() {
        return this.isRisk;
    }

    public final void setArbitrage(@Nullable String str) {
        this.arbitrage = str;
    }

    public final void setBuyNumber(@Nullable String str) {
        this.buyNumber = str;
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

    public final void setDirection(@Nullable String str) {
        this.direction = str;
    }

    public final void setDirectionBgColor(@Nullable Integer num) {
        this.directionBgColor = num;
    }

    public final void setDirectionCode(@Nullable String str) {
        this.directionCode = str;
    }

    public final void setDirectionVisible(int i11) {
        this.directionVisible = i11;
    }

    public final void setEndTime(@Nullable Long l11) {
        this.endTime = l11;
    }

    public final void setEntryPrice(@Nullable String str) {
        this.entryPrice = str;
    }

    public final void setEntryPriceValue(@Nullable BigDecimal bigDecimal) {
        this.entryPriceValue = bigDecimal;
    }

    public final void setFloatAmount(@Nullable String str) {
        this.floatAmount = str;
    }

    public final void setFloatAmountValue(@Nullable BigDecimal bigDecimal) {
        this.floatAmountValue = bigDecimal;
    }

    public final void setFundingFee(@Nullable String str) {
        this.fundingFee = str;
    }

    public final void setFundingFeeValue(@Nullable BigDecimal bigDecimal) {
        this.fundingFeeValue = bigDecimal;
    }

    public final void setFuturesGridProtectionTip(@Nullable String str) {
        this.futuresGridProtectionTip = str;
    }

    public final void setGridProfit(@Nullable String str) {
        this.gridProfit = str;
    }

    public final void setGridProfitValue(@Nullable BigDecimal bigDecimal) {
        this.gridProfitValue = bigDecimal;
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

    public final void setLeverage(@Nullable String str) {
        this.leverage = str;
    }

    public final void setLeverageBgColor(@Nullable Integer num) {
        this.leverageBgColor = num;
    }

    public final void setLeverageTextColor(@Nullable Integer num) {
        this.leverageTextColor = num;
    }

    public final void setLeverageValue(@Nullable String str) {
        this.leverageValue = str;
    }

    public final void setLeverageVisible(int i11) {
        this.leverageVisible = i11;
    }

    public final void setLiquidationPrice(@Nullable String str) {
        this.liquidationPrice = str;
    }

    public final void setLiquidationPriceValue(@Nullable BigDecimal bigDecimal) {
        this.liquidationPriceValue = bigDecimal;
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

    public final void setOpenUnitPrice(@Nullable String str) {
        this.openUnitPrice = str;
    }

    public final void setOpenUnitPriceValue(@Nullable BigDecimal bigDecimal) {
        this.openUnitPriceValue = bigDecimal;
    }

    public final void setOutPriceRange(int i11) {
        this.outPriceRange = i11;
    }

    public final void setPendingOrder(@Nullable String str) {
        this.pendingOrder = str;
    }

    public final void setPendingOrderNumberBuyColor(int i11) {
        this.pendingOrderNumberBuyColor = i11;
    }

    public final void setPendingOrderNumberSellColor(int i11) {
        this.pendingOrderNumberSellColor = i11;
    }

    public final void setPriceEnd(@Nullable BigDecimal bigDecimal) {
        this.priceEnd = bigDecimal;
    }

    public final void setPricePrecision(@Nullable Integer num) {
        this.pricePrecision = num;
    }

    public final void setPriceRange(@Nullable String str) {
        this.priceRange = str;
    }

    public final void setPriceRangeColor(@Nullable Integer num) {
        this.priceRangeColor = num;
    }

    public final void setPriceStart(@Nullable BigDecimal bigDecimal) {
        this.priceStart = bigDecimal;
    }

    public final void setProfitPrecision(@Nullable Integer num) {
        this.profitPrecision = num;
    }

    public final void setQuoteCode(@Nullable String str) {
        this.quoteCode = str;
    }

    public final void setQuoteName(@Nullable String str) {
        this.quoteName = str;
    }

    public final void setRisk(@Nullable Boolean bool) {
        this.isRisk = bool;
    }

    public final void setRiskLimitTime(@Nullable String str) {
        this.riskLimitTime = str;
    }

    public final void setRiskLimitTimeValue(@Nullable Long l11) {
        this.riskLimitTimeValue = l11;
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

    public final void setSellNumber(@Nullable String str) {
        this.sellNumber = str;
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

    public final void setTotalInvest(@Nullable String str) {
        this.totalInvest = str;
    }

    public final void setTotalInvestText(@Nullable String str) {
        this.totalInvestText = str;
    }

    public final void setTotalInvestValue(@Nullable BigDecimal bigDecimal) {
        this.totalInvestValue = bigDecimal;
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

    public final void setTotalProfitText(@Nullable String str) {
        this.totalProfitText = str;
    }

    public final void setTotalProfitValue(@Nullable BigDecimal bigDecimal) {
        this.totalProfitValue = bigDecimal;
    }

    public final void setTransfers(@Nullable List<Transfer> list) {
        this.transfers = list;
    }

    public final void setViewType(@Nullable Integer num) {
        this.viewType = num;
    }

    public final void setWeightSum(@Nullable Float f11) {
        this.weightSum = f11;
    }

    @NotNull
    public String toString() {
        return "FuturesGridRunningItemModel(symbolName=" + this.symbolName + ", symbolCode=" + this.symbolCode + ", direction=" + this.direction + ", directionCode=" + this.directionCode + ", directionVisible=" + this.directionVisible + ", leverageValue=" + this.leverageValue + ", leverage=" + this.leverage + ", leverageBgColor=" + this.leverageBgColor + ", leverageVisible=" + this.leverageVisible + ", centerContentBgColor=" + this.centerContentBgColor + ", leverageTextColor=" + this.leverageTextColor + ", directionBgColor=" + this.directionBgColor + ", lastPrice=" + this.lastPrice + ", lastPriceValue=" + this.lastPriceValue + ", lastPriceVisible=" + this.lastPriceVisible + ", liquidationPriceValue=" + this.liquidationPriceValue + ", liquidationPrice=" + this.liquidationPrice + ", runningTimeValue=" + this.runningTimeValue + ", runningTime=" + this.runningTime + ", quoteCode=" + this.quoteCode + ", quoteName=" + this.quoteName + ", totalInvestText=" + this.totalInvestText + ", totalInvest=" + this.totalInvest + ", totalInvestValue=" + this.totalInvestValue + ", totalProfitText=" + this.totalProfitText + ", totalProfit=" + this.totalProfit + ", totalProfitValue=" + this.totalProfitValue + ", totalProfitColor=" + this.totalProfitColor + ", totalProfitRate=" + this.totalProfitRate + ", totalProfitRateValue=" + this.totalProfitRateValue + ", dayArbitrageNum=" + this.dayArbitrageNum + ", totalArbitrageNum=" + this.totalArbitrageNum + ", arbitrage=" + this.arbitrage + ", gridProfit=" + this.gridProfit + ", gridProfitValue=" + this.gridProfitValue + ", floatAmount=" + this.floatAmount + ", floatAmountValue=" + this.floatAmountValue + ", fundingFee=" + this.fundingFee + ", fundingFeeValue=" + this.fundingFeeValue + ", entryPrice=" + this.entryPrice + ", entryPriceValue=" + this.entryPriceValue + ", priceRange=" + this.priceRange + ", priceRangeColor=" + this.priceRangeColor + ", outPriceRange=" + this.outPriceRange + ", priceStart=" + this.priceStart + ", priceEnd=" + this.priceEnd + ", pendingOrder=" + this.pendingOrder + ", buyNumber=" + this.buyNumber + ", sellNumber=" + this.sellNumber + ", buyNumberWidget=" + this.buyNumberWidget + ", sellNumberWidget=" + this.sellNumberWidget + ", splitWidget=" + this.splitWidget + ", weightSum=" + this.weightSum + ", pendingOrderNumberSellColor=" + this.pendingOrderNumberSellColor + ", pendingOrderNumberBuyColor=" + this.pendingOrderNumberBuyColor + ", buyNumberBg=" + this.buyNumberBg + ", sellNumberBg=" + this.sellNumberBg + ", taskId=" + this.taskId + ", runningStatus=" + this.runningStatus + ", viewType=" + this.viewType + ", pricePrecision=" + this.pricePrecision + ", profitPrecision=" + this.profitPrecision + ", openUnitPriceValue=" + this.openUnitPriceValue + ", openUnitPrice=" + this.openUnitPrice + ", endTime=" + this.endTime + ", loadingString=" + this.loadingString + ", notTradingOrderPrice=" + this.notTradingOrderPrice + ", isOpenUnit=" + this.isOpenUnit + ", isRisk=" + this.isRisk + ", futuresGridProtectionTip=" + this.futuresGridProtectionTip + ", riskLimitTimeValue=" + this.riskLimitTimeValue + ", riskLimitTime=" + this.riskLimitTime + ", stopLossPriceValue=" + this.stopLossPriceValue + ", stopLossPrice=" + this.stopLossPrice + ", stopProfitPriceValue=" + this.stopProfitPriceValue + ", stopProfitPrice=" + this.stopProfitPrice + ", stopReason=" + this.stopReason + ", stopPriceText=" + this.stopPriceText + ", stopPriceNumber=" + this.stopPriceNumber + ", stopReasonDetail=" + this.stopReasonDetail + ", transfers=" + this.transfers + ", totalInvestVisible=" + this.totalInvestVisible + ", couponReward=" + this.couponReward + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbolName);
        dest.writeString(this.symbolCode);
        dest.writeString(this.direction);
        dest.writeString(this.directionCode);
        dest.writeInt(this.directionVisible);
        dest.writeString(this.leverageValue);
        dest.writeString(this.leverage);
        Integer num = this.leverageBgColor;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeInt(this.leverageVisible);
        Integer num2 = this.centerContentBgColor;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.leverageTextColor;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.directionBgColor;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        dest.writeString(this.lastPrice);
        dest.writeSerializable(this.lastPriceValue);
        dest.writeInt(this.lastPriceVisible);
        dest.writeSerializable(this.liquidationPriceValue);
        dest.writeString(this.liquidationPrice);
        Long l11 = this.runningTimeValue;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.runningTime);
        dest.writeString(this.quoteCode);
        dest.writeString(this.quoteName);
        dest.writeString(this.totalInvestText);
        dest.writeString(this.totalInvest);
        dest.writeSerializable(this.totalInvestValue);
        dest.writeString(this.totalProfitText);
        dest.writeString(this.totalProfit);
        dest.writeSerializable(this.totalProfitValue);
        Integer num5 = this.totalProfitColor;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        dest.writeString(this.totalProfitRate);
        dest.writeSerializable(this.totalProfitRateValue);
        Integer num6 = this.dayArbitrageNum;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        Integer num7 = this.totalArbitrageNum;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num7.intValue());
        }
        dest.writeString(this.arbitrage);
        dest.writeString(this.gridProfit);
        dest.writeSerializable(this.gridProfitValue);
        dest.writeString(this.floatAmount);
        dest.writeSerializable(this.floatAmountValue);
        dest.writeString(this.fundingFee);
        dest.writeSerializable(this.fundingFeeValue);
        dest.writeString(this.entryPrice);
        dest.writeSerializable(this.entryPriceValue);
        dest.writeString(this.priceRange);
        Integer num8 = this.priceRangeColor;
        if (num8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num8.intValue());
        }
        dest.writeInt(this.outPriceRange);
        dest.writeSerializable(this.priceStart);
        dest.writeSerializable(this.priceEnd);
        dest.writeString(this.pendingOrder);
        dest.writeString(this.buyNumber);
        dest.writeString(this.sellNumber);
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
        dest.writeInt(this.pendingOrderNumberSellColor);
        dest.writeInt(this.pendingOrderNumberBuyColor);
        Integer num9 = this.buyNumberBg;
        if (num9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num9.intValue());
        }
        Integer num10 = this.sellNumberBg;
        if (num10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num10.intValue());
        }
        Long l12 = this.taskId;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.runningStatus);
        Integer num11 = this.viewType;
        if (num11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num11.intValue());
        }
        Integer num12 = this.pricePrecision;
        if (num12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num12.intValue());
        }
        Integer num13 = this.profitPrecision;
        if (num13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num13.intValue());
        }
        dest.writeSerializable(this.openUnitPriceValue);
        dest.writeString(this.openUnitPrice);
        Long l13 = this.endTime;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.loadingString);
        dest.writeString(this.notTradingOrderPrice);
        Boolean bool = this.isOpenUnit;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isRisk;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.futuresGridProtectionTip);
        Long l14 = this.riskLimitTimeValue;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        dest.writeString(this.riskLimitTime);
        dest.writeSerializable(this.stopLossPriceValue);
        dest.writeString(this.stopLossPrice);
        dest.writeSerializable(this.stopProfitPriceValue);
        dest.writeString(this.stopProfitPrice);
        dest.writeString(this.stopReason);
        dest.writeString(this.stopPriceText);
        dest.writeString(this.stopPriceNumber);
        dest.writeString(this.stopReasonDetail);
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
        dest.writeInt(this.totalInvestVisible);
        CouponReward couponReward = this.couponReward;
        if (couponReward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            couponReward.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FuturesGridRunningItemModel(String str, String str2, String str3, String str4, int i11, String str5, String str6, Integer num, int i12, Integer num2, Integer num3, Integer num4, String str7, BigDecimal bigDecimal, int i13, BigDecimal bigDecimal2, String str8, Long l11, String str9, String str10, String str11, String str12, String str13, BigDecimal bigDecimal3, String str14, String str15, BigDecimal bigDecimal4, Integer num5, String str16, BigDecimal bigDecimal5, Integer num6, Integer num7, String str17, String str18, BigDecimal bigDecimal6, String str19, BigDecimal bigDecimal7, String str20, BigDecimal bigDecimal8, String str21, BigDecimal bigDecimal9, String str22, Integer num8, int i14, BigDecimal bigDecimal10, BigDecimal bigDecimal11, String str23, String str24, String str25, Float f11, Float f12, Float f13, Float f14, int i15, int i16, Integer num9, Integer num10, Long l12, String str26, Integer num11, Integer num12, Integer num13, BigDecimal bigDecimal12, String str27, Long l13, String str28, String str29, Boolean bool, Boolean bool2, String str30, Long l14, String str31, BigDecimal bigDecimal13, String str32, BigDecimal bigDecimal14, String str33, String str34, String str35, String str36, String str37, List list, int i17, CouponReward couponReward, int i18, int i19, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        String str38 = (i18 & 1) != 0 ? null : str;
        String str39 = (i18 & 2) != 0 ? null : str2;
        String str40 = (i18 & 4) != 0 ? null : str3;
        String str41 = (i18 & 8) != 0 ? null : str4;
        int i22 = (i18 & 16) != 0 ? 0 : i11;
        String str42 = (i18 & 32) != 0 ? null : str5;
        String str43 = (i18 & 64) != 0 ? null : str6;
        Integer num14 = (i18 & 128) != 0 ? null : num;
        int i23 = (i18 & 256) != 0 ? 0 : i12;
        Integer num15 = (i18 & 512) != 0 ? null : num2;
        Integer num16 = (i18 & 1024) != 0 ? null : num3;
        Integer num17 = (i18 & 2048) != 0 ? null : num4;
        String str44 = (i18 & 4096) != 0 ? null : str7;
        String str45 = str38;
        BigDecimal bigDecimal15 = (i18 & 8192) != 0 ? null : bigDecimal;
        int i24 = (i18 & 16384) != 0 ? 0 : i13;
        BigDecimal bigDecimal16 = (i18 & 32768) != 0 ? null : bigDecimal2;
        String str46 = (i18 & 65536) != 0 ? null : str8;
        Long l15 = (i18 & 131072) != 0 ? null : l11;
        String str47 = (i18 & 262144) != 0 ? null : str9;
        String str48 = (i18 & 524288) != 0 ? null : str10;
        String str49 = (i18 & 1048576) != 0 ? null : str11;
        String str50 = (i18 & 2097152) != 0 ? null : str12;
        String str51 = (i18 & 4194304) != 0 ? null : str13;
        BigDecimal bigDecimal17 = (i18 & 8388608) != 0 ? null : bigDecimal3;
        String str52 = (i18 & 16777216) != 0 ? null : str14;
        String str53 = (i18 & 33554432) != 0 ? null : str15;
        BigDecimal bigDecimal18 = (i18 & 67108864) != 0 ? null : bigDecimal4;
        Integer num18 = (i18 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : num5;
        String str54 = (i18 & 268435456) != 0 ? null : str16;
        BigDecimal bigDecimal19 = (i18 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bigDecimal5;
        Integer num19 = (i18 & 1073741824) != 0 ? null : num6;
        Integer num20 = (i18 & Integer.MIN_VALUE) != 0 ? null : num7;
        this(str45, str39, str40, str41, i22, str42, str43, num14, i23, num15, num16, num17, str44, bigDecimal15, i24, bigDecimal16, str46, l15, str47, str48, str49, str50, str51, bigDecimal17, str52, str53, bigDecimal18, num18, str54, bigDecimal19, num19, num20, (i19 & 1) != 0 ? null : str17, (i19 & 2) != 0 ? null : str18, (i19 & 4) != 0 ? null : bigDecimal6, (i19 & 8) != 0 ? null : str19, (i19 & 16) != 0 ? null : bigDecimal7, (i19 & 32) != 0 ? null : str20, (i19 & 64) != 0 ? null : bigDecimal8, (i19 & 128) != 0 ? null : str21, (i19 & 256) != 0 ? null : bigDecimal9, (i19 & 512) != 0 ? null : str22, (i19 & 1024) != 0 ? null : num8, (i19 & 2048) != 0 ? 4 : i14, (i19 & 4096) != 0 ? null : bigDecimal10, (i19 & 8192) != 0 ? null : bigDecimal11, (i19 & 16384) != 0 ? null : str23, (i19 & 32768) != 0 ? null : str24, (i19 & 65536) != 0 ? null : str25, (i19 & 131072) != 0 ? null : f11, (i19 & 262144) != 0 ? null : f12, (i19 & 524288) != 0 ? null : f13, (i19 & 1048576) != 0 ? null : f14, (i19 & 2097152) != 0 ? C22890g.m54289n(C27017c.f54310a.m66513b()) : i15, (i19 & 4194304) != 0 ? C22890g.m54291p(C27017c.f54310a.m66513b()) : i16, (i19 & 8388608) != 0 ? null : num9, (i19 & 16777216) != 0 ? null : num10, (i19 & 33554432) != 0 ? null : l12, (i19 & 67108864) != 0 ? null : str26, (i19 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : num11, (i19 & 268435456) != 0 ? null : num12, (i19 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : num13, (i19 & 1073741824) != 0 ? null : bigDecimal12, (i19 & Integer.MIN_VALUE) != 0 ? null : str27, (i21 & 1) != 0 ? null : l13, (i21 & 2) != 0 ? null : str28, (i21 & 4) != 0 ? null : str29, (i21 & 8) != 0 ? null : bool, (i21 & 16) != 0 ? null : bool2, (i21 & 32) != 0 ? null : str30, (i21 & 64) != 0 ? null : l14, (i21 & 128) != 0 ? null : str31, (i21 & 256) != 0 ? null : bigDecimal13, (i21 & 512) != 0 ? null : str32, (i21 & 1024) != 0 ? null : bigDecimal14, (i21 & 2048) != 0 ? null : str33, (i21 & 4096) != 0 ? null : str34, (i21 & 8192) != 0 ? null : str35, (i21 & 16384) != 0 ? null : str36, (i21 & 32768) != 0 ? null : str37, (i21 & 65536) != 0 ? null : list, (i21 & 131072) != 0 ? 0 : i17, (i21 & 262144) != 0 ? null : couponReward);
    }
}
