package com.sine.all.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.provider.ContactsContract;

import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Map;

public class LocalWebService extends Service {

    SocketAddress socketAddress;
    ServerSocket webservice;
    ContactsContract.CommonDataKinds.Website website;

    void init(){
//        try {
//            ServerSocket mServerSocket = new ServerSocket();
//            mServerSocket.setReuseAddress(true);
//            mServerSocket.bind(new InetSocketAddress(mPort));



            /*
            // HTTP协议拦截器。
            BasicHttpProcessor httpProcessor = new BasicHttpProcessor();
            httpProcessor.addInterceptor(new ResponseDate());
            httpProcessor.addInterceptor(new ResponseServer());
            httpProcessor.addInterceptor(new ResponseContent());
            httpProcessor.addInterceptor(new ResponseConnControl());

            // HTTP Attribute.
            HttpParams httpParams = new BasicHttpParams();
            httpParams.setIntParameter(CoreConnectionPNames.SO_TIMEOUT, timeout)
                    .setIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, 8 * 1024)
                    .setBooleanParameter(CoreConnectionPNames.STALE_CONNECTION_CHECK, false)
                    .setBooleanParameter(CoreConnectionPNames.TCP_NODELAY, true)
                    .setParameter(CoreProtocolPNames.ORIGIN_SERVER, "WebServer/1.1");

            // 注册Http接口。
            HttpRequestHandlerRegistry handlerRegistry = new HttpRequestHandlerRegistry();
            for (Map.Entry<String, AndServerRequestHandler> handlerEntry : mRequestHandlerMap.entrySet()) {
                handlerRegistry.register("/" + handlerEntry.getKey(), new DefaultHttpRequestHandler(handlerEntry.getValue()));
            }

            // 创建HTTP服务。
            HttpService httpService = new HttpService(httpProcessor, new DefaultConnectionReuseStrategy(), new DefaultHttpResponseFactory());
            httpService.setParams(httpParams);
            httpService.setHandlerResolver(handlerRegistry);
            */
            /**
             * 开始接受客户端请求。
             */
//            while (isLoop) {
//                // 接收客户端套接字。
//                if (!mServerSocket.isClosed()) {
//                    Socket socket = mServerSocket.accept();
//                    DefaultHttpServerConnection serverConnection = new DefaultHttpServerConnection();
//                    serverConnection.bind(socket, httpParams);
//
//                    // Dispatch request handler.
//                    RequestHandleTask requestTask = new RequestHandleTask(this, httpService, serverConnection);
//                    requestTask.setDaemon(true);
//                    AndWebUtil.executeRunnable(requestTask);
//                }
//            }
//        } catch (Exception e) {
//        } finally {
//            close();
 //       }
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(fd, writer, args);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
