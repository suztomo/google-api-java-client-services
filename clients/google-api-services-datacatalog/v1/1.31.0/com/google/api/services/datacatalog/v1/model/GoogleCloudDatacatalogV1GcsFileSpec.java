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

package com.google.api.services.datacatalog.v1.model;

/**
 * Specification of a single file in Cloud Storage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1GcsFileSpec extends com.google.api.client.json.GenericJson {

  /**
   * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filePath;

  /**
   * Output only. Creation, modification, and expiration timestamps of a Cloud Storage file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1SystemTimestamps gcsTimestamps;

  /**
   * Output only. File size in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeBytes;

  /**
   * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilePath() {
    return filePath;
  }

  /**
   * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
   * @param filePath filePath or {@code null} for none
   */
  public GoogleCloudDatacatalogV1GcsFileSpec setFilePath(java.lang.String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Output only. Creation, modification, and expiration timestamps of a Cloud Storage file.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1SystemTimestamps getGcsTimestamps() {
    return gcsTimestamps;
  }

  /**
   * Output only. Creation, modification, and expiration timestamps of a Cloud Storage file.
   * @param gcsTimestamps gcsTimestamps or {@code null} for none
   */
  public GoogleCloudDatacatalogV1GcsFileSpec setGcsTimestamps(GoogleCloudDatacatalogV1SystemTimestamps gcsTimestamps) {
    this.gcsTimestamps = gcsTimestamps;
    return this;
  }

  /**
   * Output only. File size in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * Output only. File size in bytes.
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public GoogleCloudDatacatalogV1GcsFileSpec setSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1GcsFileSpec set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1GcsFileSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1GcsFileSpec clone() {
    return (GoogleCloudDatacatalogV1GcsFileSpec) super.clone();
  }

}