# Changelog

## 0.2.0 (2026-08-18)

Full Changelog: [v0.1.1...v0.2.0](https://github.com/railsinfra/rails-kotlin/compare/v0.1.1...v0.2.0)

### Features

* **api:** api update ([0907c06](https://github.com/railsinfra/rails-kotlin/commit/0907c066feb3b70c066f1cf7769e5917957010c5))
* **api:** manual updates ([449dbcc](https://github.com/railsinfra/rails-kotlin/commit/449dbccd39fa55e34fb448f7afbae466f84bb778))
* **stlc:** configurable CI runner and private-production-repo support in workflow templates ([c88f64f](https://github.com/railsinfra/rails-kotlin/commit/c88f64fd044f7e163efc97396d9cf0ab516a4a6d))


### Bug Fixes

* set production as default environment for docs snippets ([8de3b24](https://github.com/railsinfra/rails-kotlin/commit/8de3b242eb321e5ef07f0f280b2c98ebd6df5350))


### Chores

* **config:** update production sdk base url to www.api.railsinfra.com ([83de639](https://github.com/railsinfra/rails-kotlin/commit/83de639faba0cda934e4181315506d1699b32fb0))
* **internal:** codegen related update ([0a3a8af](https://github.com/railsinfra/rails-kotlin/commit/0a3a8affa33635b57f545fe724563b988f89e535))
* **internal:** codegen related update ([e59216f](https://github.com/railsinfra/rails-kotlin/commit/e59216f93d484488fba11b5c9ac26268bd147307))

## 0.1.1 (2026-05-13)

Full Changelog: [v0.1.0...v0.1.1](https://github.com/railsinfra/rails-kotlin/compare/v0.1.0...v0.1.1)

## 0.1.0 (2026-05-11)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/railsinfra/rails-kotlin/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([5b1dcec](https://github.com/railsinfra/rails-kotlin/commit/5b1dcec9aa1bc9bbad5a4b59f4947ad1991f2133))
* **api:** manual updates ([f149164](https://github.com/railsinfra/rails-kotlin/commit/f1491646c2a97badf14c5e0301b99d50afb48a78))
* **api:** manual updates ([ab7776a](https://github.com/railsinfra/rails-kotlin/commit/ab7776a30920447d2114df643538f1cc56f3a89a))
* **api:** manual updates ([d50b141](https://github.com/railsinfra/rails-kotlin/commit/d50b1410b3d9f51b7b8b4e309d4f5acde4331d9c))
* **api:** manual updates ([2b0aa5f](https://github.com/railsinfra/rails-kotlin/commit/2b0aa5ffe3f0d2b049ed8aae9563f01b6711c0cc))
* **api:** updated the sdk to be inline with rails features ([13e3551](https://github.com/railsinfra/rails-kotlin/commit/13e3551daf7bf08d451d2a010303a7c723930d03))
* **client:** add connection pooling option ([546927e](https://github.com/railsinfra/rails-kotlin/commit/546927e9af8605915d76252fdc116117708ae704))
* **client:** improve logging ([e6f84af](https://github.com/railsinfra/rails-kotlin/commit/e6f84afbfc6f81ce05b7ae59d1c7c6ca3ff69cd5))
* **client:** more robust error parsing ([e11ac2a](https://github.com/railsinfra/rails-kotlin/commit/e11ac2adec14c725e9b696a3d2ad5d882dc9439b))
* **client:** send `X-Stainless-Kotlin-Version` header ([d663ae5](https://github.com/railsinfra/rails-kotlin/commit/d663ae5c41e46e8357411cac4772199a77bf6de6))
* **client:** support proxy authentication ([c537e77](https://github.com/railsinfra/rails-kotlin/commit/c537e7763b67aa75bd675b346bdb6a452874b4f8))
* support setting headers via env ([44327d9](https://github.com/railsinfra/rails-kotlin/commit/44327d9ef505e4510c3b0376f128bf3e54cc6bec))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([c239903](https://github.com/railsinfra/rails-kotlin/commit/c2399034a50d292595ae2b9e152120d167b493e1))
* **client:** incorrect `Retry-After` parsing ([306a80b](https://github.com/railsinfra/rails-kotlin/commit/306a80b4c302530858611d5303d394e1a8cae04d))
* **client:** preserve time zone in lenient date-time parsing ([4a1be9f](https://github.com/railsinfra/rails-kotlin/commit/4a1be9f91b1d5f03bea174a078bb3cbd50e97ce2))


### Performance Improvements

* **client:** create one json mapper ([55e64eb](https://github.com/railsinfra/rails-kotlin/commit/55e64eb709eab69a62fd2a380418391daa77e1ca))


### Chores

* **ci:** skip lint on metadata-only changes ([a2a56ae](https://github.com/railsinfra/rails-kotlin/commit/a2a56aee49a3122457b35f74f04da92103fec47a))
* drop apache dependency ([cce0bf7](https://github.com/railsinfra/rails-kotlin/commit/cce0bf7d037033bffeaa0f6db4ba09f00aacd923))
* **internal:** allow passing args to `./scripts/test` ([2edb4be](https://github.com/railsinfra/rails-kotlin/commit/2edb4be7880ed02a08799acb1c06ab03083a5f9b))
* **internal:** bump ktfmt ([6038e51](https://github.com/railsinfra/rails-kotlin/commit/6038e513517e16c8853e71df134a9e622254206b))
* **internal:** bump palantir-java-format ([7ec2467](https://github.com/railsinfra/rails-kotlin/commit/7ec2467d5114adaff85675bdfb0aaf0958b44191))
* **internal:** codegen related update ([e48cee3](https://github.com/railsinfra/rails-kotlin/commit/e48cee30b01e42a2ce433f3b7f28ad0d93518512))
* **internal:** codegen related update ([74d6f71](https://github.com/railsinfra/rails-kotlin/commit/74d6f71063003939dc9a284ce983603549e239ab))
* **internal:** codegen related update ([87d154e](https://github.com/railsinfra/rails-kotlin/commit/87d154e9268c955e83dfc3aea0fa0af483dfafc3))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([5e029b9](https://github.com/railsinfra/rails-kotlin/commit/5e029b96c729c56d2fc77abc4ba6fe80d1db9c39))
* **internal:** expand imports ([c26d1e4](https://github.com/railsinfra/rails-kotlin/commit/c26d1e4580720187331d9390ea82d7cd59708fa8))
* **internal:** make `OkHttp` constructor internal ([abc12f8](https://github.com/railsinfra/rails-kotlin/commit/abc12f88e98852d14eb0c01a3268085c3fefaf15))
* **internal:** remove mock server code ([7857871](https://github.com/railsinfra/rails-kotlin/commit/7857871ea7170af183bcd65a079498af4d5b0dd4))
* **internal:** update `TestServerExtension` comment ([3f09cc3](https://github.com/railsinfra/rails-kotlin/commit/3f09cc3244e42609c59fa7779629c194efa2b5a3))
* **internal:** update gitignore ([c7b1494](https://github.com/railsinfra/rails-kotlin/commit/c7b14940fe6c1d9cc1c3ccc9cb9a8b669a5c879c))
* **internal:** update retry delay tests ([f374b27](https://github.com/railsinfra/rails-kotlin/commit/f374b2763418890784f5884d6e65db555310e1cb))
* **internal:** upgrade AssertJ ([540f2bd](https://github.com/railsinfra/rails-kotlin/commit/540f2bd4a789381a63f6b0c05dd52b157713a5f6))
* make `Properties` more resilient to `null` ([6083ba5](https://github.com/railsinfra/rails-kotlin/commit/6083ba55fbec893863256ef8322e08f3be41b32b))
* redact api-key headers in debug logs ([0e4b9b2](https://github.com/railsinfra/rails-kotlin/commit/0e4b9b29525be615fa89b37da47de9435b43852f))
* remove duplicated dokka setup ([c29b998](https://github.com/railsinfra/rails-kotlin/commit/c29b998bc620fdc18348564faf9e1095e1fb50b2))
* update mock server docs ([1cfc750](https://github.com/railsinfra/rails-kotlin/commit/1cfc7508d14ef60bbf5d1c38a88cca89356366b2))
* update SDK settings ([d9546c1](https://github.com/railsinfra/rails-kotlin/commit/d9546c1f5ed982dee919d1aac3a986afcc036f92))
* update SDK settings ([0d75350](https://github.com/railsinfra/rails-kotlin/commit/0d75350805e1d04f1f40b80bbe3492affd8ec46d))


### Documentation

* clarify forwards compat behavior ([e140814](https://github.com/railsinfra/rails-kotlin/commit/e140814e79bce635bf924bea3ac4d668921d611d))
