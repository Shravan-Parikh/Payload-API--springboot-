# Payload API

## Overview

The Payload API is designed to manage and retrieve payload-related information. It provides endpoints to handle loading and unloading details, product information, and other relevant data.

Implemnted on java using SpringBoot database used is PostgresSQL.

## API Description

The Payload API exposes the following endpoints:

### 1. Load Payload Information

**Endpoint:** `POST /load`

**Description:** Creates a new payload with the specified loading and unloading details, product type, truck type, and other relevant information.

**Request Payload:**
```json
{
  "loadingPoint": "Delhi",
  "unloadingPoint": "Jaipur",
  "productType": "Chemicals",
  "truckType": "Canter",
  "noOfTrucks": 1,
  "weight": 100,
  "comment": "",
  "shipperId": "shipper:<UUID>",
  "date": "dd-mm-yyyy"
}
```
**Endpoint:** `GET /load`
**Endpoint:** `GET /load/{loadId}`
**Endpoint:** `delete /load/{loadID}`

API details.
link : https://docs.google.com/document/d/1m3_N3FO07YigDpOF9Qg1NNx4LU2oAnZdtmgGUbDXtKo/edit
