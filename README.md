#  MyRestApp - Music REST Client

**MyRestApp** è un'app Android che consente di cercare brani musicali tramite l'API di iTunes. L'accesso all'app è protetto da un semplice login. L’interfaccia è suddivisa in più schermate (Activity) che gestiscono ricerca, streaming e archivio.

---

##  Funzionamento generale

1. L'utente inserisce username e password.
2. Se le credenziali sono corrette (`admin` / `1234`), accede al menu principale.
3. Dal menu, può:
   - Cercare brani musicali (tramite API iTunes).
   - Aprire Apple Music in un browser.
   - Accedere a una sezione "Archivio" (al momento vuota).

---

##  Attività e loro funzione

### `MainActivity`
- **Login** tramite `EditText` per username e password.
- Verifica le credenziali:
  - Se corrette: apre `SecondActivity`.
  - Se errate: mostra `Toast` con messaggio di errore.

### `SecondActivity`
- **Menu principale** con tre pulsanti:
  -  `btnSearchSongs`: apre `ThirdActivity`.
  -  `btnStreaming`: apre `FourthActivity`.
  -  `btnArchive`: apre `FifthActivity`.

### `ThirdActivity` – Ricerca canzoni
- Campo di input per digitare una parola chiave.
- All’invio, chiama l’**API iTunes** per cercare canzoni.
- Visualizza i risultati in una `ListView` con titolo e artista.

### `FourthActivity` – Streaming
- Apre direttamente **Apple Music** nel browser tramite `Intent`.

### `FifthActivity` – Archivio
- Attualmente è una schermata vuota (`activity_fifth.xml`), ma può essere usata per salvare preferiti o playlist.

---

##  Funzionalità future implementabili

-  **Schermata di registrazione** per nuovi utenti.
-  **Logout** con ritorno a `MainActivity`.
-  **Salvataggio brani preferiti** in `FifthActivity`.
-  **Riproduzione integrata** di preview musicali (se disponibile da API).
-  **Storico ricerche recenti**.


---

##  API utilizzata

- **iTunes Search API**  
  Endpoint: `https://itunes.apple.com/search?term={query}&media=music`  
  Restituisce un JSON con risultati contenenti `trackName` e `artistName`.

  ---

