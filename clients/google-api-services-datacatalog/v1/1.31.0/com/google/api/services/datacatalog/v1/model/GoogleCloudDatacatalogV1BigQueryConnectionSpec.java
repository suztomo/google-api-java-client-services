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
 * Specification for the BigQuery connection.
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
public final class GoogleCloudDatacatalogV1BigQueryConnectionSpec extends com.google.api.client.json.GenericJson {

  /**
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec cloudSql;

  /**
   * The type of the BigQuery connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionType;

  /**
   * True if there are credentials attached to the BigQuery connection; false otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasCredential;

  /**
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec getCloudSql() {
    return cloudSql;
  }

  /**
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * @param cloudSql cloudSql or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BigQueryConnectionSpec setCloudSql(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec cloudSql) {
    this.cloudSql = cloudSql;
    return this;
  }

  /**
   * The type of the BigQuery connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionType() {
    return connectionType;
  }

  /**
   * The type of the BigQuery connection.
   * @param connectionType connectionType or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BigQueryConnectionSpec setConnectionType(java.lang.String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  /**
   * True if there are credentials attached to the BigQuery connection; false otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasCredential() {
    return hasCredential;
  }

  /**
   * True if there are credentials attached to the BigQuery connection; false otherwise.
   * @param hasCredential hasCredential or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BigQueryConnectionSpec setHasCredential(java.lang.Boolean hasCredential) {
    this.hasCredential = hasCredential;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1BigQueryConnectionSpec set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1BigQueryConnectionSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1BigQueryConnectionSpec clone() {
    return (GoogleCloudDatacatalogV1BigQueryConnectionSpec) super.clone();
  }

}