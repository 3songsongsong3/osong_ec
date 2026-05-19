# OSong EC Site

Spring Boot と Thymeleaf を用いて開発している EC サイトの Web アプリケーションです。  
商品一覧の表示からユーザー認証、カート、注文、決済まで、一連の購入体験を提供することを目的としています。

---

## 概要

本プロジェクトは、Java および Spring Boot をベースにした EC サイト開発プロジェクトです。  
バックエンドには Spring Data JPA を使用し、データベースアクセスをオブジェクト指向で実装しています。  
フロントエンドには Thymeleaf を採用し、Spring Security によって認証・認可機能を構築しています。  
データベースには PostgreSQL を使用し、将来的には AWS 上でのデプロイを予定しています。

また、以下の外部 API との連携を予定しています。

- 住所自動入力 API
- 決済 API（クレジットカード決済）
- 配送情報連携 API

---

## 主な機能

- 商品一覧表示
- 商品詳細表示
- ユーザー登録
- ログイン / ログアウト
- カート機能
- 注文機能
- 注文履歴表示
- 管理画面（予定）

---

## 使用技術

### バックエンド
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Spring Security

### フロントエンド
- Thymeleaf
- HTML / CSS / JavaScript

### データベース
- PostgreSQL

### インフラ（予定）
- AWS

### 開発ツール
- Maven
- Git / GitHub
- Eclipse IDE

---

## インフラ構成（予定）
- Amazon EC2：アプリケーションサーバー
- Amazon RDS (PostgreSQL)：データベース
- Amazon S3：商品画像およびアップロードファイルの保存
- AWS IAM：アクセス権限管理
- Nginx：リバースプロキシ（HTTP/HTTPS の受付および Spring Boot への転送）

## Webサーバー構成
本プロジェクトでは、AWS EC2 上に Spring Boot アプリケーションを配置し、
Nginx をリバースプロキシとして利用する構成を採用しています。


- Client (Browser) HTTP/HTTPS (80/443)
        ↓ 
- Nginx(Reverse Proxy)
        ↓ 
- Spring Boot Application (Port 8080)
        ↓
- PostgreSQL (Amazon RDS)

---

## 外部 API 連携（予定）

- 住所自動入力 API
- 決済 API（Stripe など）
- 配送情報連携 API

---

## 開発目的

- Spring Boot を用いた Web アプリケーション開発の実践
- JPA を利用した ORM とデータベース設計の理解
- Spring Security による認証・認可の実装
- AWS を利用したクラウドインフラ構築
- 外部 API との連携経験の習得
- Git / GitHub を用いたバージョン管理とチーム開発の実践

---

## 今後の実装予定

- 商品カテゴリ検索
- 商品レビュー機能
- 在庫管理
- 管理画面
- 住所自動入力 API 連携
- 決済 API 連携
- AWS へのデプロイ

---

## 作成者

Song Eugene

---

## ライセンス

This project is for educational and portfolio purposes.
