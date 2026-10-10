package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.C5524d;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.internal.C5760c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p333i6.C38454m;
import p333i6.C38457p;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.internal.c */
/* JADX INFO: compiled from: Utility.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001DB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ!\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010+2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b.\u0010-J-\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u000101j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`22\b\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u0004052\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b6\u00107J-\u00109\u001a\u0004\u0018\u00010\u00012\u0006\u0010*\u001a\u00020)2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b=\u0010>J!\u0010B\u001a\u00020A2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\bB\u0010CJ#\u0010F\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010\u00042\b\u0010E\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0006\u0010H\u001a\u00020\u0004H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\bK\u0010LJ)\u0010Q\u001a\u00020\u001e2\b\u0010M\u001a\u0004\u0018\u00010\u00042\u000e\u0010P\u001a\n\u0018\u00010Nj\u0004\u0018\u0001`OH\u0007¢\u0006\u0004\bQ\u0010RJ#\u0010T\u001a\u00020\u001e2\b\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010S\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bT\u0010UJ)\u0010P\u001a\u00020\u0006\"\u0004\b\u0000\u0010V2\b\u0010D\u001a\u0004\u0018\u00018\u00002\b\u0010E\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\bP\u0010WJ\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\u0004052\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\bX\u00107J\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040Y2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\bZ\u0010[J'\u0010]\u001a\u00020\u00042\u0016\u0010\\\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040+H\u0007¢\u0006\u0004\b]\u0010^J#\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010_\u001a\u00020\u0004H\u0007¢\u0006\u0004\b`\u0010aJ;\u0010g\u001a\u00020\u001e2\u0006\u0010b\u001a\u00020)2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010e\u001a\u0004\u0018\u00010\u00042\u0006\u0010f\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\bg\u0010hJ\u0011\u0010i\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bi\u0010jJ\u001f\u0010l\u001a\u00020\u001e2\u0006\u0010b\u001a\u00020)2\u0006\u0010k\u001a\u00020%H\u0007¢\u0006\u0004\bl\u0010mJE\u0010t\u001a\u0004\u0018\u00010s2\n\u0010o\u001a\u0006\u0012\u0002\b\u00030n2\u0006\u0010p\u001a\u00020\u00042\u001e\u0010r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010n0q\"\b\u0012\u0002\b\u0003\u0018\u00010nH\u0007¢\u0006\u0004\bt\u0010uJA\u0010w\u001a\u0004\u0018\u00010s2\u0006\u0010v\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u00042\u001e\u0010r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010n0q\"\b\u0012\u0002\b\u0003\u0018\u00010nH\u0007¢\u0006\u0004\bw\u0010xJ;\u0010|\u001a\u0004\u0018\u00010\u00012\b\u0010y\u001a\u0004\u0018\u00010\u00012\u0006\u0010z\u001a\u00020s2\u0016\u0010{\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010q\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b|\u0010}J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b\u0005\u0010(J\u001c\u0010\u0080\u0001\u001a\u00020\u00062\b\u0010\u007f\u001a\u0004\u0018\u00010~H\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\u00062\b\u0010\u007f\u001a\u0004\u0018\u00010~H\u0007¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u001c\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0083\u0001\u001a\u00020~H\u0007¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J5\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0089\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001e\u0010\u008f\u0001\u001a\u00020\u00062\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\u00042\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0005\b\u0092\u0001\u0010\u000eJ%\u0010\u0096\u0001\u001a\u00020\u001e2\u0007\u0010\u0093\u0001\u001a\u00020\u00042\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0007¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001d\u0010\u0098\u0001\u001a\u0004\u0018\u00010)2\u0007\u0010\u0093\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001c\u0010\u009e\u0001\u001a\u00020\u00042\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u000eJ\u0013\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0005\b\u009f\u0001\u0010jJ\u0012\u0010 \u0001\u001a\u00020AH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0019\u0010¢\u0001\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020%H\u0002¢\u0006\u0005\b¢\u0001\u0010LJ\u0011\u0010£\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b£\u0001\u0010\u0003J\u0019\u0010¤\u0001\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020%H\u0002¢\u0006\u0005\b¤\u0001\u0010LJ\u0012\u0010¥\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b§\u0001\u0010\u0003J\u0011\u0010¨\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b¨\u0001\u0010\u0003J\u001c\u0010ª\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0010\u001a\u00030©\u0001H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J4\u0010¬\u0001\u001a\u00020\u001e2\u0006\u0010b\u001a\u00020)2\u0006\u0010d\u001a\u00020c2\b\u0010e\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J*\u0010®\u0001\u001a\u00020\u001e2\u0006\u0010b\u001a\u00020)2\u0006\u0010d\u001a\u00020c2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001a\u0010°\u0001\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001e\u0010´\u0001\u001a\u00020\u001e2\n\u0010³\u0001\u001a\u0005\u0018\u00010²\u0001H\u0007¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0019\u0010¶\u0001\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0005\b¶\u0001\u0010(R\u0017\u0010·\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010'R\u0019\u0010¸\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010tR\u0019\u0010¹\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010tR(\u0010¾\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\bP\u0010t\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010À\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010¿\u0001R'\u0010Ä\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bI\u0010¿\u0001\u001a\u0005\bÁ\u0001\u0010j\"\u0006\bÂ\u0001\u0010Ã\u0001R'\u0010Ç\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bK\u0010¿\u0001\u001a\u0005\bÅ\u0001\u0010j\"\u0006\bÆ\u0001\u0010Ã\u0001R)\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001f\u0010¿\u0001\u001a\u0005\bÈ\u0001\u0010j\"\u0006\bÉ\u0001\u0010Ã\u0001R+\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\n\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u0017\u0010Ó\u0001\u001a\u0005\u0018\u00010Ë\u00018G¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Î\u0001R\u0015\u0010Õ\u0001\u001a\u00030Ë\u00018G¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Î\u0001R\u001d\u0010×\u0001\u001a\u00020\u00068FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÖ\u0001\u0010\u0003\u001a\u0005\bV\u0010¦\u0001R\u0016\u0010Ú\u0001\u001a\u0004\u0018\u00010)8G¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0014\u0010Ü\u0001\u001a\u00020\u00068G¢\u0006\b\u001a\u0006\bÛ\u0001\u0010¦\u0001¨\u0006Ý\u0001"}, m90084d2 = {"Lcom/facebook/internal/c;", "", "<init>", "()V", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "Z", "(Ljava/lang/String;)Z", "valueIfNullOrEmpty", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "g0", "(Ljava/lang/String;)Ljava/lang/String;", "", "bytes", "s0", "([B)Ljava/lang/String;", "t0", "algorithm", "Q", "R", "(Ljava/lang/String;[B)Ljava/lang/String;", "Ljava/security/MessageDigest;", "hash", "P", "(Ljava/security/MessageDigest;[B)Ljava/lang/String;", "Ljava/io/Closeable;", "closeable", "", "i", "(Ljava/io/Closeable;)V", "Ljava/net/URLConnection;", "connection", "q", "(Ljava/net/URLConnection;)V", "Landroid/content/Context;", "context", "I", "(Landroid/content/Context;)Ljava/lang/String;", "Lorg/json/JSONObject;", "jsonObject", "", "n", "(Lorg/json/JSONObject;)Ljava/util/Map;", "o", "Lorg/json/JSONArray;", "jsonArray", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "", "m", "(Lorg/json/JSONArray;)Ljava/util/List;", "nonJSONPropertyKey", "N", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "Ljava/io/InputStream;", "inputStream", "h0", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/io/OutputStream;", "outputStream", "", "p", "(Ljava/io/InputStream;Ljava/io/OutputStream;)I", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "u0", "(Ljava/lang/String;Ljava/lang/String;)Z", "domain", "g", "(Landroid/content/Context;Ljava/lang/String;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;)V", "tag", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "d0", "(Ljava/lang/String;Ljava/lang/Exception;)V", "msg", "e0", "(Ljava/lang/String;Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "b0", "", "a0", "(Lorg/json/JSONArray;)Ljava/util/Set;", "map", "f0", "(Ljava/util/Map;)Ljava/lang/String;", "str", "c0", "(Ljava/lang/String;)Ljava/util/Map;", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/internal/AttributionIdentifiers;", "attributionIdentifiers", "anonymousAppDeviceGUID", "limitEventUsage", "q0", "(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;ZLandroid/content/Context;)V", "u", "()Ljava/lang/String;", "appContext", "r0", "(Lorg/json/JSONObject;Landroid/content/Context;)V", "Ljava/lang/Class;", "clazz", "methodName", "", "parameterTypes", "Ljava/lang/reflect/Method;", "J", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "K", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "receiver", FirebaseAnalytics.Param.METHOD, "args", ExifInterface.LATITUDE_SOUTH, "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "U", "(Landroid/net/Uri;)Z", "X", "contentUri", "", "y", "(Landroid/net/Uri;)J", "Landroid/os/Bundle;", "bundle", "Ljava/util/Date;", "dateBase", "w", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;", "Lcom/facebook/AccessToken;", InterfaceC33826o0.f71244p, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/facebook/AccessToken;)Z", "tokenGraphDomain", "D", "accessToken", "Lcom/facebook/internal/c$a;", TUIConstants.TUIChat.CALL_BACK, "F", "(Ljava/lang/String;Lcom/facebook/internal/c$a;)V", "f", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lcom/facebook/GraphRequest;", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;)Lcom/facebook/GraphRequest;", "graphDomain", "L", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "j0", "()I", "m0", "n0", "l0", "r", "()Z", "i0", "o0", "", "k", "(D)J", "c", "(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Landroid/content/Context;)V", "d", "(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Landroid/content/Context;)V", "Y", "(Landroid/content/Context;)Z", "Ljava/lang/Runnable;", "runnable", "p0", "(Ljava/lang/Runnable;)V", "t", "numCPUCores", "timestampOfLastCheck", "totalExternalStorageGB", "v", "()J", "setAvailableExternalStorageGB", "(J)V", "availableExternalStorageGB", "Ljava/lang/String;", "deviceTimezoneAbbreviation", "C", "setDeviceTimeZoneName", "(Ljava/lang/String;)V", "deviceTimeZoneName", "x", "setCarrierName", "carrierName", "O", "setVersionName", "versionName", "Ljava/util/Locale;", "Ljava/util/Locale;", "H", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "locale", "M", "resourceLocale", "z", "currentLocale", "isAutoAppLinkSetup$annotations", "isAutoAppLinkSetup", "B", "()Lorg/json/JSONObject;", "dataProcessingOptions", ExifInterface.LONGITUDE_WEST, "isDataProcessingRestricted", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utility.kt\ncom/facebook/internal/Utility\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1283:1\n37#2,2:1284\n37#2,2:1286\n37#2,2:1289\n37#2,2:1291\n1#3:1288\n107#4:1293\n79#4,22:1294\n*S KotlinDebug\n*F\n+ 1 Utility.kt\ncom/facebook/internal/Utility\n*L\n209#1:1284,2\n211#1:1286,2\n456#1:1289,2\n458#1:1291,2\n461#1:1293\n461#1:1294,22\n*E\n"})
public final class C5760c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static int numCPUCores;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public static Locale locale;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5760c f9649a = new C5760c();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static long timestampOfLastCheck = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static long totalExternalStorageGB = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static long availableExternalStorageGB = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static String deviceTimezoneAbbreviation = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static String deviceTimeZoneName = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static String carrierName = "NoCarrier";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static String versionName = "";

    /* JADX INFO: renamed from: com.facebook.internal.c$a */
    /* JADX INFO: compiled from: Utility.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/internal/c$a;", "", "Lorg/json/JSONObject;", "userInfo", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)V", "Lcom/facebook/FacebookException;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "b", "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7558a(@Nullable JSONObject userInfo);

        /* JADX INFO: renamed from: b */
        void mo7559b(@Nullable FacebookException error);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h0 */
    public static final String m10070h0(@Nullable InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i11 = inputStreamReader.read(cArr);
                        if (i11 == -1) {
                            String string = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                            m10071i(bufferedInputStream);
                            m10071i(inputStreamReader);
                            return string;
                        }
                        sb2.append(cArr, 0, i11);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    m10071i(bufferedInputStream);
                    m10071i(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: u0 */
    public static final boolean m10088u0(@Nullable String a11, @Nullable String b11) {
        boolean z11 = a11 == null || a11.length() == 0;
        boolean z12 = b11 == null || b11.length() == 0;
        if (z11 && z12) {
            return true;
        }
        if (z11 || z12) {
            return false;
        }
        return Intrinsics.areEqual(a11, b11);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: B */
    public static final JSONObject m10042B() {
        if (C42757a.m93689d(C5760c.class)) {
            return null;
        }
        try {
            String string = C5501a.m7799m().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5760c.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: F */
    public static final void m10044F(@NotNull final String accessToken, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject jSONObjectM86720a = C38454m.m86720a(accessToken);
        if (jSONObjectM86720a != null) {
            callback.mo7558a(jSONObjectM86720a);
            return;
        }
        GraphRequest.InterfaceC5490b interfaceC5490b = new GraphRequest.InterfaceC5490b() { // from class: i6.n
            @Override // com.facebook.GraphRequest.InterfaceC5490b
            /* JADX INFO: renamed from: a */
            public final void mo78a(GraphResponse graphResponse) {
                C5760c.m10045G(callback, accessToken, graphResponse);
            }
        };
        GraphRequest graphRequestM10094E = f9649a.m10094E(accessToken);
        graphRequestM10094E.m7647D(interfaceC5490b);
        graphRequestM10094E.m7657m();
    }

    /* JADX INFO: renamed from: G */
    public static final void m10045G(a callback, String accessToken, GraphResponse response) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getError() != null) {
            callback.mo7559b(response.getError().getException());
            return;
        }
        JSONObject jSONObjectM7743d = response.getJsonObject();
        if (jSONObjectM7743d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C38454m.m86721b(accessToken, jSONObjectM7743d);
        callback.mo7558a(response.getJsonObject());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: I */
    public static final String m10046I(@Nullable Context context) {
        C38457p.m86728g(context, "context");
        return C5501a.m7800n();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: J */
    public static final Method m10047J(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: K */
    public static final Method m10048K(@NotNull String className, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return m10047J(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: N */
    public static final Object m10050N(@NotNull JSONObject jsonObject, @Nullable String key, @Nullable String nonJSONPropertyKey) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object objOpt = jsonObject.opt(key);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (nonJSONPropertyKey == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(nonJSONPropertyKey, objOpt);
        return jSONObject;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: S */
    public static final Object m10051S(@Nullable Object receiver, @NotNull Method method, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(receiver, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: T */
    public static final boolean m10052T() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C5501a.m7800n()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextM7799m = C5501a.m7799m();
            PackageManager packageManager = contextM7799m.getPackageManager();
            String packageName = contextM7799m.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: U */
    public static final boolean m10053U(@Nullable Uri uri) {
        return uri != null && StringsKt.equals("content", uri.getScheme(), true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final boolean m10054V(@Nullable AccessToken token) {
        return token != null && Intrinsics.areEqual(token, AccessToken.INSTANCE.getCurrentAccessToken());
    }

    @JvmStatic
    /* JADX INFO: renamed from: W */
    public static final boolean m10055W() {
        if (C42757a.m93689d(C5760c.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectM10042B = m10042B();
            if (jSONObjectM10042B == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectM10042B.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String string = jSONArray.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (Intrinsics.areEqual(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5760c.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final boolean m10056X(@Nullable Uri uri) {
        return uri != null && StringsKt.equals("file", uri.getScheme(), true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final boolean m10057Z(@Nullable String s11) {
        return s11 == null || s11.length() == 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public static final Set<String> m10059a0(@NotNull JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String string = jsonArray.getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public static final List<String> m10061b0(@NotNull JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(jsonArray.getString(i11));
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final <T> boolean m10064e(@Nullable T a11, @Nullable T b11) {
        if (a11 == null) {
            return b11 == null;
        }
        return Intrinsics.areEqual(a11, b11);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final JSONObject m10066f(@NotNull String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject jSONObjectM86720a = C38454m.m86720a(accessToken);
        if (jSONObjectM86720a != null) {
            return jSONObjectM86720a;
        }
        GraphResponse graphResponseM7656l = f9649a.m10094E(accessToken).m7656l();
        if (graphResponseM7656l.getError() != null) {
            return null;
        }
        return graphResponseM7656l.getJsonObject();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public static final String m10067f0(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        Intrinsics.checkNotNullExpressionValue(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        return string;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g0 */
    public static final String m10068g0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f9649a.m10099Q("MD5", key);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m10069h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            C5760c c5760c = f9649a;
            c5760c.m10104g(context, "facebook.com");
            c5760c.m10104g(context, ".facebook.com");
            c5760c.m10104g(context, "https://facebook.com");
            c5760c.m10104g(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m10071i(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final boolean m10073k0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final HashSet<String> m10074l(@Nullable JSONArray jsonArray) throws JSONException {
        if (jsonArray == null || jsonArray.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String string = jsonArray.getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final List<String> m10075m(@NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String string = jsonArray.getString(i11);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final Map<String, Object> m10076n(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    String string = jSONArrayNames.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = m10076n((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    map.put(string, value);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final Map<String, String> m10077o(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jsonObject.optString(key);
            if (strOptString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m10080q(@Nullable URLConnection connection) {
        if (connection == null || !(connection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) connection).disconnect();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final String m10083s(@Nullable Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: s0 */
    public static final String m10084s0(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return f9649a.m10100R("SHA-1", bytes);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final String m10085t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String strM7801o = C5501a.m7801o();
            if (strM7801o != null) {
                return strM7801o;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i11 = applicationInfo.labelRes;
            if (i11 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: t0 */
    public static final String m10086t0(@Nullable String key) {
        if (key == null) {
            return null;
        }
        return f9649a.m10099Q("SHA-256", key);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: w */
    public static final Date m10089w(@Nullable Bundle bundle, @Nullable String key, @NotNull Date dateBase) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(key);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (jLongValue * 1000));
    }

    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final long m10090y(@NotNull Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = C5501a.m7799m().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j11 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j11;
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: A */
    public final String m10092A() {
        AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
        return (currentAccessToken == null || currentAccessToken.getGraphDomain() == null) ? AccessToken.DEFAULT_GRAPH_DOMAIN : currentAccessToken.getGraphDomain();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final String m10093C() {
        return deviceTimeZoneName;
    }

    /* JADX INFO: renamed from: E */
    public final GraphRequest m10094E(String accessToken) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", m10096L(m10092A()));
        bundle.putString(AccessToken.ACCESS_TOKEN_KEY, accessToken);
        GraphRequest graphRequestNewMeRequest = GraphRequest.INSTANCE.newMeRequest(null, null);
        graphRequestNewMeRequest.m7651H(bundle);
        graphRequestNewMeRequest.m7650G(HttpMethod.GET);
        return graphRequestNewMeRequest;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final Locale m10095H() {
        return locale;
    }

    /* JADX INFO: renamed from: L */
    public final String m10096L(String graphDomain) {
        return Intrinsics.areEqual(graphDomain, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public final String m10097O() {
        return versionName;
    }

    /* JADX INFO: renamed from: Q */
    public final String m10099Q(String algorithm, String key) {
        byte[] bytes = key.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return m10100R(algorithm, bytes);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m10101Y(Context context) {
        Method methodM10048K = m10048K("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM10048K == null) {
            return false;
        }
        Object objM10051S = m10051S(null, methodM10048K, context);
        return (objM10051S instanceof Integer) && Intrinsics.areEqual(objM10051S, (Object) 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m10102c(JSONObject params, AttributionIdentifiers attributionIdentifiers, String anonymousAppDeviceGUID, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !m10101Y(context)) {
            params.put("anon_id", anonymousAppDeviceGUID);
        } else {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put("anon_id", anonymousAppDeviceGUID);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10103d(JSONObject params, AttributionIdentifiers attributionIdentifiers, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !m10101Y(context)) {
            params.put("attribution", attributionIdentifiers.getAttributionId());
        } else {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put("attribution", attributionIdentifiers.getAttributionId());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final int m10106j0() {
        int i11 = numCPUCores;
        if (i11 > 0) {
            return i11;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: i6.o
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return C5760c.m10073k0(file, str);
                }
            });
            if (fileArrListFiles != null) {
                numCPUCores = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (numCPUCores <= 0) {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    /* JADX INFO: renamed from: k */
    public final long m10107k(double bytes) {
        return Math.round(bytes / 1.073741824E9d);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m10108l0(Context appContext) {
        if (Intrinsics.areEqual(carrierName, "NoCarrier")) {
            try {
                Object systemService = appContext.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                carrierName = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m10109m0(Context appContext) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= C33536a4.f68797g) {
            timestampOfLastCheck = System.currentTimeMillis();
            m10110n0();
            m10108l0(appContext);
            m10111o0();
            m10105i0();
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10112r() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: v */
    public final long m10113v() {
        return availableExternalStorageGB;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final String m10114x() {
        return carrierName;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: D */
    public static final String m10043D(@Nullable String tokenGraphDomain) {
        String strM7807u = C5501a.m7807u();
        if (tokenGraphDomain != null) {
            if (Intrinsics.areEqual(tokenGraphDomain, "gaming")) {
                return StringsKt.replace$default(strM7807u, "facebook.com", "fb.gg", false, 4, (Object) null);
            }
            if (Intrinsics.areEqual(tokenGraphDomain, "instagram")) {
                return StringsKt.replace$default(strM7807u, "facebook.com", "instagram.com", false, 4, (Object) null);
            }
        }
        return strM7807u;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: M */
    public static final Locale m10049M() {
        try {
            return C5501a.m7799m().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public static final Map<String, String> m10062c0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d0 */
    public static final void m10063d0(@Nullable String tag, @Nullable Exception e11) {
        if (C5501a.m7766B() && tag != null && e11 != null) {
            Log.d(tag, e11.getClass().getSimpleName() + ": " + e11.getMessage());
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e0 */
    public static final void m10065e0(@Nullable String tag, @Nullable String msg) {
        if (C5501a.m7766B() && tag != null && msg != null) {
            Log.d(tag, msg);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final String m10072j(@Nullable String s11, @Nullable String valueIfNullOrEmpty) {
        if (m10057Z(s11)) {
            return valueIfNullOrEmpty;
        }
        return s11;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final int m10078p(@Nullable InputStream inputStream, @NotNull OutputStream outputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i11 = 0;
                while (true) {
                    int i12 = bufferedInputStream2.read(bArr);
                    if (i12 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i12);
                    i11 += i12;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i11;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: p0 */
    public static final void m10079p0(@Nullable Runnable runnable) {
        try {
            C5501a.m7806t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: q0 */
    public static final void m10081q0(@NotNull JSONObject params, @Nullable AttributionIdentifiers attributionIdentifiers, @Nullable String anonymousAppDeviceGUID, boolean limitEventUsage, @NotNull Context context) throws JSONException {
        Object objM8237e;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.m9939g(feature)) {
            params.put("anon_id", anonymousAppDeviceGUID);
        }
        params.put("application_tracking_enabled", !limitEventUsage);
        params.put("advertiser_id_collection_enabled", C5501a.m7798l());
        if (attributionIdentifiers != null) {
            if (FeatureManager.m9939g(feature)) {
                f9649a.m10102c(params, attributionIdentifiers, anonymousAppDeviceGUID, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                if (FeatureManager.m9939g(feature)) {
                    f9649a.m10103d(params, attributionIdentifiers, context);
                } else {
                    params.put("attribution", attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.m9905h() != null) {
                params.put("advertiser_id", attributionIdentifiers.m9905h());
                params.put("advertiser_tracking_enabled", !attributionIdentifiers.getIsTrackingLimited());
            }
            if (!attributionIdentifiers.getIsTrackingLimited()) {
                String strM8093f = C5524d.m8093f();
                if (strM8093f.length() != 0) {
                    params.put("ud", strM8093f);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                params.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
        AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
        if (companion != null) {
            objM8237e = companion.m8237e("campaign_ids");
        } else {
            objM8237e = null;
        }
        if (objM8237e != null) {
            params.put("campaign_ids", objM8237e);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: r0 */
    public static final void m10082r0(@NotNull JSONObject params, @NotNull Context appContext) throws JSONException {
        Locale locale2;
        String language;
        String country;
        int i11;
        DisplayManager displayManager;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(ICustomDataEditor.STRING_ARRAY_PARAM_2);
        f9649a.m10109m0(appContext);
        String packageName = appContext.getPackageName();
        int i12 = 0;
        int i13 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i13 = packageInfo.versionCode;
            versionName = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i13);
        jSONArray.put(versionName);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale2 = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale2 = Locale.getDefault();
        }
        locale = locale2;
        StringBuilder sb2 = new StringBuilder();
        Locale locale3 = locale;
        Display display = null;
        if (locale3 != null) {
            language = locale3.getLanguage();
        } else {
            language = null;
        }
        String str = "";
        if (language == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale4 = locale;
        if (locale4 != null) {
            country = locale4.getCountry();
        } else {
            country = null;
        }
        if (country != null) {
            str = country;
        }
        sb2.append(str);
        jSONArray.put(sb2.toString());
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d11 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            if (systemService instanceof DisplayManager) {
                displayManager = (DisplayManager) systemService;
            } else {
                displayManager = null;
            }
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i14 = displayMetrics.widthPixels;
                try {
                    i12 = displayMetrics.heightPixels;
                    d11 = displayMetrics.density;
                } catch (Exception unused3) {
                }
                i11 = i12;
                i12 = i14;
            } else {
                i11 = 0;
            }
        } catch (Exception unused4) {
        }
        jSONArray.put(i12);
        jSONArray.put(i11);
        jSONArray.put(new DecimalFormat("#.##").format(d11));
        jSONArray.put(f9649a.m10106j0());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        params.put("extinfo", jSONArray.toString());
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: u */
    public static final String m10087u() {
        Context contextM7799m = C5501a.m7799m();
        if (contextM7799m == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextM7799m.getPackageManager().getPackageInfo(contextM7799m.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: z */
    public static final Locale m10091z() {
        Locale localeM10049M = m10049M();
        if (localeM10049M == null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
            return locale2;
        }
        return localeM10049M;
    }

    /* JADX INFO: renamed from: P */
    public final String m10098P(MessageDigest hash, byte[] bytes) {
        hash.update(bytes);
        byte[] digest = hash.digest();
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        for (byte b11 : digest) {
            sb2.append(Integer.toHexString((b11 >> 4) & 15));
            sb2.append(Integer.toHexString(b11 & 15));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    /* JADX INFO: renamed from: R */
    public final String m10100R(String algorithm, byte[] bytes) {
        try {
            MessageDigest hash = MessageDigest.getInstance(algorithm);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return m10098P(hash, bytes);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10104g(Context context, String domain) {
        int i11;
        boolean z11;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(domain);
        if (cookie == null) {
            return;
        }
        for (String str : (String[]) StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0])) {
            String[] strArr = (String[]) StringsKt.split$default((CharSequence) str, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str2 = strArr[0];
                int length = str2.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (Intrinsics.compare((int) str2.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                sb2.append(str2.subSequence(i12, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(domain, sb2.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10105i0() {
        try {
            if (m10112r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            availableExternalStorageGB = m10107k(availableExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m10110n0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            deviceTimezoneAbbreviation = displayName;
            String id2 = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id2, "tz.id");
            deviceTimeZoneName = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m10111o0() {
        try {
            if (m10112r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            totalExternalStorageGB = m10107k(totalExternalStorageGB);
        } catch (Exception unused) {
        }
    }
}
