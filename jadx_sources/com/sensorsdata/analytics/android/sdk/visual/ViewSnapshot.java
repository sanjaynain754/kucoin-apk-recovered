package com.sensorsdata.analytics.android.sdk.visual;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.AppStateManager;
import com.sensorsdata.analytics.android.sdk.C27650R;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.DeviceUtils;
import com.sensorsdata.analytics.android.sdk.util.ReflectUtil;
import com.sensorsdata.analytics.android.sdk.util.ViewUtil;
import com.sensorsdata.analytics.android.sdk.util.WindowHelper;
import com.sensorsdata.analytics.android.sdk.visual.model.SnapInfo;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.sensorsdata.analytics.android.sdk.visual.model.WebNode;
import com.sensorsdata.analytics.android.sdk.visual.model.WebNodeInfo;
import com.sensorsdata.analytics.android.sdk.visual.snap.Caller;
import com.sensorsdata.analytics.android.sdk.visual.snap.PropertyDescription;
import com.sensorsdata.analytics.android.sdk.visual.snap.ResourceIds;
import com.sensorsdata.analytics.android.sdk.visual.snap.SoftWareCanvas;
import com.sensorsdata.analytics.android.sdk.visual.snap.UIThreadSet;
import com.sensorsdata.analytics.android.sdk.visual.util.Dispatcher;
import com.sensorsdata.analytics.android.sdk.visual.util.VisualUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@TargetApi(16)
public class ViewSnapshot {
    private static final int JS_NOT_INTEGRATED_ALERT_TIME_OUT = 5000;
    private static final int MAX_CLASS_NAME_CACHE_SIZE = 255;
    private static final String TAG = "SA.Snapshot";
    private AlertRunnable mAlertRunnable;
    private final List<PropertyDescription> mProperties;
    private final ResourceIds mResourceIds;
    private SnapInfo mSnapInfo = new SnapInfo();
    private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    private final RootViewFinder mRootViewFinder = new RootViewFinder();
    private final ClassNameCache mClassnameCache = new ClassNameCache(255);

    public static class CachedBitmap {
        private String mImageHash = "";
        private final Paint mPaint = new Paint(2);
        private Bitmap mCached = null;

        private static byte[] concat(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x002e A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:19:0x002a, B:21:0x002e, B:22:0x003b, B:24:0x005b, B:26:0x0061, B:28:0x0064, B:31:0x006b, B:33:0x0079, B:35:0x007f, B:37:0x0082, B:38:0x0086, B:40:0x0097, B:12:0x0017, B:16:0x0023, B:18:0x0027, B:15:0x0021), top: B:45:0x0001, inners: #1, #2 }] */
        public synchronized void recreate(int i11, int i12, int i13, Bitmap bitmap) {
            byte[] byteArray;
            String lastWebNodeMsg;
            String lastDebugInfo;
            byte[] bytes;
            byte[] bytes2;
            Bitmap bitmap2 = this.mCached;
            if (bitmap2 == null || bitmap2.getWidth() != i11 || this.mCached.getHeight() != i12) {
                try {
                    this.mCached = Bitmap.createBitmap(i11, i12, Bitmap.Config.RGB_565);
                } catch (OutOfMemoryError unused) {
                    this.mCached = null;
                }
                Bitmap bitmap3 = this.mCached;
                if (bitmap3 != null) {
                    bitmap3.setDensity(i13);
                }
                if (this.mCached != null) {
                    new Canvas(this.mCached).drawBitmap(bitmap, 0.0f, 0.0f, this.mPaint);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        this.mCached.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        lastWebNodeMsg = WebNodesManager.getInstance().getLastWebNodeMsg();
                        if (!TextUtils.isEmpty(lastWebNodeMsg) && (bytes2 = lastWebNodeMsg.getBytes()) != null && bytes2.length > 0) {
                            byteArray = concat(byteArray, bytes2);
                        }
                        lastDebugInfo = VisualizedAutoTrackService.getInstance().getLastDebugInfo();
                        if (!TextUtils.isEmpty(lastDebugInfo) && (bytes = lastDebugInfo.getBytes()) != null && bytes.length > 0) {
                            byteArray = concat(byteArray, bytes);
                        }
                        this.mImageHash = toHex(MessageDigest.getInstance("MD5").digest(byteArray));
                    } catch (Exception e11) {
                        SALog.m68589i(ViewSnapshot.TAG, "CachedBitmap.recreate;Create image_hash error=" + e11);
                    }
                }
            } else if (this.mCached != null) {
                new Canvas(this.mCached).drawBitmap(bitmap, 0.0f, 0.0f, this.mPaint);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                this.mCached.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                byteArray = byteArrayOutputStream2.toByteArray();
                lastWebNodeMsg = WebNodesManager.getInstance().getLastWebNodeMsg();
                if (!TextUtils.isEmpty(lastWebNodeMsg)) {
                    byteArray = concat(byteArray, bytes2);
                }
                lastDebugInfo = VisualizedAutoTrackService.getInstance().getLastDebugInfo();
                if (!TextUtils.isEmpty(lastDebugInfo)) {
                    byteArray = concat(byteArray, bytes);
                }
                this.mImageHash = toHex(MessageDigest.getInstance("MD5").digest(byteArray));
            }
            throw th;
        }

