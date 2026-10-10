package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C5759b;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.jumio.commons.log.LogUtils;
import com.jumio.liveness.DaClient;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.bugly.proguard.C33812n7;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p333i6.C38449h;
import p333i6.C38457p;
import p818z2.C46665s;
import p818z2.InterfaceC46667u;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: GraphRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b:\u0018\u0000 32\u00020\u0001:\t17t=DHLuQBQ\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ+\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010;R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010G\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00108\u001a\u0004\bE\u0010\u0013\"\u0004\bF\u0010;R$\u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00108\u001a\u0004\bI\u0010\u0013\"\u0004\bJ\u0010;R\"\u0010P\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010\u001d\"\u0004\bO\u0010)R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010]\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00108\u001a\u0004\b_\u0010\u0013\"\u0004\b`\u0010;R.\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010f\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010MR\u0018\u0010m\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00108R\u0016\u0010o\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0013R\u0011\u0010q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bp\u0010\u0013R\u0011\u0010s\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\br\u0010\u0013¨\u0006v"}, m90084d2 = {"Lcom/facebook/GraphRequest;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "graphPath", "Landroid/os/Bundle;", "parameters", "Lcom/facebook/HttpMethod;", "httpMethod", "Lcom/facebook/GraphRequest$b;", TUIConstants.TUIChat.CALL_BACK, "version", "<init>", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$b;Ljava/lang/String;)V", "", "j", "()V", "o", "()Ljava/lang/String;", "q", "baseUrl", "", "isBatch", "k", "(Ljava/lang/String;Z)Ljava/lang/String;", "z", "(Ljava/lang/String;)Ljava/lang/String;", "J", "()Z", "B", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lorg/json/JSONArray;", "batch", "", "Lcom/facebook/GraphRequest$a;", "attachments", "C", "(Lorg/json/JSONArray;Ljava/util/Map;)V", "forceOverride", ExifInterface.LONGITUDE_EAST, "(Z)V", "Lcom/facebook/GraphResponse;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Lcom/facebook/GraphResponse;", "Lcom/facebook/GraphRequestAsyncTask;", "m", "()Lcom/facebook/GraphRequestAsyncTask;", "toString", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/AccessToken;", "n", "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "b", "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_SS, "setGraphPath", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "c", "Lorg/json/JSONObject;", "r", "()Lorg/json/JSONObject;", "F", "(Lorg/json/JSONObject;)V", "graphObject", "d", "getBatchEntryName", "setBatchEntryName", "batchEntryName", "e", "getBatchEntryDependsOn", "setBatchEntryDependsOn", "batchEntryDependsOn", "f", "Z", "getBatchEntryOmitResultOnSuccess", "setBatchEntryOmitResultOnSuccess", "batchEntryOmitResultOnSuccess", "g", "Landroid/os/Bundle;", "v", "()Landroid/os/Bundle;", "H", "(Landroid/os/Bundle;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/Object;", "x", "()Ljava/lang/Object;", "I", "(Ljava/lang/Object;)V", "tag", "i", "getVersion", "setVersion", "Lcom/facebook/GraphRequest$b;", "p", "()Lcom/facebook/GraphRequest$b;", "D", "(Lcom/facebook/GraphRequest$b;)V", "value", "Lcom/facebook/HttpMethod;", "u", "()Lcom/facebook/HttpMethod;", "G", "(Lcom/facebook/HttpMethod;)V", "forceApplicationRequest", "overriddenURL", "t", "graphPathWithVersion", "w", "relativeUrlForBatchedRequest", "y", "urlForSingleRequest", "Companion", "ParcelableResourceWithMimeType", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class GraphRequest {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @JvmField
    public static final String f7555o = GraphRequest.class.getSimpleName();

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final String f7556p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public static String f7557q;

    /* JADX INFO: renamed from: r */
    public static final Pattern f7558r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public static volatile String f7559s;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public AccessToken accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String graphPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public JSONObject graphObject;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String batchEntryName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String batchEntryDependsOn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean batchEntryOmitResultOnSuccess;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public Bundle parameters;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Object tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String version;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public InterfaceC5490b callback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public HttpMethod httpMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean forceApplicationRequest;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String overriddenURL;

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0011JA\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J/\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010-J'\u00103\u001a\u00020\u00142\u0006\u0010/\u001a\u00020.2\u0006\u0010&\u001a\u0002002\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J+\u00108\u001a\u00020\u00142\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000206052\u0006\u0010&\u001a\u000200H\u0002¢\u0006\u0004\b8\u00109J9\u0010<\u001a\u00020\u00142\u0006\u0010&\u001a\u0002002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002010:2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\rH\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bC\u0010BJ\u0019\u0010D\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u00020\u00142\b\u0010H\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bI\u0010JJ-\u0010P\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bP\u0010QJ#\u0010S\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010O\u001a\u0004\u0018\u00010RH\u0007¢\u0006\u0004\bS\u0010TJ7\u0010U\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bU\u0010VJ7\u0010X\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010W\u001a\u0004\u0018\u00010.2\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bX\u0010YJ#\u0010[\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010O\u001a\u0004\u0018\u00010ZH\u0007¢\u0006\u0004\b[\u0010\\J-\u0010]\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\b]\u0010QJG\u0010c\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010`\u001a\u00020\u001a2\u0006\u0010a\u001a\u00020\u001a2\b\u0010b\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010ZH\u0007¢\u0006\u0004\bc\u0010dJI\u0010i\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010f\u001a\u00020e2\b\u0010g\u001a\u0004\u0018\u00010\u00042\b\u0010h\u001a\u0004\u0018\u00010.2\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bi\u0010jJI\u0010i\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010l\u001a\u00020k2\b\u0010g\u001a\u0004\u0018\u00010\u00042\b\u0010h\u001a\u0004\u0018\u00010.2\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bi\u0010mJI\u0010i\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010o\u001a\u00020n2\b\u0010g\u001a\u0004\u0018\u00010\u00042\b\u0010h\u001a\u0004\u0018\u00010.2\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bi\u0010pJ5\u0010s\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010r\u001a\u00020q2\b\u0010H\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bs\u0010tJ+\u0010s\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010r\u001a\u00020q2\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bs\u0010uJ#\u0010w\u001a\u00020\n2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002010v\"\u000201H\u0007¢\u0006\u0004\bw\u0010xJ\u001d\u0010w\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002010:H\u0007¢\u0006\u0004\bw\u0010yJ\u0017\u0010w\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bw\u0010zJ\u0017\u0010|\u001a\u00020{2\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b|\u0010}J*\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020{0~2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002010v\"\u000201H\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001J$\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020{0~2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002010:H\u0007¢\u0006\u0005\b\u007f\u0010\u0081\u0001J\u001e\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020{0~2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0005\b\u007f\u0010\u0082\u0001J'\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002010v\"\u000201H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J!\u0010\u0084\u0001\u001a\u00030\u0083\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002010:H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0086\u0001J\u001b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001J.\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020{0~2\u0006\u0010\u0012\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002010:H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J(\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020{0~2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u008a\u0001J#\u0010\u008b\u0001\u001a\u00030\u0083\u00012\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J/\u0010\u008b\u0001\u001a\u00030\u0083\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008f\u0001J)\u0010\u0093\u0001\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020{0~H\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001a\u0010\u0096\u0001\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\"\u0010\u0099\u0001\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\nH\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u009b\u0001\u001a\u000b \u009a\u0001*\u0004\u0018\u00010\u00040\u00048\u0000X\u0081\u0004¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u0012\u0005\b\u009d\u0001\u0010\u0003R\u0016\u0010\u009f\u0001\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010GR\"\u0010 \u0001\u001a\u0004\u0018\u00010\u00048B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b \u0001\u0010\u009c\u0001\u001a\u0005\b¡\u0001\u0010GR\u0017\u0010¢\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¢\u0001\u0010\u009c\u0001R\u0017\u0010£\u0001\u001a\u00020\u00048\u0006X\u0086T¢\u0006\b\n\u0006\b£\u0001\u0010\u009c\u0001R\u0017\u0010¤\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¤\u0001\u0010\u009c\u0001R\u0017\u0010¥\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¥\u0001\u0010\u009c\u0001R\u0017\u0010¦\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¦\u0001\u0010\u009c\u0001R\u0017\u0010§\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b§\u0001\u0010\u009c\u0001R\u0017\u0010¨\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¨\u0001\u0010\u009c\u0001R\u0017\u0010©\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b©\u0001\u0010\u009c\u0001R\u0017\u0010ª\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bª\u0001\u0010\u009c\u0001R\u0017\u0010«\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b«\u0001\u0010\u009c\u0001R\u0017\u0010¬\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¬\u0001\u0010\u009c\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009c\u0001R\u0017\u0010®\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b®\u0001\u0010\u009c\u0001R\u0017\u0010¯\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¯\u0001\u0010\u009c\u0001R\u0017\u0010°\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b°\u0001\u0010\u009c\u0001R\u0017\u0010±\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b±\u0001\u0010\u009c\u0001R\u0017\u0010²\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b²\u0001\u0010\u009c\u0001R\u0017\u0010³\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b³\u0001\u0010\u009c\u0001R\u0017\u0010´\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b´\u0001\u0010\u009c\u0001R\u0017\u0010µ\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bµ\u0001\u0010\u009c\u0001R\u0017\u0010¶\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¶\u0001\u0010\u009c\u0001R\u0017\u0010·\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b·\u0001\u0010\u009c\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¸\u0001\u0010\u009c\u0001R\u0017\u0010¹\u0001\u001a\u00020\u00048\u0006X\u0086T¢\u0006\b\n\u0006\b¹\u0001\u0010\u009c\u0001R\u0017\u0010º\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bº\u0001\u0010\u009c\u0001R\u0017\u0010»\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b»\u0001\u0010\u009c\u0001R\u0017\u0010¼\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¼\u0001\u0010\u009c\u0001R\u0017\u0010½\u0001\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0017\u0010¿\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\b¿\u0001\u0010\u009c\u0001R\u0017\u0010À\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010\u009c\u0001R\u0017\u0010Á\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÁ\u0001\u0010\u009c\u0001R\u0017\u0010Â\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÂ\u0001\u0010\u009c\u0001R\u0017\u0010Ã\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÃ\u0001\u0010\u009c\u0001R\u0017\u0010Ä\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÄ\u0001\u0010\u009c\u0001R\u0017\u0010Å\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÅ\u0001\u0010\u009c\u0001R\u0017\u0010Æ\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÆ\u0001\u0010\u009c\u0001R\u0017\u0010Ç\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÇ\u0001\u0010\u009c\u0001R\u0017\u0010È\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÈ\u0001\u0010\u009c\u0001R\u0017\u0010É\u0001\u001a\u00020\u00048\u0002X\u0082T¢\u0006\b\n\u0006\bÉ\u0001\u0010\u009c\u0001R\u001b\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010\u009c\u0001R\"\u0010Ì\u0001\u001a\r \u009a\u0001*\u0005\u0018\u00010Ë\u00010Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Î\u0001"}, m90084d2 = {"Lcom/facebook/GraphRequest$Companion;", "", "<init>", "()V", "", "graphPath", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "d", "(Ljava/net/URL;)Ljava/net/HttpURLConnection;", "Lcom/facebook/GraphRequestBatch;", "requests", "", "i", "(Lcom/facebook/GraphRequestBatch;)Z", "connection", "shouldUseGzip", "", "x", "(Ljava/net/HttpURLConnection;Z)V", "j", "Lcom/facebook/internal/Logger;", "logger", "", "numRequests", "Ljava/io/OutputStream;", "outputStream", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/facebook/GraphRequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;Z)V", "path", "k", "(Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "graphObject", "Lcom/facebook/GraphRequest$e;", "serializer", "q", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$e;)V", "key", "value", "passByValue", "r", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$e;Z)V", "Landroid/os/Bundle;", "bundle", "Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest;", "request", "v", "(Landroid/os/Bundle;Lcom/facebook/GraphRequest$g;Lcom/facebook/GraphRequest;)V", "", "Lcom/facebook/GraphRequest$a;", "attachments", "u", "(Ljava/util/Map;Lcom/facebook/GraphRequest$g;)V", "", "", "w", "(Lcom/facebook/GraphRequest$g;Ljava/util/Collection;Ljava/util/Map;)V", "batch", "e", "(Lcom/facebook/GraphRequestBatch;)Ljava/lang/String;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Object;)Z", "m", "p", "(Ljava/lang/Object;)Ljava/lang/String;", "getDefaultBatchApplicationId", "()Ljava/lang/String;", "applicationId", "setDefaultBatchApplicationId", "(Ljava/lang/String;)V", "Lcom/facebook/AccessToken;", "accessToken", "id", "Lcom/facebook/GraphRequest$b;", TUIConstants.TUIChat.CALL_BACK, "newDeleteObjectRequest", "(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Lcom/facebook/GraphRequest$d;", "newMeRequest", "(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$d;)Lcom/facebook/GraphRequest;", "newPostRequest", "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "parameters", "newPostRequestWithBundle", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Lcom/facebook/GraphRequest$c;", "newMyFriendsRequest", "(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$c;)Lcom/facebook/GraphRequest;", "newGraphPathRequest", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "radiusInMeters", "resultsLimit", "searchText", "newPlacesSearchRequest", "(Lcom/facebook/AccessToken;Landroid/location/Location;IILjava/lang/String;Lcom/facebook/GraphRequest$c;)Lcom/facebook/GraphRequest;", "Landroid/graphics/Bitmap;", "image", "caption", ReportDataTable.COLUMN_PARAMS, "newUploadPhotoRequest", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Ljava/io/File;", "file", "(Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Landroid/net/Uri;", "photoUri", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Landroid/content/Context;", "context", "newCustomAudienceThirdPartyIdRequest", "(Lcom/facebook/AccessToken;Landroid/content/Context;Ljava/lang/String;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "(Lcom/facebook/AccessToken;Landroid/content/Context;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "", "toHttpConnection", "([Lcom/facebook/GraphRequest;)Ljava/net/HttpURLConnection;", "(Ljava/util/Collection;)Ljava/net/HttpURLConnection;", "(Lcom/facebook/GraphRequestBatch;)Ljava/net/HttpURLConnection;", "Lcom/facebook/GraphResponse;", "executeAndWait", "(Lcom/facebook/GraphRequest;)Lcom/facebook/GraphResponse;", "", "executeBatchAndWait", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "(Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "Lcom/facebook/GraphRequestAsyncTask;", "executeBatchAsync", "([Lcom/facebook/GraphRequest;)Lcom/facebook/GraphRequestAsyncTask;", "(Ljava/util/Collection;)Lcom/facebook/GraphRequestAsyncTask;", "(Lcom/facebook/GraphRequestBatch;)Lcom/facebook/GraphRequestAsyncTask;", "executeConnectionAndWait", "(Ljava/net/HttpURLConnection;Ljava/util/Collection;)Ljava/util/List;", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "executeConnectionAsync", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Lcom/facebook/GraphRequestAsyncTask;", "Landroid/os/Handler;", "callbackHandler", "(Landroid/os/Handler;Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Lcom/facebook/GraphRequestAsyncTask;", "responses", "runCallbacks$facebook_core_release", "(Lcom/facebook/GraphRequestBatch;Ljava/util/List;)V", "runCallbacks", "validateFieldsParamForGetRequests$facebook_core_release", "(Lcom/facebook/GraphRequestBatch;)V", "validateFieldsParamForGetRequests", "serializeToUrlConnection$facebook_core_release", "(Lcom/facebook/GraphRequestBatch;Ljava/net/HttpURLConnection;)V", "serializeToUrlConnection", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG$facebook_core_release$annotations", "g", "mimeContentType", C33812n7.f71057p, CmcdData.Factory.STREAMING_FORMAT_HLS, "ACCEPT_LANGUAGE_HEADER", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "I", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", "SEARCH", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "Ljava/util/regex/Pattern;", "versionPattern", "Ljava/util/regex/Pattern;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGraphRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphRequest.kt\ncom/facebook/GraphRequest$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1995:1\n215#2,2:1996\n*S KotlinDebug\n*F\n+ 1 GraphRequest.kt\ncom/facebook/GraphRequest$Companion\n*L\n1312#1:1996,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(ArraysKt.toList(requests));
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAndWait(connection, new GraphRequestBatch(requests));
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAsync(null, connection, requests);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String applicationId, @Nullable InterfaceC5490b callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (applicationId == null && accessToken != null) {
                applicationId = accessToken.getApplicationId();
            }
            if (applicationId == null) {
                applicationId = C5760c.m10046I(context);
            }
            if (applicationId == null) {
                throw new FacebookException("Facebook App ID cannot be determined");
            }
            String str = applicationId + "/custom_audience_third_party_id";
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
            Bundle bundle = new Bundle();
            if (accessToken == null) {
                if (attributionIdentifiers == null) {
                    throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
                }
                String strM9907j = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.m9905h();
                if (strM9907j != null) {
                    bundle.putString("udid", strM9907j);
                }
            }
            if (C5501a.m7810x(context) || (attributionIdentifiers != null && attributionIdentifiers.getIsTrackingLimited())) {
                bundle.putString("limit_event_usage", "1");
            }
            return new GraphRequest(accessToken, str, bundle, HttpMethod.GET, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @NotNull Bitmap image, @Nullable String caption, @Nullable Bundle params, @Nullable InterfaceC5490b callback) {
            Intrinsics.checkNotNullParameter(image, "image");
            Bundle bundle = new Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", image);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new GraphRequest(accessToken, m7679f(graphPath), bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return toHttpConnection(ArraysKt.toList(requests));
        }

        /* JADX INFO: renamed from: com.facebook.GraphRequest$Companion$a */
        /* JADX INFO: compiled from: GraphRequest.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/facebook/GraphRequest$Companion$a", "Lcom/facebook/GraphRequest$b;", "Lcom/facebook/GraphResponse;", "response", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class C5487a implements InterfaceC5490b {
            public C5487a(InterfaceC5491c interfaceC5491c) {
            }

            @Override // com.facebook.GraphRequest.InterfaceC5490b
            /* JADX INFO: renamed from: a */
            public void mo78a(@NotNull GraphResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
            }
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: t */
        public static final void m7676t(ArrayList callbacks, GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                InterfaceC5490b interfaceC5490b = (InterfaceC5490b) pair.first;
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                interfaceC5490b.mo78a((GraphResponse) obj);
            }
            Iterator<GraphRequestBatch.InterfaceC5497a> it2 = requests.m7731l().iterator();
            while (it2.hasNext()) {
                it2.next().mo7738a(requests);
            }
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(new GraphRequestBatch(requests));
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(new GraphRequestBatch(requests));
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<GraphResponse> listFromHttpConnection$facebook_core_release = GraphResponse.INSTANCE.fromHttpConnection$facebook_core_release(connection, requests);
            C5760c.m10080q(connection);
            int size = requests.size();
            if (size == listFromHttpConnection$facebook_core_release.size()) {
                runCallbacks$facebook_core_release(requests, listFromHttpConnection$facebook_core_release);
                AccessTokenManager.INSTANCE.getInstance().m7586h();
                return listFromHttpConnection$facebook_core_release;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listFromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@Nullable Handler callbackHandler, @NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(connection, requests);
            requests.m7719F(callbackHandler);
            graphRequestAsyncTask.executeOnExecutor(C5501a.m7806t(), new Void[0]);
            return graphRequestAsyncTask;
        }

        /* JADX INFO: renamed from: f */
        public final String m7679f(String graphPath) {
            return graphPath == null ? "me/photos" : graphPath;
        }

        /* JADX INFO: renamed from: g */
        public final String m7680g() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f7556p}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            return str;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m7685l(Object value) {
            return (value instanceof Bitmap) || (value instanceof byte[]) || (value instanceof Uri) || (value instanceof ParcelFileDescriptor) || (value instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: renamed from: m */
        public final boolean m7686m(Object value) {
            return (value instanceof String) || (value instanceof Boolean) || (value instanceof Number) || (value instanceof Date);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newDeleteObjectRequest(@Nullable AccessToken accessToken, @Nullable String id2, @Nullable InterfaceC5490b callback) {
            return new GraphRequest(accessToken, id2, null, HttpMethod.DELETE, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newGraphPathRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable InterfaceC5490b callback) {
            return new GraphRequest(accessToken, graphPath, null, null, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newMeRequest(@Nullable AccessToken accessToken, @Nullable final InterfaceC5492d callback) {
            return new GraphRequest(accessToken, "me", null, null, new InterfaceC5490b(callback) { // from class: z2.q
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    GraphRequest.Companion.m7674n(null, graphResponse);
                }
            }, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newMyFriendsRequest(@Nullable AccessToken accessToken, @Nullable InterfaceC5491c callback) {
            return new GraphRequest(accessToken, "me/friends", null, null, new C5487a(callback), null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newPlacesSearchRequest(@Nullable AccessToken accessToken, @Nullable Location location, int radiusInMeters, int resultsLimit, @Nullable String searchText, @Nullable final InterfaceC5491c callback) {
            if (location == null && C5760c.m10057Z(searchText)) {
                throw new FacebookException("Either location or searchText must be specified.");
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt(TUIConstants.TUIContact.LIMIT, resultsLimit);
            if (location != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                bundle.putString(TtmlNode.CENTER, str);
                bundle.putInt(DaClient.ATTR_DISTANCE, radiusInMeters);
            }
            if (!C5760c.m10057Z(searchText)) {
                bundle.putString("q", searchText);
            }
            InterfaceC5490b interfaceC5490b = new InterfaceC5490b(callback) { // from class: z2.p
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    GraphRequest.Companion.m7675o(null, graphResponse);
                }
            };
            return new GraphRequest(accessToken, FirebaseAnalytics.Event.SEARCH, bundle, HttpMethod.GET, interfaceC5490b, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newPostRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable JSONObject graphObject, @Nullable InterfaceC5490b callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, graphPath, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.m7649F(graphObject);
            return graphRequest;
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newPostRequestWithBundle(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable Bundle parameters, @Nullable InterfaceC5490b callback) {
            return new GraphRequest(accessToken, graphPath, parameters, HttpMethod.POST, callback, null, 32, null);
        }

        /* JADX INFO: renamed from: p */
        public final String m7687p(Object value) {
            if (value instanceof String) {
                return (String) value;
            }
            if ((value instanceof Boolean) || (value instanceof Number)) {
                return value.toString();
            }
            if (!(value instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) value);
            Intrinsics.checkNotNullExpressionValue(str, "iso8601DateFormat.format(value)");
            return str;
        }

        /* JADX INFO: renamed from: s */
        public final void m7690s(GraphRequestBatch requests, Logger logger, int numRequests, URL url, OutputStream outputStream, boolean shouldUseGzip) throws Throwable {
            C5495g c5495g = new C5495g(outputStream, logger, shouldUseGzip);
            if (numRequests != 1) {
                String strM7678e = m7678e(requests);
                if (strM7678e.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                c5495g.mo7701a("batch_app_id", strM7678e);
                HashMap map = new HashMap();
                m7693w(c5495g, requests, map);
                if (logger != null) {
                    logger.m9995b("  Attachments:\n");
                }
                m7691u(map, c5495g);
                return;
            }
            GraphRequest graphRequestM7728i = requests.get(0);
            HashMap map2 = new HashMap();
            for (String key : graphRequestM7728i.getParameters().keySet()) {
                Object obj = graphRequestM7728i.getParameters().get(key);
                if (m7685l(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, new C5489a(graphRequestM7728i, obj));
                }
            }
            if (logger != null) {
                logger.m9995b("  Parameters:\n");
            }
            m7692v(graphRequestM7728i.getParameters(), c5495g, graphRequestM7728i);
            if (logger != null) {
                logger.m9995b("  Attachments:\n");
            }
            m7691u(map2, c5495g);
            JSONObject graphObject = graphRequestM7728i.getGraphObject();
            if (graphObject != null) {
                String path = url.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "url.path");
                m7688q(graphObject, path, c5495g);
            }
        }

        @JvmStatic
        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            C38457p.m86726e(requests, "requests");
            return toHttpConnection(new GraphRequestBatch(requests));
        }

        /* JADX INFO: renamed from: w */
        public final void m7693w(C5495g serializer, Collection<GraphRequest> requests, Map<String, C5489a> attachments) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                it.next().m7646C(jSONArray, attachments);
            }
            serializer.m7713l("batch", jSONArray, requests);
        }

        /* JADX INFO: renamed from: x */
        public final void m7694x(HttpURLConnection connection, boolean shouldUseGzip) {
            if (!shouldUseGzip) {
                connection.setRequestProperty("Content-Type", m7680g());
            } else {
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                connection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        /* JADX INFO: renamed from: n */
        public static final void m7674n(InterfaceC5492d interfaceC5492d, GraphResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (interfaceC5492d != null) {
                interfaceC5492d.m7700a(response.getGraphObject(), response);
            }
        }

        /* JADX INFO: renamed from: o */
        public static final void m7675o(InterfaceC5491c interfaceC5491c, GraphResponse response) {
            JSONArray jSONArrayOptJSONArray;
            Intrinsics.checkNotNullParameter(response, "response");
            if (interfaceC5491c != null) {
                JSONObject jSONObjectM7742c = response.getGraphObject();
                if (jSONObjectM7742c != null) {
                    jSONArrayOptJSONArray = jSONObjectM7742c.optJSONArray("data");
                } else {
                    jSONArrayOptJSONArray = null;
                }
                interfaceC5491c.m7699a(jSONArrayOptJSONArray, response);
            }
        }

        /* JADX INFO: renamed from: d */
        public final HttpURLConnection m7677d(URL url) throws IOException {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", m7681h());
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        /* JADX INFO: renamed from: e */
        public final String m7678e(GraphRequestBatch batch) {
            String strM7729j = batch.getBatchApplicationId();
            if (strM7729j != null && !batch.isEmpty()) {
                return strM7729j;
            }
            Iterator<GraphRequest> it = batch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.f7557q;
            if (str != null && str.length() > 0) {
                return str;
            }
            return C5501a.m7800n();
        }

        @JvmStatic
        @NotNull
        public final GraphResponse executeAndWait(@NotNull GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List<GraphResponse> listExecuteBatchAndWait = executeBatchAndWait(request);
            if (listExecuteBatchAndWait.size() == 1) {
                return listExecuteBatchAndWait.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequestBatch requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpConnection;
            List<GraphResponse> listExecuteConnectionAndWait;
            Intrinsics.checkNotNullParameter(requests, "requests");
            C38457p.m86727f(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpConnection = toHttpConnection(requests);
                exc = null;
            } catch (Exception e11) {
                exc = e11;
                httpConnection = null;
            } catch (Throwable th2) {
                th = th2;
                C5760c.m10080q(httpURLConnection);
                throw th;
            }
            try {
                if (httpConnection != null) {
                    listExecuteConnectionAndWait = executeConnectionAndWait(httpConnection, requests);
                } else {
                    List<GraphResponse> listConstructErrorResponses = GraphResponse.INSTANCE.constructErrorResponses(requests.m7733n(), null, new FacebookException(exc));
                    runCallbacks$facebook_core_release(requests, listConstructErrorResponses);
                    listExecuteConnectionAndWait = listConstructErrorResponses;
                }
                C5760c.m10080q(httpConnection);
                return listExecuteConnectionAndWait;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpConnection;
                C5760c.m10080q(httpURLConnection);
                throw th;
            }
        }

        @JvmStatic
        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            C38457p.m86727f(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(requests);
            graphRequestAsyncTask.executeOnExecutor(C5501a.m7806t(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @JvmStatic
        @Nullable
        public final String getDefaultBatchApplicationId() {
            return GraphRequest.f7557q;
        }

        /* JADX INFO: renamed from: h */
        public final String m7681h() {
            if (GraphRequest.f7559s == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.0.2"}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                GraphRequest.f7559s = str;
                String strM86713a = C38449h.m86713a();
                if (!C5760c.m10057Z(strM86713a)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f7559s, strM86713a}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                    GraphRequest.f7559s = str2;
                }
            }
            return GraphRequest.f7559s;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m7682i(GraphRequestBatch requests) {
            Iterator<GraphRequestBatch.InterfaceC5497a> it = requests.m7731l().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GraphRequestBatch.InterfaceC5498b) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = requests.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof InterfaceC5494f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m7683j(GraphRequestBatch requests) {
            for (GraphRequest graphRequest : requests) {
                Iterator<String> it = graphRequest.getParameters().keySet().iterator();
                while (it.hasNext()) {
                    if (m7685l(graphRequest.getParameters().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m7684k(String path) {
            Matcher matcher = GraphRequest.f7558r.matcher(path);
            if (matcher.matches()) {
                path = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(path, "matcher.group(1)");
            }
            if (StringsKt.startsWith$default(path, "me/", false, 2, (Object) null) || StringsKt.startsWith$default(path, "/me/", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX INFO: renamed from: q */
        public final void m7688q(JSONObject graphObject, String path, InterfaceC5493e serializer) {
            boolean z11;
            boolean z12;
            if (m7684k(path)) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) path, C33844oi.f71346o, 0, false, 6, (Object) null);
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) path, "?", 0, false, 6, (Object) null);
                if (iIndexOf$default > 3 && (iIndexOf$default2 == -1 || iIndexOf$default < iIndexOf$default2)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            Iterator<String> itKeys = graphObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = graphObject.opt(key);
                if (z11 && StringsKt.equals(key, "image", true)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                m7689r(key, value, serializer, z12);
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m7689r(String key, Object value, InterfaceC5493e serializer, boolean passByValue) {
            Class<?> cls = value.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) value;
                if (passByValue) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("%s[%s]", Arrays.copyOf(new Object[]{key, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(objOpt, "jsonObject.opt(propertyName)");
                        m7689r(str, objOpt, serializer, passByValue);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\"id\")");
                    m7689r(key, strOptString, serializer, passByValue);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObject.optString(\"url\")");
                    m7689r(key, strOptString2, serializer, passByValue);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
                        m7689r(key, string, serializer, passByValue);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) value;
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{key, Integer.valueOf(i11)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                    Object objOpt2 = jSONArray.opt(i11);
                    Intrinsics.checkNotNullExpressionValue(objOpt2, "jsonArray.opt(i)");
                    m7689r(str2, objOpt2, serializer, passByValue);
                }
                return;
            }
            if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.util.Date");
                    String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) value);
                    Intrinsics.checkNotNullExpressionValue(str3, "iso8601DateFormat.format(date)");
                    serializer.mo7701a(key, str3);
                    return;
                }
                C5760c.m10065e0(GraphRequest.f7555o, "The type of property " + key + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            serializer.mo7701a(key, value.toString());
        }

        @JvmStatic
        public final void runCallbacks$facebook_core_release(@NotNull final GraphRequestBatch requests, @NotNull List<GraphResponse> responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < size; i11++) {
                GraphRequest graphRequestM7728i = requests.get(i11);
                if (graphRequestM7728i.getCallback() != null) {
                    arrayList.add(new Pair(graphRequestM7728i.getCallback(), responses.get(i11)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: z2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.m7676t(arrayList, requests);
                    }
                };
                Handler handlerM7730k = requests.getCallbackHandler();
                if (handlerM7730k != null) {
                    handlerM7730k.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
        @JvmStatic
        public final void serializeToUrlConnection$facebook_core_release(@NotNull GraphRequestBatch requests, @NotNull HttpURLConnection connection) throws Throwable {
            HttpMethod httpMethod;
            Throwable th2;
            URL url;
            OutputStream c5546b;
            GraphRequestBatch graphRequestBatch;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            Logger logger = new Logger(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean zM7683j = m7683j(requests);
            OutputStream outputStream = null;
            if (size == 1) {
                httpMethod = requests.get(0).getHttpMethod();
            } else {
                httpMethod = null;
            }
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            m7694x(connection, zM7683j);
            URL url2 = connection.getURL();
            logger.m9995b("Request:\n");
            logger.m9997d("Id", requests.getId());
            Intrinsics.checkNotNullExpressionValue(url2, "url");
            logger.m9997d("URL", url2);
            Object requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            logger.m9997d("Method", requestMethod);
            Object requestProperty = connection.getRequestProperty("User-Agent");
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            logger.m9997d("User-Agent", requestProperty);
            Object requestProperty2 = connection.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            logger.m9997d("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.getTimeoutInMilliseconds());
            connection.setReadTimeout(requests.getTimeoutInMilliseconds());
            if (httpMethod == HttpMethod.POST) {
                connection.setDoOutput(true);
                try {
                    OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                    if (zM7683j) {
                        try {
                            bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                        } catch (Throwable th3) {
                            th2 = th3;
                            outputStream = bufferedOutputStream;
                            if (outputStream != null) {
                                outputStream.close();
                                throw th2;
                            }
                            throw th2;
                        }
                    }
                    try {
                        if (m7682i(requests)) {
                            C46665s c46665s = new C46665s(requests.getCallbackHandler());
                            m7690s(requests, null, size, url2, c46665s, zM7683j);
                            url = url2;
                            OutputStream outputStream2 = bufferedOutputStream;
                            try {
                                c5546b = new C5546b(outputStream2, requests, c46665s.m102891h(), c46665s.getMaxProgress());
                                zM7683j = zM7683j;
                                size = size;
                                graphRequestBatch = requests;
                            } catch (Throwable th4) {
                                th = th4;
                                outputStream = outputStream2;
                                th2 = th;
                                if (outputStream != null) {
                                    outputStream.close();
                                    throw th2;
                                }
                                throw th2;
                            }
                        } else {
                            url = url2;
                            c5546b = bufferedOutputStream;
                            graphRequestBatch = requests;
                        }
                        try {
                            m7690s(graphRequestBatch, logger, size, url, c5546b, zM7683j);
                            c5546b.close();
                            logger.m9998e();
                        } catch (Throwable th5) {
                            th = th5;
                            outputStream = c5546b;
                            th2 = th;
                            if (outputStream != null) {
                                outputStream.close();
                                throw th2;
                            }
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        outputStream = bufferedOutputStream;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } else {
                logger.m9998e();
            }
        }

        @JvmStatic
        public final void setDefaultBatchApplicationId(@Nullable String applicationId) {
            GraphRequest.f7557q = applicationId;
        }

        /* JADX INFO: renamed from: u */
        public final void m7691u(Map<String, C5489a> attachments, C5495g serializer) throws Throwable {
            for (Map.Entry<String, C5489a> entry : attachments.entrySet()) {
                if (GraphRequest.INSTANCE.m7685l(entry.getValue().getValue())) {
                    serializer.m7711j(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m7692v(Bundle bundle, C5495g serializer, GraphRequest request) throws Throwable {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (m7686m(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    serializer.m7711j(key, obj, request);
                }
            }
        }

        @JvmStatic
        public final void validateFieldsParamForGetRequests$facebook_core_release(@NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            for (GraphRequest graphRequest : requests) {
                if (HttpMethod.GET == graphRequest.getHttpMethod() && C5760c.m10057Z(graphRequest.getParameters().getString("fields"))) {
                    Logger.Companion companion = Logger.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GET requests for /");
                    String graphPath = graphRequest.getGraphPath();
                    if (graphPath == null) {
                        graphPath = "";
                    }
                    sb2.append(graphPath);
                    sb2.append(" should contain an explicit \"fields\" parameter.");
                    companion.log(loggingBehavior, 5, "Request", sb2.toString());
                }
            }
        }

        @JvmStatic
        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequestBatch requests) throws Throwable {
            URL url;
            Intrinsics.checkNotNullParameter(requests, "requests");
            validateFieldsParamForGetRequests$facebook_core_release(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).m7669y());
                } else {
                    url = new URL(C5759b.m10039c());
                }
                HttpURLConnection httpURLConnectionM7677d = null;
                try {
                    httpURLConnectionM7677d = m7677d(url);
                    serializeToUrlConnection$facebook_core_release(requests, httpURLConnectionM7677d);
                    return httpURLConnectionM7677d;
                } catch (IOException e11) {
                    C5760c.m10080q(httpURLConnectionM7677d);
                    throw new FacebookException("could not construct request body", e11);
                } catch (JSONException e12) {
                    C5760c.m10080q(httpURLConnectionM7677d);
                    throw new FacebookException("could not construct request body", e12);
                }
            } catch (MalformedURLException e13) {
                throw new FacebookException("could not construct URL for request", e13);
            }
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @NotNull File file, @Nullable String caption, @Nullable Bundle params, @Nullable InterfaceC5490b callback) throws FileNotFoundException {
            Intrinsics.checkNotNullParameter(file, "file");
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle = new Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", parcelFileDescriptorOpen);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new GraphRequest(accessToken, m7679f(graphPath), bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable InterfaceC5490b callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        @JvmStatic
        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @NotNull Uri photoUri, @Nullable String caption, @Nullable Bundle params, @Nullable InterfaceC5490b callback) throws FacebookException, FileNotFoundException {
            Intrinsics.checkNotNullParameter(photoUri, "photoUri");
            if (C5760c.m10056X(photoUri)) {
                return newUploadPhotoRequest(accessToken, graphPath, new File(photoUri.getPath()), caption, params, callback);
            }
            if (C5760c.m10053U(photoUri)) {
                Bundle bundle = new Bundle();
                if (params != null) {
                    bundle.putAll(params);
                }
                bundle.putParcelable("picture", photoUri);
                if (caption != null && caption.length() > 0) {
                    bundle.putString("caption", caption);
                }
                return new GraphRequest(accessToken, m7679f(graphPath), bundle, HttpMethod.POST, callback, null, 32, null);
            }
            throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u0015*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0002:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "RESOURCE", "Landroid/os/Parcelable;", InterfaceC33617e1.f69660i, "mimeType", "", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getMimeType", "()Ljava/lang/String;", "getResource", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "describeContents", "", "writeToParcel", "", "out", "flags", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        @Nullable
        private final String mimeType;

        @Nullable
        private final RESOURCE resource;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C5488a();

        /* JADX INFO: renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        /* JADX INFO: compiled from: GraphRequest.kt */
        @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcel;", "source", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Parcel;)Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "", "size", "", "b", "(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class C5488a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?>[] newArray(int size) {
                return new ParcelableResourceWithMimeType[size];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?> createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, @Nullable String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        @Nullable
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(C5501a.m7799m().getClassLoader());
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$a */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/facebook/GraphRequest$a;", "", "Lcom/facebook/GraphRequest;", "request", "value", "<init>", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/GraphRequest;", "()Lcom/facebook/GraphRequest;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5489a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final GraphRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object value;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GraphRequest getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public C5489a(@NotNull GraphRequest request, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            this.value = obj;
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$b */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/GraphRequest$b;", "", "Lcom/facebook/GraphResponse;", "response", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5490b {
        /* JADX INFO: renamed from: a */
        void mo78a(@NotNull GraphResponse response);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$c */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/GraphRequest$c;", "", "Lorg/json/JSONArray;", "objects", "Lcom/facebook/GraphResponse;", "response", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONArray;Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5491c {
        /* JADX INFO: renamed from: a */
        void m7699a(@Nullable JSONArray objects, @Nullable GraphResponse response);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$d */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/GraphRequest$d;", "", "Lorg/json/JSONObject;", "obj", "Lcom/facebook/GraphResponse;", "response", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;Lcom/facebook/GraphResponse;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5492d {
        /* JADX INFO: renamed from: a */
        void m7700a(@Nullable JSONObject obj, @Nullable GraphResponse response);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$e */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/GraphRequest$e;", "", "", "key", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5493e {
        /* JADX INFO: renamed from: a */
        void mo7701a(@NotNull String key, @NotNull String value);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$f */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/GraphRequest$f;", "Lcom/facebook/GraphRequest$b;", "", "current", "max", "", "b", "(JJ)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5494f extends InterfaceC5490b {
        /* JADX INFO: renamed from: b */
        void m7702b(long current, long max);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$g */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\n2\b\u0010/\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f04\"\u0004\u0018\u00010\f¢\u0006\u0004\b6\u00107J-\u00108\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f04\"\u0004\u0018\u00010\f¢\u0006\u0004\b8\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010<R\u0018\u0010A\u001a\u00060>j\u0002`?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010@¨\u0006B"}, m90084d2 = {"Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest$e;", "Ljava/io/OutputStream;", "outputStream", "Lcom/facebook/internal/Logger;", "logger", "", "useUrlEncode", "<init>", "(Ljava/io/OutputStream;Lcom/facebook/internal/Logger;Z)V", "", "key", "", "value", "Lcom/facebook/GraphRequest;", "request", "", "j", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest;)V", "Lorg/json/JSONArray;", "requestJsonArray", "", "requests", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "d", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", "bytes", "e", "(Ljava/lang/String;[B)V", "Landroid/net/Uri;", "contentUri", "mimeType", "g", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/os/ParcelFileDescriptor;", "descriptor", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V", "k", "()V", "name", "filename", "contentType", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", "i", "Ljava/io/OutputStream;", "b", "Lcom/facebook/internal/Logger;", "Z", "firstWrite", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()Ljava/lang/RuntimeException;", "invalidTypeError", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5495g implements InterfaceC5493e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final OutputStream outputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Logger logger;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean firstWrite;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean useUrlEncode;

        @Override // com.facebook.GraphRequest.InterfaceC5493e
        /* JADX INFO: renamed from: a */
        public void mo7701a(@NotNull String key, @NotNull String value) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            m7707f(key, null, null);
            m7710i("%s", value);
            m7712k();
            Logger logger = this.logger;
            if (logger != null) {
                logger.m9997d("    " + key, value);
            }
        }

        /* JADX INFO: renamed from: b */
        public final RuntimeException m7703b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* JADX INFO: renamed from: c */
        public final void m7704c(@NotNull String format, @NotNull Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.firstWrite) {
                OutputStream outputStream2 = this.outputStream;
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.outputStream;
                byte[] bytes3 = GraphRequest.f7556p.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.outputStream;
                byte[] bytes4 = LogUtils.NEW_LINE.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.firstWrite = false;
            }
            OutputStream outputStream5 = this.outputStream;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str2 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            byte[] bytes5 = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* JADX INFO: renamed from: d */
        public final void m7705d(@NotNull String key, @NotNull Bitmap bitmap) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            m7707f(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            m7710i("", new Object[0]);
            m7712k();
            Logger logger = this.logger;
            if (logger != null) {
                logger.m9997d("    " + key, "<Image>");
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m7706e(@NotNull String key, @NotNull byte[] bytes) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            m7707f(key, key, "content/unknown");
            this.outputStream.write(bytes);
            m7710i("", new Object[0]);
            m7712k();
            Logger logger = this.logger;
            if (logger != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                logger.m9997d("    " + key, str);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m7707f(@Nullable String name, @Nullable String filename, @Nullable String contentType) throws IOException {
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s=", Arrays.copyOf(new Object[]{name}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            m7704c("Content-Disposition: form-data; name=\"%s\"", name);
            if (filename != null) {
                m7704c("; filename=\"%s\"", filename);
            }
            m7710i("", new Object[0]);
            if (contentType != null) {
                m7710i("%s: %s", "Content-Type", contentType);
            }
            m7710i("", new Object[0]);
        }

        /* JADX INFO: renamed from: g */
        public final void m7708g(@NotNull String key, @NotNull Uri contentUri, @Nullable String mimeType) throws Throwable {
            int iM10078p;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            m7707f(key, key, mimeType);
            if (this.outputStream instanceof C46665s) {
                ((C46665s) this.outputStream).m102889b(C5760c.m10090y(contentUri));
                iM10078p = 0;
            } else {
                iM10078p = C5760c.m10078p(C5501a.m7799m().getContentResolver().openInputStream(contentUri), this.outputStream);
            }
            m7710i("", new Object[0]);
            m7712k();
            Logger logger = this.logger;
            if (logger != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM10078p)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                logger.m9997d("    " + key, str);
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m7709h(@NotNull String key, @NotNull ParcelFileDescriptor descriptor, @Nullable String mimeType) throws Throwable {
            int iM10078p;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            m7707f(key, key, mimeType);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof C46665s) {
                ((C46665s) outputStream).m102889b(descriptor.getStatSize());
                iM10078p = 0;
            } else {
                iM10078p = C5760c.m10078p(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.outputStream);
            }
            m7710i("", new Object[0]);
            m7712k();
            Logger logger = this.logger;
            if (logger != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM10078p)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                logger.m9997d("    " + key, str);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m7710i(@NotNull String format, @NotNull Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            m7704c(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            m7704c(LogUtils.NEW_LINE, new Object[0]);
        }

        /* JADX INFO: renamed from: j */
        public final void m7711j(@NotNull String key, @Nullable Object value, @Nullable GraphRequest request) throws Throwable {
            Intrinsics.checkNotNullParameter(key, "key");
            Closeable closeable = this.outputStream;
            if (closeable instanceof InterfaceC46667u) {
                Intrinsics.checkNotNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((InterfaceC46667u) closeable).mo8376a(request);
            }
            Companion companion = GraphRequest.INSTANCE;
            if (companion.m7686m(value)) {
                mo7701a(key, companion.m7687p(value));
                return;
            }
            if (value instanceof Bitmap) {
                m7705d(key, (Bitmap) value);
                return;
            }
            if (value instanceof byte[]) {
                m7706e(key, (byte[]) value);
                return;
            }
            if (value instanceof Uri) {
                m7708g(key, (Uri) value, null);
                return;
            }
            if (value instanceof ParcelFileDescriptor) {
                m7709h(key, (ParcelFileDescriptor) value, null);
                return;
            }
            if (!(value instanceof ParcelableResourceWithMimeType)) {
                throw m7703b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) value;
            Parcelable resource = parcelableResourceWithMimeType.getResource();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (resource instanceof ParcelFileDescriptor) {
                m7709h(key, (ParcelFileDescriptor) resource, mimeType);
            } else {
                if (!(resource instanceof Uri)) {
                    throw m7703b();
                }
                m7708g(key, (Uri) resource, mimeType);
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m7712k() throws IOException {
            if (!this.useUrlEncode) {
                m7710i("--%s", GraphRequest.f7556p);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* JADX INFO: renamed from: l */
        public final void m7713l(@NotNull String key, @NotNull JSONArray requestJsonArray, @NotNull Collection<GraphRequest> requests) throws JSONException, IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof InterfaceC46667u)) {
                String string = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "requestJsonArray.toString()");
                mo7701a(key, string);
                return;
            }
            Intrinsics.checkNotNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            InterfaceC46667u interfaceC46667u = (InterfaceC46667u) closeable;
            m7707f(key, null, null);
            m7704c("[", new Object[0]);
            int i11 = 0;
            for (GraphRequest graphRequest : requests) {
                int i12 = i11 + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i11);
                interfaceC46667u.mo8376a(graphRequest);
                if (i11 > 0) {
                    m7704c(",%s", jSONObject.toString());
                } else {
                    m7704c("%s", jSONObject.toString());
                }
                i11 = i12;
            }
            m7704c("]", new Object[0]);
            Logger logger = this.logger;
            if (logger != null) {
                String string2 = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "requestJsonArray.toString()");
                logger.m9997d("    " + key, string2);
            }
        }

        public C5495g(@NotNull OutputStream outputStream, @Nullable Logger logger, boolean z11) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.outputStream = outputStream;
            this.logger = logger;
            this.firstWrite = true;
            this.useUrlEncode = z11;
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$h */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/facebook/GraphRequest$h", "Lcom/facebook/GraphRequest$e;", "", "key", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5496h implements InterfaceC5493e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList<String> f7579a;

        public C5496h(ArrayList<String> arrayList) {
            this.f7579a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC5493e
        /* JADX INFO: renamed from: a */
        public void mo7701a(@NotNull String key, @NotNull String value) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList<String> arrayList = this.f7579a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            arrayList.add(str);
        }
    }

    @JvmOverloads
    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i11 = 0; i11 < iNextInt; i11++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        f7556p = string;
        f7558r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, InterfaceC5490b interfaceC5490b, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : accessToken, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bundle, (i11 & 8) != 0 ? null : httpMethod, (i11 & 16) != 0 ? null : interfaceC5490b, (i11 & 32) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7644A() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(C5501a.m7800n());
        sb2.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb2.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    /* JADX INFO: renamed from: C */
    public final void m7646C(JSONArray batch, Map<String, C5489a> attachments) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strM7667w = m7667w();
        jSONObject.put("relative_url", strM7667w);
        jSONObject.put(FirebaseAnalytics.Param.METHOD, this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            Logger.INSTANCE.registerAccessToken(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.parameters.get(it.next());
            if (INSTANCE.m7685l(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(attachments.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                arrayList.add(str3);
                attachments.put(str3, new C5489a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            INSTANCE.m7688q(jSONObject2, strM7667w, new C5496h(arrayList2));
            jSONObject.put(TtmlNode.TAG_BODY, TextUtils.join("&", arrayList2));
        }
        batch.put(jSONObject);
    }

    /* JADX INFO: renamed from: D */
    public final void m7647D(@Nullable final InterfaceC5490b interfaceC5490b) {
        if (C5501a.m7770F(LoggingBehavior.GRAPH_API_DEBUG_INFO) || C5501a.m7770F(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new InterfaceC5490b() { // from class: z2.o
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    GraphRequest.m7636b(interfaceC5490b, graphResponse);
                }
            };
        } else {
            this.callback = interfaceC5490b;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m7648E(boolean forceOverride) {
        this.forceApplicationRequest = forceOverride;
    }

    /* JADX INFO: renamed from: F */
    public final void m7649F(@Nullable JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    /* JADX INFO: renamed from: G */
    public final void m7650G(@Nullable HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    /* JADX INFO: renamed from: H */
    public final void m7651H(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.parameters = bundle;
    }

    /* JADX INFO: renamed from: I */
    public final void m7652I(@Nullable Object obj) {
        this.tag = obj;
    }

    /* JADX INFO: renamed from: j */
    public final void m7654j() {
        Bundle bundle = this.parameters;
        if (m7653J()) {
            bundle.putString(AccessToken.ACCESS_TOKEN_KEY, m7661q());
        } else {
            String strM7659o = m7659o();
            if (strM7659o != null) {
                bundle.putString(AccessToken.ACCESS_TOKEN_KEY, strM7659o);
            }
        }
        if (!bundle.containsKey(AccessToken.ACCESS_TOKEN_KEY) && C5760c.m10057Z(C5501a.m7804r())) {
            Log.w(f7555o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, JPushConstants.Analysis.KEY_JSON);
        if (C5501a.m7770F(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C5501a.m7770F(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m7655k(String baseUrl, boolean isBatch) {
        if (!isBatch && this.httpMethod == HttpMethod.POST) {
            return baseUrl;
        }
        Uri.Builder builderBuildUpon = Uri.parse(baseUrl).buildUpon();
        for (String str : this.parameters.keySet()) {
            Object obj = this.parameters.get(str);
            if (obj == null) {
                obj = "";
            }
            Companion companion = INSTANCE;
            if (companion.m7686m(obj)) {
                builderBuildUpon.appendQueryParameter(str, companion.m7687p(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                throw new IllegalArgumentException(str2);
            }
        }
        String string = builderBuildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriBuilder.toString()");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final GraphResponse m7656l() {
        return INSTANCE.executeAndWait(this);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final GraphRequestAsyncTask m7657m() {
        return INSTANCE.executeBatchAsync(this);
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: o */
    public final String m7659o() {
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey(AccessToken.ACCESS_TOKEN_KEY)) {
                String token = accessToken.getToken();
                Logger.INSTANCE.registerAccessToken(token);
                return token;
            }
        } else if (!this.parameters.containsKey(AccessToken.ACCESS_TOKEN_KEY)) {
            return m7661q();
        }
        return this.parameters.getString(AccessToken.ACCESS_TOKEN_KEY);
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC5490b getCallback() {
        return this.callback;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getGraphPath() {
        return this.graphPath;
    }

    /* JADX INFO: renamed from: t */
    public final String m7664t() {
        if (f7558r.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.graphPath);
        sb2.append(", graphObject: ");
        sb2.append(this.graphObject);
        sb2.append(", httpMethod: ");
        sb2.append(this.httpMethod);
        sb2.append(", parameters: ");
        sb2.append(this.parameters);
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final Bundle getParameters() {
        return this.parameters;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final String m7667w() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String strM7670z = m7670z(C5759b.m10039c());
        m7654j();
        Uri uri = Uri.parse(m7655k(strM7670z, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final Object getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final String m7669y() {
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        String strM7670z = m7670z((this.httpMethod == HttpMethod.POST && str2 != null && StringsKt.endsWith$default(str2, "/videos", false, 2, (Object) null)) ? C5759b.m10041e() : C5759b.m10040d(C5501a.m7809w()));
        m7654j();
        return m7655k(strM7670z, false);
    }

    @JvmOverloads
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable InterfaceC5490b interfaceC5490b, @Nullable String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        m7647D(interfaceC5490b);
        m7650G(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = C5501a.m7808v();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7636b(InterfaceC5490b interfaceC5490b, GraphResponse response) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        String strOptString2;
        String strOptString3;
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectM7742c = response.getGraphObject();
        if (jSONObjectM7742c != null) {
            jSONObjectOptJSONObject = jSONObjectM7742c.optJSONObject("__debug__");
        } else {
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject != null) {
            jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("messages");
        } else {
            jSONArrayOptJSONArray = null;
        }
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString = jSONObjectOptJSONObject2.optString("message");
                } else {
                    strOptString = null;
                }
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString2 = jSONObjectOptJSONObject2.optString("type");
                } else {
                    strOptString2 = null;
                }
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString3 = jSONObjectOptJSONObject2.optString(SignTermItem.LINK);
                } else {
                    strOptString3 = null;
                }
                if (strOptString != null && strOptString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual(strOptString2, "warning")) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!C5760c.m10057Z(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    Logger.Companion companion = Logger.INSTANCE;
                    String TAG = f7555o;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    companion.log(loggingBehavior, TAG, strOptString);
                }
            }
        }
        if (interfaceC5490b != null) {
            interfaceC5490b.mo78a(response);
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7645B() {
        if (!Intrinsics.areEqual(C5501a.m7809w(), "instagram.com")) {
            return true;
        }
        return !m7644A();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m7653J() {
        boolean zContains$default;
        String strM7659o = m7659o();
        if (strM7659o != null) {
            zContains$default = StringsKt.contains$default((CharSequence) strM7659o, (CharSequence) "|", false, 2, (Object) null);
        } else {
            zContains$default = false;
        }
        if (strM7659o != null && StringsKt.startsWith$default(strM7659o, "IG", false, 2, (Object) null) && !zContains$default && m7644A()) {
            return true;
        }
        if (m7645B() || zContains$default) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final String m7661q() {
        String strM7800n = C5501a.m7800n();
        String strM7804r = C5501a.m7804r();
        if (strM7800n.length() > 0 && strM7804r.length() > 0) {
            return strM7800n + '|' + strM7804r;
        }
        C5760c.m10065e0(f7555o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final String m7670z(String baseUrl) {
        if (!m7645B()) {
            baseUrl = C5759b.m10038b();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{baseUrl, m7664t()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }
}
