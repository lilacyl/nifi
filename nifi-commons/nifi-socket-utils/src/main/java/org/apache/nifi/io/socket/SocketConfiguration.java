/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.io.socket;

import javax.net.ssl.SSLContext;
import org.apache.nifi.security.util.SslContextFactory;
import org.apache.nifi.security.util.TlsConfiguration;
import org.apache.nifi.security.util.TlsException;

public final class SocketConfiguration {

    private Integer socketTimeout;
    private Integer receiveBufferSize;
    private Integer sendBufferSize;
    private Boolean reuseAddress;
    private Boolean keepAlive;
    private Boolean oobInline;
    private Boolean tcpNoDelay;
    private Integer trafficClass;
    private TlsConfiguration tlsConfiguration;

    public SSLContext createSSLContext() throws TlsException {
        return SslContextFactory.createSslContext(tlsConfiguration);
    }

    public void setTlsConfiguration(final TlsConfiguration tlsConfiguration) {
        //print ???
        this.tlsConfiguration = tlsConfiguration;
    }

    public Integer getSocketTimeout() {
        Integer ctestParam = socketTimeout;
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        Integer ctestParam = socketTimeout;
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.socketTimeout = socketTimeout;
    }

    public Boolean getReuseAddress() {
        String ctestParam = reuseAddress.toString();
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return reuseAddress;
    }

    public void setReuseAddress(Boolean reuseAddress) {
        String ctestParam = reuseAddress.toString();
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.reuseAddress = reuseAddress;
    }

    public Boolean getKeepAlive() {
        String ctestParam = keepAlive.toString();
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        String ctestParam = keepAlive.toString();
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.keepAlive = keepAlive;
    }

    public Boolean getOobInline() {
        String ctestParam = oobInline.toString();
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return oobInline;
    }

    public void setOobInline(Boolean oobInline) {
        String ctestParam = oobInline.toString();
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.oobInline = oobInline;
    }

    public Integer getReceiveBufferSize() {
        Integer ctestParam = receiveBufferSize;
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return receiveBufferSize;
    }

    public void setReceiveBufferSize(Integer receiveBufferSize) {
        Integer ctestParam = receiveBufferSize;
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.receiveBufferSize = receiveBufferSize;
    }

    public Integer getSendBufferSize() {
        Integer ctestParam = sendBufferSize;
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return sendBufferSize;
    }

    public void setSendBufferSize(Integer sendBufferSize) {
        Integer ctestParam = sendBufferSize;
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.sendBufferSize = sendBufferSize;
    }

    public Boolean getTcpNoDelay() {
        String ctestParam = tcpNoDelay.toString();
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return tcpNoDelay;
    }

    public void setTcpNoDelay(Boolean tcpNoDelay) {
        String ctestParam = tcpNoDelay.toString();
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.tcpNoDelay = tcpNoDelay;
    }

    public Integer getTrafficClass() {
        Integer ctestParam = trafficClass;
        System.out.println("[CTEST][GET-PARAM] " + ctestParam); //add ctest
        return trafficClass;
    }

    public void setTrafficClass(Integer trafficClass) {
        Integer ctestParam = trafficClass;
        System.out.println("[CTEST][SET-PARAM] " + ctestParam); //add ctest
        this.trafficClass = trafficClass;
    }

}