        public synchronized void writeBitmapJSON(Bitmap.CompressFormat compressFormat, int i11, OutputStream outputStream) throws IOException {
            try {
                Bitmap bitmap = this.mCached;
                if (bitmap == null || bitmap.getWidth() == 0 || this.mCached.getHeight() == 0) {
                    outputStream.write("null".getBytes());
                } else {
                    outputStream.write(34);
                    Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 2);
                    this.mCached.compress(Bitmap.CompressFormat.PNG, 100, base64OutputStream);
                    base64OutputStream.flush();
                    outputStream.write(34);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getImageHash() {
            return this.mImageHash;
        }

        private String toHex(byte[] bArr) {
            String str = "";
            for (int i11 = 0; i11 < bArr.length; i11++) {
                str = (str + "0123456789ABCDEF".charAt((bArr[i11] >> 4) & 15)) + "0123456789ABCDEF".charAt(bArr[i11] & 15);
            }
            return str;
        }
    }

    public static class ClassNameCache extends LruCache<Class<?>, String> {
        @Override // android.util.LruCache
        public String create(Class<?> cls) {
            return cls.getCanonicalName();
        }

        public ClassNameCache(int i11) {
            super(i11);
        }
    }

    public static class RootViewFinder implements Callable<List<RootViewInfo>> {
        private final int mClientDensity = 160;
        private final List<RootViewInfo> mRootViews = new ArrayList();
        private final CachedBitmap mCachedBitmap = new CachedBitmap();

        private void scaleBitmap(RootViewInfo rootViewInfo, Bitmap bitmap) {
            float f11 = 1.0f;
            if (bitmap != null) {
                int density = bitmap.getDensity();
                f11 = density != 0 ? 160.0f / density : 1.0f;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int width2 = (int) (((double) (bitmap.getWidth() * f11)) + 0.5d);
                int height2 = (int) (((double) (bitmap.getHeight() * f11)) + 0.5d);
                if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                    this.mCachedBitmap.recreate(width2, height2, 160, bitmap);
                }
            }
            rootViewInfo.scale = f11;
            rootViewInfo.screenshot = this.mCachedBitmap;
        }

        @Override // java.util.concurrent.Callable
        public List<RootViewInfo> call() throws Exception {
            this.mRootViews.clear();
            Activity foregroundActivity = AppStateManager.getInstance().getForegroundActivity();
            if (foregroundActivity != null) {
                JSONObject jSONObjectBuildTitleAndScreenName = AopUtil.buildTitleAndScreenName(foregroundActivity);
                VisualUtil.mergeRnScreenNameAndTitle(jSONObjectBuildTitleAndScreenName);
                String strOptString = jSONObjectBuildTitleAndScreenName.optString(AopConstants.SCREEN_NAME);
                String strOptString2 = jSONObjectBuildTitleAndScreenName.optString(AopConstants.TITLE);
                Window window = foregroundActivity.getWindow();
                Bitmap bitmapMergeViewLayers = null;
                View rootView = (window == null || !window.isActive()) ? null : window.getDecorView().getRootView();
                if (rootView == null) {
                    return this.mRootViews;
                }
                RootViewInfo rootViewInfo = new RootViewInfo(strOptString, strOptString2, rootView);
                View[] sortedWindowViews = WindowHelper.getSortedWindowViews();
                if (sortedWindowViews != null && sortedWindowViews.length > 0) {
                    bitmapMergeViewLayers = mergeViewLayers(sortedWindowViews, rootViewInfo);
                    for (View view : sortedWindowViews) {
                        if (view.getWindowVisibility() == 0 && view.getVisibility() == 0 && view.getWidth() != 0 && view.getHeight() != 0 && !TextUtils.equals(WindowHelper.getWindowPrefix(view), WindowHelper.getMainWindowPrefix())) {
                            RootViewInfo rootViewInfo2 = new RootViewInfo(strOptString, strOptString2, view.getRootView());
                            scaleBitmap(rootViewInfo2, bitmapMergeViewLayers);
                            this.mRootViews.add(rootViewInfo2);
                        }
                    }
                }
                if (this.mRootViews.size() == 0) {
                    scaleBitmap(rootViewInfo, bitmapMergeViewLayers);
                    this.mRootViews.add(rootViewInfo);
                }
            }
            return this.mRootViews;
        }

        public Bitmap mergeViewLayers(View[] viewArr, RootViewInfo rootViewInfo) {
            int width = rootViewInfo.rootView.getWidth();
            int height = rootViewInfo.rootView.getHeight();
            if (width == 0 || height == 0) {
                int[] deviceSize = DeviceUtils.getDeviceSize(SensorsDataAPI.sharedInstance().getContext());
                width = deviceSize[0];
                height = deviceSize[1];
                if (width == 0 || height == 0) {
                    return null;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            SoftWareCanvas softWareCanvas = new SoftWareCanvas(bitmapCreateBitmap);
            int[] iArr = new int[2];
            boolean z11 = ViewUtil.getMainWindowCount(viewArr) > 1;
            WindowHelper.init();
            ViewUtil.invalidateLayerTypeView(viewArr);
            boolean z12 = false;
            for (View view : viewArr) {
                if (view.getVisibility() == 0 && view.getWidth() != 0 && view.getHeight() != 0 && ViewUtil.isWindowNeedTraverse(view, WindowHelper.getWindowPrefix(view), z11)) {
                    softWareCanvas.save();
                    if (!WindowHelper.isMainWindow(view)) {
                        view.getLocationOnScreen(iArr);
                        softWareCanvas.translate(iArr[0], iArr[1]);
                        if (WindowHelper.isDialogOrPopupWindow(view) && !z12) {
                            Paint paint = new Paint();
                            paint.setColor(-1610612736);
                            softWareCanvas.drawRect(-iArr[0], -iArr[1], softWareCanvas.getWidth(), softWareCanvas.getHeight(), paint);
                            z12 = true;
                        }
                    }
                    view.draw(softWareCanvas);
                    softWareCanvas.restore();
                    softWareCanvas.destroy();
                }
            }
            return bitmapCreateBitmap;
        }
    }

    public synchronized SnapInfo snapshots(UIThreadSet<Activity> uIThreadSet, OutputStream outputStream, StringBuilder sb2) throws IOException {
        SnapInfo snapInfo;
        CachedBitmap cachedBitmap;
        FutureTask futureTask = new FutureTask(this.mRootViewFinder);
        this.mMainThreadHandler.post(futureTask);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        List list = Collections.EMPTY_LIST;
        outputStreamWriter.write("[");
        try {
            try {
                list = (List) futureTask.get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e11) {
                SALog.m68590i(TAG, "Screenshot interrupted, no screenshot will be sent.", e11);
            }
        } catch (ExecutionException e12) {
            SALog.m68590i(TAG, "Exception thrown during screenshot attempt", e12);
        } catch (TimeoutException e13) {
            SALog.m68590i(TAG, "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", e13);
        }
        int size = list.size();
        String str = null;
        String str2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            RootViewInfo rootViewInfo = (RootViewInfo) list.get(i11);
            if (i11 > 0) {
                outputStreamWriter.write(",");
            }
            if (rootViewInfo == null || (cachedBitmap = rootViewInfo.screenshot) == null || (!isSnapShotUpdated(cachedBitmap.getImageHash(), sb2) && i11 <= 0)) {
                outputStreamWriter.write("{}");
            } else {
                outputStreamWriter.write("{");
                outputStreamWriter.write("\"activity\":");
                str = rootViewInfo.screenName;
                str2 = rootViewInfo.activityTitle;
                outputStreamWriter.write(JSONObject.quote(str));
                outputStreamWriter.write(",");
                outputStreamWriter.write("\"scale\":");
                outputStreamWriter.write(String.format("%s", Float.valueOf(rootViewInfo.scale)));
                outputStreamWriter.write(",");
                outputStreamWriter.write("\"serialized_objects\":");
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                jsonWriter.name("rootObject").value(rootViewInfo.rootView.hashCode());
                jsonWriter.name("objects");
                snapshotViewHierarchy(jsonWriter, rootViewInfo.rootView);
                jsonWriter.endObject();
                jsonWriter.flush();
                outputStreamWriter.write(",");
                outputStreamWriter.write("\"image_hash\":");
                outputStreamWriter.write(JSONObject.quote(rootViewInfo.screenshot.getImageHash()));
                outputStreamWriter.write(",");
                outputStreamWriter.write("\"screenshot\":");
                outputStreamWriter.flush();
                rootViewInfo.screenshot.writeBitmapJSON(Bitmap.CompressFormat.PNG, 70, outputStream);
                outputStreamWriter.write("}");
            }
        }
        outputStreamWriter.write("]");
        outputStreamWriter.flush();
        snapInfo = this.mSnapInfo;
        snapInfo.screenName = str;
        snapInfo.activityTitle = str2;
        return snapInfo;
    }

    public static class AlertRunnable implements Runnable {
        private String url;

        public AlertRunnable(String str) {
            this.url = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebNodesManager.getInstance().getWebNodes(this.url) == null) {
                SALog.m68589i(ViewSnapshot.TAG, "H5 页面未集成 Web JS SDK");
                WebNodesManager.getInstance().handlerFailure(this.url, "{\"callType\":\"app_alert\",\"data\":[{\"title\":\"当前页面无法进行可视化全埋点\",\"message\":\"此页面未集成 Web JS SDK 或者 Web JS SDK 版本过低，请集成最新版 Web JS SDK\",\"link_text\":\"配置文档\",\"link_url\":\"https://manual.sensorsdata.cn/sa/latest/tech_sdk_client_web_use-7545346.html\"}]}");
            }
        }
    }

