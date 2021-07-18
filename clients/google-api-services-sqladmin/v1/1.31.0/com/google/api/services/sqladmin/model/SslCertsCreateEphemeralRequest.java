/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sqladmin.model;

/**
 * SslCerts create ephemeral certificate request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SslCertsCreateEphemeralRequest extends com.google.api.client.json.GenericJson {

  /**
   * Access token to include in the signed certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("access_token")
  private java.lang.String accessToken;

  /**
   * PEM encoded public key to include in the signed certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("public_key")
  private java.lang.String publicKey;

  /**
   * Access token to include in the signed certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessToken() {
    return accessToken;
  }

  /**
   * Access token to include in the signed certificate.
   * @param accessToken accessToken or {@code null} for none
   */
  public SslCertsCreateEphemeralRequest setAccessToken(java.lang.String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * PEM encoded public key to include in the signed certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicKey() {
    return publicKey;
  }

  /**
   * PEM encoded public key to include in the signed certificate.
   * @param publicKey publicKey or {@code null} for none
   */
  public SslCertsCreateEphemeralRequest setPublicKey(java.lang.String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  @Override
  public SslCertsCreateEphemeralRequest set(String fieldName, Object value) {
    return (SslCertsCreateEphemeralRequest) super.set(fieldName, value);
  }

  @Override
  public SslCertsCreateEphemeralRequest clone() {
    return (SslCertsCreateEphemeralRequest) super.clone();
  }

}