    public static class RootViewInfo {
        final String activityTitle;
        final View rootView;
        final String screenName;
        CachedBitmap screenshot = null;
        float scale = 1.0f;

        public RootViewInfo(String str, String str2, View view) {
            this.screenName = str;
            this.activityTitle = str2;
            this.rootView = view;
        }
    }

    private void getVisibleRect(View view, Rect rect, boolean z11) {
        if (z11) {
            view.getGlobalVisibleRect(rect);
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view.getLocalVisibleRect(rect);
        rect.offset(iArr[0], iArr[1]);
    }

    private void reset() {
        this.mSnapInfo = new SnapInfo();
        ViewUtil.clear();
    }

    public ViewSnapshot(List<PropertyDescription> list, ResourceIds resourceIds) {
        this.mProperties = list;
        this.mResourceIds = resourceIds;
    }

    private void addProperties(JsonWriter jsonWriter, View view) throws IOException {
        Caller caller;
        Object objApplyMethod;
        Class<?> cls = view.getClass();
        for (PropertyDescription propertyDescription : this.mProperties) {
            if (propertyDescription.targetClass.isAssignableFrom(cls) && (caller = propertyDescription.accessor) != null && (objApplyMethod = caller.applyMethod(view)) != null) {
                if (objApplyMethod instanceof Number) {
                    jsonWriter.name(propertyDescription.name).value((Number) objApplyMethod);
                } else if (objApplyMethod instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) objApplyMethod).booleanValue();
                    if (TextUtils.equals("clickable", propertyDescription.name)) {
                        if (VisualUtil.isSupportClick(view)) {
                            zBooleanValue = true;
                        } else if (VisualUtil.isForbiddenClick(view)) {
                            zBooleanValue = false;
                        }
                    }
                    jsonWriter.name(propertyDescription.name).value(zBooleanValue);
                } else if (objApplyMethod instanceof ColorStateList) {
                    jsonWriter.name(propertyDescription.name).value(Integer.valueOf(((ColorStateList) objApplyMethod).getDefaultColor()));
                } else if (objApplyMethod instanceof Drawable) {
                    Drawable drawable = (Drawable) objApplyMethod;
                    Rect bounds = drawable.getBounds();
                    jsonWriter.name(propertyDescription.name);
                    jsonWriter.beginObject();
                    jsonWriter.name("classes");
                    jsonWriter.beginArray();
                    for (Class<?> superclass = drawable.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                        jsonWriter.value(superclass.getCanonicalName());
                    }
                    jsonWriter.endArray();
                    jsonWriter.name("dimensions");
                    jsonWriter.beginObject();
                    jsonWriter.name("left").value(bounds.left);
                    jsonWriter.name("right").value(bounds.right);
                    jsonWriter.name(ViewProps.TOP).value(bounds.top);
                    jsonWriter.name(ViewProps.BOTTOM).value(bounds.bottom);
                    jsonWriter.endObject();
                    if (drawable instanceof ColorDrawable) {
                        jsonWriter.name("color").value(((ColorDrawable) drawable).getColor());
                    }
                    jsonWriter.endObject();
                } else {
                    jsonWriter.name(propertyDescription.name).value(objApplyMethod.toString());
                }
            }
        }
    }

    private String getResName(View view) {
        int id2 = view.getId();
        if (-1 == id2) {
            return null;
        }
        return this.mResourceIds.nameForId(id2);
    }

    private boolean isSnapShotUpdated(String str, StringBuilder sb2) {
        boolean z11;
        if (TextUtils.equals(str, sb2) && !WebNodesManager.getInstance().hasH5AlertInfo()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (sb2 != null) {
            sb2.delete(0, sb2.length()).append(str);
        }
        return z11;
    }

    private void mergeWebViewNodes(JsonWriter jsonWriter, WebNode webNode, View view, float f11) {
        float left;
        float top;
        boolean z11;
        try {
            jsonWriter.beginObject();
            jsonWriter.name("hashCode").value(webNode.getId() + view.hashCode());
            long j11 = 0;
            jsonWriter.name("index").value(0L);
            if (!TextUtils.isEmpty(webNode.get$element_selector())) {
                jsonWriter.name("element_selector").value(webNode.get$element_selector());
            }
            if (!TextUtils.isEmpty(webNode.get$element_content())) {
                jsonWriter.name("element_content").value(webNode.get$element_content());
            }
            JsonWriter jsonWriterName = jsonWriter.name("element_level");
            SnapInfo snapInfo = this.mSnapInfo;
            int i11 = snapInfo.elementLevel + 1;
            snapInfo.elementLevel = i11;
            jsonWriterName.value(i11);
            jsonWriter.name("h5_title").value(webNode.get$title());
            float scale = webNode.getScale();
            if (f11 == 0.0f) {
                f11 = scale;
            }
            if (view.getScrollX() == 0) {
                left = webNode.getLeft();
            } else {
                left = webNode.getLeft() + webNode.getScrollX();
            }
            float f12 = left * f11;
            if (view.getScrollY() == 0) {
                top = webNode.getTop();
            } else {
                top = webNode.getTop() + webNode.getScrollY();
            }
            float f13 = top * f11;
            jsonWriter.name("left").value((int) f12);
            jsonWriter.name(ViewProps.TOP).value((int) f13);
            jsonWriter.name("width").value((int) (webNode.getWidth() * f11));
            jsonWriter.name("height").value((int) (webNode.getHeight() * f11));
            jsonWriter.name("scrollX").value(0L);
            jsonWriter.name("scrollY").value(0L);
            if (f13 <= view.getHeight() + view.getScrollY() && webNode.getTop() + webNode.getHeight() > 0.0f && f12 <= view.getWidth() + view.getScrollX() && webNode.getLeft() + webNode.getWidth() > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            JsonWriter jsonWriterName2 = jsonWriter.name("visibility");
            if (!webNode.isVisibility() || !z11) {
                j11 = 8;
            }
            jsonWriterName2.value(j11);
            jsonWriter.name("url").value(webNode.get$url());
            jsonWriter.name("clickable").value(true);
            jsonWriter.name(ViewProps.IMPORTANT_FOR_ACCESSIBILITY).value(true);
            jsonWriter.name("is_h5").value(true);
            jsonWriter.name("classes");
            jsonWriter.beginArray();
            jsonWriter.value(webNode.getTagName());
            Class<?> superclass = view.getClass();
            do {
                jsonWriter.value(superclass.getCanonicalName());
                superclass = superclass.getSuperclass();
                if (superclass == Object.class) {
                    break;
                }
            } while (superclass != null);
            jsonWriter.endArray();
            List<String> subelements = webNode.getSubelements();
            if (subelements != null && subelements.size() > 0) {
                jsonWriter.name("subviews");
                jsonWriter.beginArray();
                Iterator<String> it = subelements.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next());
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
        } catch (IOException e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void snapshotView(JsonWriter jsonWriter, final View view, int i11) throws IOException {
        if (ViewUtil.isViewSelfVisible(view)) {
            ArrayList arrayList = null;
            if (ViewUtil.instanceOfWebView(view)) {
                this.mSnapInfo.isWebView = true;
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    view.post(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.visual.ViewSnapshot.1
                        @Override // java.lang.Runnable
                        public void run() {
                            String str = (String) ReflectUtil.callMethod(view, "getUrl", new Object[0]);
                            if (TextUtils.isEmpty(str)) {
                                countDownLatch.countDown();
                                return;
                            }
                            ViewSnapshot.this.mSnapInfo.webViewUrl = str;
                            Float f11 = (Float) ReflectUtil.callMethod(view, "getScale", new Object[0]);
                            if (f11 != null) {
                                ViewSnapshot.this.mSnapInfo.webViewScale = f11.floatValue();
                            }
                            countDownLatch.countDown();
                            SensorsDataAutoTrackHelper.loadUrl(view, "javascript:window.sensorsdata_app_call_js('visualized')");
                        }
                    });
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
                try {
                    countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e12) {
                    SALog.printStackTrace(e12);
                }
                SALog.m68589i(TAG, "WebView url: " + this.mSnapInfo.webViewUrl);
                if (!TextUtils.isEmpty(this.mSnapInfo.webViewUrl)) {
                    WebNodeInfo webNodes = WebNodesManager.getInstance().getWebNodes(this.mSnapInfo.webViewUrl);
                    if (webNodes != null) {
                        if (webNodes.getStatus() == WebNodeInfo.Status.SUCCESS) {
                            List<WebNode> webNodes2 = webNodes.getWebNodes();
                            if (webNodes2 != null && webNodes2.size() > 0) {
                                arrayList = new ArrayList();
                                for (WebNode webNode : webNodes2) {
                                    mergeWebViewNodes(jsonWriter, webNode, view, this.mSnapInfo.webViewScale);
                                    arrayList.add(webNode.getId() + view.hashCode());
                                }
                            }
                        } else if (webNodes.getStatus() == WebNodeInfo.Status.FAILURE) {
                            this.mSnapInfo.alertInfos = webNodes.getAlertInfos();
                        }
                    } else {
                        if (this.mAlertRunnable == null) {
                            this.mAlertRunnable = new AlertRunnable(this.mSnapInfo.webViewUrl);
                        }
                        Dispatcher.getInstance().postDelayed(this.mAlertRunnable, 5000L);
                    }
                }
            }
            jsonWriter.beginObject();
            jsonWriter.name("hashCode").value(view.hashCode());
            jsonWriter.name("id").value(view.getId());
            jsonWriter.name("index").value(VisualUtil.getChildIndex(view.getParent(), view));
            JsonWriter jsonWriterName = jsonWriter.name("element_level");
            SnapInfo snapInfo = this.mSnapInfo;
            int i12 = snapInfo.elementLevel + 1;
            snapInfo.elementLevel = i12;
            jsonWriterName.value(i12);
            jsonWriter.name("element_selector").value(ViewUtil.getElementSelector(view));
            JSONObject screenNameAndTitle = VisualUtil.getScreenNameAndTitle(view, this.mSnapInfo);
            if (screenNameAndTitle != null) {
                String strOptString = screenNameAndTitle.optString(AopConstants.SCREEN_NAME);
                String strOptString2 = screenNameAndTitle.optString(AopConstants.TITLE);
                if (!TextUtils.isEmpty(strOptString)) {
                    jsonWriter.name(FirebaseAnalytics.Param.SCREEN_NAME).value(strOptString);
                }
                if (!TextUtils.isEmpty(strOptString2)) {
                    jsonWriter.name("title").value(strOptString2);
                }
            }
            ViewNode viewNode = ViewUtil.getViewNode(view, i11, true);
            if (viewNode != null) {
                if (!TextUtils.isEmpty(viewNode.getViewPath())) {
                    jsonWriter.name("element_path").value(viewNode.getViewPath());
                }
                if (!TextUtils.isEmpty(viewNode.getViewPosition())) {
                    jsonWriter.name("element_position").value(viewNode.getViewPosition());
                }
                if (!TextUtils.isEmpty(viewNode.getViewContent()) && VisualUtil.isSupportElementContent(view)) {
                    jsonWriter.name("element_content").value(viewNode.getViewContent());
                }
                jsonWriter.name("is_list_view").value(viewNode.isListView());
            }
            jsonWriter.name("sa_id_name").value(getResName(view));
            try {
                String str = (String) view.getTag(C27650R.id.sensors_analytics_tag_view_id);
                if (!TextUtils.isEmpty(str)) {
                    jsonWriter.name("sa_id_name").value(str);
                }
            } catch (Exception e13) {
                SALog.printStackTrace(e13);
            }
            if (!WindowHelper.isMainWindow(view.getRootView())) {
                if (WindowHelper.isDecorView(view.getClass())) {
                    DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
                    int i13 = displayMetrics.widthPixels;
                    int i14 = displayMetrics.heightPixels;
                    jsonWriter.name(ViewProps.TOP).value(view.getTop());
                    jsonWriter.name("left").value(view.getLeft());
                    jsonWriter.name("width").value(i13);
                    jsonWriter.name("height").value(i14);
                } else {
                    ViewParent parent = view.getParent();
                    if (parent != null && WindowHelper.isDecorView(parent.getClass())) {
                        Rect rect = new Rect();
                        getVisibleRect(view, rect, false);
                        jsonWriter.name(ViewProps.TOP).value(rect.top);
                        jsonWriter.name("left").value(rect.left);
                        jsonWriter.name("width").value(rect.width());
                        jsonWriter.name("height").value(rect.height());
                    } else {
                        jsonWriter.name(ViewProps.TOP).value(view.getTop());
                        jsonWriter.name("left").value(view.getLeft());
                        jsonWriter.name("width").value(view.getWidth());
                        jsonWriter.name("height").value(view.getHeight());
                    }
                }
            } else {
                jsonWriter.name(ViewProps.TOP).value(view.getTop());
                jsonWriter.name("left").value(view.getLeft());
                jsonWriter.name("width").value(view.getWidth());
                jsonWriter.name("height").value(view.getHeight());
            }
            int scrollX = view.getScrollX();
            if ((view instanceof TextView) && ((TextView) view).getMaxLines() == 1) {
                scrollX = 0;
            }
            jsonWriter.name("scrollX").value(scrollX);
            jsonWriter.name("scrollY").value(view.getScrollY());
            jsonWriter.name("visibility").value(VisualUtil.getVisibility(view));
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            jsonWriter.name("translationX").value(translationX);
            jsonWriter.name("translationY").value(translationY);
            jsonWriter.name("classes");
            jsonWriter.beginArray();
            Class<?> superclass = view.getClass();
            do {
                jsonWriter.value(this.mClassnameCache.get(superclass));
                superclass = superclass.getSuperclass();
                if (superclass == Object.class) {
                    break;
                }
            } while (superclass != null);
            jsonWriter.endArray();
            addProperties(jsonWriter, view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                int[] rules = ((RelativeLayout.LayoutParams) layoutParams).getRules();
                jsonWriter.name("layoutRules");
                jsonWriter.beginArray();
                for (int i15 : rules) {
                    jsonWriter.value(i15);
                }
                jsonWriter.endArray();
            }
            jsonWriter.name("subviews");
            jsonWriter.beginArray();
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jsonWriter.value((String) it.next());
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = viewGroup.getChildAt(i16);
                    if (childAt != null) {
                        jsonWriter.value(childAt.hashCode());
                    }
                }
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int childCount2 = viewGroup2.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = viewGroup2.getChildAt(i17);
                if (childAt2 != null) {
                    snapshotView(jsonWriter, childAt2, i17);
                }
            }
        }
    }

    private void snapshotViewHierarchy(JsonWriter jsonWriter, View view) throws IOException {
        reset();
        jsonWriter.beginArray();
        snapshotView(jsonWriter, view, 0);
        jsonWriter.endArray();
        WebNodesManager.getInstance().setHasWebView(this.mSnapInfo.isWebView);
    }
}
